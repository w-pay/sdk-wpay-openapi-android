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
import au.com.woolworths.village.sdk.openapi.dto.GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * Mandatory data object containing response
 */
@ApiModel(description = "Mandatory data object containing response")

public class GetCustomerPaymentInstrumentResultData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_TYPE = "paymentInstrumentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_TYPE)
  private String paymentInstrumentType;

  /**
   * The status of the payment instrument in the container.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNVERIFIED_PERSISTENT("UNVERIFIED_PERSISTENT"),
    
    VERIFIED("VERIFIED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_LAST_USED = "lastUsed";
  @SerializedName(SERIALIZED_NAME_LAST_USED)
  private OffsetDateTime lastUsed;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_DETAIL = "paymentInstrumentDetail";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_DETAIL)
  private GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetail paymentInstrumentDetail;


  public GetCustomerPaymentInstrumentResultData paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The payment instrument id.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "90731", required = true, value = "The payment instrument id.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public GetCustomerPaymentInstrumentResultData paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The payment token. The payment token is a unique identifier for the payment instrument.
   * @return paymentToken
  **/
  @ApiModelProperty(example = "712029a1-c0aa-41bc-a810-3d42424c5834", required = true, value = "The payment token. The payment token is a unique identifier for the payment instrument.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public GetCustomerPaymentInstrumentResultData paymentInstrumentType(String paymentInstrumentType) {
    
    this.paymentInstrumentType = paymentInstrumentType;
    return this;
  }

   /**
   * The type of the payment instrument.
   * @return paymentInstrumentType
  **/
  @ApiModelProperty(example = "GIFT_CARD", required = true, value = "The type of the payment instrument.")

  public String getPaymentInstrumentType() {
    return paymentInstrumentType;
  }


  public void setPaymentInstrumentType(String paymentInstrumentType) {
    this.paymentInstrumentType = paymentInstrumentType;
  }


  public GetCustomerPaymentInstrumentResultData status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the payment instrument in the container.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the payment instrument in the container.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public GetCustomerPaymentInstrumentResultData createdOn(OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * The timestamp for when the payment instrument was added. The timestamp format is ISO8601.
   * @return createdOn
  **/
  @ApiModelProperty(example = "2017-11-06T19:38:09.890+11:00", required = true, value = "The timestamp for when the payment instrument was added. The timestamp format is ISO8601.")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public GetCustomerPaymentInstrumentResultData lastUpdated(OffsetDateTime lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The timestamp the payment instrument was last updated in the container. The timestamp format is ISO8601.
   * @return lastUpdated
  **/
  @ApiModelProperty(example = "2017-11-06T19:38:09.890+11:00", required = true, value = "The timestamp the payment instrument was last updated in the container. The timestamp format is ISO8601.")

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public GetCustomerPaymentInstrumentResultData lastUsed(OffsetDateTime lastUsed) {
    
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * The timestamp the payment instrument was last used in the container. The timestamp format is ISO8601. Will be null if never used.
   * @return lastUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-06T19:38:09.890+11:00", value = "The timestamp the payment instrument was last used in the container. The timestamp format is ISO8601. Will be null if never used.")

  public OffsetDateTime getLastUsed() {
    return lastUsed;
  }


  public void setLastUsed(OffsetDateTime lastUsed) {
    this.lastUsed = lastUsed;
  }


  public GetCustomerPaymentInstrumentResultData primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * A flag to indicate if this payment instrument is the primary instrument in the container.
   * @return primary
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if this payment instrument is the primary instrument in the container.")

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public GetCustomerPaymentInstrumentResultData allowed(Boolean allowed) {
    
    this.allowed = allowed;
    return this;
  }

   /**
   * A flag to indicate if the merchant profile in the container allows the use of this payment instrument.
   * @return allowed
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if the merchant profile in the container allows the use of this payment instrument.")

  public Boolean getAllowed() {
    return allowed;
  }


  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  public GetCustomerPaymentInstrumentResultData paymentInstrumentDetail(GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetail paymentInstrumentDetail) {
    
    this.paymentInstrumentDetail = paymentInstrumentDetail;
    return this;
  }

   /**
   * Get paymentInstrumentDetail
   * @return paymentInstrumentDetail
  **/
  @ApiModelProperty(required = true, value = "")

  public GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetail getPaymentInstrumentDetail() {
    return paymentInstrumentDetail;
  }


  public void setPaymentInstrumentDetail(GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetail paymentInstrumentDetail) {
    this.paymentInstrumentDetail = paymentInstrumentDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerPaymentInstrumentResultData getCustomerPaymentInstrumentResultData = (GetCustomerPaymentInstrumentResultData) o;
    return Objects.equals(this.paymentInstrumentId, getCustomerPaymentInstrumentResultData.paymentInstrumentId) &&
        Objects.equals(this.paymentToken, getCustomerPaymentInstrumentResultData.paymentToken) &&
        Objects.equals(this.paymentInstrumentType, getCustomerPaymentInstrumentResultData.paymentInstrumentType) &&
        Objects.equals(this.status, getCustomerPaymentInstrumentResultData.status) &&
        Objects.equals(this.createdOn, getCustomerPaymentInstrumentResultData.createdOn) &&
        Objects.equals(this.lastUpdated, getCustomerPaymentInstrumentResultData.lastUpdated) &&
        Objects.equals(this.lastUsed, getCustomerPaymentInstrumentResultData.lastUsed) &&
        Objects.equals(this.primary, getCustomerPaymentInstrumentResultData.primary) &&
        Objects.equals(this.allowed, getCustomerPaymentInstrumentResultData.allowed) &&
        Objects.equals(this.paymentInstrumentDetail, getCustomerPaymentInstrumentResultData.paymentInstrumentDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, paymentToken, paymentInstrumentType, status, createdOn, lastUpdated, lastUsed, primary, allowed, paymentInstrumentDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerPaymentInstrumentResultData {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paymentInstrumentType: ").append(toIndentedString(paymentInstrumentType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    paymentInstrumentDetail: ").append(toIndentedString(paymentInstrumentDetail)).append("\n");
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

