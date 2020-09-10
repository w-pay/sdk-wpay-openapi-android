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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * Mandatory data object containing response
 */
@ApiModel(description = "Mandatory data object containing response")

public class PaymentSession implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_SESSION_ID = "paymentSessionId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SESSION_ID)
  private String paymentSessionId;

  public static final String SERIALIZED_NAME_PAYMENT_REQUEST_ID = "paymentRequestId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUEST_ID)
  private String paymentRequestId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_EXPIRY_TIME = "expiryTime";
  @SerializedName(SERIALIZED_NAME_EXPIRY_TIME)
  private OffsetDateTime expiryTime;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_MERCHANT_INFO = "merchantInfo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INFO)
  private DynamicPayload merchantInfo;

  public static final String SERIALIZED_NAME_CUSTOMER_INFO = "customerInfo";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_INFO)
  private DynamicPayload customerInfo;


  public PaymentSession paymentSessionId(String paymentSessionId) {
    
    this.paymentSessionId = paymentSessionId;
    return this;
  }

   /**
   * The ID of the payment session
   * @return paymentSessionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the payment session")

  public String getPaymentSessionId() {
    return paymentSessionId;
  }


  public void setPaymentSessionId(String paymentSessionId) {
    this.paymentSessionId = paymentSessionId;
  }


  public PaymentSession paymentRequestId(String paymentRequestId) {
    
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


  public PaymentSession merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The ID of the merchant initiating the payment session
   * @return merchantId
  **/
  @ApiModelProperty(required = true, value = "The ID of the merchant initiating the payment session")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public PaymentSession walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The ID of the customers wallet
   * @return walletId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the customers wallet")

  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public PaymentSession expiryTime(OffsetDateTime expiryTime) {
    
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * The ISO date/time for when the payment session will expire and become unusable
   * @return expiryTime
  **/
  @ApiModelProperty(example = "2017-11-06T19:38:09.890+11:00", required = true, value = "The ISO date/time for when the payment session will expire and become unusable")

  public OffsetDateTime getExpiryTime() {
    return expiryTime;
  }


  public void setExpiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
  }


  public PaymentSession location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The location of the payment session (Used to group payment sessions)
   * @return location
  **/
  @ApiModelProperty(required = true, value = "The location of the payment session (Used to group payment sessions)")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public PaymentSession merchantInfo(DynamicPayload merchantInfo) {
    
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


  public PaymentSession customerInfo(DynamicPayload customerInfo) {
    
    this.customerInfo = customerInfo;
    return this;
  }

   /**
   * Get customerInfo
   * @return customerInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DynamicPayload getCustomerInfo() {
    return customerInfo;
  }


  public void setCustomerInfo(DynamicPayload customerInfo) {
    this.customerInfo = customerInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSession paymentSession = (PaymentSession) o;
    return Objects.equals(this.paymentSessionId, paymentSession.paymentSessionId) &&
        Objects.equals(this.paymentRequestId, paymentSession.paymentRequestId) &&
        Objects.equals(this.merchantId, paymentSession.merchantId) &&
        Objects.equals(this.walletId, paymentSession.walletId) &&
        Objects.equals(this.expiryTime, paymentSession.expiryTime) &&
        Objects.equals(this.location, paymentSession.location) &&
        Objects.equals(this.merchantInfo, paymentSession.merchantInfo) &&
        Objects.equals(this.customerInfo, paymentSession.customerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSessionId, paymentRequestId, merchantId, walletId, expiryTime, location, merchantInfo, customerInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSession {\n");
    sb.append("    paymentSessionId: ").append(toIndentedString(paymentSessionId)).append("\n");
    sb.append("    paymentRequestId: ").append(toIndentedString(paymentRequestId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
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

