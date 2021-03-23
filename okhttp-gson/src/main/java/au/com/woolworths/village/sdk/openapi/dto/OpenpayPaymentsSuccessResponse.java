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

import java.util.Objects;
import java.util.Arrays;
import au.com.woolworths.village.sdk.openapi.dto.OpenpayPaymentsSuccessResponsePaymentResponses;
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
 * The JSON success response structure of the Payments endpoint.
 */
@ApiModel(description = "The JSON success response structure of the Payments endpoint.")

public class OpenpayPaymentsSuccessResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_RECEIPT = "transactionReceipt";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECEIPT)
  private String transactionReceipt;

  public static final String SERIALIZED_NAME_PAYMENT_RESPONSES = "paymentResponses";
  @SerializedName(SERIALIZED_NAME_PAYMENT_RESPONSES)
  private List<OpenpayPaymentsSuccessResponsePaymentResponses> paymentResponses = new ArrayList<OpenpayPaymentsSuccessResponsePaymentResponses>();


  public OpenpayPaymentsSuccessResponse transactionReceipt(String transactionReceipt) {
    
    this.transactionReceipt = transactionReceipt;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.
   * @return transactionReceipt
  **/
  @ApiModelProperty(example = "1000000000670622", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.")

  public String getTransactionReceipt() {
    return transactionReceipt;
  }


  public void setTransactionReceipt(String transactionReceipt) {
    this.transactionReceipt = transactionReceipt;
  }


  public OpenpayPaymentsSuccessResponse paymentResponses(List<OpenpayPaymentsSuccessResponsePaymentResponses> paymentResponses) {
    
    this.paymentResponses = paymentResponses;
    return this;
  }

  public OpenpayPaymentsSuccessResponse addPaymentResponsesItem(OpenpayPaymentsSuccessResponsePaymentResponses paymentResponsesItem) {
    this.paymentResponses.add(paymentResponsesItem);
    return this;
  }

   /**
   * Get paymentResponses
   * @return paymentResponses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<OpenpayPaymentsSuccessResponsePaymentResponses> getPaymentResponses() {
    return paymentResponses;
  }


  public void setPaymentResponses(List<OpenpayPaymentsSuccessResponsePaymentResponses> paymentResponses) {
    this.paymentResponses = paymentResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenpayPaymentsSuccessResponse openpayPaymentsSuccessResponse = (OpenpayPaymentsSuccessResponse) o;
    return Objects.equals(this.transactionReceipt, openpayPaymentsSuccessResponse.transactionReceipt) &&
        Objects.equals(this.paymentResponses, openpayPaymentsSuccessResponse.paymentResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionReceipt, paymentResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayPaymentsSuccessResponse {\n");
    sb.append("    transactionReceipt: ").append(toIndentedString(transactionReceipt)).append("\n");
    sb.append("    paymentResponses: ").append(toIndentedString(paymentResponses)).append("\n");
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

