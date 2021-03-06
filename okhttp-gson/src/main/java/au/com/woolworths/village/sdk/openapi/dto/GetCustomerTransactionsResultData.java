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
import au.com.woolworths.village.sdk.openapi.dto.CustomerTransactionSummary;
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

public class GetCustomerTransactionsResultData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<CustomerTransactionSummary> transactions = new ArrayList<CustomerTransactionSummary>();


  public GetCustomerTransactionsResultData transactions(List<CustomerTransactionSummary> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public GetCustomerTransactionsResultData addTransactionsItem(CustomerTransactionSummary transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * The resulting list of transactions.  If no results match the request then an empty array will be returned
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "The resulting list of transactions.  If no results match the request then an empty array will be returned")

  public List<CustomerTransactionSummary> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<CustomerTransactionSummary> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerTransactionsResultData getCustomerTransactionsResultData = (GetCustomerTransactionsResultData) o;
    return Objects.equals(this.transactions, getCustomerTransactionsResultData.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerTransactionsResultData {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

