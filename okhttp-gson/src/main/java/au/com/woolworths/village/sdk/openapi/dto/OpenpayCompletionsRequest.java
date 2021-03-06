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
 * The JSON request structure of the Openpay Completions endpoint.
 */
@ApiModel(description = "The JSON request structure of the Openpay Completions endpoint.")

public class OpenpayCompletionsRequest implements Serializable {
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

  public static final String SERIALIZED_NAME_COMPLETIONS = "completions";
  @SerializedName(SERIALIZED_NAME_COMPLETIONS)
  private List<OpenpayCompletionsRequestCompletions> completions = new ArrayList<OpenpayCompletionsRequestCompletions>();


  public OpenpayCompletionsRequest clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.
   * @return clientReference
  **/
  @ApiModelProperty(example = "4VWPZ8676N7MUAO", required = true, value = "A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public OpenpayCompletionsRequest orderNumber(String orderNumber) {
    
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


  public OpenpayCompletionsRequest merchantTransactedAt(String merchantTransactedAt) {
    
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


  public OpenpayCompletionsRequest completions(List<OpenpayCompletionsRequestCompletions> completions) {
    
    this.completions = completions;
    return this;
  }

  public OpenpayCompletionsRequest addCompletionsItem(OpenpayCompletionsRequestCompletions completionsItem) {
    this.completions.add(completionsItem);
    return this;
  }

   /**
   * Get completions
   * @return completions
  **/
  @ApiModelProperty(required = true, value = "")

  public List<OpenpayCompletionsRequestCompletions> getCompletions() {
    return completions;
  }


  public void setCompletions(List<OpenpayCompletionsRequestCompletions> completions) {
    this.completions = completions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenpayCompletionsRequest openpayCompletionsRequest = (OpenpayCompletionsRequest) o;
    return Objects.equals(this.clientReference, openpayCompletionsRequest.clientReference) &&
        Objects.equals(this.orderNumber, openpayCompletionsRequest.orderNumber) &&
        Objects.equals(this.merchantTransactedAt, openpayCompletionsRequest.merchantTransactedAt) &&
        Objects.equals(this.completions, openpayCompletionsRequest.completions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReference, orderNumber, merchantTransactedAt, completions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayCompletionsRequest {\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    merchantTransactedAt: ").append(toIndentedString(merchantTransactedAt)).append("\n");
    sb.append("    completions: ").append(toIndentedString(completions)).append("\n");
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

