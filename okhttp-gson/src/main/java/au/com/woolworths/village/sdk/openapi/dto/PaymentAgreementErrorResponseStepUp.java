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
 * Only present if an error occurred during instrument verification.
 */
@ApiModel(description = "Only present if an error occurred during instrument verification.")

public class PaymentAgreementErrorResponseStepUp implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MANDATORY = "mandatory";
  @SerializedName(SERIALIZED_NAME_MANDATORY)
  private Boolean mandatory;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public PaymentAgreementErrorResponseStepUp type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the step up action. For payment agreements this will be CAPTURE_CVV which identifies that the consumer must capture the CVV prior to payment.
   * @return type
  **/
  @ApiModelProperty(example = "CAPTURE_CVV", required = true, value = "The type of the step up action. For payment agreements this will be CAPTURE_CVV which identifies that the consumer must capture the CVV prior to payment.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PaymentAgreementErrorResponseStepUp mandatory(Boolean mandatory) {
    
    this.mandatory = mandatory;
    return this;
  }

   /**
   * A flag to indicate if this step up (action) is mandatory.
   * @return mandatory
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if this step up (action) is mandatory.")

  public Boolean getMandatory() {
    return mandatory;
  }


  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public PaymentAgreementErrorResponseStepUp url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of an iframe. This iframe is used to capture a credit card expiry and CVV or CVV only. The URL will automatically switch between expiry and CVV or CVV only endpoints based on the container requirement.
   * @return url
  **/
  @ApiModelProperty(example = "https://uat.woolworthspay.com.au/container-ws/getCaptureFrame/cvv/2f890821-e2c1-4dbb-aabf-dcaed3885923/90731", required = true, value = "The URL of an iframe. This iframe is used to capture a credit card expiry and CVV or CVV only. The URL will automatically switch between expiry and CVV or CVV only endpoints based on the container requirement.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAgreementErrorResponseStepUp paymentAgreementErrorResponseStepUp = (PaymentAgreementErrorResponseStepUp) o;
    return Objects.equals(this.type, paymentAgreementErrorResponseStepUp.type) &&
        Objects.equals(this.mandatory, paymentAgreementErrorResponseStepUp.mandatory) &&
        Objects.equals(this.url, paymentAgreementErrorResponseStepUp.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mandatory, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAgreementErrorResponseStepUp {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

