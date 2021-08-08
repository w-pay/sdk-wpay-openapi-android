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
import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethods;
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
 * The JSON response structure of the Merchant Profile endpoint.
 */
@ApiModel(description = "The JSON response structure of the Merchant Profile endpoint.")

public class MerchantProfileResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALLOWED_PAYMENT_METHODS = "allowedPaymentMethods";
  @SerializedName(SERIALIZED_NAME_ALLOWED_PAYMENT_METHODS)
  private MerchantProfileResponseAllowedPaymentMethods allowedPaymentMethods;


  public MerchantProfileResponse allowedPaymentMethods(MerchantProfileResponseAllowedPaymentMethods allowedPaymentMethods) {
    
    this.allowedPaymentMethods = allowedPaymentMethods;
    return this;
  }

   /**
   * Get allowedPaymentMethods
   * @return allowedPaymentMethods
  **/
  @ApiModelProperty(required = true, value = "")

  public MerchantProfileResponseAllowedPaymentMethods getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }


  public void setAllowedPaymentMethods(MerchantProfileResponseAllowedPaymentMethods allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProfileResponse merchantProfileResponse = (MerchantProfileResponse) o;
    return Objects.equals(this.allowedPaymentMethods, merchantProfileResponse.allowedPaymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProfileResponse {\n");
    sb.append("    allowedPaymentMethods: ").append(toIndentedString(allowedPaymentMethods)).append("\n");
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

