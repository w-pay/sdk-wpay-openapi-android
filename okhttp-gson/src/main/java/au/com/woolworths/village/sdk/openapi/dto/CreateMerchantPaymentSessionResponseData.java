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
 * Mandatory data object containing response
 */
@ApiModel(description = "Mandatory data object containing response")

public class CreateMerchantPaymentSessionResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_SESSION_ID = "paymentSessionId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SESSION_ID)
  private String paymentSessionId;

  public static final String SERIALIZED_NAME_QR = "qr";
  @SerializedName(SERIALIZED_NAME_QR)
  private Qr qr;


  public CreateMerchantPaymentSessionResponseData paymentSessionId(String paymentSessionId) {
    
    this.paymentSessionId = paymentSessionId;
    return this;
  }

   /**
   * The ID of the new payment session
   * @return paymentSessionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the new payment session")

  public String getPaymentSessionId() {
    return paymentSessionId;
  }


  public void setPaymentSessionId(String paymentSessionId) {
    this.paymentSessionId = paymentSessionId;
  }


  public CreateMerchantPaymentSessionResponseData qr(Qr qr) {
    
    this.qr = qr;
    return this;
  }

   /**
   * Get qr
   * @return qr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Qr getQr() {
    return qr;
  }


  public void setQr(Qr qr) {
    this.qr = qr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMerchantPaymentSessionResponseData createMerchantPaymentSessionResponseData = (CreateMerchantPaymentSessionResponseData) o;
    return Objects.equals(this.paymentSessionId, createMerchantPaymentSessionResponseData.paymentSessionId) &&
        Objects.equals(this.qr, createMerchantPaymentSessionResponseData.qr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSessionId, qr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMerchantPaymentSessionResponseData {\n");
    sb.append("    paymentSessionId: ").append(toIndentedString(paymentSessionId)).append("\n");
    sb.append("    qr: ").append(toIndentedString(qr)).append("\n");
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

