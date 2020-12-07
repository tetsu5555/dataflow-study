package apptest;

import com.google.gson.annotations.SerializedName;

public class SampleInputJson {
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
