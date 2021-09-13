/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.6
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
 * GiftcardsBalanceResponseGiftCardBalances
 */

public class GiftcardsBalanceResponseGiftCardBalances implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_EXPIRY_DAY = "expiryDay";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DAY)
  private String expiryDay;

  public static final String SERIALIZED_NAME_EXPIRY_MONTH = "expiryMonth";
  @SerializedName(SERIALIZED_NAME_EXPIRY_MONTH)
  private String expiryMonth;

  public static final String SERIALIZED_NAME_EXPIRY_YEAR = "expiryYear";
  @SerializedName(SERIALIZED_NAME_EXPIRY_YEAR)
  private String expiryYear;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired;


  public GiftcardsBalanceResponseGiftCardBalances cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * The gift card number. This property will only be returned if the endpoint was called with the \&quot;cardNumber\&quot; and \&quot;pinCode\&quot; request properties.
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6280003090920742517", value = "The gift card number. This property will only be returned if the endpoint was called with the \"cardNumber\" and \"pinCode\" request properties.")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public GiftcardsBalanceResponseGiftCardBalances paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The gift card payment instrument id. This property will only be returned if the endpoint was called with the \&quot;paymentInstrumentId\&quot; request property.
   * @return paymentInstrumentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "81054", value = "The gift card payment instrument id. This property will only be returned if the endpoint was called with the \"paymentInstrumentId\" request property.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public GiftcardsBalanceResponseGiftCardBalances balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The current available balance of the gift card.
   * @return balance
  **/
  @ApiModelProperty(example = "333.38", required = true, value = "The current available balance of the gift card.")

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public GiftcardsBalanceResponseGiftCardBalances expiryDay(String expiryDay) {
    
    this.expiryDay = expiryDay;
    return this;
  }

   /**
   * The day of the expiry date of the gift card.
   * @return expiryDay
  **/
  @ApiModelProperty(example = "31", required = true, value = "The day of the expiry date of the gift card.")

  public String getExpiryDay() {
    return expiryDay;
  }


  public void setExpiryDay(String expiryDay) {
    this.expiryDay = expiryDay;
  }


  public GiftcardsBalanceResponseGiftCardBalances expiryMonth(String expiryMonth) {
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The month of the expiry date of the gift card.
   * @return expiryMonth
  **/
  @ApiModelProperty(example = "03", required = true, value = "The month of the expiry date of the gift card.")

  public String getExpiryMonth() {
    return expiryMonth;
  }


  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public GiftcardsBalanceResponseGiftCardBalances expiryYear(String expiryYear) {
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The year of the expiry date of the gift card.
   * @return expiryYear
  **/
  @ApiModelProperty(example = "2018", required = true, value = "The year of the expiry date of the gift card.")

  public String getExpiryYear() {
    return expiryYear;
  }


  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public GiftcardsBalanceResponseGiftCardBalances expired(Boolean expired) {
    
    this.expired = expired;
    return this;
  }

   /**
   * A flag to indicate if the gift card is expired.
   * @return expired
  **/
  @ApiModelProperty(example = "true", required = true, value = "A flag to indicate if the gift card is expired.")

  public Boolean getExpired() {
    return expired;
  }


  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftcardsBalanceResponseGiftCardBalances giftcardsBalanceResponseGiftCardBalances = (GiftcardsBalanceResponseGiftCardBalances) o;
    return Objects.equals(this.cardNumber, giftcardsBalanceResponseGiftCardBalances.cardNumber) &&
        Objects.equals(this.paymentInstrumentId, giftcardsBalanceResponseGiftCardBalances.paymentInstrumentId) &&
        Objects.equals(this.balance, giftcardsBalanceResponseGiftCardBalances.balance) &&
        Objects.equals(this.expiryDay, giftcardsBalanceResponseGiftCardBalances.expiryDay) &&
        Objects.equals(this.expiryMonth, giftcardsBalanceResponseGiftCardBalances.expiryMonth) &&
        Objects.equals(this.expiryYear, giftcardsBalanceResponseGiftCardBalances.expiryYear) &&
        Objects.equals(this.expired, giftcardsBalanceResponseGiftCardBalances.expired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, paymentInstrumentId, balance, expiryDay, expiryMonth, expiryYear, expired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftcardsBalanceResponseGiftCardBalances {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    expiryDay: ").append(toIndentedString(expiryDay)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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

