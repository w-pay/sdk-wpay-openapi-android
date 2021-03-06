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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON success response structure of the Payments endpoint.
 */
@ApiModel(description = "The JSON success response structure of the Payments endpoint.")

public class PaymentsSuccessResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_RECEIPT = "transactionReceipt";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECEIPT)
  private String transactionReceipt;

  public static final String SERIALIZED_NAME_PARTIAL_SUCCESS = "partialSuccess";
  @SerializedName(SERIALIZED_NAME_PARTIAL_SUCCESS)
  private Boolean partialSuccess;

  public static final String SERIALIZED_NAME_FRAUD_RESPONSE = "fraudResponse";
  @SerializedName(SERIALIZED_NAME_FRAUD_RESPONSE)
  private PaymentsSuccessResponseFraudResponse fraudResponse;

  public static final String SERIALIZED_NAME_CREDIT_CARDS = "creditCards";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARDS)
  private List<PaymentsSuccessResponseCreditCards> creditCards = new ArrayList<PaymentsSuccessResponseCreditCards>();

  public static final String SERIALIZED_NAME_GIFT_CARDS = "giftCards";
  @SerializedName(SERIALIZED_NAME_GIFT_CARDS)
  private List<PaymentsSuccessResponseGiftCards> giftCards = new ArrayList<PaymentsSuccessResponseGiftCards>();

  public static final String SERIALIZED_NAME_PAY_PAL = "payPal";
  @SerializedName(SERIALIZED_NAME_PAY_PAL)
  private List<PaymentsSuccessResponsePayPal> payPal = new ArrayList<PaymentsSuccessResponsePayPal>();

  public static final String SERIALIZED_NAME_ANDROID_PAY = "androidPay";
  @SerializedName(SERIALIZED_NAME_ANDROID_PAY)
  private List<Object> androidPay = new ArrayList<Object>();

  public static final String SERIALIZED_NAME_GOOGLE_PAY = "googlePay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PAY)
  private List<PaymentsSuccessResponseGooglePay> googlePay = new ArrayList<PaymentsSuccessResponseGooglePay>();

  public static final String SERIALIZED_NAME_APPLE_PAY = "applePay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private List<PaymentsSuccessResponseApplePay> applePay = new ArrayList<PaymentsSuccessResponseApplePay>();

  public static final String SERIALIZED_NAME_UNKNOWN = "unknown";
  @SerializedName(SERIALIZED_NAME_UNKNOWN)
  private List<PaymentsSuccessResponseUnknown> unknown = new ArrayList<PaymentsSuccessResponseUnknown>();


  public PaymentsSuccessResponse transactionReceipt(String transactionReceipt) {
    
    this.transactionReceipt = transactionReceipt;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.
   * @return transactionReceipt
  **/
  @ApiModelProperty(example = "1000000000670621", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.")

  public String getTransactionReceipt() {
    return transactionReceipt;
  }


  public void setTransactionReceipt(String transactionReceipt) {
    this.transactionReceipt = transactionReceipt;
  }


  public PaymentsSuccessResponse partialSuccess(Boolean partialSuccess) {
    
    this.partialSuccess = partialSuccess;
    return this;
  }

   /**
   * A flag to indicate if a split payment was only partially successful, ie. at least 1 of the payment instruments had a successful payment result.
   * @return partialSuccess
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if a split payment was only partially successful, ie. at least 1 of the payment instruments had a successful payment result.")

  public Boolean getPartialSuccess() {
    return partialSuccess;
  }


  public void setPartialSuccess(Boolean partialSuccess) {
    this.partialSuccess = partialSuccess;
  }


  public PaymentsSuccessResponse fraudResponse(PaymentsSuccessResponseFraudResponse fraudResponse) {
    
    this.fraudResponse = fraudResponse;
    return this;
  }

   /**
   * Get fraudResponse
   * @return fraudResponse
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentsSuccessResponseFraudResponse getFraudResponse() {
    return fraudResponse;
  }


  public void setFraudResponse(PaymentsSuccessResponseFraudResponse fraudResponse) {
    this.fraudResponse = fraudResponse;
  }


  public PaymentsSuccessResponse creditCards(List<PaymentsSuccessResponseCreditCards> creditCards) {
    
    this.creditCards = creditCards;
    return this;
  }

  public PaymentsSuccessResponse addCreditCardsItem(PaymentsSuccessResponseCreditCards creditCardsItem) {
    this.creditCards.add(creditCardsItem);
    return this;
  }

   /**
   * Get creditCards
   * @return creditCards
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PaymentsSuccessResponseCreditCards> getCreditCards() {
    return creditCards;
  }


  public void setCreditCards(List<PaymentsSuccessResponseCreditCards> creditCards) {
    this.creditCards = creditCards;
  }


  public PaymentsSuccessResponse giftCards(List<PaymentsSuccessResponseGiftCards> giftCards) {
    
    this.giftCards = giftCards;
    return this;
  }

  public PaymentsSuccessResponse addGiftCardsItem(PaymentsSuccessResponseGiftCards giftCardsItem) {
    this.giftCards.add(giftCardsItem);
    return this;
  }

   /**
   * Get giftCards
   * @return giftCards
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PaymentsSuccessResponseGiftCards> getGiftCards() {
    return giftCards;
  }


  public void setGiftCards(List<PaymentsSuccessResponseGiftCards> giftCards) {
    this.giftCards = giftCards;
  }


  public PaymentsSuccessResponse payPal(List<PaymentsSuccessResponsePayPal> payPal) {
    
    this.payPal = payPal;
    return this;
  }

  public PaymentsSuccessResponse addPayPalItem(PaymentsSuccessResponsePayPal payPalItem) {
    this.payPal.add(payPalItem);
    return this;
  }

   /**
   * Get payPal
   * @return payPal
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PaymentsSuccessResponsePayPal> getPayPal() {
    return payPal;
  }


  public void setPayPal(List<PaymentsSuccessResponsePayPal> payPal) {
    this.payPal = payPal;
  }


  public PaymentsSuccessResponse androidPay(List<Object> androidPay) {
    
    this.androidPay = androidPay;
    return this;
  }

  public PaymentsSuccessResponse addAndroidPayItem(Object androidPayItem) {
    this.androidPay.add(androidPayItem);
    return this;
  }

   /**
   * Android Pay has been replaced by Google Pay. This property has been retained for backward compatibility and will always be an empty array.
   * @return androidPay
  **/
  @ApiModelProperty(required = true, value = "Android Pay has been replaced by Google Pay. This property has been retained for backward compatibility and will always be an empty array.")

  public List<Object> getAndroidPay() {
    return androidPay;
  }


  public void setAndroidPay(List<Object> androidPay) {
    this.androidPay = androidPay;
  }


  public PaymentsSuccessResponse googlePay(List<PaymentsSuccessResponseGooglePay> googlePay) {
    
    this.googlePay = googlePay;
    return this;
  }

  public PaymentsSuccessResponse addGooglePayItem(PaymentsSuccessResponseGooglePay googlePayItem) {
    this.googlePay.add(googlePayItem);
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PaymentsSuccessResponseGooglePay> getGooglePay() {
    return googlePay;
  }


  public void setGooglePay(List<PaymentsSuccessResponseGooglePay> googlePay) {
    this.googlePay = googlePay;
  }


  public PaymentsSuccessResponse applePay(List<PaymentsSuccessResponseApplePay> applePay) {
    
    this.applePay = applePay;
    return this;
  }

  public PaymentsSuccessResponse addApplePayItem(PaymentsSuccessResponseApplePay applePayItem) {
    this.applePay.add(applePayItem);
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PaymentsSuccessResponseApplePay> getApplePay() {
    return applePay;
  }


  public void setApplePay(List<PaymentsSuccessResponseApplePay> applePay) {
    this.applePay = applePay;
  }


  public PaymentsSuccessResponse unknown(List<PaymentsSuccessResponseUnknown> unknown) {
    
    this.unknown = unknown;
    return this;
  }

  public PaymentsSuccessResponse addUnknownItem(PaymentsSuccessResponseUnknown unknownItem) {
    this.unknown.add(unknownItem);
    return this;
  }

   /**
   * Get unknown
   * @return unknown
  **/
  @ApiModelProperty(required = true, value = "")

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
    PaymentsSuccessResponse paymentsSuccessResponse = (PaymentsSuccessResponse) o;
    return Objects.equals(this.transactionReceipt, paymentsSuccessResponse.transactionReceipt) &&
        Objects.equals(this.partialSuccess, paymentsSuccessResponse.partialSuccess) &&
        Objects.equals(this.fraudResponse, paymentsSuccessResponse.fraudResponse) &&
        Objects.equals(this.creditCards, paymentsSuccessResponse.creditCards) &&
        Objects.equals(this.giftCards, paymentsSuccessResponse.giftCards) &&
        Objects.equals(this.payPal, paymentsSuccessResponse.payPal) &&
        Objects.equals(this.androidPay, paymentsSuccessResponse.androidPay) &&
        Objects.equals(this.googlePay, paymentsSuccessResponse.googlePay) &&
        Objects.equals(this.applePay, paymentsSuccessResponse.applePay) &&
        Objects.equals(this.unknown, paymentsSuccessResponse.unknown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionReceipt, partialSuccess, fraudResponse, creditCards, giftCards, payPal, androidPay, googlePay, applePay, unknown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsSuccessResponse {\n");
    sb.append("    transactionReceipt: ").append(toIndentedString(transactionReceipt)).append("\n");
    sb.append("    partialSuccess: ").append(toIndentedString(partialSuccess)).append("\n");
    sb.append("    fraudResponse: ").append(toIndentedString(fraudResponse)).append("\n");
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

