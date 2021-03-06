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
import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This object is only required if the payments request is for an in-store payment transaction.
 */
@ApiModel(description = "This object is only required if the payments request is for an in-store payment transaction.")

public class PaymentsRequestStoreData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminalId";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_LANE_ID = "laneId";
  @SerializedName(SERIALIZED_NAME_LANE_ID)
  private String laneId;

  public static final String SERIALIZED_NAME_STAN = "stan";
  @SerializedName(SERIALIZED_NAME_STAN)
  private String stan;

  public static final String SERIALIZED_NAME_RRN = "rrn";
  @SerializedName(SERIALIZED_NAME_RRN)
  private String rrn;

  public static final String SERIALIZED_NAME_TRANSACTION_TIMESTAMP = "transactionTimestamp";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TIMESTAMP)
  private BigDecimal transactionTimestamp;


  public PaymentsRequestStoreData groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * The payment transaction merchant group id. The group id is defined as a logical grouping of merchants or stores. A default configured group id is set in Apigee if absent in the payload.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7915d9d7-368e-4af9-a3d4-d09927b8603a", value = "The payment transaction merchant group id. The group id is defined as a logical grouping of merchants or stores. A default configured group id is set in Apigee if absent in the payload.")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public PaymentsRequestStoreData terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The in-store payment transaction terminal id. This is a 8 character alphanumeric string. If present in the payload the &#39;storeId&#39; has to be omitted.
   * @return terminalId
  **/
  @ApiModelProperty(example = "W4952110", required = true, value = "The in-store payment transaction terminal id. This is a 8 character alphanumeric string. If present in the payload the 'storeId' has to be omitted.")

  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public PaymentsRequestStoreData storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The in-store payment transaction store id. If present in the payload the &#39;terminalId&#39; and &#39;stan&#39; can be omitted.
   * @return storeId
  **/
  @ApiModelProperty(example = "4952110", required = true, value = "The in-store payment transaction store id. If present in the payload the 'terminalId' and 'stan' can be omitted.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public PaymentsRequestStoreData laneId(String laneId) {
    
    this.laneId = laneId;
    return this;
  }

   /**
   * The in-store payment transaction lane id.
   * @return laneId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110", value = "The in-store payment transaction lane id.")

  public String getLaneId() {
    return laneId;
  }


  public void setLaneId(String laneId) {
    this.laneId = laneId;
  }


  public PaymentsRequestStoreData stan(String stan) {
    
    this.stan = stan;
    return this;
  }

   /**
   * The System Trace Audit Number (STAN) used to identify the transaction. This is a 6 digit numeric string.
   * @return stan
  **/
  @ApiModelProperty(example = "555001", required = true, value = "The System Trace Audit Number (STAN) used to identify the transaction. This is a 6 digit numeric string.")

  public String getStan() {
    return stan;
  }


  public void setStan(String stan) {
    this.stan = stan;
  }


  public PaymentsRequestStoreData rrn(String rrn) {
    
    this.rrn = rrn;
    return this;
  }

   /**
   * The in-store payment transaction store id. This is a 12 digit \&quot;0\&quot; [zero] padded numeric string.
   * @return rrn
  **/
  @ApiModelProperty(example = "000000006564", required = true, value = "The in-store payment transaction store id. This is a 12 digit \"0\" [zero] padded numeric string.")

  public String getRrn() {
    return rrn;
  }


  public void setRrn(String rrn) {
    this.rrn = rrn;
  }


  public PaymentsRequestStoreData transactionTimestamp(BigDecimal transactionTimestamp) {
    
    this.transactionTimestamp = transactionTimestamp;
    return this;
  }

   /**
   * The in-store payment transaction timestamp. The timestamp format is milliseconds since epoch.
   * @return transactionTimestamp
  **/
  @ApiModelProperty(example = "1607915015449", required = true, value = "The in-store payment transaction timestamp. The timestamp format is milliseconds since epoch.")

  public BigDecimal getTransactionTimestamp() {
    return transactionTimestamp;
  }


  public void setTransactionTimestamp(BigDecimal transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsRequestStoreData paymentsRequestStoreData = (PaymentsRequestStoreData) o;
    return Objects.equals(this.groupId, paymentsRequestStoreData.groupId) &&
        Objects.equals(this.terminalId, paymentsRequestStoreData.terminalId) &&
        Objects.equals(this.storeId, paymentsRequestStoreData.storeId) &&
        Objects.equals(this.laneId, paymentsRequestStoreData.laneId) &&
        Objects.equals(this.stan, paymentsRequestStoreData.stan) &&
        Objects.equals(this.rrn, paymentsRequestStoreData.rrn) &&
        Objects.equals(this.transactionTimestamp, paymentsRequestStoreData.transactionTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, terminalId, storeId, laneId, stan, rrn, transactionTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRequestStoreData {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    laneId: ").append(toIndentedString(laneId)).append("\n");
    sb.append("    stan: ").append(toIndentedString(stan)).append("\n");
    sb.append("    rrn: ").append(toIndentedString(rrn)).append("\n");
    sb.append("    transactionTimestamp: ").append(toIndentedString(transactionTimestamp)).append("\n");
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

