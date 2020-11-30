package apptest;

import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Count;
import org.apache.beam.sdk.transforms.Filter;
import org.apache.beam.sdk.transforms.FlatMapElements;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.TypeDescriptors;

import java.util.Arrays;

import com.google.api.services.bigquery.model.TableSchema;
import com.google.auth.oauth2.IdTokenProvider.Option;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

class JsonExample {
  // jsonキー名に設定する。(もし、このアノテーションが設定なければ変数名がキー名になる。)
  @SerializedName("Data1")
  private int data1;
  // jsonキー名
  @SerializedName("Data2")
  private String data2;
  // data1のgetterプロパティ
  public int getData1() {
    return data1;
  }
  // data1のsetterプロパティ
  public void setData1(int data1) {
    this.data1 = data1;
  }
  // data2のgetterプロパティ
  public String getData2() {
    return data2;
  }
  // data2のsetterプロパティ
  public void setData2(String data2) {
    this.data2 = data2;
  }
}

public class App {

  // private static String getBQString(CustomOptions options) {
  //   StringBuilder sb = new StringBuilder();
  //   sb.append(options.getProject());
  //   sb.append(':');
  //   sb.append(options.getDataset());
  //   sb.append('.');
  //   sb.append(options.getBqTable());

  //   return sb.toString();
  // }

  // private static void printBQOption(CustomOptions options) {
  //   options.setJobName("hogehogehoge");
  //   options.setBqTable("hogehgoe");
  //   options.setDataset("hogehoge");
  //   System.out.println(getBQString(options));
  // }

  private static JSONArray getArrayFromJSON() {
    JSONParser parser = new JSONParser();
    try {
      Object obj = parser.parse(new FileReader("./crunchify.json"));

      JSONObject jsonObject = (JSONObject) obj;
      JSONArray companyList = (JSONArray) jsonObject.get("Company List");

      return companyList;
    } catch (Exception e) {
      return new JSONArray();
    }
  }

  public static void main(String[] args) {

    CustomOptions options = PipelineOptionsFactory.fromArgs(args).withValidation().as(CustomOptions.class);
    // TableSchema schema = SampleSchemaFactory.create();

    // Pipeline pipeline = Pipeline.create(options);

    // pipeline.apply(TextIO.read().from(options.getInputLocation()))
    //     .apply(FlatMapElements.into(TypeDescriptors.strings())
    //         .via((String words) -> Arrays.asList(words.split("\"[^\\\\p{L}]+\""))))
    //     .apply(Filter.by((String word) -> !word.isEmpty())).apply(Count.perElement())
    //     .apply(MapElements.into(TypeDescriptors.strings())
    //         .via((KV<String, Long> count) -> count.getKey() + "," + count.getValue()))
    //     .apply(TextIO.write().to(options.getOutputLocation()));

    // pipeline.run().waitUntilFinish();

    // JSONArray companyList = getArrayFromJSON();
    // Iterator<JSONObject> iterator = companyList.iterator();

    // while (iterator.hasNext()) {
    //   System.out.println(iterator.next());
    // }

    // // テキスト読み込み
    // PCollection<String> textData = pipeline.apply(TextIO.read().from(options.getInputLocation()));
    // // テキスト書き込み
    // textData.apply(TextIO.write().to(options.getOutputLocation()));
    // // Pipeline 実行
    // pipeline.run().waitUntilFinish();

    // Jsonタイプのデータ
    String json = "{ \"Data1\": 1, \"Data2\":\"TEST\" }";
    // Jsonタイプのstring値をJsonExmpleタイプに変換
    Gson gson = new Gson();
    // Jsonタイプをクラスに変換する。キー名と変数名やアノテーション(SerializedName)と一致することでデータが格納
    JsonExample obj = gson.fromJson(json, JsonExample.class);
    // 結果は1
    System.out.println(obj.getData1());
    // 結果はTEST
    System.out.println(obj.getData2());
    // data1は「10」に格納
    obj.setData1(10);
    // data2は「Hello world」に格納
    obj.setData2("Hello world");
    // インスタンスデータをjsonタイプに変換する。
    json = gson.toJson(obj);
    //　結果値は {"Data1":10,"Data2":"Hello world"}
    System.out.println(json);
  }
}