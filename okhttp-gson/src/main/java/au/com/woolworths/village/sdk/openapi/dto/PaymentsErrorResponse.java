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

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON error response structure of the Payments endpoint.
 */
@ApiModel(description = "The JSON error response structure of the Payments endpoint.")

public class PaymentsErrorResponse implements Serializable {
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
  private List<PaymentsErrorResponseCreditCards> creditCards = null;

  public static final String SERIALIZED_NAME_GIFT_CARDS = "giftCards";
  @SerializedName(SERIALIZED_NAME_GIFT_CARDS)
  private List<PaymentsErrorResponseGiftCards> giftCards = null;

  public static final String SERIALIZED_NAME_PAY_PAL = "payPal";
  @SerializedName(SERIALIZED_NAME_PAY_PAL)
  private List<PaymentsErrorResponsePayPal> payPal = null;

  public static final String SERIALIZED_NAME_ANDROID_PAY = "androidPay";
  @SerializedName(SERIALIZED_NAME_ANDROID_PAY)
  private List<Object> androidPay = null;

  public static final String SERIALIZED_NAME_GOOGLE_PAY = "googlePay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PAY)
  private List<PaymentsErrorResponseGooglePay> googlePay = null;

  public static final String SERIALIZED_NAME_APPLE_PAY = "applePay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private List<PaymentsErrorResponseApplePay> applePay = null;

  public static final String SERIALIZED_NAME_UNKNOWN = "unknown";
  @SerializedName(SERIALIZED_NAME_UNKNOWN)
  private List<PaymentsSuccessResponseUnknown> unknown = null;


  public PaymentsErrorResponse httpStatusCode(BigDecimal httpStatusCode) {
    
    this.httpStatusCode = httpStatusCode;
    return this;
  }

   /**
   * The http status code (4xx and 5xx HTTP status codes).
   * @return httpStatusCode
  **/
  @ApiModelProperty(example = "400", required = true, value = "The http status code (4xx and 5xx HTTP status codes).")

  public BigDecimal getHttpStatusCode() {
    return httpStatusCode;
  }


