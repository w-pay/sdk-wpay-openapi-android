/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsErrorResponseVerifyResponses;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * The JSON error response structure of the Verify Payment Instruments endpoint.
 */
@ApiModel(description = "The JSON error response structure of the Verify Payment Instruments endpoint.")

public class VerifyPaymentInstrumentsErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HTTP_STATUS_CODE = "httpStatusCode";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS_CODE)
  private BigDecimal httpStatusCode;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ERROR_DETAIL = "errorDetail";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAIL)
  private String errorDetail;

  public static final String SERIALIZED_NAME_VERIFY_RESPONSES = "verifyResponses";
  @SerializedName(SERIALIZED_NAME_VERIFY_RESPONSES)
  private List<VerifyPaymentInstrumentsErrorResponseVerifyResponses> verifyResponses = null;


  public VerifyPaymentInstrumentsErrorResponse httpStatusCode(BigDecimal httpStatusCode) {
    
    this.httpStatusCode = httpStatusCode;
    return this;
  }

   /**
   * The http status code (4xx and 5xx HTTP status codes).
   * @return httpStatusCode
  **/
  @ApiModelProperty(example = "400", required = true, value = "The http status code (4xx and 5xx HTTP status codes).")

  public BigDecimal getHttpStatusCode() {
    return httpStatusCode;
  }


  public void setHttpStatusCode(BigDecimal httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  public VerifyPaymentInstrumentsErrorResponse errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code.
   * @return errorCode
  **/
  @ApiModelProperty(example = "BI52", required = true, value = "The error code.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public VerifyPaymentInstrumentsErrorResponse errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message.
   * @return errorMessage
  **/
  @ApiModelProperty(example = "PAYMENT TRANSACTION FAILED", required = true, value = "The error message.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public VerifyPaymentInstrumentsErrorResponse errorDetail(String errorDetail) {
    
    this.errorDetail = errorDetail;
    return this;
  }

   /**
   * The error detail.
   * @return errorDetail
  **/
  @ApiModelProperty(example = "Oops! An unknown error has occurred", required = true, value = "The error detail.")

  public String getErrorDetail() {
    return errorDetail;
  }


  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }


  public VerifyPaymentInstrumentsErrorResponse verifyResponses(List<VerifyPaymentInstrumentsErrorResponseVerifyResponses> verifyResponses) {
    
    this.verifyResponses = verifyResponses;
    return this;
  }

  public VerifyPaymentInstrumentsErrorResponse addVerifyResponsesItem(VerifyPaymentInstrumentsErrorResponseVerifyResponses verifyResponsesItem) {
    if (this.verifyResponses == null) {
      this.verifyResponses = new ArrayList<VerifyPaymentInstrumentsErrorResponseVerifyResponses>();
    }
    this.verifyResponses.add(verifyResponsesItem);
    return this;
  }

   /**
   * Get verifyResponses
   * @return verifyResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VerifyPaymentInstrumentsErrorResponseVerifyResponses> getVerifyResponses() {
    return verifyResponses;
  }


  public void setVerifyResponses(List<VerifyPaymentInstrumentsErrorResponseVerifyResponses> verifyResponses) {
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
    VerifyPaymentInstrumentsErrorResponse verifyPaymentInstrumentsErrorResponse = (VerifyPaymentInstrumentsErrorResponse) o;
    return Objects.equals(this.httpStatusCode, verifyPaymentInstrumentsErrorResponse.httpStatusCode) &&
        Objects.equals(this.errorCode, verifyPaymentInstrumentsErrorResponse.errorCode) &&
        Objects.equals(this.errorMessage, verifyPaymentInstrumentsErrorResponse.errorMessage) &&
        Objects.equals(this.errorDetail, verifyPaymentInstrumentsErrorResponse.errorDetail) &&
        Objects.equals(this.verifyResponses, verifyPaymentInstrumentsErrorResponse.verifyResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, errorCode, errorMessage, errorDetail, verifyResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPaymentInstrumentsErrorResponse {\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

