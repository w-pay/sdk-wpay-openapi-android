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
import au.com.woolworths.village.sdk.openapi.dto.CompletionsSuccessResponseCompletionResponses;
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
 * The JSON response structure of the Completions endpoint.
 */
@ApiModel(description = "The JSON response structure of the Completions endpoint.")

public class CompletionsSuccessResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_RECEIPT = "transactionReceipt";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECEIPT)
  private String transactionReceipt;

  public static final String SERIALIZED_NAME_PARTIAL_SUCCESS = "partialSuccess";
  @SerializedName(SERIALIZED_NAME_PARTIAL_SUCCESS)
  private Boolean partialSuccess;

  public static final String SERIALIZED_NAME_COMPLETION_RESPONSES = "completionResponses";
  @SerializedName(SERIALIZED_NAME_COMPLETION_RESPONSES)
  private List<CompletionsSuccessResponseCompletionResponses> completionResponses = new ArrayList<CompletionsSuccessResponseCompletionResponses>();


  public CompletionsSuccessResponse transactionReceipt(String transactionReceipt) {
    
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


  public CompletionsSuccessResponse partialSuccess(Boolean partialSuccess) {
    
    this.partialSuccess = partialSuccess;
    return this;
  }

   /**
   * A flag to indicate if a split completion was only partially successful, ie. at least 1 of the completions had a successful result.
   * @return partialSuccess
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if a split completion was only partially successful, ie. at least 1 of the completions had a successful result.")

  public Boolean getPartialSuccess() {
    return partialSuccess;
  }


  public void setPartialSuccess(Boolean partialSuccess) {
    this.partialSuccess = partialSuccess;
  }


  public CompletionsSuccessResponse completionResponses(List<CompletionsSuccessResponseCompletionResponses> completionResponses) {
    
    this.completionResponses = completionResponses;
    return this;
  }

  public CompletionsSuccessResponse addCompletionResponsesItem(CompletionsSuccessResponseCompletionResponses completionResponsesItem) {
    this.completionResponses.add(completionResponsesItem);
    return this;
  }

   /**
   * Get completionResponses
   * @return completionResponses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CompletionsSuccessResponseCompletionResponses> getCompletionResponses() {
    return completionResponses;
  }


  public void setCompletionResponses(List<CompletionsSuccessResponseCompletionResponses> completionResponses) {
    this.completionResponses = completionResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionsSuccessResponse completionsSuccessResponse = (CompletionsSuccessResponse) o;
    return Objects.equals(this.transactionReceipt, completionsSuccessResponse.transactionReceipt) &&
        Objects.equals(this.partialSuccess, completionsSuccessResponse.partialSuccess) &&
        Objects.equals(this.completionResponses, completionsSuccessResponse.completionResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionReceipt, partialSuccess, completionResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionsSuccessResponse {\n");
    sb.append("    transactionReceipt: ").append(toIndentedString(transactionReceipt)).append("\n");
    sb.append("    partialSuccess: ").append(toIndentedString(partialSuccess)).append("\n");
    sb.append("    completionResponses: ").append(toIndentedString(completionResponses)).append("\n");
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

