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
 * The JSON request structure of the Openpay Refunds endpoint.
 */
@ApiModel(description = "The JSON request structure of the Openpay Refunds endpoint.")

public class OpenpayRefundsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_MERCHANT_TRANSACTED_AT = "merchantTransactedAt";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TRANSACTED_AT)
  private String merchantTransactedAt;

  public static final String SERIALIZED_NAME_REFUNDS = "refunds";
  @SerializedName(SERIALIZED_NAME_REFUNDS)
  private List<OpenpayRefundsRequestRefunds> refunds = new ArrayList<OpenpayRefundsRequestRefunds>();

  public static final String SERIALIZED_NAME_STORE_DATA = "storeData";
  @SerializedName(SERIALIZED_NAME_STORE_DATA)
  private OpenpayRefundsRequestStoreData storeData;


  public OpenpayRefundsRequest clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.
   * @return clientReference
  **/
  @ApiModelProperty(example = "V9FI6BV0BWGXO06", required = true, value = "A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public OpenpayRefundsRequest orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * The merchant order number of the transaction.
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170505090", value = "The merchant order number of the transaction.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public OpenpayRefundsRequest merchantTransactedAt(String merchantTransactedAt) {
    
    this.merchantTransactedAt = merchantTransactedAt;
    return this;
  }

   /**
   * The merchants transaction date and time. The timestamp format is ISO8601.
   * @return merchantTransactedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-19T18:00:00.000+1100", value = "The merchants transaction date and time. The timestamp format is ISO8601.")

  public String getMerchantTransactedAt() {
    return merchantTransactedAt;
  }


  public void setMerchantTransactedAt(String merchantTransactedAt) {
    this.merchantTransactedAt = merchantTransactedAt;
  }


  public OpenpayRefundsRequest refunds(List<OpenpayRefundsRequestRefunds> refunds) {
    
    this.refunds = refunds;
    return this;
  }

  public OpenpayRefundsRequest addRefundsItem(OpenpayRefundsRequestRefunds refundsItem) {
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * Get refunds
   * @return refunds
  **/
  @ApiModelProperty(required = true, value = "")

  public List<OpenpayRefundsRequestRefunds> getRefunds() {
    return refunds;
  }


  public void setRefunds(List<OpenpayRefundsRequestRefunds> refunds) {
    this.refunds = refunds;
  }


  public OpenpayRefundsRequest storeData(OpenpayRefundsRequestStoreData storeData) {
    
    this.storeData = storeData;
    return this;
  }

   /**
   * Get storeData
   * @return storeData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenpayRefundsRequestStoreData getStoreData() {
    return storeData;
  }


  public void setStoreData(OpenpayRefundsRequestStoreData storeData) {
    this.storeData = storeData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenpayRefundsRequest openpayRefundsRequest = (OpenpayRefundsRequest) o;
    return Objects.equals(this.clientReference, openpayRefundsRequest.clientReference) &&
        Objects.equals(this.orderNumber, openpayRefundsRequest.orderNumber) &&
        Objects.equals(this.merchantTransactedAt, openpayRefundsRequest.merchantTransactedAt) &&
        Objects.equals(this.refunds, openpayRefundsRequest.refunds) &&
        Objects.equals(this.storeData, openpayRefundsRequest.storeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReference, orderNumber, merchantTransactedAt, refunds, storeData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayRefundsRequest {\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    merchantTransactedAt: ").append(toIndentedString(merchantTransactedAt)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    storeData: ").append(toIndentedString(storeData)).append("\n");
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
