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
import au.com.woolworths.village.sdk.openapi.dto.OpenpayRefundsErrorResponseRefundResponses;
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
 * The JSON error response structure of the Refunds endpoint.
 */
@ApiModel(description = "The JSON error response structure of the Refunds endpoint.")

public class OpenpayRefundsErrorResponse implements Serializable {
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

  public static final String SERIALIZED_NAME_REFUND_RESPONSES = "refundResponses";
  @SerializedName(SERIALIZED_NAME_REFUND_RESPONSES)
  private List<OpenpayRefundsErrorResponseRefundResponses> refundResponses = null;


  public OpenpayRefundsErrorResponse httpStatusCode(BigDecimal httpStatusCode) {
    
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


  public OpenpayRefundsErrorResponse errorCode(String errorCode) {
    
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


  public OpenpayRefundsErrorResponse errorMessage(String errorMessage) {
    
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


  public OpenpayRefundsErrorResponse errorDetail(String errorDetail) {
    
    this.errorDetail = errorDetail;
    return this;
  }

   /**
   * The error detail.
   * @return errorDetail
  **/
  @ApiModelProperty(example = "We are currently experiencing technical issues with our service.", required = true, value = "The error detail.")

  public String getErrorDetail() {
    return errorDetail;
  }


  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }


  public OpenpayRefundsErrorResponse refundResponses(List<OpenpayRefundsErrorResponseRefundResponses> refundResponses) {
    
    this.refundResponses = refundResponses;
    return this;
  }

  public OpenpayRefundsErrorResponse addRefundResponsesItem(OpenpayRefundsErrorResponseRefundResponses refundResponsesItem) {
    if (this.refundResponses == null) {
      this.refundResponses = new ArrayList<OpenpayRefundsErrorResponseRefundResponses>();
    }
    this.refundResponses.add(refundResponsesItem);
    return this;
  }

   /**
   * Get refundResponses
   * @return refundResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OpenpayRefundsErrorResponseRefundResponses> getRefundResponses() {
    return refundResponses;
  }


  public void setRefundResponses(List<OpenpayRefundsErrorResponseRefundResponses> refundResponses) {
    this.refundResponses = refundResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenpayRefundsErrorResponse openpayRefundsErrorResponse = (OpenpayRefundsErrorResponse) o;
    return Objects.equals(this.httpStatusCode, openpayRefundsErrorResponse.httpStatusCode) &&
        Objects.equals(this.errorCode, openpayRefundsErrorResponse.errorCode) &&
        Objects.equals(this.errorMessage, openpayRefundsErrorResponse.errorMessage) &&
        Objects.equals(this.errorDetail, openpayRefundsErrorResponse.errorDetail) &&
        Objects.equals(this.refundResponses, openpayRefundsErrorResponse.refundResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, errorCode, errorMessage, errorDetail, refundResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayRefundsErrorResponse {\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
    sb.append("    refundResponses: ").append(toIndentedString(refundResponses)).append("\n");
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

