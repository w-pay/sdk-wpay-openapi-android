/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.5
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
 * PaymentsRequestPayments
 */

public class PaymentsRequestPayments implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_STEP_UP_TOKEN = "stepUpToken";
  @SerializedName(SERIALIZED_NAME_STEP_UP_TOKEN)
  private String stepUpToken;

  public static final String SERIALIZED_NAME_PASSCODE = "passcode";
  @SerializedName(SERIALIZED_NAME_PASSCODE)
  private String passcode;


  public PaymentsRequestPayments paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The payment instrument id from the card capture iframe response or the list payment instruments response. This property can be omitted if the payment token property is present.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "90731", required = true, value = "The payment instrument id from the card capture iframe response or the list payment instruments response. This property can be omitted if the payment token property is present.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public PaymentsRequestPayments paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The payment token from the card capture iframe response or the list payment instruments response. This property can be omitted if the payment instrument id property is present.
   * @return paymentToken
  **/
  @ApiModelProperty(example = "712029a1-c0aa-41bc-a810-3d42424c5834", required = true, value = "The payment token from the card capture iframe response or the list payment instruments response. This property can be omitted if the payment instrument id property is present.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public PaymentsRequestPayments amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount you want to pay with the payment instrument.
   * @return amount
  **/
  @ApiModelProperty(example = "20.5", required = true, value = "The amount you want to pay with the payment instrument.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public PaymentsRequestPayments stepUpToken(String stepUpToken) {
    
    this.stepUpToken = stepUpToken;
    return this;
  }

   /**
   * The step-up token is used to track additional credit card information (eg. CVV and expiry) attached to the payment instrument. It&#39;s only valid for a predefined time and if an expired step-up token is used during payment, the payment for that instrument will fail and the user will have to get a new step-up token before retrying the payment. A step-up token is returned in the response of a credit card iframe. This property is currently only required for credit card instruments and only if specific credit card information (eg. CVV and expiry) is required during payment.
   * @return stepUpToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e86b3a32-96a5-4659-b6d8-5d685bfa78e8", value = "The step-up token is used to track additional credit card information (eg. CVV and expiry) attached to the payment instrument. It's only valid for a predefined time and if an expired step-up token is used during payment, the payment for that instrument will fail and the user will have to get a new step-up token before retrying the payment. A step-up token is returned in the response of a credit card iframe. This property is currently only required for credit card instruments and only if specific credit card information (eg. CVV and expiry) is required during payment.")

  public String getStepUpToken() {
    return stepUpToken;
  }


  public void setStepUpToken(String stepUpToken) {
    this.stepUpToken = stepUpToken;
  }


  public PaymentsRequestPayments passcode(String passcode) {
    
    this.passcode = passcode;
    return this;
  }

   /**
   * The passcode is used to send additional information (eg. gift card PIN) for the payment instrument. This property is currently only required for gift card instruments and only if the gift card PIN is required during payment. This property should NOT be used with credit card instruments (see stepUpToken).
   * @return passcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1425", value = "The passcode is used to send additional information (eg. gift card PIN) for the payment instrument. This property is currently only required for gift card instruments and only if the gift card PIN is required during payment. This property should NOT be used with credit card instruments (see stepUpToken).")

  public String getPasscode() {
    return passcode;
  }


  public void setPasscode(String passcode) {
    this.passcode = passcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsRequestPayments paymentsRequestPayments = (PaymentsRequestPayments) o;
    return Objects.equals(this.paymentInstrumentId, paymentsRequestPayments.paymentInstrumentId) &&
        Objects.equals(this.paymentToken, paymentsRequestPayments.paymentToken) &&
        Objects.equals(this.amount, paymentsRequestPayments.amount) &&
        Objects.equals(this.stepUpToken, paymentsRequestPayments.stepUpToken) &&
        Objects.equals(this.passcode, paymentsRequestPayments.passcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, paymentToken, amount, stepUpToken, passcode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRequestPayments {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    stepUpToken: ").append(toIndentedString(stepUpToken)).append("\n");
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
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

