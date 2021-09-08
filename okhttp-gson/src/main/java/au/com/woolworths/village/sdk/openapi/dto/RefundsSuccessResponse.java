/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.6
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
 * The JSON response structure of the Refunds endpoint.
 */
@ApiModel(description = "The JSON response structure of the Refunds endpoint.")

public class RefundsSuccessResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_RECEIPT = "transactionReceipt";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECEIPT)
  private String transactionReceipt;

  public static final String SERIALIZED_NAME_PARTIAL_SUCCESS = "partialSuccess";
  @SerializedName(SERIALIZED_NAME_PARTIAL_SUCCESS)
  private Boolean partialSuccess;

  public static final String SERIALIZED_NAME_REFUND_RESPONSES = "refundResponses";
  @SerializedName(SERIALIZED_NAME_REFUND_RESPONSES)
  private List<RefundsSuccessResponseRefundResponses> refundResponses = new ArrayList<RefundsSuccessResponseRefundResponses>();


  public RefundsSuccessResponse transactionReceipt(String transactionReceipt) {
    
    this.transactionReceipt = transactionReceipt;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.
   * @return transactionReceipt
  **/
  @ApiModelProperty(example = "1000000000670875", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.")

  public String getTransactionReceipt() {
    return transactionReceipt;
  }


  public void setTransactionReceipt(String transactionReceipt) {
    this.transactionReceipt = transactionReceipt;
  }


  public RefundsSuccessResponse partialSuccess(Boolean partialSuccess) {
    
    this.partialSuccess = partialSuccess;
    return this;
  }

   /**
   * A flag to indicate if a split refund was only partially successful, ie. at least 1 of the refunds had a successful result.
   * @return partialSuccess
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if a split refund was only partially successful, ie. at least 1 of the refunds had a successful result.")

  public Boolean getPartialSuccess() {
    return partialSuccess;
  }


  public void setPartialSuccess(Boolean partialSuccess) {
    this.partialSuccess = partialSuccess;
  }


  public RefundsSuccessResponse refundResponses(List<RefundsSuccessResponseRefundResponses> refundResponses) {
    
    this.refundResponses = refundResponses;
    return this;
  }

  public RefundsSuccessResponse addRefundResponsesItem(RefundsSuccessResponseRefundResponses refundResponsesItem) {
    this.refundResponses.add(refundResponsesItem);
    return this;
  }

   /**
   * Get refundResponses
   * @return refundResponses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<RefundsSuccessResponseRefundResponses> getRefundResponses() {
    return refundResponses;
  }


  public void setRefundResponses(List<RefundsSuccessResponseRefundResponses> refundResponses) {
    this.refundResponses = refundResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundsSuccessResponse refundsSuccessResponse = (RefundsSuccessResponse) o;
    return Objects.equals(this.transactionReceipt, refundsSuccessResponse.transactionReceipt) &&
        Objects.equals(this.partialSuccess, refundsSuccessResponse.partialSuccess) &&
        Objects.equals(this.refundResponses, refundsSuccessResponse.refundResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionReceipt, partialSuccess, refundResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundsSuccessResponse {\n");
    sb.append("    transactionReceipt: ").append(toIndentedString(transactionReceipt)).append("\n");
    sb.append("    partialSuccess: ").append(toIndentedString(partialSuccess)).append("\n");
    sb.append("    refundResponses: ").append(toIndentedString(refundResponses)).append("\n");
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

