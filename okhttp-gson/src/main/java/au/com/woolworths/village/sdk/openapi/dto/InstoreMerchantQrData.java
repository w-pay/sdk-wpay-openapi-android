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
 * Mandatory data object containing response
 */
@ApiModel(description = "Mandatory data object containing response")

public class InstoreMerchantQrData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  /**
   * The type of ID held in referenceId
   */
  @JsonAdapter(ReferenceTypeEnum.Adapter.class)
  public enum ReferenceTypeEnum {
    REQUEST("PAYMENT_REQUEST"),
    
    SESSION("PAYMENT_SESSION");

    private String value;

    ReferenceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReferenceTypeEnum fromValue(String value) {
      for (ReferenceTypeEnum b : ReferenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReferenceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferenceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferenceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReferenceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFERENCE_TYPE = "referenceType";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TYPE)
  private ReferenceTypeEnum referenceType;

  public static final String SERIALIZED_NAME_TIME_TO_LIVE = "timeToLive";
  @SerializedName(SERIALIZED_NAME_TIME_TO_LIVE)
  private Integer timeToLive = 0;


  public InstoreMerchantQrData referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * The ID of the payment request linked to this QR code
   * @return referenceId
  **/
  @ApiModelProperty(required = true, value = "The ID of the payment request linked to this QR code")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public InstoreMerchantQrData referenceType(ReferenceTypeEnum referenceType) {
    
    this.referenceType = referenceType;
    return this;
  }

   /**
   * The type of ID held in referenceId
   * @return referenceType
  **/
  @ApiModelProperty(example = "PAYMENT_REQUEST", required = true, value = "The type of ID held in referenceId")

  public ReferenceTypeEnum getReferenceType() {
    return referenceType;
  }


  public void setReferenceType(ReferenceTypeEnum referenceType) {
    this.referenceType = referenceType;
  }


  public InstoreMerchantQrData timeToLive(Integer timeToLive) {
    
    this.timeToLive = timeToLive;
    return this;
  }

   /**
   * The time in seconds that the QR code should remain valid.  After this time any use of the QR code by a customer will fail to return any data. Default value is 0 which indicates that the code will not expire until it is deleted
   * minimum: 0
   * @return timeToLive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time in seconds that the QR code should remain valid.  After this time any use of the QR code by a customer will fail to return any data. Default value is 0 which indicates that the code will not expire until it is deleted")

  public Integer getTimeToLive() {
    return timeToLive;
  }


  public void setTimeToLive(Integer timeToLive) {
    this.timeToLive = timeToLive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstoreMerchantQrData instoreMerchantQrData = (InstoreMerchantQrData) o;
    return Objects.equals(this.referenceId, instoreMerchantQrData.referenceId) &&
        Objects.equals(this.referenceType, instoreMerchantQrData.referenceType) &&
        Objects.equals(this.timeToLive, instoreMerchantQrData.timeToLive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, referenceType, timeToLive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstoreMerchantQrData {\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
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

