package apptest;

import com.google.api.services.bigquery.model.TableFieldSchema;
import com.google.api.services.bigquery.model.TableSchema;
import java.util.ArrayList;
import java.util.List;

public class SampleSchemaFactory {
  public static TableSchema create() {
    List<TableFieldSchema> fields;
    fields = new ArrayList<>();
    fields.add(new TableFieldSchema().setName("Data1").setType("STRING"));
    fields.add(new TableFieldSchema().setName("Data2").setType("STRING"));
    // fields.add(new TableFieldSchema().setName("ts").setType("TIMESTAMP"));
    // fields.add(
    //     new TableFieldSchema().setName("attributes").setType("RECORD").setFields(new ArrayList<TableFieldSchema>() {
    //       {
    //         add(new TableFieldSchema().setName("attr1").setType("STRING"));
    //         add(new TableFieldSchema().setName("attr2").setType("RECORD").setFields(new ArrayList<TableFieldSchema>() {
    //           {
    //             add(new TableFieldSchema().setName("prop1").setType("INTEGER"));
    //             add(new TableFieldSchema().setName("prop2").setType("STRING"));
    //           }
    //         }));
    //       }
    //     }));
    TableSchema schema = new TableSchema().setFields(fields);

    return schema;
  }
}
