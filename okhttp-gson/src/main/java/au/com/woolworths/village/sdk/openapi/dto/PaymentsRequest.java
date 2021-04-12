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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON request structure of the Payments endpoint.
 */
@ApiModel(description = "The JSON request structure of the Payments endpoint.")

public class PaymentsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private PaymentsRequestTransactionType transactionType;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private PaymentsRequestShippingAddress shippingAddress;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private List<PaymentsRequestPayments> payments = new ArrayList<PaymentsRequestPayments>();

  public static final String SERIALIZED_NAME_EXTENDED_MERCHANT_DATA = "extendedMerchantData";
  @SerializedName(SERIALIZED_NAME_EXTENDED_MERCHANT_DATA)
  private List<PaymentsRequestExtendedMerchantData> extendedMerchantData = null;

  public static final String SERIALIZED_NAME_STORE_DATA = "storeData";
  @SerializedName(SERIALIZED_NAME_STORE_DATA)
  private PaymentsRequestStoreData storeData;

  public static final String SERIALIZED_NAME_FRAUD_PAYLOAD = "fraudPayload";
  @SerializedName(SERIALIZED_NAME_FRAUD_PAYLOAD)
  private PaymentsRequestFraudPayload fraudPayload;


  public PaymentsRequest transactionType(PaymentsRequestTransactionType transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentsRequestTransactionType getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(PaymentsRequestTransactionType transactionType) {
    this.transactionType = transactionType;
  }


  public PaymentsRequest clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.
   * @return clientReference
  **/
  @ApiModelProperty(example = "T5ESYRPWJKPHF54", required = true, value = "A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public PaymentsRequest orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * The merchant order number of the transaction.
   * @return orderNumber
  **/
  @ApiModelProperty(example = "20170505090", required = true, value = "The merchant order number of the transaction.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public PaymentsRequest shippingAddress(PaymentsRequestShippingAddress shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsRequestShippingAddress getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(PaymentsRequestShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public PaymentsRequest payments(List<PaymentsRequestPayments> payments) {
    
    this.payments = payments;
    return this;
  }

  public PaymentsRequest addPaymentsItem(PaymentsRequestPayments paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PaymentsRequestPayments> getPayments() {
    return payments;
  }


  public void setPayments(List<PaymentsRequestPayments> payments) {
    this.payments = payments;
  }


  public PaymentsRequest extendedMerchantData(List<PaymentsRequestExtendedMerchantData> extendedMerchantData) {
    
    this.extendedMerchantData = extendedMerchantData;
    return this;
  }

  public PaymentsRequest addExtendedMerchantDataItem(PaymentsRequestExtendedMerchantData extendedMerchantDataItem) {
    if (this.extendedMerchantData == null) {
      this.extendedMerchantData = new ArrayList<PaymentsRequestExtendedMerchantData>();
    }
    this.extendedMerchantData.add(extendedMerchantDataItem);
    return this;
  }

   /**
   * This object is only required if the payments request contains paypal instruments.
   * @return extendedMerchantData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This object is only required if the payments request contains paypal instruments.")

  public List<PaymentsRequestExtendedMerchantData> getExtendedMerchantData() {
    return extendedMerchantData;
  }


  public void setExtendedMerchantData(List<PaymentsRequestExtendedMerchantData> extendedMerchantData) {
    this.extendedMerchantData = extendedMerchantData;
  }


  public PaymentsRequest storeData(PaymentsRequestStoreData storeData) {
    
    this.storeData = storeData;
    return this;
  }

   /**
   * Get storeData
   * @return storeData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsRequestStoreData getStoreData() {
    return storeData;
  }


  public void setStoreData(PaymentsRequestStoreData storeData) {
    this.storeData = storeData;
  }


  public PaymentsRequest fraudPayload(PaymentsRequestFraudPayload fraudPayload) {
    
    this.fraudPayload = fraudPayload;
    return this;
  }

   /**
   * Get fraudPayload
   * @return fraudPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsRequestFraudPayload getFraudPayload() {
    return fraudPayload;
  }


  public void setFraudPayload(PaymentsRequestFraudPayload fraudPayload) {
    this.fraudPayload = fraudPayload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsRequest paymentsRequest = (PaymentsRequest) o;
    return Objects.equals(this.transactionType, paymentsRequest.transactionType) &&
        Objects.equals(this.clientReference, paymentsRequest.clientReference) &&
        Objects.equals(this.orderNumber, paymentsRequest.orderNumber) &&
        Objects.equals(this.shippingAddress, paymentsRequest.shippingAddress) &&
        Objects.equals(this.payments, paymentsRequest.payments) &&
        Objects.equals(this.extendedMerchantData, paymentsRequest.extendedMerchantData) &&
        Objects.equals(this.storeData, paymentsRequest.storeData) &&
        Objects.equals(this.fraudPayload, paymentsRequest.fraudPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, clientReference, orderNumber, shippingAddress, payments, extendedMerchantData, storeData, fraudPayload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRequest {\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    extendedMerchantData: ").append(toIndentedString(extendedMerchantData)).append("\n");
    sb.append("    storeData: ").append(toIndentedString(storeData)).append("\n");
    sb.append("    fraudPayload: ").append(toIndentedString(fraudPayload)).append("\n");
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
