/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.2
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
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * PaymentAgreementResponsePaymentAgreement
 */

public class PaymentAgreementResponsePaymentAgreement implements Serializable {
  private static final long serialVersionUID = 1L;

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

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_TYPE = "paymentInstrumentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_TYPE)
  private String paymentInstrumentType;

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


  public PaymentAgreementResponsePaymentAgreement type(TypeEnum type) {
    
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


  public PaymentAgreementResponsePaymentAgreement paymentInstrumentId(String paymentInstrumentId) {
    
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


  public PaymentAgreementResponsePaymentAgreement paymentInstrumentType(String paymentInstrumentType) {
    
    this.paymentInstrumentType = paymentInstrumentType;
    return this;
  }

   /**
   * The type of the payment instrument used in the payment agreement.
   * @return paymentInstrumentType
  **/
  @ApiModelProperty(example = "CREDIT_CARD", required = true, value = "The type of the payment instrument used in the payment agreement.")

  public String getPaymentInstrumentType() {
    return paymentInstrumentType;
  }


  public void setPaymentInstrumentType(String paymentInstrumentType) {
    this.paymentInstrumentType = paymentInstrumentType;
  }


  public PaymentAgreementResponsePaymentAgreement scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * The credit card scheme.
   * @return scheme
  **/
  @ApiModelProperty(example = "VISA", required = true, value = "The credit card scheme.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public PaymentAgreementResponsePaymentAgreement cardSuffix(String cardSuffix) {
    
    this.cardSuffix = cardSuffix;
    return this;
  }

   /**
   * The suffix (last 4 digits) of the credit card number.
   * @return cardSuffix
  **/
  @ApiModelProperty(example = "4405", required = true, value = "The suffix (last 4 digits) of the credit card number.")

  public String getCardSuffix() {
    return cardSuffix;
  }


  public void setCardSuffix(String cardSuffix) {
    this.cardSuffix = cardSuffix;
  }


  public PaymentAgreementResponsePaymentAgreement expiryMonth(String expiryMonth) {
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The month of the expiry date of the credit card.
   * @return expiryMonth
  **/
  @ApiModelProperty(example = "11", required = true, value = "The month of the expiry date of the credit card.")

  public String getExpiryMonth() {
    return expiryMonth;
  }


  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public PaymentAgreementResponsePaymentAgreement expiryYear(String expiryYear) {
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The year of the expiry date of the credit card.
   * @return expiryYear
  **/
  @ApiModelProperty(example = "22", required = true, value = "The year of the expiry date of the credit card.")

  public String getExpiryYear() {
    return expiryYear;
  }


  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public PaymentAgreementResponsePaymentAgreement startDate(String startDate) {
    
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


  public PaymentAgreementResponsePaymentAgreement endDate(String endDate) {
    
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


  public PaymentAgreementResponsePaymentAgreement chargeFrequency(ChargeFrequencyEnum chargeFrequency) {
    
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


  public PaymentAgreementResponsePaymentAgreement chargeAmount(BigDecimal chargeAmount) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAgreementResponsePaymentAgreement paymentAgreementResponsePaymentAgreement = (PaymentAgreementResponsePaymentAgreement) o;
    return Objects.equals(this.type, paymentAgreementResponsePaymentAgreement.type) &&
        Objects.equals(this.paymentInstrumentId, paymentAgreementResponsePaymentAgreement.paymentInstrumentId) &&
        Objects.equals(this.paymentInstrumentType, paymentAgreementResponsePaymentAgreement.paymentInstrumentType) &&
        Objects.equals(this.scheme, paymentAgreementResponsePaymentAgreement.scheme) &&
        Objects.equals(this.cardSuffix, paymentAgreementResponsePaymentAgreement.cardSuffix) &&
        Objects.equals(this.expiryMonth, paymentAgreementResponsePaymentAgreement.expiryMonth) &&
        Objects.equals(this.expiryYear, paymentAgreementResponsePaymentAgreement.expiryYear) &&
        Objects.equals(this.startDate, paymentAgreementResponsePaymentAgreement.startDate) &&
        Objects.equals(this.endDate, paymentAgreementResponsePaymentAgreement.endDate) &&
        Objects.equals(this.chargeFrequency, paymentAgreementResponsePaymentAgreement.chargeFrequency) &&
        Objects.equals(this.chargeAmount, paymentAgreementResponsePaymentAgreement.chargeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, paymentInstrumentId, paymentInstrumentType, scheme, cardSuffix, expiryMonth, expiryYear, startDate, endDate, chargeFrequency, chargeAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAgreementResponsePaymentAgreement {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    paymentInstrumentType: ").append(toIndentedString(paymentInstrumentType)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    cardSuffix: ").append(toIndentedString(cardSuffix)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    chargeFrequency: ").append(toIndentedString(chargeFrequency)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
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

