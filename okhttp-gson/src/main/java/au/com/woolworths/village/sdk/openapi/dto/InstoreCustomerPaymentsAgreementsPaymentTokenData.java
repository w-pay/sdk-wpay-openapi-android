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
import au.com.woolworths.village.sdk.openapi.dto.BillingAddress;
import au.com.woolworths.village.sdk.openapi.dto.PaymentAgreement;
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
 * Mandatory data object containing request
 */
@ApiModel(description = "Mandatory data object containing request")

public class InstoreCustomerPaymentsAgreementsPaymentTokenData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_CUSTOMER_REF = "customerRef";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REF)
  private String customerRef;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private BillingAddress billingAddress;

  public static final String SERIALIZED_NAME_PAYMENT_AGREEMENT = "paymentAgreement";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AGREEMENT)
  private PaymentAgreement paymentAgreement;


  public InstoreCustomerPaymentsAgreementsPaymentTokenData clientReference(String clientReference) {
    
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


  public InstoreCustomerPaymentsAgreementsPaymentTokenData customerRef(String customerRef) {
    
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


  public InstoreCustomerPaymentsAgreementsPaymentTokenData orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Merchant order number of the transaction.
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant order number of the transaction.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public InstoreCustomerPaymentsAgreementsPaymentTokenData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the payment agreement. Used to distinguish payment agreements from one another.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the payment agreement. Used to distinguish payment agreements from one another.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InstoreCustomerPaymentsAgreementsPaymentTokenData billingAddress(BillingAddress billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillingAddress getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(BillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  public InstoreCustomerPaymentsAgreementsPaymentTokenData paymentAgreement(PaymentAgreement paymentAgreement) {
    
    this.paymentAgreement = paymentAgreement;
    return this;
  }

   /**
   * Get paymentAgreement
   * @return paymentAgreement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentAgreement getPaymentAgreement() {
    return paymentAgreement;
  }


  public void setPaymentAgreement(PaymentAgreement paymentAgreement) {
    this.paymentAgreement = paymentAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstoreCustomerPaymentsAgreementsPaymentTokenData instoreCustomerPaymentsAgreementsPaymentTokenData = (InstoreCustomerPaymentsAgreementsPaymentTokenData) o;
    return Objects.equals(this.clientReference, instoreCustomerPaymentsAgreementsPaymentTokenData.clientReference) &&
        Objects.equals(this.customerRef, instoreCustomerPaymentsAgreementsPaymentTokenData.customerRef) &&
        Objects.equals(this.orderNumber, instoreCustomerPaymentsAgreementsPaymentTokenData.orderNumber) &&
        Objects.equals(this.description, instoreCustomerPaymentsAgreementsPaymentTokenData.description) &&
        Objects.equals(this.billingAddress, instoreCustomerPaymentsAgreementsPaymentTokenData.billingAddress) &&
        Objects.equals(this.paymentAgreement, instoreCustomerPaymentsAgreementsPaymentTokenData.paymentAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReference, customerRef, orderNumber, description, billingAddress, paymentAgreement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstoreCustomerPaymentsAgreementsPaymentTokenData {\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    paymentAgreement: ").append(toIndentedString(paymentAgreement)).append("\n");
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

