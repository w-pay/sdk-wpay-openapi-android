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
import au.com.woolworths.village.sdk.openapi.dto.PaymentsSuccessResponseExtendedTransactionData1;
import au.com.woolworths.village.sdk.openapi.dto.PaymentsSuccessResponseStepUp;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PaymentsSuccessResponseGooglePay
 */

public class PaymentsSuccessResponseGooglePay implements Serializable {
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

  public static final String SERIALIZED_NAME_STEP_UP = "stepUp";
  @SerializedName(SERIALIZED_NAME_STEP_UP)
  private PaymentsSuccessResponseStepUp stepUp;

  public static final String SERIALIZED_NAME_EXTENDED_TRANSACTION_DATA = "extendedTransactionData";
  @SerializedName(SERIALIZED_NAME_EXTENDED_TRANSACTION_DATA)
  private List<PaymentsSuccessResponseExtendedTransactionData1> extendedTransactionData = null;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_CODE = "externalServiceCode";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_CODE)
  private String externalServiceCode;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE = "externalServiceMessage";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE)
  private String externalServiceMessage;


  public PaymentsSuccessResponseGooglePay paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The google pay payment instrument id.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "90953", required = true, value = "The google pay payment instrument id.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public PaymentsSuccessResponseGooglePay paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The google pay payment token. The payment token is a unique identifier for the payment instrument.
   * @return paymentToken
  **/
  @ApiModelProperty(example = "76a4c2f1-7620-4bc4-8f4f-01c1467ea318", required = true, value = "The google pay payment token. The payment token is a unique identifier for the payment instrument.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public PaymentsSuccessResponseGooglePay paymentTransactionRef(String paymentTransactionRef) {
    
    this.paymentTransactionRef = paymentTransactionRef;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the google pay transaction in the container.
   * @return paymentTransactionRef
  **/
  @ApiModelProperty(example = "1000000000670625", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the google pay transaction in the container.")

  public String getPaymentTransactionRef() {
    return paymentTransactionRef;
  }


  public void setPaymentTransactionRef(String paymentTransactionRef) {
    this.paymentTransactionRef = paymentTransactionRef;
  }


  public PaymentsSuccessResponseGooglePay errorCode(String errorCode) {
    
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


  public PaymentsSuccessResponseGooglePay errorMessage(String errorMessage) {
    
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


  public PaymentsSuccessResponseGooglePay errorDetail(String errorDetail) {
    
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


  public PaymentsSuccessResponseGooglePay stepUp(PaymentsSuccessResponseStepUp stepUp) {
    
    this.stepUp = stepUp;
    return this;
  }

   /**
   * Get stepUp
   * @return stepUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsSuccessResponseStepUp getStepUp() {
    return stepUp;
  }


  public void setStepUp(PaymentsSuccessResponseStepUp stepUp) {
    this.stepUp = stepUp;
  }


  public PaymentsSuccessResponseGooglePay extendedTransactionData(List<PaymentsSuccessResponseExtendedTransactionData1> extendedTransactionData) {
    
    this.extendedTransactionData = extendedTransactionData;
    return this;
  }

  public PaymentsSuccessResponseGooglePay addExtendedTransactionDataItem(PaymentsSuccessResponseExtendedTransactionData1 extendedTransactionDataItem) {
    if (this.extendedTransactionData == null) {
      this.extendedTransactionData = new ArrayList<PaymentsSuccessResponseExtendedTransactionData1>();
    }
    this.extendedTransactionData.add(extendedTransactionDataItem);
    return this;
  }

   /**
   * This array is only included in the response if it is enabled in the consumers API configuration.
   * @return extendedTransactionData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This array is only included in the response if it is enabled in the consumers API configuration.")

  public List<PaymentsSuccessResponseExtendedTransactionData1> getExtendedTransactionData() {
    return extendedTransactionData;
  }


  public void setExtendedTransactionData(List<PaymentsSuccessResponseExtendedTransactionData1> extendedTransactionData) {
    this.extendedTransactionData = extendedTransactionData;
  }


  public PaymentsSuccessResponseGooglePay externalServiceCode(String externalServiceCode) {
    
    this.externalServiceCode = externalServiceCode;
    return this;
  }

   /**
   * The external service code (from eg. Google Pay). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The external service code (from eg. Google Pay). This property is only included in the response if it is enabled in the consumers API configuration.")

  public String getExternalServiceCode() {
    return externalServiceCode;
  }


  public void setExternalServiceCode(String externalServiceCode) {
    this.externalServiceCode = externalServiceCode;
  }


  public PaymentsSuccessResponseGooglePay externalServiceMessage(String externalServiceMessage) {
    
    this.externalServiceMessage = externalServiceMessage;
    return this;
  }

   /**
   * The external service message (from eg. Google Pay). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACCEPT", value = "The external service message (from eg. Google Pay). This property is only included in the response if it is enabled in the consumers API configuration.")

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
    PaymentsSuccessResponseGooglePay paymentsSuccessResponseGooglePay = (PaymentsSuccessResponseGooglePay) o;
    return Objects.equals(this.paymentInstrumentId, paymentsSuccessResponseGooglePay.paymentInstrumentId) &&
        Objects.equals(this.paymentToken, paymentsSuccessResponseGooglePay.paymentToken) &&
        Objects.equals(this.paymentTransactionRef, paymentsSuccessResponseGooglePay.paymentTransactionRef) &&
        Objects.equals(this.errorCode, paymentsSuccessResponseGooglePay.errorCode) &&
        Objects.equals(this.errorMessage, paymentsSuccessResponseGooglePay.errorMessage) &&
        Objects.equals(this.errorDetail, paymentsSuccessResponseGooglePay.errorDetail) &&
        Objects.equals(this.stepUp, paymentsSuccessResponseGooglePay.stepUp) &&
        Objects.equals(this.extendedTransactionData, paymentsSuccessResponseGooglePay.extendedTransactionData) &&
        Objects.equals(this.externalServiceCode, paymentsSuccessResponseGooglePay.externalServiceCode) &&
        Objects.equals(this.externalServiceMessage, paymentsSuccessResponseGooglePay.externalServiceMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, paymentToken, paymentTransactionRef, errorCode, errorMessage, errorDetail, stepUp, extendedTransactionData, externalServiceCode, externalServiceMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsSuccessResponseGooglePay {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paymentTransactionRef: ").append(toIndentedString(paymentTransactionRef)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
    sb.append("    stepUp: ").append(toIndentedString(stepUp)).append("\n");
    sb.append("    extendedTransactionData: ").append(toIndentedString(extendedTransactionData)).append("\n");
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

