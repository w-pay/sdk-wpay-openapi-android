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
import au.com.woolworths.village.sdk.openapi.dto.TokenizePaypalResponsePayPal;
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
 * The JSON response structure of the Tokenize Paypal endpoint.
 */
@ApiModel(description = "The JSON response structure of the Tokenize Paypal endpoint.")

public class TokenizePaypalResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAY_PAL = "payPal";
  @SerializedName(SERIALIZED_NAME_PAY_PAL)
  private TokenizePaypalResponsePayPal payPal;


  public TokenizePaypalResponse payPal(TokenizePaypalResponsePayPal payPal) {
    
    this.payPal = payPal;
    return this;
  }

   /**
   * Get payPal
   * @return payPal
  **/
  @ApiModelProperty(required = true, value = "")

  public TokenizePaypalResponsePayPal getPayPal() {
    return payPal;
  }


  public void setPayPal(TokenizePaypalResponsePayPal payPal) {
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
    TokenizePaypalResponse tokenizePaypalResponse = (TokenizePaypalResponse) o;
    return Objects.equals(this.payPal, tokenizePaypalResponse.payPal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payPal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizePaypalResponse {\n");
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

