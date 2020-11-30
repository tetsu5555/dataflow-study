package apptest.tmp;


import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

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

public class JSONTest {
  public static void main(String[] args) {
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