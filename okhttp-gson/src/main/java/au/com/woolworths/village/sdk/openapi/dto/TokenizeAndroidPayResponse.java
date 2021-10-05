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
 * The JSON response structure of the Tokenize Android Pay endpoint.
 */
@ApiModel(description = "The JSON response structure of the Tokenize Android Pay endpoint.")

public class TokenizeAndroidPayResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_STEP_UP_TOKEN = "stepUpToken";
  @SerializedName(SERIALIZED_NAME_STEP_UP_TOKEN)
  private String stepUpToken;


  public TokenizeAndroidPayResponse paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The new payment instrument id to be used for payments.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(example = "20191", required = true, value = "The new payment instrument id to be used for payments.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public TokenizeAndroidPayResponse stepUpToken(String stepUpToken) {
    
    this.stepUpToken = stepUpToken;
    return this;
  }

   /**
   * The step-up token to be used for payments.
   * @return stepUpToken
  **/
  @ApiModelProperty(example = "6bf0a37c-0a5d-4619-8182-4c331358d021", required = true, value = "The step-up token to be used for payments.")

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
    TokenizeAndroidPayResponse tokenizeAndroidPayResponse = (TokenizeAndroidPayResponse) o;
    return Objects.equals(this.paymentInstrumentId, tokenizeAndroidPayResponse.paymentInstrumentId) &&
        Objects.equals(this.stepUpToken, tokenizeAndroidPayResponse.stepUpToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentId, stepUpToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeAndroidPayResponse {\n");
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

