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
import au.com.woolworths.village.sdk.openapi.dto.OpenpayVoidsSuccessResponseVoidResponses;
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
 * The JSON success response structure of the Voids endpoint.
 */
@ApiModel(description = "The JSON success response structure of the Voids endpoint.")

public class OpenpayVoidsSuccessResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_RECEIPT = "transactionReceipt";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECEIPT)
  private String transactionReceipt;

  public static final String SERIALIZED_NAME_VOID_RESPONSES = "voidResponses";
  @SerializedName(SERIALIZED_NAME_VOID_RESPONSES)
  private List<OpenpayVoidsSuccessResponseVoidResponses> voidResponses = new ArrayList<OpenpayVoidsSuccessResponseVoidResponses>();


  public OpenpayVoidsSuccessResponse transactionReceipt(String transactionReceipt) {
    
    this.transactionReceipt = transactionReceipt;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.
   * @return transactionReceipt
  **/
  @ApiModelProperty(example = "1000000000670747", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.")

  public String getTransactionReceipt() {
    return transactionReceipt;
  }


  public void setTransactionReceipt(String transactionReceipt) {
    this.transactionReceipt = transactionReceipt;
  }


  public OpenpayVoidsSuccessResponse voidResponses(List<OpenpayVoidsSuccessResponseVoidResponses> voidResponses) {
    
    this.voidResponses = voidResponses;
    return this;
  }

  public OpenpayVoidsSuccessResponse addVoidResponsesItem(OpenpayVoidsSuccessResponseVoidResponses voidResponsesItem) {
    this.voidResponses.add(voidResponsesItem);
    return this;
  }

   /**
   * Get voidResponses
   * @return voidResponses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<OpenpayVoidsSuccessResponseVoidResponses> getVoidResponses() {
    return voidResponses;
  }


  public void setVoidResponses(List<OpenpayVoidsSuccessResponseVoidResponses> voidResponses) {
    this.voidResponses = voidResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenpayVoidsSuccessResponse openpayVoidsSuccessResponse = (OpenpayVoidsSuccessResponse) o;
    return Objects.equals(this.transactionReceipt, openpayVoidsSuccessResponse.transactionReceipt) &&
        Objects.equals(this.voidResponses, openpayVoidsSuccessResponse.voidResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionReceipt, voidResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayVoidsSuccessResponse {\n");
    sb.append("    transactionReceipt: ").append(toIndentedString(transactionReceipt)).append("\n");
    sb.append("    voidResponses: ").append(toIndentedString(voidResponses)).append("\n");
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

