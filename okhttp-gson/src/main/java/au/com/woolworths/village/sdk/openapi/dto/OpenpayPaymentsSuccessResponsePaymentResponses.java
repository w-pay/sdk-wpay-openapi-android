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

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * OpenpayPaymentsSuccessResponsePaymentResponses
 */

public class OpenpayPaymentsSuccessResponsePaymentResponses implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_PAYMENT_TRANSACTION_REF = "paymentTransactionRef";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TRANSACTION_REF)
  private String paymentTransactionRef;

  public static final String SERIALIZED_NAME_EXTENDED_TRANSACTION_DATA = "extendedTransactionData";
  @SerializedName(SERIALIZED_NAME_EXTENDED_TRANSACTION_DATA)
  private List<OpenpayPaymentsSuccessResponseExtendedTransactionData> extendedTransactionData = new ArrayList<OpenpayPaymentsSuccessResponseExtendedTransactionData>();

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_CODE = "externalServiceCode";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_CODE)
  private String externalServiceCode;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE = "externalServiceMessage";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE)
  private String externalServiceMessage;


  public OpenpayPaymentsSuccessResponsePaymentResponses paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The payment token. The payment token is a unique identifier for the payment instrument.
   * @return paymentToken
  **/
  @ApiModelProperty(example = "46ee5998-10cd-11ea-8d71-362b9e155667", required = true, value = "The payment token. The payment token is a unique identifier for the payment instrument.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public OpenpayPaymentsSuccessResponsePaymentResponses paymentTransactionRef(String paymentTransactionRef) {
    
    this.paymentTransactionRef = paymentTransactionRef;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the openpay transaction in the container.
   * @return paymentTransactionRef
  **/
  @ApiModelProperty(example = "1000000000670622", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the openpay transaction in the container.")

  public String getPaymentTransactionRef() {
    return paymentTransactionRef;
  }


  public void setPaymentTransactionRef(String paymentTransactionRef) {
    this.paymentTransactionRef = paymentTransactionRef;
  }


  public OpenpayPaymentsSuccessResponsePaymentResponses extendedTransactionData(List<OpenpayPaymentsSuccessResponseExtendedTransactionData> extendedTransactionData) {
    
    this.extendedTransactionData = extendedTransactionData;
    return this;
  }

  public OpenpayPaymentsSuccessResponsePaymentResponses addExtendedTransactionDataItem(OpenpayPaymentsSuccessResponseExtendedTransactionData extendedTransactionDataItem) {
    this.extendedTransactionData.add(extendedTransactionDataItem);
    return this;
  }

   /**
   * This array is only included in the response if it is enabled in the consumers API configuration.
   * @return extendedTransactionData
  **/
  @ApiModelProperty(required = true, value = "This array is only included in the response if it is enabled in the consumers API configuration.")

  public List<OpenpayPaymentsSuccessResponseExtendedTransactionData> getExtendedTransactionData() {
    return extendedTransactionData;
  }


  public void setExtendedTransactionData(List<OpenpayPaymentsSuccessResponseExtendedTransactionData> extendedTransactionData) {
    this.extendedTransactionData = extendedTransactionData;
  }


  public OpenpayPaymentsSuccessResponsePaymentResponses externalServiceCode(String externalServiceCode) {
    
    this.externalServiceCode = externalServiceCode;
    return this;
  }

   /**
   * The external service code (from eg. Openpay). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceCode
  **/
  @ApiModelProperty(example = "00", required = true, value = "The external service code (from eg. Openpay). This property is only included in the response if it is enabled in the consumers API configuration.")

  public String getExternalServiceCode() {
    return externalServiceCode;
  }


  public void setExternalServiceCode(String externalServiceCode) {
    this.externalServiceCode = externalServiceCode;
  }


  public OpenpayPaymentsSuccessResponsePaymentResponses externalServiceMessage(String externalServiceMessage) {
    
    this.externalServiceMessage = externalServiceMessage;
    return this;
  }

   /**
   * The external service message (from eg. Openpay). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceMessage
  **/
  @ApiModelProperty(example = "APPROVED", required = true, value = "The external service message (from eg. Openpay). This property is only included in the response if it is enabled in the consumers API configuration.")

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
    OpenpayPaymentsSuccessResponsePaymentResponses openpayPaymentsSuccessResponsePaymentResponses = (OpenpayPaymentsSuccessResponsePaymentResponses) o;
    return Objects.equals(this.paymentToken, openpayPaymentsSuccessResponsePaymentResponses.paymentToken) &&
        Objects.equals(this.paymentTransactionRef, openpayPaymentsSuccessResponsePaymentResponses.paymentTransactionRef) &&
        Objects.equals(this.extendedTransactionData, openpayPaymentsSuccessResponsePaymentResponses.extendedTransactionData) &&
        Objects.equals(this.externalServiceCode, openpayPaymentsSuccessResponsePaymentResponses.externalServiceCode) &&
        Objects.equals(this.externalServiceMessage, openpayPaymentsSuccessResponsePaymentResponses.externalServiceMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, paymentTransactionRef, extendedTransactionData, externalServiceCode, externalServiceMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayPaymentsSuccessResponsePaymentResponses {\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paymentTransactionRef: ").append(toIndentedString(paymentTransactionRef)).append("\n");
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

