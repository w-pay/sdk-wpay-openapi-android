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

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * VerifyPaymentInstrumentsRequestPaymentInstruments
 */

public class VerifyPaymentInstrumentsRequestPaymentInstruments implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_STEP_UP_TOKEN = "stepUpToken";
  @SerializedName(SERIALIZED_NAME_STEP_UP_TOKEN)
  private String stepUpToken;


  public VerifyPaymentInstrumentsRequestPaymentInstruments paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The payment token.
   * @return paymentToken
  **/
  @ApiModelProperty(example = "f63fbfa8-0a2f-48a6-9162-6b102161a05b", required = true, value = "The payment token.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public VerifyPaymentInstrumentsRequestPaymentInstruments stepUpToken(String stepUpToken) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyPaymentInstrumentsRequestPaymentInstruments verifyPaymentInstrumentsRequestPaymentInstruments = (VerifyPaymentInstrumentsRequestPaymentInstruments) o;
    return Objects.equals(this.paymentToken, verifyPaymentInstrumentsRequestPaymentInstruments.paymentToken) &&
        Objects.equals(this.stepUpToken, verifyPaymentInstrumentsRequestPaymentInstruments.stepUpToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, stepUpToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPaymentInstrumentsRequestPaymentInstruments {\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
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

