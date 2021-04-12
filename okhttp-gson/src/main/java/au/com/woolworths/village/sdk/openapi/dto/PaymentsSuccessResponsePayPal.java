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
 * PaymentsSuccessResponsePayPal
 */

public class PaymentsSuccessResponsePayPal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_PAYMENT_TRANSACTION_REF = "paymentTransactionRef";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TRANSACTION_REF)
  private String paymentTransactionRef;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ERROR_DETAIL = "errorDetail";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAIL)
  private String errorDetail;

  public static final String SERIALIZED_NAME_RECEIPT_DATA = "receiptData";
  @SerializedName(SERIALIZED_NAME_RECEIPT_DATA)
  private PaymentsSuccessResponseReceiptData2 receiptData;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_CODE = "externalServiceCode";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_CODE)
  private String externalServiceCode;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE = "externalServiceMessage";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE)
  private String externalServiceMessage;


  public PaymentsSuccessResponsePayPal paymentInstrumentId(String paymentInstrumentId) {
    
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


  public PaymentsSuccessResponsePayPal paymentToken(String paymentToken) {
    
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


  public PaymentsSuccessResponsePayPal paymentTransactionRef(String paymentTransactionRef) {
    
    this.paymentTransactionRef = paymentTransactionRef;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the paypal transaction in the container.
   * @return paymentTransactionRef
  **/
  @ApiModelProperty(example = "1000000000670624", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the paypal transaction in the container.")

  public String getPaymentTransactionRef() {
    return paymentTransactionRef;
  }


  public void setPaymentTransactionRef(String paymentTransactionRef) {
    this.paymentTransactionRef = paymentTransactionRef;
  }


  public PaymentsSuccessResponsePayPal errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code. Only present if an error occurred during payment.
   * @return errorCode
  **/
  @ApiModelProperty(example = "UN99", required = true, value = "The error code. Only present if an error occurred during payment.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public PaymentsSuccessResponsePayPal errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message. Only present if an error occurred during payment.
   * @return errorMessage
  **/
  @ApiModelProperty(example = "UNEXPECTED SYSTEM FAILURE", required = true, value = "The error message. Only present if an error occurred during payment.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public PaymentsSuccessResponsePayPal errorDetail(String errorDetail) {
    
    this.errorDetail = errorDetail;
    return this;
  }

   /**
   * The error detail. Only present if an error occurred during payment.
   * @return errorDetail
  **/
  @ApiModelProperty(example = "We are currently experiencing technical issues with our service.", required = true, value = "The error detail. Only present if an error occurred during payment.")

  public String getErrorDetail() {
    return errorDetail;
  }


  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }


  public PaymentsSuccessResponsePayPal receiptData(PaymentsSuccessResponseReceiptData2 receiptData) {
    
    this.receiptData = receiptData;
    return this;
  }

   /**
   * Get receiptData
   * @return receiptData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsSuccessResponseReceiptData2 getReceiptData() {
    return receiptData;
  }


  public void setReceiptData(PaymentsSuccessResponseReceiptData2 receiptData) {
    this.receiptData = receiptData;
  }


  public PaymentsSuccessResponsePayPal externalServiceCode(String externalServiceCode) {
    
    this.externalServiceCode = externalServiceCode;
    return this;
  }

   /**
   * The external service code (from eg. PayPal). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00", value = "The external service code (from eg. PayPal). This property is only included in the response if it is enabled in the consumers API configuration.")

  public String getExternalServiceCode() {
    return externalServiceCode;
  }


  public void setExternalServiceCode(String externalServiceCode) {
    this.externalServiceCode = externalServiceCode;
  }


  public PaymentsSuccessResponsePayPal externalServiceMessage(String externalServiceMessage) {
    
    this.externalServiceMessage = externalServiceMessage;
    return this;
  }

   /**
   * The external service message (from eg. PayPal). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPROVED", value = "The external service message (from eg. PayPal). This property is only included in the response if it is enabled in the consumers API configuration.")

  public String getExternalServiceMessage() {
    return externalServiceMessage;
  }


  public void setExternalServiceMessage(String externalServiceMessage) {
    this.externalServiceMessage = externalServiceMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsSuccessResponsePayPal paymentsSuccessResponsePayPal = (PaymentsSuccessResponsePayPal) o;
    return Objects.equals(this.paymentInstrumentId, paymentsSuccessResponsePayPal.paymentInstrumentId) &&
        Objects.equals(this.paymentToken, paymentsSuccessResponsePayPal.paymentToken) &&
        Objects.equals(this.paymentTransactionRef, paymentsSuccessResponsePayPal.paymentTransactionRef) &&
        Objects.equals(this.errorCode, paymentsSuccessResponsePayPal.errorCode) &&
        Objects.equals(this.errorMessage, paymentsSuccessResponsePayPal.errorMessage) &&
        Objects.equals(this.errorDetail, paymentsSuccessResponsePayPal.errorDetail) &&
        Objects.equals(this.receiptData, paymentsSuccessResponsePayPal.receiptData) &&
        Objects.equals(this.externalServiceCode, paymentsSuccessResponsePayPal.externalServiceCode) &&
        Objects.equals(this.externalServiceMessage, paymentsSuccessResponsePayPal.externalServiceMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, paymentToken, paymentTransactionRef, errorCode, errorMessage, errorDetail, receiptData, externalServiceCode, externalServiceMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsSuccessResponsePayPal {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paymentTransactionRef: ").append(toIndentedString(paymentTransactionRef)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
    sb.append("    receiptData: ").append(toIndentedString(receiptData)).append("\n");
    sb.append("    externalServiceCode: ").append(toIndentedString(externalServiceCode)).append("\n");
    sb.append("    externalServiceMessage: ").append(toIndentedString(externalServiceMessage)).append("\n");
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
