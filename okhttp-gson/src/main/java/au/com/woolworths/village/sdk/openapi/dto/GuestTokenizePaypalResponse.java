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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON response structure of the Guest Tokenize Paypal endpoint.
 */
@ApiModel(description = "The JSON response structure of the Guest Tokenize Paypal endpoint.")

public class GuestTokenizePaypalResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAY_PAL = "payPal";
  @SerializedName(SERIALIZED_NAME_PAY_PAL)
  private GuestTokenizePaypalResponsePayPal payPal;


  public GuestTokenizePaypalResponse payPal(GuestTokenizePaypalResponsePayPal payPal) {
    
    this.payPal = payPal;
    return this;
  }

   /**
   * Get payPal
   * @return payPal
  **/
  @ApiModelProperty(required = true, value = "")

  public GuestTokenizePaypalResponsePayPal getPayPal() {
    return payPal;
  }


  public void setPayPal(GuestTokenizePaypalResponsePayPal payPal) {
    this.payPal = payPal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestTokenizePaypalResponse guestTokenizePaypalResponse = (GuestTokenizePaypalResponse) o;
    return Objects.equals(this.payPal, guestTokenizePaypalResponse.payPal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payPal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestTokenizePaypalResponse {\n");
    sb.append("    payPal: ").append(toIndentedString(payPal)).append("\n");
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
