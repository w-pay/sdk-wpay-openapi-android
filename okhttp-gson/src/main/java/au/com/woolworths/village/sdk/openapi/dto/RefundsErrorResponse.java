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

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON response structure of the Refunds endpoint.
 */
@ApiModel(description = "The JSON response structure of the Refunds endpoint.")

public class RefundsErrorResponse implements Serializable {
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
  private List<RefundsErrorResponseRefundResponses> refundResponses = null;


  public RefundsErrorResponse httpStatusCode(BigDecimal httpStatusCode) {
    
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


  public RefundsErrorResponse errorCode(String errorCode) {
    
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


  public RefundsErrorResponse errorMessage(String errorMessage) {
    
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


  public RefundsErrorResponse errorDetail(String errorDetail) {
    
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


  public RefundsErrorResponse refundResponses(List<RefundsErrorResponseRefundResponses> refundResponses) {
    
    this.refundResponses = refundResponses;
    return this;
  }

  public RefundsErrorResponse addRefundResponsesItem(RefundsErrorResponseRefundResponses refundResponsesItem) {
    if (this.refundResponses == null) {
      this.refundResponses = new ArrayList<RefundsErrorResponseRefundResponses>();
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

  public List<RefundsErrorResponseRefundResponses> getRefundResponses() {
    return refundResponses;
  }


  public void setRefundResponses(List<RefundsErrorResponseRefundResponses> refundResponses) {
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
    RefundsErrorResponse refundsErrorResponse = (RefundsErrorResponse) o;
    return Objects.equals(this.httpStatusCode, refundsErrorResponse.httpStatusCode) &&
        Objects.equals(this.errorCode, refundsErrorResponse.errorCode) &&
        Objects.equals(this.errorMessage, refundsErrorResponse.errorMessage) &&
        Objects.equals(this.errorDetail, refundsErrorResponse.errorDetail) &&
        Objects.equals(this.refundResponses, refundsErrorResponse.refundResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, errorCode, errorMessage, errorDetail, refundResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundsErrorResponse {\n");
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

