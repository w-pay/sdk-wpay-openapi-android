/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentsSuccessResponseExtendedTransactionData1
 */

public class PaymentsSuccessResponseExtendedTransactionData1 implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The name of the extended transaction data field.
   */
  @JsonAdapter(FieldEnum.Adapter.class)
  public enum FieldEnum {
    BIN("bin");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldEnum fromValue(String value) {
      for (FieldEnum b : FieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FieldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldEnum field;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public PaymentsSuccessResponseExtendedTransactionData1 field(FieldEnum field) {
    
    this.field = field;
    return this;
  }

   /**
   * The name of the extended transaction data field.
   * @return field
  **/
  @ApiModelProperty(required = true, value = "The name of the extended transaction data field.")

  public FieldEnum getField() {
    return field;
  }


  public void setField(FieldEnum field) {
    this.field = field;
  }


  public PaymentsSuccessResponseExtendedTransactionData1 value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the extended transaction data field.
   * @return value
  **/
  @ApiModelProperty(example = "376445", required = true, value = "The value of the extended transaction data field.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsSuccessResponseExtendedTransactionData1 paymentsSuccessResponseExtendedTransactionData1 = (PaymentsSuccessResponseExtendedTransactionData1) o;
    return Objects.equals(this.field, paymentsSuccessResponseExtendedTransactionData1.field) &&
        Objects.equals(this.value, paymentsSuccessResponseExtendedTransactionData1.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsSuccessResponseExtendedTransactionData1 {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

