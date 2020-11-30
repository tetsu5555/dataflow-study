package apptest;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.gcp.bigquery.BigQueryIO;
import org.apache.beam.sdk.io.gcp.pubsub.PubsubIO;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.ParDo;

import com.google.api.services.bigquery.model.TableSchema;

public class App {
  private static String getBQString(CustomOptions options) {
    StringBuilder sb = new StringBuilder();
    sb.append(options.getProject());
    sb.append(':');
    sb.append(options.getDataset());
    sb.append('.');
    sb.append(options.getBqTable());
    return sb.toString();
  }
  
  public static void main(String[] args) {

    CustomOptions options = PipelineOptionsFactory.fromArgs(args).withValidation().as(CustomOptions.class);
    Pipeline pipeline = Pipeline.create(options);

    String bqStr = getBQString(options);
    TableSchema schema = SampleSchemaFactory.create();

    System.out.println(schema);

    // 処理内容を適用する
    // pubsubのsubscriptionからデータを読み出す
    pipeline.apply(PubsubIO.readStrings().fromTopic("projects/ferrous-arch-90702/topics/avro-records"))
        // 5分間隔のwindowを指定(なくても可)
        // .apply(Window.<String>into(FixedWindows.of(Duration.standardMinutes(5))))
        // pubsubからの入力に対する変換を設定 (実装は後述)
        .apply(ParDo.of(new BigQueryRowConverter()))
        // BigQueryへの書き込みを設定
        .apply("WriteToBQ", BigQueryIO.writeTableRows()
            // 書き込み先テーブル名を指定
            .to(bqStr)
            // 書き込み先のschemaをObjectで定義して渡す
            .withSchema(schema)
            // テーブルがなければ作成する(オプション)
            .withCreateDisposition(BigQueryIO.Write.CreateDisposition.CREATE_IF_NEEDED)
            // テーブル末尾にデータを挿入していく（オプション)
            .withWriteDisposition(BigQueryIO.Write.WriteDisposition.WRITE_APPEND));
    // 実行
    pipeline.run();
  }
}