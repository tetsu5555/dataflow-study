package apptest;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.runners.dataflow.options.DataflowPipelineOptions;

public interface CustomOptions extends DataflowPipelineOptions {

  @Description("Input location to read text files.")
  @Default.String("gs://apache-beam-samples/shakespeare/*")
  String getInputLocation();
  void setInputLocation(String value);

  @Description("Output location to write output files.")
  String getOutputLocation();
  void setOutputLocation(String value);

  @Description("Dataset to run ob")
  String getDataset();
  void setDataset(String value);

  @Description("BqTable to run ob")
  String getBqTable();
  void setBqTable(String value);
}