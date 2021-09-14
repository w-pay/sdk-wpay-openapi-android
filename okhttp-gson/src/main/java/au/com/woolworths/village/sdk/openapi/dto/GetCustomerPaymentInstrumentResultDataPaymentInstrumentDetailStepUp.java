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
 * GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp
 */

public class GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MANDATORY = "mandatory";
  @SerializedName(SERIALIZED_NAME_MANDATORY)
  private Boolean mandatory;


  public GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the step up action. For gift cards this will be REQUIRE_PASSCODE which identifies that the consumer must capture the PIN prior to payment.
   * @return type
  **/
  @ApiModelProperty(example = "REQUIRE_PASSCODE", required = true, value = "The type of the step up action. For gift cards this will be REQUIRE_PASSCODE which identifies that the consumer must capture the PIN prior to payment.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp mandatory(Boolean mandatory) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp getCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp = (GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp) o;
    return Objects.equals(this.type, getCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp.type) &&
        Objects.equals(this.mandatory, getCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp.mandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mandatory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerPaymentInstrumentResultDataPaymentInstrumentDetailStepUp {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
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

