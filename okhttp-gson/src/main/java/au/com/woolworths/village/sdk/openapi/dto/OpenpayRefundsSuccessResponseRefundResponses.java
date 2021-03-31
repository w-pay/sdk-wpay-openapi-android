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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * OpenpayRefundsSuccessResponseRefundResponses
 */

public class OpenpayRefundsSuccessResponseRefundResponses implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_TRANSACTION_REF = "paymentTransactionRef";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TRANSACTION_REF)
  private String paymentTransactionRef;

  public static final String SERIALIZED_NAME_REFUND_TRANSACTION_REF = "refundTransactionRef";
  @SerializedName(SERIALIZED_NAME_REFUND_TRANSACTION_REF)
  private String refundTransactionRef;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_EXTENDED_TRANSACTION_DATA = "extendedTransactionData";
  @SerializedName(SERIALIZED_NAME_EXTENDED_TRANSACTION_DATA)
  private List<OpenpayPaymentsSuccessResponseExtendedTransactionData> extendedTransactionData = new ArrayList<OpenpayPaymentsSuccessResponseExtendedTransactionData>();

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_CODE = "externalServiceCode";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_CODE)
  private String externalServiceCode;

  public static final String SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE = "externalServiceMessage";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SERVICE_MESSAGE)
  private String externalServiceMessage;


  public OpenpayRefundsSuccessResponseRefundResponses paymentTransactionRef(String paymentTransactionRef) {
    
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


  public OpenpayRefundsSuccessResponseRefundResponses refundTransactionRef(String refundTransactionRef) {
    
    this.refundTransactionRef = refundTransactionRef;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the refund transaction in the container.
   * @return refundTransactionRef
  **/
  @ApiModelProperty(example = "1000000000670875", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the refund transaction in the container.")

  public String getRefundTransactionRef() {
    return refundTransactionRef;
  }


  public void setRefundTransactionRef(String refundTransactionRef) {
    this.refundTransactionRef = refundTransactionRef;
  }


  public OpenpayRefundsSuccessResponseRefundResponses amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount processed in the refund.
   * @return amount
  **/
  @ApiModelProperty(example = "20.5", required = true, value = "The amount processed in the refund.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public OpenpayRefundsSuccessResponseRefundResponses extendedTransactionData(List<OpenpayPaymentsSuccessResponseExtendedTransactionData> extendedTransactionData) {
    
    this.extendedTransactionData = extendedTransactionData;
    return this;
  }

  public OpenpayRefundsSuccessResponseRefundResponses addExtendedTransactionDataItem(OpenpayPaymentsSuccessResponseExtendedTransactionData extendedTransactionDataItem) {
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


  public OpenpayRefundsSuccessResponseRefundResponses externalServiceCode(String externalServiceCode) {
    
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


  public OpenpayRefundsSuccessResponseRefundResponses externalServiceMessage(String externalServiceMessage) {
    
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
    OpenpayRefundsSuccessResponseRefundResponses openpayRefundsSuccessResponseRefundResponses = (OpenpayRefundsSuccessResponseRefundResponses) o;
    return Objects.equals(this.paymentTransactionRef, openpayRefundsSuccessResponseRefundResponses.paymentTransactionRef) &&
        Objects.equals(this.refundTransactionRef, openpayRefundsSuccessResponseRefundResponses.refundTransactionRef) &&
        Objects.equals(this.amount, openpayRefundsSuccessResponseRefundResponses.amount) &&
        Objects.equals(this.extendedTransactionData, openpayRefundsSuccessResponseRefundResponses.extendedTransactionData) &&
        Objects.equals(this.externalServiceCode, openpayRefundsSuccessResponseRefundResponses.externalServiceCode) &&
        Objects.equals(this.externalServiceMessage, openpayRefundsSuccessResponseRefundResponses.externalServiceMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionRef, refundTransactionRef, amount, extendedTransactionData, externalServiceCode, externalServiceMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayRefundsSuccessResponseRefundResponses {\n");
    sb.append("    paymentTransactionRef: ").append(toIndentedString(paymentTransactionRef)).append("\n");
    sb.append("    refundTransactionRef: ").append(toIndentedString(refundTransactionRef)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

