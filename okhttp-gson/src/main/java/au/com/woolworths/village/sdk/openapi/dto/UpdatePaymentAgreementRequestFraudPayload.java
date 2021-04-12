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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Set to null to skip the fraud check. Only required if the payment agreement payment instrument id is being changed to a different payment instrument.
 */
@ApiModel(description = "Set to null to skip the fraud check. Only required if the payment agreement payment instrument id is being changed to a different payment instrument.")

public class UpdatePaymentAgreementRequestFraudPayload implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  /**
   * The fraud check message format.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    ZIP_BASE_64_ENCODED("ZIP_BASE_64_ENCODED"),
    
    XML("XML");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  /**
   * The fraud check response message format.
   */
  @JsonAdapter(ResponseFormatEnum.Adapter.class)
  public enum ResponseFormatEnum {
    ZIP_BASE_64_ENCODED("ZIP_BASE_64_ENCODED"),
    
    XML("XML");

    private String value;

    ResponseFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponseFormatEnum fromValue(String value) {
      for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResponseFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponseFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResponseFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESPONSE_FORMAT = "responseFormat";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FORMAT)
  private ResponseFormatEnum responseFormat;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public UpdatePaymentAgreementRequestFraudPayload provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * The fraud check provider.
   * @return provider
  **/
  @ApiModelProperty(example = "cybersource", required = true, value = "The fraud check provider.")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public UpdatePaymentAgreementRequestFraudPayload version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The fraud check version.
   * @return version
  **/
  @ApiModelProperty(example = "CyberSourceTransaction_1.101", required = true, value = "The fraud check version.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public UpdatePaymentAgreementRequestFraudPayload format(FormatEnum format) {
    
    this.format = format;
    return this;
  }

   /**
   * The fraud check message format.
   * @return format
  **/
  @ApiModelProperty(required = true, value = "The fraud check message format.")

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public UpdatePaymentAgreementRequestFraudPayload responseFormat(ResponseFormatEnum responseFormat) {
    
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * The fraud check response message format.
   * @return responseFormat
  **/
  @ApiModelProperty(required = true, value = "The fraud check response message format.")

  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }


  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }


  public UpdatePaymentAgreementRequestFraudPayload message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The fraud check message.
   * @return message
  **/
  @ApiModelProperty(example = "GzbOxpLagX6iFEb7td61cZyA=", required = true, value = "The fraud check message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentAgreementRequestFraudPayload updatePaymentAgreementRequestFraudPayload = (UpdatePaymentAgreementRequestFraudPayload) o;
    return Objects.equals(this.provider, updatePaymentAgreementRequestFraudPayload.provider) &&
        Objects.equals(this.version, updatePaymentAgreementRequestFraudPayload.version) &&
        Objects.equals(this.format, updatePaymentAgreementRequestFraudPayload.format) &&
        Objects.equals(this.responseFormat, updatePaymentAgreementRequestFraudPayload.responseFormat) &&
        Objects.equals(this.message, updatePaymentAgreementRequestFraudPayload.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, version, format, responseFormat, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentAgreementRequestFraudPayload {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