  public void setHttpStatusCode(BigDecimal httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  public PaymentsErrorResponse errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code.
   * @return errorCode
  **/
  @ApiModelProperty(example = "BI52", required = true, value = "The error code.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public PaymentsErrorResponse errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message.
   * @return errorMessage
  **/
  @ApiModelProperty(example = "PAYMENT TRANSACTION FAILED", required = true, value = "The error message.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public PaymentsErrorResponse errorDetail(String errorDetail) {
    
    this.errorDetail = errorDetail;
    return this;
  }

   /**
   * The error detail.
   * @return errorDetail
  **/
  @ApiModelProperty(example = "Oops! An unknown error has occurred", required = true, value = "The error detail.")

  public String getErrorDetail() {
    return errorDetail;
  }


  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }


  public PaymentsErrorResponse creditCards(List<PaymentsErrorResponseCreditCards> creditCards) {
    
    this.creditCards = creditCards;
    return this;
  }

  public PaymentsErrorResponse addCreditCardsItem(PaymentsErrorResponseCreditCards creditCardsItem) {
    if (this.creditCards == null) {
      this.creditCards = new ArrayList<PaymentsErrorResponseCreditCards>();
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

  public List<PaymentsErrorResponseCreditCards> getCreditCards() {
    return creditCards;
  }


  public void setCreditCards(List<PaymentsErrorResponseCreditCards> creditCards) {
    this.creditCards = creditCards;
  }


  public PaymentsErrorResponse giftCards(List<PaymentsErrorResponseGiftCards> giftCards) {
    
    this.giftCards = giftCards;
    return this;
  }

  public PaymentsErrorResponse addGiftCardsItem(PaymentsErrorResponseGiftCards giftCardsItem) {
    if (this.giftCards == null) {
      this.giftCards = new ArrayList<PaymentsErrorResponseGiftCards>();
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

  public List<PaymentsErrorResponseGiftCards> getGiftCards() {
    return giftCards;
  }


  public void setGiftCards(List<PaymentsErrorResponseGiftCards> giftCards) {
    this.giftCards = giftCards;
  }


  public PaymentsErrorResponse payPal(List<PaymentsErrorResponsePayPal> payPal) {
    
    this.payPal = payPal;
    return this;
  }

  public PaymentsErrorResponse addPayPalItem(PaymentsErrorResponsePayPal payPalItem) {
    if (this.payPal == null) {
      this.payPal = new ArrayList<PaymentsErrorResponsePayPal>();
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

  public List<PaymentsErrorResponsePayPal> getPayPal() {
    return payPal;
  }


  public void setPayPal(List<PaymentsErrorResponsePayPal> payPal) {
    this.payPal = payPal;
  }


  public PaymentsErrorResponse androidPay(List<Object> androidPay) {
    
    this.androidPay = androidPay;
    return this;
  }

  public PaymentsErrorResponse addAndroidPayItem(Object androidPayItem) {
    if (this.androidPay == null) {
      this.androidPay = new ArrayList<Object>();
    }
    this.androidPay.add(androidPayItem);
    return this;
  }

   /**
   * Android Pay has been replaced by Google Pay. This property has been retained for backward compatibility and will always be an empty array.
   * @return androidPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Android Pay has been replaced by Google Pay. This property has been retained for backward compatibility and will always be an empty array.")

  public List<Object> getAndroidPay() {
    return androidPay;
  }


  public void setAndroidPay(List<Object> androidPay) {
    this.androidPay = androidPay;
  }


  public PaymentsErrorResponse googlePay(List<PaymentsErrorResponseGooglePay> googlePay) {
    
    this.googlePay = googlePay;
    return this;
  }

  public PaymentsErrorResponse addGooglePayItem(PaymentsErrorResponseGooglePay googlePayItem) {
    if (this.googlePay == null) {
      this.googlePay = new ArrayList<PaymentsErrorResponseGooglePay>();
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

  public List<PaymentsErrorResponseGooglePay> getGooglePay() {
    return googlePay;
  }


  public void setGooglePay(List<PaymentsErrorResponseGooglePay> googlePay) {
    this.googlePay = googlePay;
  }


  public PaymentsErrorResponse applePay(List<PaymentsErrorResponseApplePay> applePay) {
    
    this.applePay = applePay;
    return this;
  }

  public PaymentsErrorResponse addApplePayItem(PaymentsErrorResponseApplePay applePayItem) {
    if (this.applePay == null) {
      this.applePay = new ArrayList<PaymentsErrorResponseApplePay>();
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

  public List<PaymentsErrorResponseApplePay> getApplePay() {
    return applePay;
  }


  public void setApplePay(List<PaymentsErrorResponseApplePay> applePay) {
    this.applePay = applePay;
  }


  public PaymentsErrorResponse unknown(List<PaymentsSuccessResponseUnknown> unknown) {
    
    this.unknown = unknown;
    return this;
  }

  public PaymentsErrorResponse addUnknownItem(PaymentsSuccessResponseUnknown unknownItem) {
    if (this.unknown == null) {
      this.unknown = new ArrayList<PaymentsSuccessResponseUnknown>();
    }
    this.unknown.add(unknownItem);
    return this;
  }

   /**
   * Get unknown
   * @return unknown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PaymentsSuccessResponseUnknown> getUnknown() {
    return unknown;
  }


  public void setUnknown(List<PaymentsSuccessResponseUnknown> unknown) {
    this.unknown = unknown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsErrorResponse paymentsErrorResponse = (PaymentsErrorResponse) o;
    return Objects.equals(this.httpStatusCode, paymentsErrorResponse.httpStatusCode) &&
        Objects.equals(this.errorCode, paymentsErrorResponse.errorCode) &&
        Objects.equals(this.errorMessage, paymentsErrorResponse.errorMessage) &&
        Objects.equals(this.errorDetail, paymentsErrorResponse.errorDetail) &&
        Objects.equals(this.creditCards, paymentsErrorResponse.creditCards) &&
        Objects.equals(this.giftCards, paymentsErrorResponse.giftCards) &&
        Objects.equals(this.payPal, paymentsErrorResponse.payPal) &&
        Objects.equals(this.androidPay, paymentsErrorResponse.androidPay) &&
        Objects.equals(this.googlePay, paymentsErrorResponse.googlePay) &&
        Objects.equals(this.applePay, paymentsErrorResponse.applePay) &&
        Objects.equals(this.unknown, paymentsErrorResponse.unknown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, errorCode, errorMessage, errorDetail, creditCards, giftCards, payPal, androidPay, googlePay, applePay, unknown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsErrorResponse {\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
    sb.append("    creditCards: ").append(toIndentedString(creditCards)).append("\n");
    sb.append("    giftCards: ").append(toIndentedString(giftCards)).append("\n");
    sb.append("    payPal: ").append(toIndentedString(payPal)).append("\n");
    sb.append("    androidPay: ").append(toIndentedString(androidPay)).append("\n");
    sb.append("    googlePay: ").append(toIndentedString(googlePay)).append("\n");
    sb.append("    applePay: ").append(toIndentedString(applePay)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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

