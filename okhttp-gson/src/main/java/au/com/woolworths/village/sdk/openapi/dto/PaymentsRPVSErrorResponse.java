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
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRPVSErrorResponseApplePay;
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRPVSErrorResponseCreditCards;
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRPVSErrorResponseGiftCards;
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRPVSErrorResponseGooglePay;
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRPVSErrorResponsePayPal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * The JSON RPVS error response structure of the Payments endpoint.
 */
@ApiModel(description = "The JSON RPVS error response structure of the Payments endpoint.")

public class PaymentsRPVSErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HTTP_STATUS_CODE = "httpStatusCode";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS_CODE)
  private BigDecimal httpStatusCode;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ERROR_DETAIL = "errorDetail";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAIL)
  private String errorDetail;

  public static final String SERIALIZED_NAME_CREDIT_CARDS = "creditCards";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARDS)
  private List<PaymentsRPVSErrorResponseCreditCards> creditCards = null;

  public static final String SERIALIZED_NAME_GIFT_CARDS = "giftCards";
  @SerializedName(SERIALIZED_NAME_GIFT_CARDS)
  private List<PaymentsRPVSErrorResponseGiftCards> giftCards = null;

  public static final String SERIALIZED_NAME_PAY_PAL = "payPal";
  @SerializedName(SERIALIZED_NAME_PAY_PAL)
  private List<PaymentsRPVSErrorResponsePayPal> payPal = null;

  public static final String SERIALIZED_NAME_GOOGLE_PAY = "googlePay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PAY)
  private List<PaymentsRPVSErrorResponseGooglePay> googlePay = null;

  public static final String SERIALIZED_NAME_APPLE_PAY = "applePay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private List<PaymentsRPVSErrorResponseApplePay> applePay = null;


  public PaymentsRPVSErrorResponse httpStatusCode(BigDecimal httpStatusCode) {
    
    this.httpStatusCode = httpStatusCode;
    return this;
  }

   /**
   * The http status code (403).
   * @return httpStatusCode
  **/
  @ApiModelProperty(example = "403", required = true, value = "The http status code (403).")

  public BigDecimal getHttpStatusCode() {
    return httpStatusCode;
  }


  public void setHttpStatusCode(BigDecimal httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  public PaymentsRPVSErrorResponse errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code.
   * @return errorCode
  **/
  @ApiModelProperty(example = "RP-001", required = true, value = "The error code.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public PaymentsRPVSErrorResponse errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message.
   * @return errorMessage
  **/
  @ApiModelProperty(example = "RESTRICTED PRODUCT VALIDATION FAILED", required = true, value = "The error message.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public PaymentsRPVSErrorResponse errorDetail(String errorDetail) {
    
    this.errorDetail = errorDetail;
    return this;
  }

   /**
   * The error detail.
   * @return errorDetail
  **/
  @ApiModelProperty(example = "Restricted products present in the basket", required = true, value = "The error detail.")

  public String getErrorDetail() {
    return errorDetail;
  }


  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }


  public PaymentsRPVSErrorResponse creditCards(List<PaymentsRPVSErrorResponseCreditCards> creditCards) {
    
    this.creditCards = creditCards;
    return this;
  }

  public PaymentsRPVSErrorResponse addCreditCardsItem(PaymentsRPVSErrorResponseCreditCards creditCardsItem) {
    if (this.creditCards == null) {
      this.creditCards = new ArrayList<PaymentsRPVSErrorResponseCreditCards>();
    }
    this.creditCards.add(creditCardsItem);
    return this;
  }

   /**
   * Get creditCards
   * @return creditCards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentsRPVSErrorResponseCreditCards> getCreditCards() {
    return creditCards;
  }


  public void setCreditCards(List<PaymentsRPVSErrorResponseCreditCards> creditCards) {
    this.creditCards = creditCards;
  }


  public PaymentsRPVSErrorResponse giftCards(List<PaymentsRPVSErrorResponseGiftCards> giftCards) {
    
    this.giftCards = giftCards;
    return this;
  }

  public PaymentsRPVSErrorResponse addGiftCardsItem(PaymentsRPVSErrorResponseGiftCards giftCardsItem) {
    if (this.giftCards == null) {
      this.giftCards = new ArrayList<PaymentsRPVSErrorResponseGiftCards>();
    }
    this.giftCards.add(giftCardsItem);
    return this;
  }

   /**
   * Get giftCards
   * @return giftCards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentsRPVSErrorResponseGiftCards> getGiftCards() {
    return giftCards;
  }


  public void setGiftCards(List<PaymentsRPVSErrorResponseGiftCards> giftCards) {
    this.giftCards = giftCards;
  }


  public PaymentsRPVSErrorResponse payPal(List<PaymentsRPVSErrorResponsePayPal> payPal) {
    
    this.payPal = payPal;
    return this;
  }

  public PaymentsRPVSErrorResponse addPayPalItem(PaymentsRPVSErrorResponsePayPal payPalItem) {
    if (this.payPal == null) {
      this.payPal = new ArrayList<PaymentsRPVSErrorResponsePayPal>();
    }
    this.payPal.add(payPalItem);
    return this;
  }

   /**
   * Get payPal
   * @return payPal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentsRPVSErrorResponsePayPal> getPayPal() {
    return payPal;
  }


  public void setPayPal(List<PaymentsRPVSErrorResponsePayPal> payPal) {
    this.payPal = payPal;
  }


  public PaymentsRPVSErrorResponse googlePay(List<PaymentsRPVSErrorResponseGooglePay> googlePay) {
    
    this.googlePay = googlePay;
    return this;
  }

  public PaymentsRPVSErrorResponse addGooglePayItem(PaymentsRPVSErrorResponseGooglePay googlePayItem) {
    if (this.googlePay == null) {
      this.googlePay = new ArrayList<PaymentsRPVSErrorResponseGooglePay>();
    }
    this.googlePay.add(googlePayItem);
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentsRPVSErrorResponseGooglePay> getGooglePay() {
    return googlePay;
  }


  public void setGooglePay(List<PaymentsRPVSErrorResponseGooglePay> googlePay) {
    this.googlePay = googlePay;
  }


  public PaymentsRPVSErrorResponse applePay(List<PaymentsRPVSErrorResponseApplePay> applePay) {
    
    this.applePay = applePay;
    return this;
  }

  public PaymentsRPVSErrorResponse addApplePayItem(PaymentsRPVSErrorResponseApplePay applePayItem) {
    if (this.applePay == null) {
      this.applePay = new ArrayList<PaymentsRPVSErrorResponseApplePay>();
    }
    this.applePay.add(applePayItem);
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentsRPVSErrorResponseApplePay> getApplePay() {
    return applePay;
  }


  public void setApplePay(List<PaymentsRPVSErrorResponseApplePay> applePay) {
    this.applePay = applePay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsRPVSErrorResponse paymentsRPVSErrorResponse = (PaymentsRPVSErrorResponse) o;
    return Objects.equals(this.httpStatusCode, paymentsRPVSErrorResponse.httpStatusCode) &&
        Objects.equals(this.errorCode, paymentsRPVSErrorResponse.errorCode) &&
        Objects.equals(this.errorMessage, paymentsRPVSErrorResponse.errorMessage) &&
        Objects.equals(this.errorDetail, paymentsRPVSErrorResponse.errorDetail) &&
        Objects.equals(this.creditCards, paymentsRPVSErrorResponse.creditCards) &&
        Objects.equals(this.giftCards, paymentsRPVSErrorResponse.giftCards) &&
        Objects.equals(this.payPal, paymentsRPVSErrorResponse.payPal) &&
        Objects.equals(this.googlePay, paymentsRPVSErrorResponse.googlePay) &&
        Objects.equals(this.applePay, paymentsRPVSErrorResponse.applePay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, errorCode, errorMessage, errorDetail, creditCards, giftCards, payPal, googlePay, applePay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRPVSErrorResponse {\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
    sb.append("    creditCards: ").append(toIndentedString(creditCards)).append("\n");
    sb.append("    giftCards: ").append(toIndentedString(giftCards)).append("\n");
    sb.append("    payPal: ").append(toIndentedString(payPal)).append("\n");
    sb.append("    googlePay: ").append(toIndentedString(googlePay)).append("\n");
    sb.append("    applePay: ").append(toIndentedString(applePay)).append("\n");
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

