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
 * This object is only required if the refunds request is for an in-store refund transaction.
 */
@ApiModel(description = "This object is only required if the refunds request is for an in-store refund transaction.")

public class RefundsRequestStoreData implements Serializable {
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


  public RefundsRequestStoreData groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * The refund transaction merchant group id. The group id is defined as a logical grouping of merchants or stores. A default configured group id is set in Apigee if absent in the payload.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7915d9d7-368e-4af9-a3d4-d09927b8603a", value = "The refund transaction merchant group id. The group id is defined as a logical grouping of merchants or stores. A default configured group id is set in Apigee if absent in the payload.")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public RefundsRequestStoreData terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The in-store refund transaction terminal id. This is a 8 character alphanumeric string. If present in the payload the &#39;storeId&#39; has to be omitted.
   * @return terminalId
  **/
  @ApiModelProperty(example = "W4952110", required = true, value = "The in-store refund transaction terminal id. This is a 8 character alphanumeric string. If present in the payload the 'storeId' has to be omitted.")

  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public RefundsRequestStoreData storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The in-store refund transaction store id. If present in the payload the &#39;terminalId&#39; and &#39;stan&#39; can be omitted.
   * @return storeId
  **/
  @ApiModelProperty(example = "4952110", required = true, value = "The in-store refund transaction store id. If present in the payload the 'terminalId' and 'stan' can be omitted.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public RefundsRequestStoreData laneId(String laneId) {
    
    this.laneId = laneId;
    return this;
  }

   /**
   * The in-store refund transaction lane id.
   * @return laneId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110", value = "The in-store refund transaction lane id.")

  public String getLaneId() {
    return laneId;
  }


  public void setLaneId(String laneId) {
    this.laneId = laneId;
  }


  public RefundsRequestStoreData stan(String stan) {
    
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


  public RefundsRequestStoreData rrn(String rrn) {
    
    this.rrn = rrn;
    return this;
  }

   /**
   * The in-store refund transaction store id. This is a 12 digit \&quot;0\&quot; [zero] padded numeric string.
   * @return rrn
  **/
  @ApiModelProperty(example = "000000006564", required = true, value = "The in-store refund transaction store id. This is a 12 digit \"0\" [zero] padded numeric string.")

  public String getRrn() {
    return rrn;
  }


  public void setRrn(String rrn) {
    this.rrn = rrn;
  }


  public RefundsRequestStoreData transactionTimestamp(BigDecimal transactionTimestamp) {
    
    this.transactionTimestamp = transactionTimestamp;
    return this;
  }

   /**
   * The in-store refund transaction timestamp. The timestamp format is milliseconds since epoch.
   * @return transactionTimestamp
  **/
  @ApiModelProperty(example = "1607915015449", required = true, value = "The in-store refund transaction timestamp. The timestamp format is milliseconds since epoch.")

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
    RefundsRequestStoreData refundsRequestStoreData = (RefundsRequestStoreData) o;
    return Objects.equals(this.groupId, refundsRequestStoreData.groupId) &&
        Objects.equals(this.terminalId, refundsRequestStoreData.terminalId) &&
        Objects.equals(this.storeId, refundsRequestStoreData.storeId) &&
        Objects.equals(this.laneId, refundsRequestStoreData.laneId) &&
        Objects.equals(this.stan, refundsRequestStoreData.stan) &&
        Objects.equals(this.rrn, refundsRequestStoreData.rrn) &&
        Objects.equals(this.transactionTimestamp, refundsRequestStoreData.transactionTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, terminalId, storeId, laneId, stan, rrn, transactionTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundsRequestStoreData {\n");
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

