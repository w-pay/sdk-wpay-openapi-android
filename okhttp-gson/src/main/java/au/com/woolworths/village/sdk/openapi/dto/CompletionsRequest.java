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
 * The JSON request structure of the Completions endpoint.
 */
@ApiModel(description = "The JSON request structure of the Completions endpoint.")

public class CompletionsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_COMPLETIONS = "completions";
  @SerializedName(SERIALIZED_NAME_COMPLETIONS)
  private List<CompletionsRequestCompletions> completions = new ArrayList<CompletionsRequestCompletions>();


  public CompletionsRequest clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.
   * @return clientReference
  **/
  @ApiModelProperty(example = "Z3XFS8507RDC71T", required = true, value = "A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public CompletionsRequest orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * The merchant order number of the transaction.
   * @return orderNumber
  **/
  @ApiModelProperty(example = "20170505090", required = true, value = "The merchant order number of the transaction.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public CompletionsRequest completions(List<CompletionsRequestCompletions> completions) {
    
    this.completions = completions;
    return this;
  }

  public CompletionsRequest addCompletionsItem(CompletionsRequestCompletions completionsItem) {
    this.completions.add(completionsItem);
    return this;
  }

   /**
   * Get completions
   * @return completions
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CompletionsRequestCompletions> getCompletions() {
    return completions;
  }


  public void setCompletions(List<CompletionsRequestCompletions> completions) {
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
    CompletionsRequest completionsRequest = (CompletionsRequest) o;
    return Objects.equals(this.clientReference, completionsRequest.clientReference) &&
        Objects.equals(this.orderNumber, completionsRequest.orderNumber) &&
        Objects.equals(this.completions, completionsRequest.completions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReference, orderNumber, completions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionsRequest {\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
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

