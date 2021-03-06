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
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * CreatePaymentAgreementRequestPaymentAgreement
 */

public class CreatePaymentAgreementRequestPaymentAgreement implements Serializable {
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

  public static final String SERIALIZED_NAME_IMMEDIATE_CHARGE = "immediateCharge";
  @SerializedName(SERIALIZED_NAME_IMMEDIATE_CHARGE)
  private Boolean immediateCharge = false;

  public static final String SERIALIZED_NAME_STEP_UP_TOKEN = "stepUpToken";
  @SerializedName(SERIALIZED_NAME_STEP_UP_TOKEN)
  private String stepUpToken;


  public CreatePaymentAgreementRequestPaymentAgreement type(TypeEnum type) {
    
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


  public CreatePaymentAgreementRequestPaymentAgreement paymentInstrumentId(String paymentInstrumentId) {
    
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


  public CreatePaymentAgreementRequestPaymentAgreement startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The payment agreement start date and time. The timestamp format is ISO8601.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-01T00:00:00.000+1100", value = "The payment agreement start date and time. The timestamp format is ISO8601.")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public CreatePaymentAgreementRequestPaymentAgreement endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The payment agreement end date and time. The timestamp format is ISO8601.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-12-31T23:59:59.999+1100", value = "The payment agreement end date and time. The timestamp format is ISO8601.")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public CreatePaymentAgreementRequestPaymentAgreement chargeFrequency(ChargeFrequencyEnum chargeFrequency) {
    
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


  public CreatePaymentAgreementRequestPaymentAgreement chargeAmount(BigDecimal chargeAmount) {
    
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


  public CreatePaymentAgreementRequestPaymentAgreement immediateCharge(Boolean immediateCharge) {
    
    this.immediateCharge = immediateCharge;
    return this;
  }

   /**
   * A flag to indicate if a charge transaction must be performed at the time of payment agreement creation. This in convenient in the cases where a customer wants to process a first charge transaction immediately at payment agreement creation.
   * @return immediateCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A flag to indicate if a charge transaction must be performed at the time of payment agreement creation. This in convenient in the cases where a customer wants to process a first charge transaction immediately at payment agreement creation.")

  public Boolean getImmediateCharge() {
    return immediateCharge;
  }


  public void setImmediateCharge(Boolean immediateCharge) {
    this.immediateCharge = immediateCharge;
  }


  public CreatePaymentAgreementRequestPaymentAgreement stepUpToken(String stepUpToken) {
    
    this.stepUpToken = stepUpToken;
    return this;
  }

   /**
   * The step-up token is used to track additional credit card information (eg. CVV and expiry) attached to the payment instrument. It&#39;s only valid for a predefined time and if an expired step-up token is used during validation, the validation of that instrument will fail and the user will have to get a new step-up token before retrying the API call. A step-up token is returned in the response of a credit card iframe. This property is only required for credit card instruments and only if specific credit card information (eg. CVV and expiry) is required during the API call.
   * @return stepUpToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e86b3a32-96a5-4659-b6d8-5d685bfa78e8", value = "The step-up token is used to track additional credit card information (eg. CVV and expiry) attached to the payment instrument. It's only valid for a predefined time and if an expired step-up token is used during validation, the validation of that instrument will fail and the user will have to get a new step-up token before retrying the API call. A step-up token is returned in the response of a credit card iframe. This property is only required for credit card instruments and only if specific credit card information (eg. CVV and expiry) is required during the API call.")

  public String getStepUpToken() {
    return stepUpToken;
  }


  public void setStepUpToken(String stepUpToken) {
    this.stepUpToken = stepUpToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentAgreementRequestPaymentAgreement createPaymentAgreementRequestPaymentAgreement = (CreatePaymentAgreementRequestPaymentAgreement) o;
    return Objects.equals(this.type, createPaymentAgreementRequestPaymentAgreement.type) &&
        Objects.equals(this.paymentInstrumentId, createPaymentAgreementRequestPaymentAgreement.paymentInstrumentId) &&
        Objects.equals(this.startDate, createPaymentAgreementRequestPaymentAgreement.startDate) &&
        Objects.equals(this.endDate, createPaymentAgreementRequestPaymentAgreement.endDate) &&
        Objects.equals(this.chargeFrequency, createPaymentAgreementRequestPaymentAgreement.chargeFrequency) &&
        Objects.equals(this.chargeAmount, createPaymentAgreementRequestPaymentAgreement.chargeAmount) &&
        Objects.equals(this.immediateCharge, createPaymentAgreementRequestPaymentAgreement.immediateCharge) &&
        Objects.equals(this.stepUpToken, createPaymentAgreementRequestPaymentAgreement.stepUpToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, paymentInstrumentId, startDate, endDate, chargeFrequency, chargeAmount, immediateCharge, stepUpToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentAgreementRequestPaymentAgreement {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    chargeFrequency: ").append(toIndentedString(chargeFrequency)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    immediateCharge: ").append(toIndentedString(immediateCharge)).append("\n");
    sb.append("    stepUpToken: ").append(toIndentedString(stepUpToken)).append("\n");
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

