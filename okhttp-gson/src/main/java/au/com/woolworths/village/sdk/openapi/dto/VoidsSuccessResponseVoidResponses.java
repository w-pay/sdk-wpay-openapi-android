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
import java.io.Serializable;

/**
 * VoidsSuccessResponseVoidResponses
 */

public class VoidsSuccessResponseVoidResponses implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_TRANSACTION_REF = "paymentTransactionRef";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TRANSACTION_REF)
  private String paymentTransactionRef;

  public static final String SERIALIZED_NAME_VOID_TRANSACTION_REF = "voidTransactionRef";
  @SerializedName(SERIALIZED_NAME_VOID_TRANSACTION_REF)
  private String voidTransactionRef;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ERROR_DETAIL = "errorDetail";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAIL)
  private String errorDetail;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_CODE = "externalServiceCode";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_CODE)
  private String externalServiceCode;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE = "externalServiceMessage";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE)
  private String externalServiceMessage;


  public VoidsSuccessResponseVoidResponses paymentTransactionRef(String paymentTransactionRef) {
    
    this.paymentTransactionRef = paymentTransactionRef;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the credit card transaction in the container.
   * @return paymentTransactionRef
  **/
  @ApiModelProperty(example = "1000000000670622", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the credit card transaction in the container.")

  public String getPaymentTransactionRef() {
    return paymentTransactionRef;
  }


  public void setPaymentTransactionRef(String paymentTransactionRef) {
    this.paymentTransactionRef = paymentTransactionRef;
  }


  public VoidsSuccessResponseVoidResponses voidTransactionRef(String voidTransactionRef) {
    
    this.voidTransactionRef = voidTransactionRef;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the void transaction in the container.
   * @return voidTransactionRef
  **/
  @ApiModelProperty(example = "1000000000670875", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the void transaction in the container.")

  public String getVoidTransactionRef() {
    return voidTransactionRef;
  }


  public void setVoidTransactionRef(String voidTransactionRef) {
    this.voidTransactionRef = voidTransactionRef;
  }


  public VoidsSuccessResponseVoidResponses errorCode(String errorCode) {
    
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


  public VoidsSuccessResponseVoidResponses errorMessage(String errorMessage) {
    
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


  public VoidsSuccessResponseVoidResponses errorDetail(String errorDetail) {
    
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


  public VoidsSuccessResponseVoidResponses externalServiceCode(String externalServiceCode) {
    
    this.externalServiceCode = externalServiceCode;
    return this;
  }

   /**
   * The external service code (from eg. Webpay). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceCode
  **/
  @ApiModelProperty(example = "00", required = true, value = "The external service code (from eg. Webpay). This property is only included in the response if it is enabled in the consumers API configuration.")

  public String getExternalServiceCode() {
    return externalServiceCode;
  }


  public void setExternalServiceCode(String externalServiceCode) {
    this.externalServiceCode = externalServiceCode;
  }


  public VoidsSuccessResponseVoidResponses externalServiceMessage(String externalServiceMessage) {
    
    this.externalServiceMessage = externalServiceMessage;
    return this;
  }

   /**
   * The external service message (from eg. Webpay). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceMessage
  **/
  @ApiModelProperty(example = "APPROVED", required = true, value = "The external service message (from eg. Webpay). This property is only included in the response if it is enabled in the consumers API configuration.")

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
    VoidsSuccessResponseVoidResponses voidsSuccessResponseVoidResponses = (VoidsSuccessResponseVoidResponses) o;
    return Objects.equals(this.paymentTransactionRef, voidsSuccessResponseVoidResponses.paymentTransactionRef) &&
        Objects.equals(this.voidTransactionRef, voidsSuccessResponseVoidResponses.voidTransactionRef) &&
        Objects.equals(this.errorCode, voidsSuccessResponseVoidResponses.errorCode) &&
        Objects.equals(this.errorMessage, voidsSuccessResponseVoidResponses.errorMessage) &&
        Objects.equals(this.errorDetail, voidsSuccessResponseVoidResponses.errorDetail) &&
        Objects.equals(this.externalServiceCode, voidsSuccessResponseVoidResponses.externalServiceCode) &&
        Objects.equals(this.externalServiceMessage, voidsSuccessResponseVoidResponses.externalServiceMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionRef, voidTransactionRef, errorCode, errorMessage, errorDetail, externalServiceCode, externalServiceMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoidsSuccessResponseVoidResponses {\n");
    sb.append("    paymentTransactionRef: ").append(toIndentedString(paymentTransactionRef)).append("\n");
    sb.append("    voidTransactionRef: ").append(toIndentedString(voidTransactionRef)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

