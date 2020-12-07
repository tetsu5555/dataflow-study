// package apptest;

// import org.apache.beam.sdk.values.PCollection;
// import org.apache.beam.sdk.Pipeline;
// import org.apache.beam.sdk.io.TextIO;
// import org.apache.beam.sdk.options.PipelineOptionsFactory;
// import org.apache.beam.sdk.transforms.Count;
// import org.apache.beam.sdk.transforms.Filter;
// import org.apache.beam.sdk.transforms.FlatMapElements;
// import org.apache.beam.sdk.transforms.MapElements;
// import org.apache.beam.sdk.values.KV;
// import org.apache.beam.sdk.values.TypeDescriptors;

// import java.util.Arrays;

// import com.google.api.services.bigquery.model.TableSchema;
// import com.google.auth.oauth2.IdTokenProvider.Option;

// import org.json.simple.JSONArray;
// import org.json.simple.JSONObject;
// import org.json.simple.parser.JSONParser;

// import java.io.FileReader;
// import java.util.Iterator;

// public class App {

//   // private static String getBQString(CustomOptions options) {
//   //   StringBuilder sb = new StringBuilder();
//   //   sb.append(options.getProject());
//   //   sb.append(':');
//   //   sb.append(options.getDataset());
//   //   sb.append('.');
//   //   sb.append(options.getBqTable());

//   //   return sb.toString();
//   // }

//   // private static void printBQOption(CustomOptions options) {
//   //   options.setJobName("hogehogehoge");
//   //   options.setBqTable("hogehgoe");
//   //   options.setDataset("hogehoge");
//   //   System.out.println(getBQString(options));
//   // }

//   private static JSONArray getArrayFromJSON() {
//     JSONParser parser = new JSONParser();
//     try {
//       Object obj = parser.parse(new FileReader("./crunchify.json"));

//       JSONObject jsonObject = (JSONObject) obj;
//       JSONArray companyList = (JSONArray) jsonObject.get("Company List");

//       return companyList;
//     } catch (Exception e) {
//       return new JSONArray();
//     }
//   }

//   public static void main(String[] args) {

//     CustomOptions options = PipelineOptionsFactory.fromArgs(args).withValidation().as(CustomOptions.class);
//     // TableSchema schema = SampleSchemaFactory.create();

//     Pipeline pipeline = Pipeline.create(options);

//     // pipeline.apply(TextIO.read().from(options.getInputLocation()))
//     //     .apply(FlatMapElements.into(TypeDescriptors.strings())
//     //         .via((String words) -> Arrays.asList(words.split("\"[^\\\\p{L}]+\""))))
//     //     .apply(Filter.by((String word) -> !word.isEmpty())).apply(Count.perElement())
//     //     .apply(MapElements.into(TypeDescriptors.strings())
//     //         .via((KV<String, Long> count) -> count.getKey() + "," + count.getValue()))
//     //     .apply(TextIO.write().to(options.getOutputLocation()));

//     // pipeline.run().waitUntilFinish();

//     JSONArray companyList = getArrayFromJSON();
//     Iterator<JSONObject> iterator = companyList.iterator();

//     while (iterator.hasNext()) {
//       System.out.println(iterator.next());
//     }

//     // テキスト読み込み
//     PCollection<String> textData = pipeline.apply(TextIO.read().from(options.getInputLocation()));
//     // テキスト書き込み
//     textData.apply(TextIO.write().to(options.getOutputLocation()));
//     // Pipeline 実行
//     pipeline.run().waitUntilFinish();
//   }
// }