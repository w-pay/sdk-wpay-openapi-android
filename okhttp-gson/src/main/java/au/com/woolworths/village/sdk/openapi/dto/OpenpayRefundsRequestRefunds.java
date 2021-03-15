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

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * OpenpayRefundsRequestRefunds
 */

public class OpenpayRefundsRequestRefunds implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_TRANSACTION_REF = "paymentTransactionRef";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TRANSACTION_REF)
  private String paymentTransactionRef;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_GST_AMOUNT = "gstAmount";
  @SerializedName(SERIALIZED_NAME_GST_AMOUNT)
  private BigDecimal gstAmount;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public OpenpayRefundsRequestRefunds paymentTransactionRef(String paymentTransactionRef) {
    
    this.paymentTransactionRef = paymentTransactionRef;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the payment transaction in the container.
   * @return paymentTransactionRef
  **/
  @ApiModelProperty(example = "1000000000670622", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the payment transaction in the container.")

  public String getPaymentTransactionRef() {
    return paymentTransactionRef;
  }


  public void setPaymentTransactionRef(String paymentTransactionRef) {
    this.paymentTransactionRef = paymentTransactionRef;
  }


  public OpenpayRefundsRequestRefunds amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount you want to refund.
   * @return amount
  **/
  @ApiModelProperty(example = "20.5", required = true, value = "The amount you want to refund.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public OpenpayRefundsRequestRefunds gstAmount(BigDecimal gstAmount) {
    
    this.gstAmount = gstAmount;
    return this;
  }

   /**
   * The GST amount of the amount you want to refund.
   * @return gstAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.86", value = "The GST amount of the amount you want to refund.")

  public BigDecimal getGstAmount() {
    return gstAmount;
  }


  public void setGstAmount(BigDecimal gstAmount) {
    this.gstAmount = gstAmount;
  }


  public OpenpayRefundsRequestRefunds reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason or justification for the refund.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Item broken on delivery", value = "The reason or justification for the refund.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenpayRefundsRequestRefunds openpayRefundsRequestRefunds = (OpenpayRefundsRequestRefunds) o;
    return Objects.equals(this.paymentTransactionRef, openpayRefundsRequestRefunds.paymentTransactionRef) &&
        Objects.equals(this.amount, openpayRefundsRequestRefunds.amount) &&
        Objects.equals(this.gstAmount, openpayRefundsRequestRefunds.gstAmount) &&
        Objects.equals(this.reason, openpayRefundsRequestRefunds.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionRef, amount, gstAmount, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayRefundsRequestRefunds {\n");
    sb.append("    paymentTransactionRef: ").append(toIndentedString(paymentTransactionRef)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    gstAmount: ").append(toIndentedString(gstAmount)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

