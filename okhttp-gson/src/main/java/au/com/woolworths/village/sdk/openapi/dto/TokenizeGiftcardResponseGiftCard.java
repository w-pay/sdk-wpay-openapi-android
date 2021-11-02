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
 * TokenizeGiftcardResponseGiftCard
 */

public class TokenizeGiftcardResponseGiftCard implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

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

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  public static final String SERIALIZED_NAME_PROGRAM_NAME = "programName";
  @SerializedName(SERIALIZED_NAME_PROGRAM_NAME)
  private String programName;

  public static final String SERIALIZED_NAME_CARD_SUFFIX = "cardSuffix";
  @SerializedName(SERIALIZED_NAME_CARD_SUFFIX)
  private String cardSuffix;


  public TokenizeGiftcardResponseGiftCard paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The new payment instrument id to be used for payments.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "81054", required = true, value = "The new payment instrument id to be used for payments.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public TokenizeGiftcardResponseGiftCard status(StatusEnum status) {
    
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


  public TokenizeGiftcardResponseGiftCard lastUpdated(String lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The timestamp the payment instrument was last updated in the container. The timestamp format is ISO8601.
   * @return lastUpdated
  **/
  @ApiModelProperty(example = "2017-10-26T06:35:09.083Z", required = true, value = "The timestamp the payment instrument was last updated in the container. The timestamp format is ISO8601.")

  public String getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public TokenizeGiftcardResponseGiftCard lastUsed(String lastUsed) {
    
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * The timestamp the payment instrument was last used in the container. The timestamp format is ISO8601. Will be null if never used.
   * @return lastUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-10-12T02:25:49.770Z", value = "The timestamp the payment instrument was last used in the container. The timestamp format is ISO8601. Will be null if never used.")

  public String getLastUsed() {
    return lastUsed;
  }


  public void setLastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
  }


  public TokenizeGiftcardResponseGiftCard primary(Boolean primary) {
    
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


  public TokenizeGiftcardResponseGiftCard allowed(Boolean allowed) {
    
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


  public TokenizeGiftcardResponseGiftCard programName(String programName) {
    
    this.programName = programName;
    return this;
  }

   /**
   * The gift card program name.
   * @return programName
  **/
  @ApiModelProperty(example = "WISH Gift Card", required = true, value = "The gift card program name.")

  public String getProgramName() {
    return programName;
  }


  public void setProgramName(String programName) {
    this.programName = programName;
  }


  public TokenizeGiftcardResponseGiftCard cardSuffix(String cardSuffix) {
    
    this.cardSuffix = cardSuffix;
    return this;
  }

   /**
   * The suffix (last 4 digits) of the gift card number.
   * @return cardSuffix
  **/
  @ApiModelProperty(example = "2517", required = true, value = "The suffix (last 4 digits) of the gift card number.")

  public String getCardSuffix() {
    return cardSuffix;
  }


  public void setCardSuffix(String cardSuffix) {
    this.cardSuffix = cardSuffix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeGiftcardResponseGiftCard tokenizeGiftcardResponseGiftCard = (TokenizeGiftcardResponseGiftCard) o;
    return Objects.equals(this.paymentInstrumentId, tokenizeGiftcardResponseGiftCard.paymentInstrumentId) &&
        Objects.equals(this.status, tokenizeGiftcardResponseGiftCard.status) &&
        Objects.equals(this.lastUpdated, tokenizeGiftcardResponseGiftCard.lastUpdated) &&
        Objects.equals(this.lastUsed, tokenizeGiftcardResponseGiftCard.lastUsed) &&
        Objects.equals(this.primary, tokenizeGiftcardResponseGiftCard.primary) &&
        Objects.equals(this.allowed, tokenizeGiftcardResponseGiftCard.allowed) &&
        Objects.equals(this.programName, tokenizeGiftcardResponseGiftCard.programName) &&
        Objects.equals(this.cardSuffix, tokenizeGiftcardResponseGiftCard.cardSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, status, lastUpdated, lastUsed, primary, allowed, programName, cardSuffix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeGiftcardResponseGiftCard {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    cardSuffix: ").append(toIndentedString(cardSuffix)).append("\n");
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

