package apptest;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class JSONReadFromTheFile {
  public static void main(String[] args) throws Exception {
    String dir = System.getProperty("user.dir");
    System.out.println(dir);

    String file = dir + "/src/main/java/apptest/" + "hoge.json";
    String jsonString = readFileAsString(file);
    System.out.println(jsonString);

    // jsonをobjectに変換	
    Gson gson = new Gson();
    LogJson jsonObj = gson.fromJson(jsonString, LogJson.class);

  }

  public static String readFileAsString(String file) throws Exception {
    return new String(Files.readAllBytes(Paths.get(file)));
  }
}