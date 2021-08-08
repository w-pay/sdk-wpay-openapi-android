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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * The JSON response structure of the Tokenize Apple Pay endpoint.
 */
@ApiModel(description = "The JSON response structure of the Tokenize Apple Pay endpoint.")

public class TokenizeApplePayResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_STEP_UP_TOKEN = "stepUpToken";
  @SerializedName(SERIALIZED_NAME_STEP_UP_TOKEN)
  private String stepUpToken;


  public TokenizeApplePayResponse paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The new payment instrument id to be used for payments.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "20192", required = true, value = "The new payment instrument id to be used for payments.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public TokenizeApplePayResponse stepUpToken(String stepUpToken) {
    
    this.stepUpToken = stepUpToken;
    return this;
  }

   /**
   * The step-up token to be used for payments.
   * @return stepUpToken
  **/
  @ApiModelProperty(example = "2d053b14-7c7a-447f-99b7-7618d6182f34", required = true, value = "The step-up token to be used for payments.")

  public String getStepUpToken() {
    return stepUpToken;
  }


  public void setStepUpToken(String stepUpToken) {
    this.stepUpToken = stepUpToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeApplePayResponse tokenizeApplePayResponse = (TokenizeApplePayResponse) o;
    return Objects.equals(this.paymentInstrumentId, tokenizeApplePayResponse.paymentInstrumentId) &&
        Objects.equals(this.stepUpToken, tokenizeApplePayResponse.stepUpToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, stepUpToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeApplePayResponse {\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    stepUpToken: ").append(toIndentedString(stepUpToken)).append("\n");
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

