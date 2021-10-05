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
import au.com.woolworths.village.sdk.openapi.dto.GuestTokenizeGiftcardResponseGiftCard;
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
 * The JSON response structure of the Guest Tokenize Giftcard endpoint.
 */
@ApiModel(description = "The JSON response structure of the Guest Tokenize Giftcard endpoint.")

public class GuestTokenizeGiftcardResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GIFT_CARD = "giftCard";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD)
  private GuestTokenizeGiftcardResponseGiftCard giftCard;

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


  public GuestTokenizeGiftcardResponse giftCard(GuestTokenizeGiftcardResponseGiftCard giftCard) {
    
    this.giftCard = giftCard;
    return this;
  }

   /**
   * Get giftCard
   * @return giftCard
  **/
  @ApiModelProperty(required = true, value = "")

  public GuestTokenizeGiftcardResponseGiftCard getGiftCard() {
    return giftCard;
  }


  public void setGiftCard(GuestTokenizeGiftcardResponseGiftCard giftCard) {
    this.giftCard = giftCard;
  }


  public GuestTokenizeGiftcardResponse balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The current available balance of the gift card.
   * @return balance
  **/
  @ApiModelProperty(example = "333.4", required = true, value = "The current available balance of the gift card.")

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public GuestTokenizeGiftcardResponse expiryDay(String expiryDay) {
    
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


  public GuestTokenizeGiftcardResponse expiryMonth(String expiryMonth) {
    
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


  public GuestTokenizeGiftcardResponse expiryYear(String expiryYear) {
    
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


  public GuestTokenizeGiftcardResponse expired(Boolean expired) {
    
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
    GuestTokenizeGiftcardResponse guestTokenizeGiftcardResponse = (GuestTokenizeGiftcardResponse) o;
    return Objects.equals(this.giftCard, guestTokenizeGiftcardResponse.giftCard) &&
        Objects.equals(this.balance, guestTokenizeGiftcardResponse.balance) &&
        Objects.equals(this.expiryDay, guestTokenizeGiftcardResponse.expiryDay) &&
        Objects.equals(this.expiryMonth, guestTokenizeGiftcardResponse.expiryMonth) &&
        Objects.equals(this.expiryYear, guestTokenizeGiftcardResponse.expiryYear) &&
        Objects.equals(this.expired, guestTokenizeGiftcardResponse.expired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCard, balance, expiryDay, expiryMonth, expiryYear, expired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestTokenizeGiftcardResponse {\n");
    sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
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

