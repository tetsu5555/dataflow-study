package apptest;

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

public class App {

  public static void main(String[] args) {
    CustomOptions options = PipelineOptionsFactory.fromArgs(args).withValidation().as(CustomOptions.class);
    Pipeline pipeline = Pipeline.create(options);

    pipeline.apply(TextIO.read().from(options.getInputLocation()))
        .apply(FlatMapElements.into(TypeDescriptors.strings())
            .via((String words) -> Arrays.asList(words.split("\"[^\\\\p{L}]+\""))))
        .apply(Filter.by((String word) -> !word.isEmpty())).apply(Count.perElement())
        .apply(MapElements.into(TypeDescriptors.strings())
            .via((KV<String, Long> count) -> count.getKey() + "," + count.getValue()))
        .apply(TextIO.write().to(options.getOutputLocation()));

    pipeline.run().waitUntilFinish();
  }
}