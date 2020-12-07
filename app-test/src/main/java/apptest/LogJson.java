package apptest;

import com.google.gson.annotations.SerializedName;

public class LogJson {
  // jsonキー名に設定する。(もし、このアノテーションが設定なければ変数名がキー名になる。)
  @SerializedName("uid")
  private String uid;
  public String getUID() {
    return uid;
  }
  public void setUID(String uid) {
    this.uid = uid;
  }

  @SerializedName("event_hash")
  private String event_hash;
  public String getEventHash() {
    return event_hash;
  }
  public void setEventHash(String event_hash) {
    this.event_hash = event_hash;
  }

  @SerializedName("event_name")
  private String event_name;
  public String getEventName() {
    return event_name;
  }
  public void setEventName(String event_name) {
    this.event_name = event_name;
  }

  @SerializedName("api_key")
  private String api_key;
  public String getApiKey() {
    return api_key;
  }
  public void setApiKey(String api_key) {
    this.api_key = api_key;
  }

  @SerializedName("encrypted_target")
  private String encrypted_target;
  public String getEncryptedTarget() {
    return encrypted_target;
  }
  public void setEncryptedTarget(String encrypted_target) {
    this.encrypted_target = encrypted_target;
  }

  // @SerializedName("timestamp")
  // private String timestamp;
  // public String getTimestamp() {
  //   return timestamp;
  // }
  // public void setTimestamp(String timestamp) {
  //   this.timestamp = timestamp;
  // }

  @SerializedName("mass_push_id")
  private String mass_push_id;
  public String getMassPushId() {
    return mass_push_id;
  }
  public void setMassPushId(String mass_push_id) {
    this.mass_push_id = mass_push_id;
  }

  @SerializedName("plugin_type")
  private String plugin_type;
  public String getPluginType() {
    return plugin_type;
  }
  public void setPluginType(String plugin_type) {
    this.plugin_type = plugin_type;
  }

  @SerializedName("schedule_id")
  private String schedule_id;
  public String getScheduleId() {
    return schedule_id;
  }
  public void setScheduleId(String schedule_id) {
    this.schedule_id = schedule_id;
  }

  @SerializedName("schedule_task_id")
  private String schedule_task_id;
  public String getScheduleTaskId() {
    return schedule_task_id;
  }
  public void setScheduleTaskId(String schedule_task_id) {
    this.schedule_task_id = schedule_task_id;
  }

  @SerializedName("error_type")
  private String error_type;
  public String getErrorType() {
    return error_type;
  }
  public void setErrorType(String error_type) {
    this.error_type = error_type;
  }

  @SerializedName("error_code")
  private String error_code;
  public String getErrorCode() {
    return error_code;
  }
  public void setErrorCode(String error_code) {
    this.error_code = error_code;
  }

  @SerializedName("error_message")
  private String error_message;
  public String getErrorMessage() {
    return error_message;
  }
  public void setErrorMessage(String error_message) {
    this.error_message = error_message;
  }

  @SerializedName("values")
  private String values;
  public String getValues() {
    return values;
  }
  public void setValues(String values) {
    this.values = values;
  }
}
