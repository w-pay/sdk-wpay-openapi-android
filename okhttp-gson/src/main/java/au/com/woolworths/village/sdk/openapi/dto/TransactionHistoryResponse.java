/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.2
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON response structure of the Transaction History endpoint.
 */
@ApiModel(description = "The JSON response structure of the Transaction History endpoint.")

public class TransactionHistoryResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RETURNED = "returned";
  @SerializedName(SERIALIZED_NAME_RETURNED)
  private BigDecimal returned;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<TransactionHistoryResponseTransactions> transactions = new ArrayList<TransactionHistoryResponseTransactions>();


  public TransactionHistoryResponse returned(BigDecimal returned) {
    
    this.returned = returned;
    return this;
  }

   /**
   * The number of transactions returned in the results.
   * @return returned
  **/
  @ApiModelProperty(example = "2", required = true, value = "The number of transactions returned in the results.")

  public BigDecimal getReturned() {
    return returned;
  }


  public void setReturned(BigDecimal returned) {
    this.returned = returned;
  }


  public TransactionHistoryResponse total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of transactions available in the container.
   * @return total
  **/
  @ApiModelProperty(example = "6", required = true, value = "The total number of transactions available in the container.")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public TransactionHistoryResponse transactions(List<TransactionHistoryResponseTransactions> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public TransactionHistoryResponse addTransactionsItem(TransactionHistoryResponseTransactions transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "")

  public List<TransactionHistoryResponseTransactions> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<TransactionHistoryResponseTransactions> transactions) {
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
    TransactionHistoryResponse transactionHistoryResponse = (TransactionHistoryResponse) o;
    return Objects.equals(this.returned, transactionHistoryResponse.returned) &&
        Objects.equals(this.total, transactionHistoryResponse.total) &&
        Objects.equals(this.transactions, transactionHistoryResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returned, total, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionHistoryResponse {\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

