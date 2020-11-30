/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package apptest.entity;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MassPushLogs extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8572344549975883325L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MassPushLogs\",\"namespace\":\"apptest.entity\",\"fields\":[{\"name\":\"uid\",\"type\":\"string\"},{\"name\":\"event_hash\",\"type\":\"string\"},{\"name\":\"event_name\",\"type\":\"string\"},{\"name\":\"api_key\",\"type\":\"string\"},{\"name\":\"encrypted_target\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"mass_push_id\",\"type\":\"string\"},{\"name\":\"plugin_type\",\"type\":\"string\"},{\"name\":\"schedule_id\",\"type\":\"string\"},{\"name\":\"schedule_task_id\",\"type\":\"string\"},{\"name\":\"error_type\",\"type\":\"string\"},{\"name\":\"error_code\",\"type\":\"string\"},{\"name\":\"error_message\",\"type\":\"string\"},{\"name\":\"values\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MassPushLogs> ENCODER =
      new BinaryMessageEncoder<MassPushLogs>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MassPushLogs> DECODER =
      new BinaryMessageDecoder<MassPushLogs>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<MassPushLogs> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<MassPushLogs> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MassPushLogs>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this MassPushLogs to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a MassPushLogs from a ByteBuffer. */
  public static MassPushLogs fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence uid;
  @Deprecated public java.lang.CharSequence event_hash;
  @Deprecated public java.lang.CharSequence event_name;
  @Deprecated public java.lang.CharSequence api_key;
  @Deprecated public java.lang.CharSequence encrypted_target;
  @Deprecated public org.joda.time.DateTime timestamp;
  @Deprecated public java.lang.CharSequence mass_push_id;
  @Deprecated public java.lang.CharSequence plugin_type;
  @Deprecated public java.lang.CharSequence schedule_id;
  @Deprecated public java.lang.CharSequence schedule_task_id;
  @Deprecated public java.lang.CharSequence error_type;
  @Deprecated public java.lang.CharSequence error_code;
  @Deprecated public java.lang.CharSequence error_message;
  @Deprecated public java.lang.CharSequence values;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MassPushLogs() {}

  /**
   * All-args constructor.
   * @param uid The new value for uid
   * @param event_hash The new value for event_hash
   * @param event_name The new value for event_name
   * @param api_key The new value for api_key
   * @param encrypted_target The new value for encrypted_target
   * @param timestamp The new value for timestamp
   * @param mass_push_id The new value for mass_push_id
   * @param plugin_type The new value for plugin_type
   * @param schedule_id The new value for schedule_id
   * @param schedule_task_id The new value for schedule_task_id
   * @param error_type The new value for error_type
   * @param error_code The new value for error_code
   * @param error_message The new value for error_message
   * @param values The new value for values
   */
  public MassPushLogs(java.lang.CharSequence uid, java.lang.CharSequence event_hash, java.lang.CharSequence event_name, java.lang.CharSequence api_key, java.lang.CharSequence encrypted_target, org.joda.time.DateTime timestamp, java.lang.CharSequence mass_push_id, java.lang.CharSequence plugin_type, java.lang.CharSequence schedule_id, java.lang.CharSequence schedule_task_id, java.lang.CharSequence error_type, java.lang.CharSequence error_code, java.lang.CharSequence error_message, java.lang.CharSequence values) {
    this.uid = uid;
    this.event_hash = event_hash;
    this.event_name = event_name;
    this.api_key = api_key;
    this.encrypted_target = encrypted_target;
    this.timestamp = timestamp;
    this.mass_push_id = mass_push_id;
    this.plugin_type = plugin_type;
    this.schedule_id = schedule_id;
    this.schedule_task_id = schedule_task_id;
    this.error_type = error_type;
    this.error_code = error_code;
    this.error_message = error_message;
    this.values = values;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uid;
    case 1: return event_hash;
    case 2: return event_name;
    case 3: return api_key;
    case 4: return encrypted_target;
    case 5: return timestamp;
    case 6: return mass_push_id;
    case 7: return plugin_type;
    case 8: return schedule_id;
    case 9: return schedule_task_id;
    case 10: return error_type;
    case 11: return error_code;
    case 12: return error_message;
    case 13: return values;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  protected static final org.apache.avro.data.TimeConversions.DateConversion DATE_CONVERSION = new org.apache.avro.data.TimeConversions.DateConversion();
  protected static final org.apache.avro.data.TimeConversions.TimeConversion TIME_CONVERSION = new org.apache.avro.data.TimeConversions.TimeConversion();
  protected static final org.apache.avro.data.TimeConversions.TimestampConversion TIMESTAMP_CONVERSION = new org.apache.avro.data.TimeConversions.TimestampConversion();
  protected static final org.apache.avro.Conversions.DecimalConversion DECIMAL_CONVERSION = new org.apache.avro.Conversions.DecimalConversion();

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      null,
      TIMESTAMP_CONVERSION,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uid = (java.lang.CharSequence)value$; break;
    case 1: event_hash = (java.lang.CharSequence)value$; break;
    case 2: event_name = (java.lang.CharSequence)value$; break;
    case 3: api_key = (java.lang.CharSequence)value$; break;
    case 4: encrypted_target = (java.lang.CharSequence)value$; break;
    case 5: timestamp = (org.joda.time.DateTime)value$; break;
    case 6: mass_push_id = (java.lang.CharSequence)value$; break;
    case 7: plugin_type = (java.lang.CharSequence)value$; break;
    case 8: schedule_id = (java.lang.CharSequence)value$; break;
    case 9: schedule_task_id = (java.lang.CharSequence)value$; break;
    case 10: error_type = (java.lang.CharSequence)value$; break;
    case 11: error_code = (java.lang.CharSequence)value$; break;
    case 12: error_message = (java.lang.CharSequence)value$; break;
    case 13: values = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uid' field.
   * @return The value of the 'uid' field.
   */
  public java.lang.CharSequence getUid() {
    return uid;
  }

  /**
   * Sets the value of the 'uid' field.
   * @param value the value to set.
   */
  public void setUid(java.lang.CharSequence value) {
    this.uid = value;
  }

  /**
   * Gets the value of the 'event_hash' field.
   * @return The value of the 'event_hash' field.
   */
  public java.lang.CharSequence getEventHash() {
    return event_hash;
  }

  /**
   * Sets the value of the 'event_hash' field.
   * @param value the value to set.
   */
  public void setEventHash(java.lang.CharSequence value) {
    this.event_hash = value;
  }

  /**
   * Gets the value of the 'event_name' field.
   * @return The value of the 'event_name' field.
   */
  public java.lang.CharSequence getEventName() {
    return event_name;
  }

  /**
   * Sets the value of the 'event_name' field.
   * @param value the value to set.
   */
  public void setEventName(java.lang.CharSequence value) {
    this.event_name = value;
  }

  /**
   * Gets the value of the 'api_key' field.
   * @return The value of the 'api_key' field.
   */
  public java.lang.CharSequence getApiKey() {
    return api_key;
  }

  /**
   * Sets the value of the 'api_key' field.
   * @param value the value to set.
   */
  public void setApiKey(java.lang.CharSequence value) {
    this.api_key = value;
  }

  /**
   * Gets the value of the 'encrypted_target' field.
   * @return The value of the 'encrypted_target' field.
   */
  public java.lang.CharSequence getEncryptedTarget() {
    return encrypted_target;
  }

  /**
   * Sets the value of the 'encrypted_target' field.
   * @param value the value to set.
   */
  public void setEncryptedTarget(java.lang.CharSequence value) {
    this.encrypted_target = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public org.joda.time.DateTime getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(org.joda.time.DateTime value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'mass_push_id' field.
   * @return The value of the 'mass_push_id' field.
   */
  public java.lang.CharSequence getMassPushId() {
    return mass_push_id;
  }

  /**
   * Sets the value of the 'mass_push_id' field.
   * @param value the value to set.
   */
  public void setMassPushId(java.lang.CharSequence value) {
    this.mass_push_id = value;
  }

  /**
   * Gets the value of the 'plugin_type' field.
   * @return The value of the 'plugin_type' field.
   */
  public java.lang.CharSequence getPluginType() {
    return plugin_type;
  }

  /**
   * Sets the value of the 'plugin_type' field.
   * @param value the value to set.
   */
  public void setPluginType(java.lang.CharSequence value) {
    this.plugin_type = value;
  }

  /**
   * Gets the value of the 'schedule_id' field.
   * @return The value of the 'schedule_id' field.
   */
  public java.lang.CharSequence getScheduleId() {
    return schedule_id;
  }

  /**
   * Sets the value of the 'schedule_id' field.
   * @param value the value to set.
   */
  public void setScheduleId(java.lang.CharSequence value) {
    this.schedule_id = value;
  }

  /**
   * Gets the value of the 'schedule_task_id' field.
   * @return The value of the 'schedule_task_id' field.
   */
  public java.lang.CharSequence getScheduleTaskId() {
    return schedule_task_id;
  }

  /**
   * Sets the value of the 'schedule_task_id' field.
   * @param value the value to set.
   */
  public void setScheduleTaskId(java.lang.CharSequence value) {
    this.schedule_task_id = value;
  }

  /**
   * Gets the value of the 'error_type' field.
   * @return The value of the 'error_type' field.
   */
  public java.lang.CharSequence getErrorType() {
    return error_type;
  }

  /**
   * Sets the value of the 'error_type' field.
   * @param value the value to set.
   */
  public void setErrorType(java.lang.CharSequence value) {
    this.error_type = value;
  }

  /**
   * Gets the value of the 'error_code' field.
   * @return The value of the 'error_code' field.
   */
  public java.lang.CharSequence getErrorCode() {
    return error_code;
  }

  /**
   * Sets the value of the 'error_code' field.
   * @param value the value to set.
   */
  public void setErrorCode(java.lang.CharSequence value) {
    this.error_code = value;
  }

  /**
   * Gets the value of the 'error_message' field.
   * @return The value of the 'error_message' field.
   */
  public java.lang.CharSequence getErrorMessage() {
    return error_message;
  }

  /**
   * Sets the value of the 'error_message' field.
   * @param value the value to set.
   */
  public void setErrorMessage(java.lang.CharSequence value) {
    this.error_message = value;
  }

  /**
   * Gets the value of the 'values' field.
   * @return The value of the 'values' field.
   */
  public java.lang.CharSequence getValues() {
    return values;
  }

  /**
   * Sets the value of the 'values' field.
   * @param value the value to set.
   */
  public void setValues(java.lang.CharSequence value) {
    this.values = value;
  }

  /**
   * Creates a new MassPushLogs RecordBuilder.
   * @return A new MassPushLogs RecordBuilder
   */
  public static apptest.entity.MassPushLogs.Builder newBuilder() {
    return new apptest.entity.MassPushLogs.Builder();
  }

  /**
   * Creates a new MassPushLogs RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MassPushLogs RecordBuilder
   */
  public static apptest.entity.MassPushLogs.Builder newBuilder(apptest.entity.MassPushLogs.Builder other) {
    return new apptest.entity.MassPushLogs.Builder(other);
  }

  /**
   * Creates a new MassPushLogs RecordBuilder by copying an existing MassPushLogs instance.
   * @param other The existing instance to copy.
   * @return A new MassPushLogs RecordBuilder
   */
  public static apptest.entity.MassPushLogs.Builder newBuilder(apptest.entity.MassPushLogs other) {
    return new apptest.entity.MassPushLogs.Builder(other);
  }

  /**
   * RecordBuilder for MassPushLogs instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MassPushLogs>
    implements org.apache.avro.data.RecordBuilder<MassPushLogs> {

    private java.lang.CharSequence uid;
    private java.lang.CharSequence event_hash;
    private java.lang.CharSequence event_name;
    private java.lang.CharSequence api_key;
    private java.lang.CharSequence encrypted_target;
    private org.joda.time.DateTime timestamp;
    private java.lang.CharSequence mass_push_id;
    private java.lang.CharSequence plugin_type;
    private java.lang.CharSequence schedule_id;
    private java.lang.CharSequence schedule_task_id;
    private java.lang.CharSequence error_type;
    private java.lang.CharSequence error_code;
    private java.lang.CharSequence error_message;
    private java.lang.CharSequence values;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(apptest.entity.MassPushLogs.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event_hash)) {
        this.event_hash = data().deepCopy(fields()[1].schema(), other.event_hash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.event_name)) {
        this.event_name = data().deepCopy(fields()[2].schema(), other.event_name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.api_key)) {
        this.api_key = data().deepCopy(fields()[3].schema(), other.api_key);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.encrypted_target)) {
        this.encrypted_target = data().deepCopy(fields()[4].schema(), other.encrypted_target);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[5].schema(), other.timestamp);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.mass_push_id)) {
        this.mass_push_id = data().deepCopy(fields()[6].schema(), other.mass_push_id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.plugin_type)) {
        this.plugin_type = data().deepCopy(fields()[7].schema(), other.plugin_type);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.schedule_id)) {
        this.schedule_id = data().deepCopy(fields()[8].schema(), other.schedule_id);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.schedule_task_id)) {
        this.schedule_task_id = data().deepCopy(fields()[9].schema(), other.schedule_task_id);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.error_type)) {
        this.error_type = data().deepCopy(fields()[10].schema(), other.error_type);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.error_code)) {
        this.error_code = data().deepCopy(fields()[11].schema(), other.error_code);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.error_message)) {
        this.error_message = data().deepCopy(fields()[12].schema(), other.error_message);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.values)) {
        this.values = data().deepCopy(fields()[13].schema(), other.values);
        fieldSetFlags()[13] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MassPushLogs instance
     * @param other The existing instance to copy.
     */
    private Builder(apptest.entity.MassPushLogs other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event_hash)) {
        this.event_hash = data().deepCopy(fields()[1].schema(), other.event_hash);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.event_name)) {
        this.event_name = data().deepCopy(fields()[2].schema(), other.event_name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.api_key)) {
        this.api_key = data().deepCopy(fields()[3].schema(), other.api_key);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.encrypted_target)) {
        this.encrypted_target = data().deepCopy(fields()[4].schema(), other.encrypted_target);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[5].schema(), other.timestamp);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.mass_push_id)) {
        this.mass_push_id = data().deepCopy(fields()[6].schema(), other.mass_push_id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.plugin_type)) {
        this.plugin_type = data().deepCopy(fields()[7].schema(), other.plugin_type);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.schedule_id)) {
        this.schedule_id = data().deepCopy(fields()[8].schema(), other.schedule_id);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.schedule_task_id)) {
        this.schedule_task_id = data().deepCopy(fields()[9].schema(), other.schedule_task_id);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.error_type)) {
        this.error_type = data().deepCopy(fields()[10].schema(), other.error_type);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.error_code)) {
        this.error_code = data().deepCopy(fields()[11].schema(), other.error_code);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.error_message)) {
        this.error_message = data().deepCopy(fields()[12].schema(), other.error_message);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.values)) {
        this.values = data().deepCopy(fields()[13].schema(), other.values);
        fieldSetFlags()[13] = true;
      }
    }

    /**
      * Gets the value of the 'uid' field.
      * @return The value.
      */
    public java.lang.CharSequence getUid() {
      return uid;
    }

    /**
      * Sets the value of the 'uid' field.
      * @param value The value of 'uid'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setUid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.uid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'uid' field has been set.
      * @return True if the 'uid' field has been set, false otherwise.
      */
    public boolean hasUid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'uid' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearUid() {
      uid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'event_hash' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventHash() {
      return event_hash;
    }

    /**
      * Sets the value of the 'event_hash' field.
      * @param value The value of 'event_hash'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setEventHash(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.event_hash = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'event_hash' field has been set.
      * @return True if the 'event_hash' field has been set, false otherwise.
      */
    public boolean hasEventHash() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'event_hash' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearEventHash() {
      event_hash = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'event_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventName() {
      return event_name;
    }

    /**
      * Sets the value of the 'event_name' field.
      * @param value The value of 'event_name'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setEventName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.event_name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'event_name' field has been set.
      * @return True if the 'event_name' field has been set, false otherwise.
      */
    public boolean hasEventName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'event_name' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearEventName() {
      event_name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'api_key' field.
      * @return The value.
      */
    public java.lang.CharSequence getApiKey() {
      return api_key;
    }

    /**
      * Sets the value of the 'api_key' field.
      * @param value The value of 'api_key'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setApiKey(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.api_key = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'api_key' field has been set.
      * @return True if the 'api_key' field has been set, false otherwise.
      */
    public boolean hasApiKey() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'api_key' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearApiKey() {
      api_key = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'encrypted_target' field.
      * @return The value.
      */
    public java.lang.CharSequence getEncryptedTarget() {
      return encrypted_target;
    }

    /**
      * Sets the value of the 'encrypted_target' field.
      * @param value The value of 'encrypted_target'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setEncryptedTarget(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.encrypted_target = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'encrypted_target' field has been set.
      * @return True if the 'encrypted_target' field has been set, false otherwise.
      */
    public boolean hasEncryptedTarget() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'encrypted_target' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearEncryptedTarget() {
      encrypted_target = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public org.joda.time.DateTime getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setTimestamp(org.joda.time.DateTime value) {
      validate(fields()[5], value);
      this.timestamp = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearTimestamp() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'mass_push_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getMassPushId() {
      return mass_push_id;
    }

    /**
      * Sets the value of the 'mass_push_id' field.
      * @param value The value of 'mass_push_id'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setMassPushId(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.mass_push_id = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'mass_push_id' field has been set.
      * @return True if the 'mass_push_id' field has been set, false otherwise.
      */
    public boolean hasMassPushId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'mass_push_id' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearMassPushId() {
      mass_push_id = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'plugin_type' field.
      * @return The value.
      */
    public java.lang.CharSequence getPluginType() {
      return plugin_type;
    }

    /**
      * Sets the value of the 'plugin_type' field.
      * @param value The value of 'plugin_type'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setPluginType(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.plugin_type = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'plugin_type' field has been set.
      * @return True if the 'plugin_type' field has been set, false otherwise.
      */
    public boolean hasPluginType() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'plugin_type' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearPluginType() {
      plugin_type = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'schedule_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getScheduleId() {
      return schedule_id;
    }

    /**
      * Sets the value of the 'schedule_id' field.
      * @param value The value of 'schedule_id'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setScheduleId(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.schedule_id = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'schedule_id' field has been set.
      * @return True if the 'schedule_id' field has been set, false otherwise.
      */
    public boolean hasScheduleId() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'schedule_id' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearScheduleId() {
      schedule_id = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'schedule_task_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getScheduleTaskId() {
      return schedule_task_id;
    }

    /**
      * Sets the value of the 'schedule_task_id' field.
      * @param value The value of 'schedule_task_id'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setScheduleTaskId(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.schedule_task_id = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'schedule_task_id' field has been set.
      * @return True if the 'schedule_task_id' field has been set, false otherwise.
      */
    public boolean hasScheduleTaskId() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'schedule_task_id' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearScheduleTaskId() {
      schedule_task_id = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'error_type' field.
      * @return The value.
      */
    public java.lang.CharSequence getErrorType() {
      return error_type;
    }

    /**
      * Sets the value of the 'error_type' field.
      * @param value The value of 'error_type'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setErrorType(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.error_type = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'error_type' field has been set.
      * @return True if the 'error_type' field has been set, false otherwise.
      */
    public boolean hasErrorType() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'error_type' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearErrorType() {
      error_type = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'error_code' field.
      * @return The value.
      */
    public java.lang.CharSequence getErrorCode() {
      return error_code;
    }

    /**
      * Sets the value of the 'error_code' field.
      * @param value The value of 'error_code'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setErrorCode(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.error_code = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'error_code' field has been set.
      * @return True if the 'error_code' field has been set, false otherwise.
      */
    public boolean hasErrorCode() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'error_code' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearErrorCode() {
      error_code = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'error_message' field.
      * @return The value.
      */
    public java.lang.CharSequence getErrorMessage() {
      return error_message;
    }

    /**
      * Sets the value of the 'error_message' field.
      * @param value The value of 'error_message'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setErrorMessage(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.error_message = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'error_message' field has been set.
      * @return True if the 'error_message' field has been set, false otherwise.
      */
    public boolean hasErrorMessage() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'error_message' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearErrorMessage() {
      error_message = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'values' field.
      * @return The value.
      */
    public java.lang.CharSequence getValues() {
      return values;
    }

    /**
      * Sets the value of the 'values' field.
      * @param value The value of 'values'.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder setValues(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.values = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'values' field has been set.
      * @return True if the 'values' field has been set, false otherwise.
      */
    public boolean hasValues() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'values' field.
      * @return This builder.
      */
    public apptest.entity.MassPushLogs.Builder clearValues() {
      values = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MassPushLogs build() {
      try {
        MassPushLogs record = new MassPushLogs();
        record.uid = fieldSetFlags()[0] ? this.uid : (java.lang.CharSequence) defaultValue(fields()[0], record.getConversion(0));
        record.event_hash = fieldSetFlags()[1] ? this.event_hash : (java.lang.CharSequence) defaultValue(fields()[1], record.getConversion(1));
        record.event_name = fieldSetFlags()[2] ? this.event_name : (java.lang.CharSequence) defaultValue(fields()[2], record.getConversion(2));
        record.api_key = fieldSetFlags()[3] ? this.api_key : (java.lang.CharSequence) defaultValue(fields()[3], record.getConversion(3));
        record.encrypted_target = fieldSetFlags()[4] ? this.encrypted_target : (java.lang.CharSequence) defaultValue(fields()[4], record.getConversion(4));
        record.timestamp = fieldSetFlags()[5] ? this.timestamp : (org.joda.time.DateTime) defaultValue(fields()[5], record.getConversion(5));
        record.mass_push_id = fieldSetFlags()[6] ? this.mass_push_id : (java.lang.CharSequence) defaultValue(fields()[6], record.getConversion(6));
        record.plugin_type = fieldSetFlags()[7] ? this.plugin_type : (java.lang.CharSequence) defaultValue(fields()[7], record.getConversion(7));
        record.schedule_id = fieldSetFlags()[8] ? this.schedule_id : (java.lang.CharSequence) defaultValue(fields()[8], record.getConversion(8));
        record.schedule_task_id = fieldSetFlags()[9] ? this.schedule_task_id : (java.lang.CharSequence) defaultValue(fields()[9], record.getConversion(9));
        record.error_type = fieldSetFlags()[10] ? this.error_type : (java.lang.CharSequence) defaultValue(fields()[10], record.getConversion(10));
        record.error_code = fieldSetFlags()[11] ? this.error_code : (java.lang.CharSequence) defaultValue(fields()[11], record.getConversion(11));
        record.error_message = fieldSetFlags()[12] ? this.error_message : (java.lang.CharSequence) defaultValue(fields()[12], record.getConversion(12));
        record.values = fieldSetFlags()[13] ? this.values : (java.lang.CharSequence) defaultValue(fields()[13], record.getConversion(13));
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MassPushLogs>
    WRITER$ = (org.apache.avro.io.DatumWriter<MassPushLogs>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MassPushLogs>
    READER$ = (org.apache.avro.io.DatumReader<MassPushLogs>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}