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
 * PaymentsSuccessResponseStepUp
 */

public class PaymentsSuccessResponseStepUp implements Serializable {
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


  public PaymentsSuccessResponseStepUp type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the step up action. For google pay this will be REFRESH_TOKEN.
   * @return type
  **/
  @ApiModelProperty(example = "REFRESH_TOKEN", required = true, value = "The type of the step up action. For google pay this will be REFRESH_TOKEN.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PaymentsSuccessResponseStepUp mandatory(Boolean mandatory) {
    
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


  public PaymentsSuccessResponseStepUp url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the endpoint to use to update the google pay token.
   * @return url
  **/
  @ApiModelProperty(example = "https://{environment}.mobile-api.woolworths.com.au/wow/v1/pay/googlepay/tokenize/90953", required = true, value = "The URL of the endpoint to use to update the google pay token.")

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
    PaymentsSuccessResponseStepUp paymentsSuccessResponseStepUp = (PaymentsSuccessResponseStepUp) o;
    return Objects.equals(this.type, paymentsSuccessResponseStepUp.type) &&
        Objects.equals(this.mandatory, paymentsSuccessResponseStepUp.mandatory) &&
        Objects.equals(this.url, paymentsSuccessResponseStepUp.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mandatory, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsSuccessResponseStepUp {\n");
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
