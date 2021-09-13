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

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON response structure of the Giftcards Balance endpoint.
 */
@ApiModel(description = "The JSON response structure of the Giftcards Balance endpoint.")

public class GiftcardsBalanceResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GIFT_CARD_BALANCES = "giftCardBalances";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_BALANCES)
  private List<GiftcardsBalanceResponseGiftCardBalances> giftCardBalances = null;


  public GiftcardsBalanceResponse giftCardBalances(List<GiftcardsBalanceResponseGiftCardBalances> giftCardBalances) {
    
    this.giftCardBalances = giftCardBalances;
    return this;
  }

  public GiftcardsBalanceResponse addGiftCardBalancesItem(GiftcardsBalanceResponseGiftCardBalances giftCardBalancesItem) {
    if (this.giftCardBalances == null) {
      this.giftCardBalances = new ArrayList<GiftcardsBalanceResponseGiftCardBalances>();
    }
    this.giftCardBalances.add(giftCardBalancesItem);
    return this;
  }

   /**
   * Get giftCardBalances
   * @return giftCardBalances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GiftcardsBalanceResponseGiftCardBalances> getGiftCardBalances() {
    return giftCardBalances;
  }


  public void setGiftCardBalances(List<GiftcardsBalanceResponseGiftCardBalances> giftCardBalances) {
    this.giftCardBalances = giftCardBalances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftcardsBalanceResponse giftcardsBalanceResponse = (GiftcardsBalanceResponse) o;
    return Objects.equals(this.giftCardBalances, giftcardsBalanceResponse.giftCardBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCardBalances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftcardsBalanceResponse {\n");
    sb.append("    giftCardBalances: ").append(toIndentedString(giftCardBalances)).append("\n");
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

