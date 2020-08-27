/*
 * Village Wallet
 * APIs for Village Wallet
 *
 * The version of the OpenAPI document: 0.0.6
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

import io.swagger.annotations.ApiModelProperty;

/**
 * MerchantPaymentDetailAllOf
 */

public class MerchantPaymentDetailAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BASKET = "basket";
  @SerializedName(SERIALIZED_NAME_BASKET)
  private Basket basket;

  public static final String SERIALIZED_NAME_POS_PAYLOAD = "posPayload";
  @SerializedName(SERIALIZED_NAME_POS_PAYLOAD)
  private PosPayload posPayload;

  public static final String SERIALIZED_NAME_MERCHANT_PAYLOAD = "merchantPayload";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PAYLOAD)
  private MerchantPayload merchantPayload;


  public MerchantPaymentDetailAllOf basket(Basket basket) {
    
    this.basket = basket;
    return this;
  }

   /**
   * Get basket
   * @return basket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Basket getBasket() {
    return basket;
  }


  public void setBasket(Basket basket) {
    this.basket = basket;
  }


  public MerchantPaymentDetailAllOf posPayload(PosPayload posPayload) {
    
    this.posPayload = posPayload;
    return this;
  }

   /**
   * Get posPayload
   * @return posPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PosPayload getPosPayload() {
    return posPayload;
  }


  public void setPosPayload(PosPayload posPayload) {
    this.posPayload = posPayload;
  }


  public MerchantPaymentDetailAllOf merchantPayload(MerchantPayload merchantPayload) {
    
    this.merchantPayload = merchantPayload;
    return this;
  }

   /**
   * Get merchantPayload
   * @return merchantPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantPayload getMerchantPayload() {
    return merchantPayload;
  }


  public void setMerchantPayload(MerchantPayload merchantPayload) {
    this.merchantPayload = merchantPayload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantPaymentDetailAllOf merchantPaymentDetailAllOf = (MerchantPaymentDetailAllOf) o;
    return Objects.equals(this.basket, merchantPaymentDetailAllOf.basket) &&
        Objects.equals(this.posPayload, merchantPaymentDetailAllOf.posPayload) &&
        Objects.equals(this.merchantPayload, merchantPaymentDetailAllOf.merchantPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basket, posPayload, merchantPayload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantPaymentDetailAllOf {\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    posPayload: ").append(toIndentedString(posPayload)).append("\n");
    sb.append("    merchantPayload: ").append(toIndentedString(merchantPayload)).append("\n");
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

