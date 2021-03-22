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
import au.com.woolworths.village.sdk.openapi.dto.GiftcardsBalanceRequestGiftCardInstruments;
import au.com.woolworths.village.sdk.openapi.dto.GiftcardsBalanceRequestGiftCards;
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
 * The JSON request structure of the Giftcards Balance endpoint.
 */
@ApiModel(description = "The JSON request structure of the Giftcards Balance endpoint.")

public class GiftcardsBalanceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GIFT_CARDS = "giftCards";
  @SerializedName(SERIALIZED_NAME_GIFT_CARDS)
  private List<GiftcardsBalanceRequestGiftCards> giftCards = null;

  public static final String SERIALIZED_NAME_GIFT_CARD_INSTRUMENTS = "giftCardInstruments";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_INSTRUMENTS)
  private List<GiftcardsBalanceRequestGiftCardInstruments> giftCardInstruments = null;


  public GiftcardsBalanceRequest giftCards(List<GiftcardsBalanceRequestGiftCards> giftCards) {
    
    this.giftCards = giftCards;
    return this;
  }

  public GiftcardsBalanceRequest addGiftCardsItem(GiftcardsBalanceRequestGiftCards giftCardsItem) {
    if (this.giftCards == null) {
      this.giftCards = new ArrayList<GiftcardsBalanceRequestGiftCards>();
    }
    this.giftCards.add(giftCardsItem);
    return this;
  }

   /**
   * Use this array if the endpoint is being called with \&quot;cardNumber\&quot; and \&quot;pinCode\&quot; request properties.
   * @return giftCards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use this array if the endpoint is being called with \"cardNumber\" and \"pinCode\" request properties.")

  public List<GiftcardsBalanceRequestGiftCards> getGiftCards() {
    return giftCards;
  }


  public void setGiftCards(List<GiftcardsBalanceRequestGiftCards> giftCards) {
    this.giftCards = giftCards;
  }


  public GiftcardsBalanceRequest giftCardInstruments(List<GiftcardsBalanceRequestGiftCardInstruments> giftCardInstruments) {
    
    this.giftCardInstruments = giftCardInstruments;
    return this;
  }

  public GiftcardsBalanceRequest addGiftCardInstrumentsItem(GiftcardsBalanceRequestGiftCardInstruments giftCardInstrumentsItem) {
    if (this.giftCardInstruments == null) {
      this.giftCardInstruments = new ArrayList<GiftcardsBalanceRequestGiftCardInstruments>();
    }
    this.giftCardInstruments.add(giftCardInstrumentsItem);
    return this;
  }

   /**
   * Use this array if the endpoint is being called with \&quot;paymentInstrumentId\&quot; request properties.
   * @return giftCardInstruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use this array if the endpoint is being called with \"paymentInstrumentId\" request properties.")

  public List<GiftcardsBalanceRequestGiftCardInstruments> getGiftCardInstruments() {
    return giftCardInstruments;
  }


  public void setGiftCardInstruments(List<GiftcardsBalanceRequestGiftCardInstruments> giftCardInstruments) {
    this.giftCardInstruments = giftCardInstruments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftcardsBalanceRequest giftcardsBalanceRequest = (GiftcardsBalanceRequest) o;
    return Objects.equals(this.giftCards, giftcardsBalanceRequest.giftCards) &&
        Objects.equals(this.giftCardInstruments, giftcardsBalanceRequest.giftCardInstruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCards, giftCardInstruments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftcardsBalanceRequest {\n");
    sb.append("    giftCards: ").append(toIndentedString(giftCards)).append("\n");
    sb.append("    giftCardInstruments: ").append(toIndentedString(giftCardInstruments)).append("\n");
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

