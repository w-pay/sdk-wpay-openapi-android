/*
 * Village Wallet
 * APIs for Village Wallet
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import au.com.woolworths.village.sdk.openapi.dto.DynamicPayload;
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
 * Mandatory data object containing details of the payment session
 */
@ApiModel(description = "Mandatory data object containing details of the payment session")

public class MerchantPaymentSessionPaymentSessionIdData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MERCHANT_INFO = "merchantInfo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INFO)
  private DynamicPayload merchantInfo;

  public static final String SERIALIZED_NAME_PAYMENT_REQUEST_ID = "paymentRequestId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUEST_ID)
  private String paymentRequestId;


  public MerchantPaymentSessionPaymentSessionIdData merchantInfo(DynamicPayload merchantInfo) {
    
    this.merchantInfo = merchantInfo;
    return this;
  }

   /**
   * Get merchantInfo
   * @return merchantInfo
  **/
  @ApiModelProperty(required = true, value = "")

  public DynamicPayload getMerchantInfo() {
    return merchantInfo;
  }


  public void setMerchantInfo(DynamicPayload merchantInfo) {
    this.merchantInfo = merchantInfo;
  }


  public MerchantPaymentSessionPaymentSessionIdData paymentRequestId(String paymentRequestId) {
    
    this.paymentRequestId = paymentRequestId;
    return this;
  }

   /**
   * The ID of the associated payment request
   * @return paymentRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the associated payment request")

  public String getPaymentRequestId() {
    return paymentRequestId;
  }


  public void setPaymentRequestId(String paymentRequestId) {
    this.paymentRequestId = paymentRequestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantPaymentSessionPaymentSessionIdData merchantPaymentSessionPaymentSessionIdData = (MerchantPaymentSessionPaymentSessionIdData) o;
    return Objects.equals(this.merchantInfo, merchantPaymentSessionPaymentSessionIdData.merchantInfo) &&
        Objects.equals(this.paymentRequestId, merchantPaymentSessionPaymentSessionIdData.paymentRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantInfo, paymentRequestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantPaymentSessionPaymentSessionIdData {\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    paymentRequestId: ").append(toIndentedString(paymentRequestId)).append("\n");
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

