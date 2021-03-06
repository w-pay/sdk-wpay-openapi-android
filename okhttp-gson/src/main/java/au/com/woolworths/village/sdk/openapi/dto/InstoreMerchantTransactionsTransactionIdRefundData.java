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
import au.com.woolworths.village.sdk.openapi.dto.InstoreMerchantTransactionsTransactionIdRefundDataSubTransactions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Mandatory data object containing response
 */
@ApiModel(description = "Mandatory data object containing response")

public class InstoreMerchantTransactionsTransactionIdRefundData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_SUB_TRANSACTIONS = "subTransactions";
  @SerializedName(SERIALIZED_NAME_SUB_TRANSACTIONS)
  private List<InstoreMerchantTransactionsTransactionIdRefundDataSubTransactions> subTransactions = null;


  public InstoreMerchantTransactionsTransactionIdRefundData reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the refund, or other message logged with the transaction
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "The reason for the refund, or other message logged with the transaction")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public InstoreMerchantTransactionsTransactionIdRefundData clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * An optional client reference to be associated with the transaction.  If not suplied the transactionId will be used.
   * @return clientReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional client reference to be associated with the transaction.  If not suplied the transactionId will be used.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public InstoreMerchantTransactionsTransactionIdRefundData subTransactions(List<InstoreMerchantTransactionsTransactionIdRefundDataSubTransactions> subTransactions) {
    
    this.subTransactions = subTransactions;
    return this;
  }

  public InstoreMerchantTransactionsTransactionIdRefundData addSubTransactionsItem(InstoreMerchantTransactionsTransactionIdRefundDataSubTransactions subTransactionsItem) {
    if (this.subTransactions == null) {
      this.subTransactions = new ArrayList<InstoreMerchantTransactionsTransactionIdRefundDataSubTransactions>();
    }
    this.subTransactions.add(subTransactionsItem);
    return this;
  }

   /**
   * List of payments and amounts to refund. Can be used to refund to multiple payment instruments or to issue partial refunds. If subTransactions is not supplied the entire transaction will be refunded.
   * @return subTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of payments and amounts to refund. Can be used to refund to multiple payment instruments or to issue partial refunds. If subTransactions is not supplied the entire transaction will be refunded.")

  public List<InstoreMerchantTransactionsTransactionIdRefundDataSubTransactions> getSubTransactions() {
    return subTransactions;
  }


  public void setSubTransactions(List<InstoreMerchantTransactionsTransactionIdRefundDataSubTransactions> subTransactions) {
    this.subTransactions = subTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstoreMerchantTransactionsTransactionIdRefundData instoreMerchantTransactionsTransactionIdRefundData = (InstoreMerchantTransactionsTransactionIdRefundData) o;
    return Objects.equals(this.reason, instoreMerchantTransactionsTransactionIdRefundData.reason) &&
        Objects.equals(this.clientReference, instoreMerchantTransactionsTransactionIdRefundData.clientReference) &&
        Objects.equals(this.subTransactions, instoreMerchantTransactionsTransactionIdRefundData.subTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, clientReference, subTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstoreMerchantTransactionsTransactionIdRefundData {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    subTransactions: ").append(toIndentedString(subTransactions)).append("\n");
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

