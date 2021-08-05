/*
 * Village Wallet
 * APIs for Village Wallet
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Mandatory data object containing response
 */
@ApiModel(description = "Mandatory data object containing response")

public class MerchantTransactionsTransactionIdRefundData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;


  public MerchantTransactionsTransactionIdRefundData reason(String reason) {
    
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


  public MerchantTransactionsTransactionIdRefundData clientReference(String clientReference) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantTransactionsTransactionIdRefundData merchantTransactionsTransactionIdRefundData = (MerchantTransactionsTransactionIdRefundData) o;
    return Objects.equals(this.reason, merchantTransactionsTransactionIdRefundData.reason) &&
        Objects.equals(this.clientReference, merchantTransactionsTransactionIdRefundData.clientReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, clientReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantTransactionsTransactionIdRefundData {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
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
