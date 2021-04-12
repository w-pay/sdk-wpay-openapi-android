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

import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * ListPaymentInstrumentsResponsePayPal
 */

public class ListPaymentInstrumentsResponsePayPal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

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

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private String lastUpdated;

  public static final String SERIALIZED_NAME_LAST_USED = "lastUsed";
  @SerializedName(SERIALIZED_NAME_LAST_USED)
  private String lastUsed;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  public static final String SERIALIZED_NAME_PAY_PAL_ID = "payPalId";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_ID)
  private String payPalId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;


  public ListPaymentInstrumentsResponsePayPal paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The paypal payment instrument id.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "90271", required = true, value = "The paypal payment instrument id.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public ListPaymentInstrumentsResponsePayPal paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The paypal payment token. The payment token is a unique identifier for the payment instrument.
   * @return paymentToken
  **/
  @ApiModelProperty(example = "15f774d0-e42e-11e9-a359-2a2ae2dbcce4", required = true, value = "The paypal payment token. The payment token is a unique identifier for the payment instrument.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public ListPaymentInstrumentsResponsePayPal status(StatusEnum status) {
    
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


  public ListPaymentInstrumentsResponsePayPal lastUpdated(String lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The timestamp the payment instrument was last updated in the container. The timestamp format is ISO8601.
   * @return lastUpdated
  **/
  @ApiModelProperty(example = "2017-11-06T08:38:09.860Z", required = true, value = "The timestamp the payment instrument was last updated in the container. The timestamp format is ISO8601.")

  public String getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public ListPaymentInstrumentsResponsePayPal lastUsed(String lastUsed) {
    
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * The timestamp the payment instrument was last used in the container. The timestamp format is ISO8601. Will be null if never used.
   * @return lastUsed
  **/
  @ApiModelProperty(example = "2017-11-06T08:38:09.860Z", required = true, value = "The timestamp the payment instrument was last used in the container. The timestamp format is ISO8601. Will be null if never used.")

  public String getLastUsed() {
    return lastUsed;
  }


  public void setLastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
  }


  public ListPaymentInstrumentsResponsePayPal createdOn(OffsetDateTime createdOn) {
    
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


  public ListPaymentInstrumentsResponsePayPal primary(Boolean primary) {
    
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


  public ListPaymentInstrumentsResponsePayPal allowed(Boolean allowed) {
    
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


  public ListPaymentInstrumentsResponsePayPal payPalId(String payPalId) {
    
    this.payPalId = payPalId;
    return this;
  }

   /**
   * The Paypal email id.
   * @return payPalId
  **/
  @ApiModelProperty(example = "jane.doe@paypal.com", required = true, value = "The Paypal email id.")

  public String getPayPalId() {
    return payPalId;
  }


  public void setPayPalId(String payPalId) {
    this.payPalId = payPalId;
  }


  public ListPaymentInstrumentsResponsePayPal customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * The Paypal customer id.
   * @return customerId
  **/
  @ApiModelProperty(example = "690238314", required = true, value = "The Paypal customer id.")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPaymentInstrumentsResponsePayPal listPaymentInstrumentsResponsePayPal = (ListPaymentInstrumentsResponsePayPal) o;
    return Objects.equals(this.paymentInstrumentId, listPaymentInstrumentsResponsePayPal.paymentInstrumentId) &&
        Objects.equals(this.paymentToken, listPaymentInstrumentsResponsePayPal.paymentToken) &&
        Objects.equals(this.status, listPaymentInstrumentsResponsePayPal.status) &&
        Objects.equals(this.lastUpdated, listPaymentInstrumentsResponsePayPal.lastUpdated) &&
        Objects.equals(this.lastUsed, listPaymentInstrumentsResponsePayPal.lastUsed) &&
        Objects.equals(this.createdOn, listPaymentInstrumentsResponsePayPal.createdOn) &&
        Objects.equals(this.primary, listPaymentInstrumentsResponsePayPal.primary) &&
        Objects.equals(this.allowed, listPaymentInstrumentsResponsePayPal.allowed) &&
        Objects.equals(this.payPalId, listPaymentInstrumentsResponsePayPal.payPalId) &&
        Objects.equals(this.customerId, listPaymentInstrumentsResponsePayPal.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, paymentToken, status, lastUpdated, lastUsed, createdOn, primary, allowed, payPalId, customerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaymentInstrumentsResponsePayPal {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    payPalId: ").append(toIndentedString(payPalId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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
