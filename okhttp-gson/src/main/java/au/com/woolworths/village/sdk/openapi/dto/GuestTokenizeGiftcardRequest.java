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

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON request structure of the Guest Tokenize Giftcard endpoint.
 */
@ApiModel(description = "The JSON request structure of the Guest Tokenize Giftcard endpoint.")

public class GuestTokenizeGiftcardRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_PIN_CODE = "pinCode";
  @SerializedName(SERIALIZED_NAME_PIN_CODE)
  private String pinCode;


  public GuestTokenizeGiftcardRequest cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * The gift card number.
   * @return cardNumber
  **/
  @ApiModelProperty(example = "6280003090920742517", required = true, value = "The gift card number.")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public GuestTokenizeGiftcardRequest pinCode(String pinCode) {
    
    this.pinCode = pinCode;
    return this;
  }

   /**
   * The gift card pin code.
   * @return pinCode
  **/
  @ApiModelProperty(example = "3196", required = true, value = "The gift card pin code.")

  public String getPinCode() {
    return pinCode;
  }


  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestTokenizeGiftcardRequest guestTokenizeGiftcardRequest = (GuestTokenizeGiftcardRequest) o;
    return Objects.equals(this.cardNumber, guestTokenizeGiftcardRequest.cardNumber) &&
        Objects.equals(this.pinCode, guestTokenizeGiftcardRequest.pinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, pinCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestTokenizeGiftcardRequest {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
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

