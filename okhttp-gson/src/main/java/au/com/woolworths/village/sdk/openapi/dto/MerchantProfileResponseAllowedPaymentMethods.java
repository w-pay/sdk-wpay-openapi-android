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
import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsApplePay;
import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsCreditCard;
import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsGiftCard;
import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsGooglePay;
import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsPayPal;
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
 * MerchantProfileResponseAllowedPaymentMethods
 */

public class MerchantProfileResponseAllowedPaymentMethods implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GIFT_CARD = "giftCard";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD)
  private MerchantProfileResponseAllowedPaymentMethodsGiftCard giftCard;

  public static final String SERIALIZED_NAME_CREDIT_CARD = "creditCard";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARD)
  private MerchantProfileResponseAllowedPaymentMethodsCreditCard creditCard;

  public static final String SERIALIZED_NAME_PAY_PAL = "payPal";
  @SerializedName(SERIALIZED_NAME_PAY_PAL)
  private MerchantProfileResponseAllowedPaymentMethodsPayPal payPal;

  public static final String SERIALIZED_NAME_GOOGLE_PAY = "googlePay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PAY)
  private MerchantProfileResponseAllowedPaymentMethodsGooglePay googlePay;

  public static final String SERIALIZED_NAME_APPLE_PAY = "applePay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private MerchantProfileResponseAllowedPaymentMethodsApplePay applePay;


  public MerchantProfileResponseAllowedPaymentMethods giftCard(MerchantProfileResponseAllowedPaymentMethodsGiftCard giftCard) {
    
    this.giftCard = giftCard;
    return this;
  }

   /**
   * Get giftCard
   * @return giftCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantProfileResponseAllowedPaymentMethodsGiftCard getGiftCard() {
    return giftCard;
  }


  public void setGiftCard(MerchantProfileResponseAllowedPaymentMethodsGiftCard giftCard) {
    this.giftCard = giftCard;
  }


  public MerchantProfileResponseAllowedPaymentMethods creditCard(MerchantProfileResponseAllowedPaymentMethodsCreditCard creditCard) {
    
    this.creditCard = creditCard;
    return this;
  }

   /**
   * Get creditCard
   * @return creditCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantProfileResponseAllowedPaymentMethodsCreditCard getCreditCard() {
    return creditCard;
  }


  public void setCreditCard(MerchantProfileResponseAllowedPaymentMethodsCreditCard creditCard) {
    this.creditCard = creditCard;
  }


  public MerchantProfileResponseAllowedPaymentMethods payPal(MerchantProfileResponseAllowedPaymentMethodsPayPal payPal) {
    
    this.payPal = payPal;
    return this;
  }

   /**
   * Get payPal
   * @return payPal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantProfileResponseAllowedPaymentMethodsPayPal getPayPal() {
    return payPal;
  }


  public void setPayPal(MerchantProfileResponseAllowedPaymentMethodsPayPal payPal) {
    this.payPal = payPal;
  }


  public MerchantProfileResponseAllowedPaymentMethods googlePay(MerchantProfileResponseAllowedPaymentMethodsGooglePay googlePay) {
    
    this.googlePay = googlePay;
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantProfileResponseAllowedPaymentMethodsGooglePay getGooglePay() {
    return googlePay;
  }


  public void setGooglePay(MerchantProfileResponseAllowedPaymentMethodsGooglePay googlePay) {
    this.googlePay = googlePay;
  }


  public MerchantProfileResponseAllowedPaymentMethods applePay(MerchantProfileResponseAllowedPaymentMethodsApplePay applePay) {
    
    this.applePay = applePay;
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  @ApiModelProperty(required = true, value = "")

  public MerchantProfileResponseAllowedPaymentMethodsApplePay getApplePay() {
    return applePay;
  }


  public void setApplePay(MerchantProfileResponseAllowedPaymentMethodsApplePay applePay) {
    this.applePay = applePay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProfileResponseAllowedPaymentMethods merchantProfileResponseAllowedPaymentMethods = (MerchantProfileResponseAllowedPaymentMethods) o;
    return Objects.equals(this.giftCard, merchantProfileResponseAllowedPaymentMethods.giftCard) &&
        Objects.equals(this.creditCard, merchantProfileResponseAllowedPaymentMethods.creditCard) &&
        Objects.equals(this.payPal, merchantProfileResponseAllowedPaymentMethods.payPal) &&
        Objects.equals(this.googlePay, merchantProfileResponseAllowedPaymentMethods.googlePay) &&
        Objects.equals(this.applePay, merchantProfileResponseAllowedPaymentMethods.applePay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCard, creditCard, payPal, googlePay, applePay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProfileResponseAllowedPaymentMethods {\n");
    sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    payPal: ").append(toIndentedString(payPal)).append("\n");
    sb.append("    googlePay: ").append(toIndentedString(googlePay)).append("\n");
    sb.append("    applePay: ").append(toIndentedString(applePay)).append("\n");
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

