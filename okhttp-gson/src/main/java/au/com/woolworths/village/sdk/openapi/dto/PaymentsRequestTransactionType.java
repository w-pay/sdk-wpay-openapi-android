/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRequestTransactionTypeApplePay;
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRequestTransactionTypeGooglePay;
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
 * PaymentsRequestTransactionType
 */

public class PaymentsRequestTransactionType implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The container transaction type to use for credit card instruments. This property is only required if the payments request contains credit card instruments.
   */
  @JsonAdapter(CreditCardEnum.Adapter.class)
  public enum CreditCardEnum {
    PREAUTH("PREAUTH"),
    
    PURCHASE("PURCHASE");

    private String value;

    CreditCardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreditCardEnum fromValue(String value) {
      for (CreditCardEnum b : CreditCardEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CreditCardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreditCardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreditCardEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CreditCardEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CREDIT_CARD = "creditCard";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARD)
  private CreditCardEnum creditCard;

  /**
   * The container transaction type to use for gift card instruments. This property is only required if the payments request contains gift card instruments.
   */
  @JsonAdapter(GiftCardEnum.Adapter.class)
  public enum GiftCardEnum {
    PREAUTH("PREAUTH"),
    
    PURCHASE("PURCHASE");

    private String value;

    GiftCardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GiftCardEnum fromValue(String value) {
      for (GiftCardEnum b : GiftCardEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GiftCardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GiftCardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GiftCardEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GiftCardEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GIFT_CARD = "giftCard";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD)
  private GiftCardEnum giftCard;

  /**
   * The container transaction type to use for paypal instruments. This property is only required if the payments request contains paypal instruments. Only PURCHASE is currently supported for paypal instruments.
   */
  @JsonAdapter(PayPalEnum.Adapter.class)
  public enum PayPalEnum {
    PURCHASE("PURCHASE");

    private String value;

    PayPalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayPalEnum fromValue(String value) {
      for (PayPalEnum b : PayPalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayPalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayPalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayPalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayPalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAY_PAL = "payPal";
  @SerializedName(SERIALIZED_NAME_PAY_PAL)
  private PayPalEnum payPal;

  public static final String SERIALIZED_NAME_GOOGLE_PAY = "googlePay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PAY)
  private PaymentsRequestTransactionTypeGooglePay googlePay;

  public static final String SERIALIZED_NAME_APPLE_PAY = "applePay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private PaymentsRequestTransactionTypeApplePay applePay;


  public PaymentsRequestTransactionType creditCard(CreditCardEnum creditCard) {
    
    this.creditCard = creditCard;
    return this;
  }

   /**
   * The container transaction type to use for credit card instruments. This property is only required if the payments request contains credit card instruments.
   * @return creditCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The container transaction type to use for credit card instruments. This property is only required if the payments request contains credit card instruments.")

  public CreditCardEnum getCreditCard() {
    return creditCard;
  }


  public void setCreditCard(CreditCardEnum creditCard) {
    this.creditCard = creditCard;
  }


  public PaymentsRequestTransactionType giftCard(GiftCardEnum giftCard) {
    
    this.giftCard = giftCard;
    return this;
  }

   /**
   * The container transaction type to use for gift card instruments. This property is only required if the payments request contains gift card instruments.
   * @return giftCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The container transaction type to use for gift card instruments. This property is only required if the payments request contains gift card instruments.")

  public GiftCardEnum getGiftCard() {
    return giftCard;
  }


  public void setGiftCard(GiftCardEnum giftCard) {
    this.giftCard = giftCard;
  }


  public PaymentsRequestTransactionType payPal(PayPalEnum payPal) {
    
    this.payPal = payPal;
    return this;
  }

   /**
   * The container transaction type to use for paypal instruments. This property is only required if the payments request contains paypal instruments. Only PURCHASE is currently supported for paypal instruments.
   * @return payPal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The container transaction type to use for paypal instruments. This property is only required if the payments request contains paypal instruments. Only PURCHASE is currently supported for paypal instruments.")

  public PayPalEnum getPayPal() {
    return payPal;
  }


  public void setPayPal(PayPalEnum payPal) {
    this.payPal = payPal;
  }


  public PaymentsRequestTransactionType googlePay(PaymentsRequestTransactionTypeGooglePay googlePay) {
    
    this.googlePay = googlePay;
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsRequestTransactionTypeGooglePay getGooglePay() {
    return googlePay;
  }


  public void setGooglePay(PaymentsRequestTransactionTypeGooglePay googlePay) {
    this.googlePay = googlePay;
  }


  public PaymentsRequestTransactionType applePay(PaymentsRequestTransactionTypeApplePay applePay) {
    
    this.applePay = applePay;
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsRequestTransactionTypeApplePay getApplePay() {
    return applePay;
  }


  public void setApplePay(PaymentsRequestTransactionTypeApplePay applePay) {
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
    PaymentsRequestTransactionType paymentsRequestTransactionType = (PaymentsRequestTransactionType) o;
    return Objects.equals(this.creditCard, paymentsRequestTransactionType.creditCard) &&
        Objects.equals(this.giftCard, paymentsRequestTransactionType.giftCard) &&
        Objects.equals(this.payPal, paymentsRequestTransactionType.payPal) &&
        Objects.equals(this.googlePay, paymentsRequestTransactionType.googlePay) &&
        Objects.equals(this.applePay, paymentsRequestTransactionType.applePay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCard, giftCard, payPal, googlePay, applePay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRequestTransactionType {\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
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

