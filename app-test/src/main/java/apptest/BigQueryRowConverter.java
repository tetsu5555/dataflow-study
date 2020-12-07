package apptest;

import com.google.api.services.bigquery.model.TableRow;
import com.google.gson.Gson;
import org.apache.beam.sdk.transforms.DoFn;

public class BigQueryRowConverter extends DoFn<String, TableRow> {

  @ProcessElement
  public void processElement(ProcessContext dofn) throws Exception {
    // 入力を受け取る
    // String json = dofn.element();
    // Gson gson = new Gson();
    // jsonをobjectに変換
    // SampleInputJson jsonObj = gson.fromJson(json, SampleInputJson.class);
    // jsonの内容をbigqueryのtableRowに変換していく
    TableRow output = new TableRow();
    // TableRow attributesOutput = new TableRow();
    // TableRow attr2Output = new TableRow();
    // 出力にデータをセットする
    output.set("Data1", "hoge");
    output.set("Data2", "fuga");

    // attributesOutput.set("attr2", attr2Output);
    // output.set("attributes", attributesOutput);
    // output.set("ts", jsonObj.timeStamp / 1000);
    // 出力する
    dofn.output(output);
  }
}
