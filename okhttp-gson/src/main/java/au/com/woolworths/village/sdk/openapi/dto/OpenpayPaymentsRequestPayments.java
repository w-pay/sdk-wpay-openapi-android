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
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * OpenpayPaymentsRequestPayments
 */

public class OpenpayPaymentsRequestPayments implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_TOKEN = "paymentToken";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TOKEN)
  private String paymentToken;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_GST_AMOUNT = "gstAmount";
  @SerializedName(SERIALIZED_NAME_GST_AMOUNT)
  private BigDecimal gstAmount;


  public OpenpayPaymentsRequestPayments paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The payment token.
   * @return paymentToken
  **/
  @ApiModelProperty(example = "46ee5998-10cd-11ea-8d71-362b9e155667", required = true, value = "The payment token.")

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public OpenpayPaymentsRequestPayments amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount you want to pay with the payment instrument.
   * @return amount
  **/
  @ApiModelProperty(example = "20.5", required = true, value = "The amount you want to pay with the payment instrument.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public OpenpayPaymentsRequestPayments gstAmount(BigDecimal gstAmount) {
    
    this.gstAmount = gstAmount;
    return this;
  }

   /**
   * The GST amount of the full amount you want to pay with the payment instrument.
   * @return gstAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.86", value = "The GST amount of the full amount you want to pay with the payment instrument.")

  public BigDecimal getGstAmount() {
    return gstAmount;
  }


  public void setGstAmount(BigDecimal gstAmount) {
    this.gstAmount = gstAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenpayPaymentsRequestPayments openpayPaymentsRequestPayments = (OpenpayPaymentsRequestPayments) o;
    return Objects.equals(this.paymentToken, openpayPaymentsRequestPayments.paymentToken) &&
        Objects.equals(this.amount, openpayPaymentsRequestPayments.amount) &&
        Objects.equals(this.gstAmount, openpayPaymentsRequestPayments.gstAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, amount, gstAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayPaymentsRequestPayments {\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    gstAmount: ").append(toIndentedString(gstAmount)).append("\n");
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

