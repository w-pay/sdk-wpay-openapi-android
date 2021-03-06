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
import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseStepUp1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * ListPaymentInstrumentsResponsePaymentAgreements
 */

public class ListPaymentInstrumentsResponsePaymentAgreements implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  /**
   * The status of the payment agreement in the container.
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

  /**
   * The payment agreement type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    RECURRING("RECURRING"),
    
    ADHOC("ADHOC"),
    
    INSTALLMENT("INSTALLMENT");

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

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_CARD_SUFFIX = "cardSuffix";
  @SerializedName(SERIALIZED_NAME_CARD_SUFFIX)
  private String cardSuffix;

  public static final String SERIALIZED_NAME_EXPIRY_MONTH = "expiryMonth";
  @SerializedName(SERIALIZED_NAME_EXPIRY_MONTH)
  private String expiryMonth;

  public static final String SERIALIZED_NAME_EXPIRY_YEAR = "expiryYear";
  @SerializedName(SERIALIZED_NAME_EXPIRY_YEAR)
  private String expiryYear;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  /**
   * The payment agreement charge frequency.
   */
  @JsonAdapter(ChargeFrequencyEnum.Adapter.class)
  public enum ChargeFrequencyEnum {
    WEEKLY("WEEKLY"),
    
    FORTNIGHTLY("FORTNIGHTLY"),
    
    MONTHLY("MONTHLY");

    private String value;

    ChargeFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargeFrequencyEnum fromValue(String value) {
      for (ChargeFrequencyEnum b : ChargeFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChargeFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargeFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChargeFrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHARGE_FREQUENCY = "chargeFrequency";
  @SerializedName(SERIALIZED_NAME_CHARGE_FREQUENCY)
  private ChargeFrequencyEnum chargeFrequency;

  public static final String SERIALIZED_NAME_CHARGE_AMOUNT = "chargeAmount";
  @SerializedName(SERIALIZED_NAME_CHARGE_AMOUNT)
  private BigDecimal chargeAmount;

  public static final String SERIALIZED_NAME_CHARGE_CYCLE = "chargeCycle";
  @SerializedName(SERIALIZED_NAME_CHARGE_CYCLE)
  private BigDecimal chargeCycle;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private String expired;

  public static final String SERIALIZED_NAME_UPDATE_U_R_L = "updateURL";
  @SerializedName(SERIALIZED_NAME_UPDATE_U_R_L)
  private String updateURL;

  public static final String SERIALIZED_NAME_STEP_UP = "stepUp";
  @SerializedName(SERIALIZED_NAME_STEP_UP)
  private ListPaymentInstrumentsResponseStepUp1 stepUp;


  public ListPaymentInstrumentsResponsePaymentAgreements paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement.
   * @return paymentToken
  **/
  @ApiModelProperty(example = "27e07e4e-58df-4072-8e75-33dd464af667", required = true, value = "The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the payment agreement in the container.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the payment agreement in the container.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements lastUpdated(String lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The timestamp the payment agreement was last updated in the container. The timestamp format is ISO8601.
   * @return lastUpdated
  **/
  @ApiModelProperty(example = "2018-09-01T00:00:00.000+1100", required = true, value = "The timestamp the payment agreement was last updated in the container. The timestamp format is ISO8601.")

  public String getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements lastUsed(String lastUsed) {
    
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * The timestamp the payment agreement was last used in the container. The timestamp format is ISO8601. Will be null if never used.
   * @return lastUsed
  **/
  @ApiModelProperty(example = "2018-09-14T12:00:00.000+1100", required = true, value = "The timestamp the payment agreement was last used in the container. The timestamp format is ISO8601. Will be null if never used.")

  public String getLastUsed() {
    return lastUsed;
  }


  public void setLastUsed(String lastUsed) {
    this.lastUsed = lastUsed;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements createdOn(OffsetDateTime createdOn) {
    
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


  public ListPaymentInstrumentsResponsePaymentAgreements primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * A flag to indicate if this payment instrument is the primary instrument in the container. Not used for payment agreements.
   * @return primary
  **/
  @ApiModelProperty(example = "false", required = true, value = "A flag to indicate if this payment instrument is the primary instrument in the container. Not used for payment agreements.")

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements allowed(Boolean allowed) {
    
    this.allowed = allowed;
    return this;
  }

   /**
   * A flag to indicate if the merchant profile in the container allows the use of this payment agreement.
   * @return allowed
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if the merchant profile in the container allows the use of this payment agreement.")

  public Boolean getAllowed() {
    return allowed;
  }


  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The payment agreement type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The payment agreement type.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The payment agreement payment instrument id that will be used for the charges.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "90731", required = true, value = "The payment agreement payment instrument id that will be used for the charges.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * The credit card scheme.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VISA", value = "The credit card scheme.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements cardSuffix(String cardSuffix) {
    
    this.cardSuffix = cardSuffix;
    return this;
  }

   /**
   * The suffix (last 4 digits) of the credit card number.
   * @return cardSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4405", value = "The suffix (last 4 digits) of the credit card number.")

  public String getCardSuffix() {
    return cardSuffix;
  }


  public void setCardSuffix(String cardSuffix) {
    this.cardSuffix = cardSuffix;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements expiryMonth(String expiryMonth) {
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The month of the expiry date of the credit card.
   * @return expiryMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11", value = "The month of the expiry date of the credit card.")

  public String getExpiryMonth() {
    return expiryMonth;
  }


  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements expiryYear(String expiryYear) {
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The year of the expiry date of the credit card.
   * @return expiryYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22", value = "The year of the expiry date of the credit card.")

  public String getExpiryYear() {
    return expiryYear;
  }


  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The payment agreement start date and time. The timestamp format is ISO8601.
   * @return startDate
  **/
  @ApiModelProperty(example = "2018-09-01T00:00:00.000+1100", required = true, value = "The payment agreement start date and time. The timestamp format is ISO8601.")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The payment agreement end date and time. The timestamp format is ISO8601.
   * @return endDate
  **/
  @ApiModelProperty(example = "2018-12-31T23:59:59.999+1100", required = true, value = "The payment agreement end date and time. The timestamp format is ISO8601.")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements chargeFrequency(ChargeFrequencyEnum chargeFrequency) {
    
    this.chargeFrequency = chargeFrequency;
    return this;
  }

   /**
   * The payment agreement charge frequency.
   * @return chargeFrequency
  **/
  @ApiModelProperty(required = true, value = "The payment agreement charge frequency.")

  public ChargeFrequencyEnum getChargeFrequency() {
    return chargeFrequency;
  }


  public void setChargeFrequency(ChargeFrequencyEnum chargeFrequency) {
    this.chargeFrequency = chargeFrequency;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements chargeAmount(BigDecimal chargeAmount) {
    
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * The amount that will be charged at the frequency specified in the payment agreement.
   * @return chargeAmount
  **/
  @ApiModelProperty(example = "25.99", required = true, value = "The amount that will be charged at the frequency specified in the payment agreement.")

  public BigDecimal getChargeAmount() {
    return chargeAmount;
  }


  public void setChargeAmount(BigDecimal chargeAmount) {
    this.chargeAmount = chargeAmount;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements chargeCycle(BigDecimal chargeCycle) {
    
    this.chargeCycle = chargeCycle;
    return this;
  }

   /**
   * The current charge cycle number.
   * @return chargeCycle
  **/
  @ApiModelProperty(example = "2", required = true, value = "The current charge cycle number.")

  public BigDecimal getChargeCycle() {
    return chargeCycle;
  }


  public void setChargeCycle(BigDecimal chargeCycle) {
    this.chargeCycle = chargeCycle;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements expired(String expired) {
    
    this.expired = expired;
    return this;
  }

   /**
   * A flag to indicate if the payment agreement is expired.
   * @return expired
  **/
  @ApiModelProperty(example = "false", required = true, value = "A flag to indicate if the payment agreement is expired.")

  public String getExpired() {
    return expired;
  }


  public void setExpired(String expired) {
    this.expired = expired;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements updateURL(String updateURL) {
    
    this.updateURL = updateURL;
    return this;
  }

   /**
   * The URL of the endpoint to use to update the payment agreement.
   * @return updateURL
  **/
  @ApiModelProperty(example = "https://{environment}.mobile-api.woolworths.com.au/wow/v1/pay/paymentagreements/27e07e4e-58df-4072-8e75-33dd464af667", required = true, value = "The URL of the endpoint to use to update the payment agreement.")

  public String getUpdateURL() {
    return updateURL;
  }


  public void setUpdateURL(String updateURL) {
    this.updateURL = updateURL;
  }


  public ListPaymentInstrumentsResponsePaymentAgreements stepUp(ListPaymentInstrumentsResponseStepUp1 stepUp) {
    
    this.stepUp = stepUp;
    return this;
  }

   /**
   * Get stepUp
   * @return stepUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListPaymentInstrumentsResponseStepUp1 getStepUp() {
    return stepUp;
  }


  public void setStepUp(ListPaymentInstrumentsResponseStepUp1 stepUp) {
    this.stepUp = stepUp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPaymentInstrumentsResponsePaymentAgreements listPaymentInstrumentsResponsePaymentAgreements = (ListPaymentInstrumentsResponsePaymentAgreements) o;
    return Objects.equals(this.paymentToken, listPaymentInstrumentsResponsePaymentAgreements.paymentToken) &&
        Objects.equals(this.status, listPaymentInstrumentsResponsePaymentAgreements.status) &&
        Objects.equals(this.lastUpdated, listPaymentInstrumentsResponsePaymentAgreements.lastUpdated) &&
        Objects.equals(this.lastUsed, listPaymentInstrumentsResponsePaymentAgreements.lastUsed) &&
        Objects.equals(this.createdOn, listPaymentInstrumentsResponsePaymentAgreements.createdOn) &&
        Objects.equals(this.primary, listPaymentInstrumentsResponsePaymentAgreements.primary) &&
        Objects.equals(this.allowed, listPaymentInstrumentsResponsePaymentAgreements.allowed) &&
        Objects.equals(this.type, listPaymentInstrumentsResponsePaymentAgreements.type) &&
        Objects.equals(this.paymentInstrumentId, listPaymentInstrumentsResponsePaymentAgreements.paymentInstrumentId) &&
        Objects.equals(this.scheme, listPaymentInstrumentsResponsePaymentAgreements.scheme) &&
        Objects.equals(this.cardSuffix, listPaymentInstrumentsResponsePaymentAgreements.cardSuffix) &&
        Objects.equals(this.expiryMonth, listPaymentInstrumentsResponsePaymentAgreements.expiryMonth) &&
        Objects.equals(this.expiryYear, listPaymentInstrumentsResponsePaymentAgreements.expiryYear) &&
        Objects.equals(this.startDate, listPaymentInstrumentsResponsePaymentAgreements.startDate) &&
        Objects.equals(this.endDate, listPaymentInstrumentsResponsePaymentAgreements.endDate) &&
        Objects.equals(this.chargeFrequency, listPaymentInstrumentsResponsePaymentAgreements.chargeFrequency) &&
        Objects.equals(this.chargeAmount, listPaymentInstrumentsResponsePaymentAgreements.chargeAmount) &&
        Objects.equals(this.chargeCycle, listPaymentInstrumentsResponsePaymentAgreements.chargeCycle) &&
        Objects.equals(this.expired, listPaymentInstrumentsResponsePaymentAgreements.expired) &&
        Objects.equals(this.updateURL, listPaymentInstrumentsResponsePaymentAgreements.updateURL) &&
        Objects.equals(this.stepUp, listPaymentInstrumentsResponsePaymentAgreements.stepUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, status, lastUpdated, lastUsed, createdOn, primary, allowed, type, paymentInstrumentId, scheme, cardSuffix, expiryMonth, expiryYear, startDate, endDate, chargeFrequency, chargeAmount, chargeCycle, expired, updateURL, stepUp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaymentInstrumentsResponsePaymentAgreements {\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    cardSuffix: ").append(toIndentedString(cardSuffix)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    chargeFrequency: ").append(toIndentedString(chargeFrequency)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    chargeCycle: ").append(toIndentedString(chargeCycle)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    updateURL: ").append(toIndentedString(updateURL)).append("\n");
    sb.append("    stepUp: ").append(toIndentedString(stepUp)).append("\n");
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

