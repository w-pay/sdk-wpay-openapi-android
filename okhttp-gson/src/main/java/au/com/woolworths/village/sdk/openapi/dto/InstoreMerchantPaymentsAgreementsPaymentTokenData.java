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
import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Mandatory data object containing request
 */
@ApiModel(description = "Mandatory data object containing request")

public class InstoreMerchantPaymentsAgreementsPaymentTokenData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionType transactionType;

  public static final String SERIALIZED_NAME_CUSTOMER_REF = "customerRef";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REF)
  private String customerRef;


  public InstoreMerchantPaymentsAgreementsPaymentTokenData paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement
   * @return paymentToken
  **/
  @ApiModelProperty(required = true, value = "The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public InstoreMerchantPaymentsAgreementsPaymentTokenData amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public InstoreMerchantPaymentsAgreementsPaymentTokenData clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * A merchant application specific reference number for the transaction.
   * @return clientReference
  **/
  @ApiModelProperty(required = true, value = "A merchant application specific reference number for the transaction.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public InstoreMerchantPaymentsAgreementsPaymentTokenData orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * A merchant order number for the transaction.
   * @return orderNumber
  **/
  @ApiModelProperty(required = true, value = "A merchant order number for the transaction.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public InstoreMerchantPaymentsAgreementsPaymentTokenData transactionType(TransactionType transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionType getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }


  public InstoreMerchantPaymentsAgreementsPaymentTokenData customerRef(String customerRef) {
    
    this.customerRef = customerRef;
    return this;
  }

   /**
   * A merchant application specific reference number for the customer.
   * @return customerRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A merchant application specific reference number for the customer.")

  public String getCustomerRef() {
    return customerRef;
  }


  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstoreMerchantPaymentsAgreementsPaymentTokenData instoreMerchantPaymentsAgreementsPaymentTokenData = (InstoreMerchantPaymentsAgreementsPaymentTokenData) o;
    return Objects.equals(this.paymentToken, instoreMerchantPaymentsAgreementsPaymentTokenData.paymentToken) &&
        Objects.equals(this.amount, instoreMerchantPaymentsAgreementsPaymentTokenData.amount) &&
        Objects.equals(this.clientReference, instoreMerchantPaymentsAgreementsPaymentTokenData.clientReference) &&
        Objects.equals(this.orderNumber, instoreMerchantPaymentsAgreementsPaymentTokenData.orderNumber) &&
        Objects.equals(this.transactionType, instoreMerchantPaymentsAgreementsPaymentTokenData.transactionType) &&
        Objects.equals(this.customerRef, instoreMerchantPaymentsAgreementsPaymentTokenData.customerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, amount, clientReference, orderNumber, transactionType, customerRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstoreMerchantPaymentsAgreementsPaymentTokenData {\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
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

