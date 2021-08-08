/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsSuccessResponseFraudResponse;
import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsSuccessResponseVerifyResponses;
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
 * The JSON success response structure of the Verify Payment Instruments endpoint.
 */
@ApiModel(description = "The JSON success response structure of the Verify Payment Instruments endpoint.")

public class VerifyPaymentInstrumentsSuccessResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_RECEIPT = "transactionReceipt";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RECEIPT)
  private String transactionReceipt;

  public static final String SERIALIZED_NAME_PARTIAL_SUCCESS = "partialSuccess";
  @SerializedName(SERIALIZED_NAME_PARTIAL_SUCCESS)
  private Boolean partialSuccess;

  public static final String SERIALIZED_NAME_FRAUD_RESPONSE = "fraudResponse";
  @SerializedName(SERIALIZED_NAME_FRAUD_RESPONSE)
  private VerifyPaymentInstrumentsSuccessResponseFraudResponse fraudResponse;

  public static final String SERIALIZED_NAME_VERIFY_RESPONSES = "verifyResponses";
  @SerializedName(SERIALIZED_NAME_VERIFY_RESPONSES)
  private List<VerifyPaymentInstrumentsSuccessResponseVerifyResponses> verifyResponses = new ArrayList<VerifyPaymentInstrumentsSuccessResponseVerifyResponses>();


  public VerifyPaymentInstrumentsSuccessResponse transactionReceipt(String transactionReceipt) {
    
    this.transactionReceipt = transactionReceipt;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.
   * @return transactionReceipt
  **/
  @ApiModelProperty(example = "1000000009303280", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the whole/grouped transaction in the container.")

  public String getTransactionReceipt() {
    return transactionReceipt;
  }


  public void setTransactionReceipt(String transactionReceipt) {
    this.transactionReceipt = transactionReceipt;
  }


  public VerifyPaymentInstrumentsSuccessResponse partialSuccess(Boolean partialSuccess) {
    
    this.partialSuccess = partialSuccess;
    return this;
  }

   /**
   * Not in use. A property that will be used in future for multi-instrument verification.
   * @return partialSuccess
  **/
  @ApiModelProperty(example = "false", required = true, value = "Not in use. A property that will be used in future for multi-instrument verification.")

  public Boolean getPartialSuccess() {
    return partialSuccess;
  }


  public void setPartialSuccess(Boolean partialSuccess) {
    this.partialSuccess = partialSuccess;
  }


  public VerifyPaymentInstrumentsSuccessResponse fraudResponse(VerifyPaymentInstrumentsSuccessResponseFraudResponse fraudResponse) {
    
    this.fraudResponse = fraudResponse;
    return this;
  }

   /**
   * Get fraudResponse
   * @return fraudResponse
  **/
  @ApiModelProperty(required = true, value = "")

  public VerifyPaymentInstrumentsSuccessResponseFraudResponse getFraudResponse() {
    return fraudResponse;
  }


  public void setFraudResponse(VerifyPaymentInstrumentsSuccessResponseFraudResponse fraudResponse) {
    this.fraudResponse = fraudResponse;
  }


  public VerifyPaymentInstrumentsSuccessResponse verifyResponses(List<VerifyPaymentInstrumentsSuccessResponseVerifyResponses> verifyResponses) {
    
    this.verifyResponses = verifyResponses;
    return this;
  }

  public VerifyPaymentInstrumentsSuccessResponse addVerifyResponsesItem(VerifyPaymentInstrumentsSuccessResponseVerifyResponses verifyResponsesItem) {
    this.verifyResponses.add(verifyResponsesItem);
    return this;
  }

   /**
   * Get verifyResponses
   * @return verifyResponses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<VerifyPaymentInstrumentsSuccessResponseVerifyResponses> getVerifyResponses() {
    return verifyResponses;
  }


  public void setVerifyResponses(List<VerifyPaymentInstrumentsSuccessResponseVerifyResponses> verifyResponses) {
    this.verifyResponses = verifyResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyPaymentInstrumentsSuccessResponse verifyPaymentInstrumentsSuccessResponse = (VerifyPaymentInstrumentsSuccessResponse) o;
    return Objects.equals(this.transactionReceipt, verifyPaymentInstrumentsSuccessResponse.transactionReceipt) &&
        Objects.equals(this.partialSuccess, verifyPaymentInstrumentsSuccessResponse.partialSuccess) &&
        Objects.equals(this.fraudResponse, verifyPaymentInstrumentsSuccessResponse.fraudResponse) &&
        Objects.equals(this.verifyResponses, verifyPaymentInstrumentsSuccessResponse.verifyResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionReceipt, partialSuccess, fraudResponse, verifyResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPaymentInstrumentsSuccessResponse {\n");
    sb.append("    transactionReceipt: ").append(toIndentedString(transactionReceipt)).append("\n");
    sb.append("    partialSuccess: ").append(toIndentedString(partialSuccess)).append("\n");
    sb.append("    fraudResponse: ").append(toIndentedString(fraudResponse)).append("\n");
    sb.append("    verifyResponses: ").append(toIndentedString(verifyResponses)).append("\n");
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

