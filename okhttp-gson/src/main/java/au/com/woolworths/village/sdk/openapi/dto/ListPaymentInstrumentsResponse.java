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
import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseApplePay;
import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseCreditCards;
import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseGiftCards;
import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseGooglePay;
import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponsePayPal;
import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponsePaymentAgreements;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * The JSON response structure of the List Payment Instruments endpoint.
 */
@ApiModel(description = "The JSON response structure of the List Payment Instruments endpoint.")

public class ListPaymentInstrumentsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CREDIT_CARDS = "creditCards";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARDS)
  private List<ListPaymentInstrumentsResponseCreditCards> creditCards = new ArrayList<ListPaymentInstrumentsResponseCreditCards>();

  public static final String SERIALIZED_NAME_GIFT_CARDS = "giftCards";
  @SerializedName(SERIALIZED_NAME_GIFT_CARDS)
  private List<ListPaymentInstrumentsResponseGiftCards> giftCards = new ArrayList<ListPaymentInstrumentsResponseGiftCards>();

  public static final String SERIALIZED_NAME_PAY_PAL = "payPal";
  @SerializedName(SERIALIZED_NAME_PAY_PAL)
  private List<ListPaymentInstrumentsResponsePayPal> payPal = new ArrayList<ListPaymentInstrumentsResponsePayPal>();

  public static final String SERIALIZED_NAME_PAYMENT_AGREEMENTS = "paymentAgreements";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AGREEMENTS)
  private List<ListPaymentInstrumentsResponsePaymentAgreements> paymentAgreements = new ArrayList<ListPaymentInstrumentsResponsePaymentAgreements>();

  public static final String SERIALIZED_NAME_ANDROID_PAY = "androidPay";
  @SerializedName(SERIALIZED_NAME_ANDROID_PAY)
  private Object androidPay;

  public static final String SERIALIZED_NAME_GOOGLE_PAY = "googlePay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PAY)
  private ListPaymentInstrumentsResponseGooglePay googlePay;

  public static final String SERIALIZED_NAME_APPLE_PAY = "applePay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private ListPaymentInstrumentsResponseApplePay applePay;


  public ListPaymentInstrumentsResponse creditCards(List<ListPaymentInstrumentsResponseCreditCards> creditCards) {
    
    this.creditCards = creditCards;
    return this;
  }

  public ListPaymentInstrumentsResponse addCreditCardsItem(ListPaymentInstrumentsResponseCreditCards creditCardsItem) {
    this.creditCards.add(creditCardsItem);
    return this;
  }

   /**
   * Get creditCards
   * @return creditCards
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ListPaymentInstrumentsResponseCreditCards> getCreditCards() {
    return creditCards;
  }


  public void setCreditCards(List<ListPaymentInstrumentsResponseCreditCards> creditCards) {
    this.creditCards = creditCards;
  }


  public ListPaymentInstrumentsResponse giftCards(List<ListPaymentInstrumentsResponseGiftCards> giftCards) {
    
    this.giftCards = giftCards;
    return this;
  }

  public ListPaymentInstrumentsResponse addGiftCardsItem(ListPaymentInstrumentsResponseGiftCards giftCardsItem) {
    this.giftCards.add(giftCardsItem);
    return this;
  }

   /**
   * Get giftCards
   * @return giftCards
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ListPaymentInstrumentsResponseGiftCards> getGiftCards() {
    return giftCards;
  }


  public void setGiftCards(List<ListPaymentInstrumentsResponseGiftCards> giftCards) {
    this.giftCards = giftCards;
  }


  public ListPaymentInstrumentsResponse payPal(List<ListPaymentInstrumentsResponsePayPal> payPal) {
    
    this.payPal = payPal;
    return this;
  }

  public ListPaymentInstrumentsResponse addPayPalItem(ListPaymentInstrumentsResponsePayPal payPalItem) {
    this.payPal.add(payPalItem);
    return this;
  }

   /**
   * Get payPal
   * @return payPal
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ListPaymentInstrumentsResponsePayPal> getPayPal() {
    return payPal;
  }


  public void setPayPal(List<ListPaymentInstrumentsResponsePayPal> payPal) {
    this.payPal = payPal;
  }


  public ListPaymentInstrumentsResponse paymentAgreements(List<ListPaymentInstrumentsResponsePaymentAgreements> paymentAgreements) {
    
    this.paymentAgreements = paymentAgreements;
    return this;
  }

  public ListPaymentInstrumentsResponse addPaymentAgreementsItem(ListPaymentInstrumentsResponsePaymentAgreements paymentAgreementsItem) {
    this.paymentAgreements.add(paymentAgreementsItem);
    return this;
  }

   /**
   * Get paymentAgreements
   * @return paymentAgreements
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ListPaymentInstrumentsResponsePaymentAgreements> getPaymentAgreements() {
    return paymentAgreements;
  }


  public void setPaymentAgreements(List<ListPaymentInstrumentsResponsePaymentAgreements> paymentAgreements) {
    this.paymentAgreements = paymentAgreements;
  }


  public ListPaymentInstrumentsResponse androidPay(Object androidPay) {
    
    this.androidPay = androidPay;
    return this;
  }

   /**
   * Android Pay has been replaced by Google Pay. This property has been retained for backward compatibility and will always be null.
   * @return androidPay
  **/
  @ApiModelProperty(required = true, value = "Android Pay has been replaced by Google Pay. This property has been retained for backward compatibility and will always be null.")

  public Object getAndroidPay() {
    return androidPay;
  }


  public void setAndroidPay(Object androidPay) {
    this.androidPay = androidPay;
  }


  public ListPaymentInstrumentsResponse googlePay(ListPaymentInstrumentsResponseGooglePay googlePay) {
    
    this.googlePay = googlePay;
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  @ApiModelProperty(required = true, value = "")

  public ListPaymentInstrumentsResponseGooglePay getGooglePay() {
    return googlePay;
  }


  public void setGooglePay(ListPaymentInstrumentsResponseGooglePay googlePay) {
    this.googlePay = googlePay;
  }


  public ListPaymentInstrumentsResponse applePay(ListPaymentInstrumentsResponseApplePay applePay) {
    
    this.applePay = applePay;
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  @ApiModelProperty(required = true, value = "")

  public ListPaymentInstrumentsResponseApplePay getApplePay() {
    return applePay;
  }


  public void setApplePay(ListPaymentInstrumentsResponseApplePay applePay) {
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
    ListPaymentInstrumentsResponse listPaymentInstrumentsResponse = (ListPaymentInstrumentsResponse) o;
    return Objects.equals(this.creditCards, listPaymentInstrumentsResponse.creditCards) &&
        Objects.equals(this.giftCards, listPaymentInstrumentsResponse.giftCards) &&
        Objects.equals(this.payPal, listPaymentInstrumentsResponse.payPal) &&
        Objects.equals(this.paymentAgreements, listPaymentInstrumentsResponse.paymentAgreements) &&
        Objects.equals(this.androidPay, listPaymentInstrumentsResponse.androidPay) &&
        Objects.equals(this.googlePay, listPaymentInstrumentsResponse.googlePay) &&
        Objects.equals(this.applePay, listPaymentInstrumentsResponse.applePay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCards, giftCards, payPal, paymentAgreements, androidPay, googlePay, applePay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaymentInstrumentsResponse {\n");
    sb.append("    creditCards: ").append(toIndentedString(creditCards)).append("\n");
    sb.append("    giftCards: ").append(toIndentedString(giftCards)).append("\n");
    sb.append("    payPal: ").append(toIndentedString(payPal)).append("\n");
    sb.append("    paymentAgreements: ").append(toIndentedString(paymentAgreements)).append("\n");
    sb.append("    androidPay: ").append(toIndentedString(androidPay)).append("\n");
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

