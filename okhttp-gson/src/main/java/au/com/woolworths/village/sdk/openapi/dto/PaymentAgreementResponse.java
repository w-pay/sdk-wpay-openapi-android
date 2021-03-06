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
 * The JSON response structure of the Create and Update Payment Agreement endpoints.
 */
@ApiModel(description = "The JSON response structure of the Create and Update Payment Agreement endpoints.")

public class PaymentAgreementResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_RECEIPT = "transactionReceipt";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECEIPT)
  private String transactionReceipt;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_PAYMENT_AGREEMENT = "paymentAgreement";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AGREEMENT)
  private PaymentAgreementResponsePaymentAgreement paymentAgreement;

  public static final String SERIALIZED_NAME_FRAUD_RESPONSE = "fraudResponse";
  @SerializedName(SERIALIZED_NAME_FRAUD_RESPONSE)
  private PaymentsSuccessResponseFraudResponse fraudResponse;

  public static final String SERIALIZED_NAME_EXTENDED_TRANSACTION_DATA = "extendedTransactionData";
  @SerializedName(SERIALIZED_NAME_EXTENDED_TRANSACTION_DATA)
  private List<PaymentsSuccessResponseExtendedTransactionData> extendedTransactionData = null;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_CODE = "externalServiceCode";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_CODE)
  private String externalServiceCode;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE = "externalServiceMessage";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE)
  private String externalServiceMessage;


  public PaymentAgreementResponse transactionReceipt(String transactionReceipt) {
    
    this.transactionReceipt = transactionReceipt;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the transaction in the container.
   * @return transactionReceipt
  **/
  @ApiModelProperty(example = "1000000000670621", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the transaction in the container.")

  public String getTransactionReceipt() {
    return transactionReceipt;
  }


  public void setTransactionReceipt(String transactionReceipt) {
    this.transactionReceipt = transactionReceipt;
  }


  public PaymentAgreementResponse paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement.
   * @return paymentToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "27e07e4e-58df-4072-8e75-33dd464af667", value = "The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public PaymentAgreementResponse paymentAgreement(PaymentAgreementResponsePaymentAgreement paymentAgreement) {
    
    this.paymentAgreement = paymentAgreement;
    return this;
  }

   /**
   * Get paymentAgreement
   * @return paymentAgreement
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentAgreementResponsePaymentAgreement getPaymentAgreement() {
    return paymentAgreement;
  }


  public void setPaymentAgreement(PaymentAgreementResponsePaymentAgreement paymentAgreement) {
    this.paymentAgreement = paymentAgreement;
  }


  public PaymentAgreementResponse fraudResponse(PaymentsSuccessResponseFraudResponse fraudResponse) {
    
    this.fraudResponse = fraudResponse;
    return this;
  }

   /**
   * Get fraudResponse
   * @return fraudResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsSuccessResponseFraudResponse getFraudResponse() {
    return fraudResponse;
  }


  public void setFraudResponse(PaymentsSuccessResponseFraudResponse fraudResponse) {
    this.fraudResponse = fraudResponse;
  }


  public PaymentAgreementResponse extendedTransactionData(List<PaymentsSuccessResponseExtendedTransactionData> extendedTransactionData) {
    
    this.extendedTransactionData = extendedTransactionData;
    return this;
  }

  public PaymentAgreementResponse addExtendedTransactionDataItem(PaymentsSuccessResponseExtendedTransactionData extendedTransactionDataItem) {
    if (this.extendedTransactionData == null) {
      this.extendedTransactionData = new ArrayList<PaymentsSuccessResponseExtendedTransactionData>();
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

  public List<PaymentsSuccessResponseExtendedTransactionData> getExtendedTransactionData() {
    return extendedTransactionData;
  }


  public void setExtendedTransactionData(List<PaymentsSuccessResponseExtendedTransactionData> extendedTransactionData) {
    this.extendedTransactionData = extendedTransactionData;
  }


  public PaymentAgreementResponse externalServiceCode(String externalServiceCode) {
    
    this.externalServiceCode = externalServiceCode;
    return this;
  }

   /**
   * The external service code (from eg. Webpay). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00", value = "The external service code (from eg. Webpay). This property is only included in the response if it is enabled in the consumers API configuration.")

  public String getExternalServiceCode() {
    return externalServiceCode;
  }


  public void setExternalServiceCode(String externalServiceCode) {
    this.externalServiceCode = externalServiceCode;
  }


  public PaymentAgreementResponse externalServiceMessage(String externalServiceMessage) {
    
    this.externalServiceMessage = externalServiceMessage;
    return this;
  }

   /**
   * The external service message (from eg. Webpay). This property is only included in the response if it is enabled in the consumers API configuration.
   * @return externalServiceMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPROVED", value = "The external service message (from eg. Webpay). This property is only included in the response if it is enabled in the consumers API configuration.")

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
    PaymentAgreementResponse paymentAgreementResponse = (PaymentAgreementResponse) o;
    return Objects.equals(this.transactionReceipt, paymentAgreementResponse.transactionReceipt) &&
        Objects.equals(this.paymentToken, paymentAgreementResponse.paymentToken) &&
        Objects.equals(this.paymentAgreement, paymentAgreementResponse.paymentAgreement) &&
        Objects.equals(this.fraudResponse, paymentAgreementResponse.fraudResponse) &&
        Objects.equals(this.extendedTransactionData, paymentAgreementResponse.extendedTransactionData) &&
        Objects.equals(this.externalServiceCode, paymentAgreementResponse.externalServiceCode) &&
        Objects.equals(this.externalServiceMessage, paymentAgreementResponse.externalServiceMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionReceipt, paymentToken, paymentAgreement, fraudResponse, extendedTransactionData, externalServiceCode, externalServiceMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAgreementResponse {\n");
    sb.append("    transactionReceipt: ").append(toIndentedString(transactionReceipt)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paymentAgreement: ").append(toIndentedString(paymentAgreement)).append("\n");
    sb.append("    fraudResponse: ").append(toIndentedString(fraudResponse)).append("\n");
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

