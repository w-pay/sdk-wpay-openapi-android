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
 * ImportPaymentInstrumentsRequestPayPal
 */

public class ImportPaymentInstrumentsRequestPayPal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_PAY_PAL_ID = "payPalId";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_ID)
  private String payPalId;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TOKEN = "paymentMethodToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TOKEN)
  private String paymentMethodToken;


  public ImportPaymentInstrumentsRequestPayPal customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * The Paypal customer id.
   * @return customerId
  **/
  @ApiModelProperty(example = "690238314", required = true, value = "The Paypal customer id.")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ImportPaymentInstrumentsRequestPayPal payPalId(String payPalId) {
    
    this.payPalId = payPalId;
    return this;
  }

   /**
   * The Paypal email id.
   * @return payPalId
  **/
  @ApiModelProperty(example = "jane.doe@paypal.com", required = true, value = "The Paypal email id.")

  public String getPayPalId() {
    return payPalId;
  }


  public void setPayPalId(String payPalId) {
    this.payPalId = payPalId;
  }


  public ImportPaymentInstrumentsRequestPayPal paymentMethodToken(String paymentMethodToken) {
    
    this.paymentMethodToken = paymentMethodToken;
    return this;
  }

   /**
   * The Paypal payment method token.
   * @return paymentMethodToken
  **/
  @ApiModelProperty(example = "I7wME6uOKgsq3fz3y52s", required = true, value = "The Paypal payment method token.")

  public String getPaymentMethodToken() {
    return paymentMethodToken;
  }


  public void setPaymentMethodToken(String paymentMethodToken) {
    this.paymentMethodToken = paymentMethodToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportPaymentInstrumentsRequestPayPal importPaymentInstrumentsRequestPayPal = (ImportPaymentInstrumentsRequestPayPal) o;
    return Objects.equals(this.customerId, importPaymentInstrumentsRequestPayPal.customerId) &&
        Objects.equals(this.payPalId, importPaymentInstrumentsRequestPayPal.payPalId) &&
        Objects.equals(this.paymentMethodToken, importPaymentInstrumentsRequestPayPal.paymentMethodToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, payPalId, paymentMethodToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportPaymentInstrumentsRequestPayPal {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    payPalId: ").append(toIndentedString(payPalId)).append("\n");
    sb.append("    paymentMethodToken: ").append(toIndentedString(paymentMethodToken)).append("\n");
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

