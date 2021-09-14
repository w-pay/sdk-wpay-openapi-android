/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * PaymentsRPVSErrorResponseValidationErrors
 */

public class PaymentsRPVSErrorResponseValidationErrors implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of restricted product rule that was violated.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NOT_ALLOWED("NOT_ALLOWED"),
    
    ALLOWED("ALLOWED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_REASON_DESCRIPTION = "reasonDescription";
  @SerializedName(SERIALIZED_NAME_REASON_DESCRIPTION)
  private String reasonDescription;


  public PaymentsRPVSErrorResponseValidationErrors type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of restricted product rule that was violated.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of restricted product rule that was violated.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentsRPVSErrorResponseValidationErrors reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * The reason code of the restricted product rule that was violated.
   * @return reasonCode
  **/
  @ApiModelProperty(example = "RCNA0001", required = true, value = "The reason code of the restricted product rule that was violated.")

  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public PaymentsRPVSErrorResponseValidationErrors reasonDescription(String reasonDescription) {
    
    this.reasonDescription = reasonDescription;
    return this;
  }

   /**
   * The reason description of the restricted product rule that was violated.
   * @return reasonDescription
  **/
  @ApiModelProperty(example = "Some description for RCNA0001", required = true, value = "The reason description of the restricted product rule that was violated.")

  public String getReasonDescription() {
    return reasonDescription;
  }


  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsRPVSErrorResponseValidationErrors paymentsRPVSErrorResponseValidationErrors = (PaymentsRPVSErrorResponseValidationErrors) o;
    return Objects.equals(this.type, paymentsRPVSErrorResponseValidationErrors.type) &&
        Objects.equals(this.reasonCode, paymentsRPVSErrorResponseValidationErrors.reasonCode) &&
        Objects.equals(this.reasonDescription, paymentsRPVSErrorResponseValidationErrors.reasonDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, reasonCode, reasonDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRPVSErrorResponseValidationErrors {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
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

