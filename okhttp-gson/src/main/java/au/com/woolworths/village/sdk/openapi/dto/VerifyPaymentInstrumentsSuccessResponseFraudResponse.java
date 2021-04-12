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
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * VerifyPaymentInstrumentsSuccessResponseFraudResponse
 */

public class VerifyPaymentInstrumentsSuccessResponseFraudResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private String decision;


  public VerifyPaymentInstrumentsSuccessResponseFraudResponse clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The fraud check client id. Will be null if the fraud check was skipped.
   * @return clientId
  **/
  @ApiModelProperty(example = "5615334856056397603065", required = true, value = "The fraud check client id. Will be null if the fraud check was skipped.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public VerifyPaymentInstrumentsSuccessResponseFraudResponse reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * The fraud check reason code. Will be null if the fraud check was skipped.
   * @return reasonCode
  **/
  @ApiModelProperty(example = "100", required = true, value = "The fraud check reason code. Will be null if the fraud check was skipped.")

  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public VerifyPaymentInstrumentsSuccessResponseFraudResponse decision(String decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * The fraud check decision. Will be null if the fraud check was skipped.
   * @return decision
  **/
  @ApiModelProperty(example = "ACCEPT", required = true, value = "The fraud check decision. Will be null if the fraud check was skipped.")

  public String getDecision() {
    return decision;
  }


  public void setDecision(String decision) {
    this.decision = decision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyPaymentInstrumentsSuccessResponseFraudResponse verifyPaymentInstrumentsSuccessResponseFraudResponse = (VerifyPaymentInstrumentsSuccessResponseFraudResponse) o;
    return Objects.equals(this.clientId, verifyPaymentInstrumentsSuccessResponseFraudResponse.clientId) &&
        Objects.equals(this.reasonCode, verifyPaymentInstrumentsSuccessResponseFraudResponse.reasonCode) &&
        Objects.equals(this.decision, verifyPaymentInstrumentsSuccessResponseFraudResponse.decision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, reasonCode, decision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPaymentInstrumentsSuccessResponseFraudResponse {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
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
