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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * The base JSON response structure of all errors.
 */
@ApiModel(description = "The base JSON response structure of all errors.")

public class BaseErrorResponse implements Serializable {
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


  public BaseErrorResponse httpStatusCode(BigDecimal httpStatusCode) {
    
    this.httpStatusCode = httpStatusCode;
    return this;
  }

   /**
   * The http status code (4xx and 5xx HTTP status codes).
   * @return httpStatusCode
  **/
  @ApiModelProperty(example = "500", required = true, value = "The http status code (4xx and 5xx HTTP status codes).")

  public BigDecimal getHttpStatusCode() {
    return httpStatusCode;
  }


  public void setHttpStatusCode(BigDecimal httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  public BaseErrorResponse errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code.
   * @return errorCode
  **/
  @ApiModelProperty(example = "AP99", required = true, value = "The error code.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public BaseErrorResponse errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message.
   * @return errorMessage
  **/
  @ApiModelProperty(example = "Internal Server Error", required = true, value = "The error message.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public BaseErrorResponse errorDetail(String errorDetail) {
    
    this.errorDetail = errorDetail;
    return this;
  }

   /**
   * The error detail.
   * @return errorDetail
  **/
  @ApiModelProperty(example = "Oops! An error has occurred: ScriptExecutionFailed", required = true, value = "The error detail.")

  public String getErrorDetail() {
    return errorDetail;
  }


  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseErrorResponse baseErrorResponse = (BaseErrorResponse) o;
    return Objects.equals(this.httpStatusCode, baseErrorResponse.httpStatusCode) &&
        Objects.equals(this.errorCode, baseErrorResponse.errorCode) &&
        Objects.equals(this.errorMessage, baseErrorResponse.errorMessage) &&
        Objects.equals(this.errorDetail, baseErrorResponse.errorDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, errorCode, errorMessage, errorDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseErrorResponse {\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

