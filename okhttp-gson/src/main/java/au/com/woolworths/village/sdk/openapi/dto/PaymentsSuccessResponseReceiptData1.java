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
 * This object is only included in the response if it is enabled in the consumers API configuration.
 */
@ApiModel(description = "This object is only included in the response if it is enabled in the consumers API configuration.")

public class PaymentsSuccessResponseReceiptData1 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARD_SUFFIX = "cardSuffix";
  @SerializedName(SERIALIZED_NAME_CARD_SUFFIX)
  private String cardSuffix;


  public PaymentsSuccessResponseReceiptData1 cardSuffix(String cardSuffix) {
    
    this.cardSuffix = cardSuffix;
    return this;
  }

   /**
   * The suffix (last 4 digits) of the gift card number used in the WEX transaction.
   * @return cardSuffix
  **/
  @ApiModelProperty(example = "2517", required = true, value = "The suffix (last 4 digits) of the gift card number used in the WEX transaction.")

  public String getCardSuffix() {
    return cardSuffix;
  }


  public void setCardSuffix(String cardSuffix) {
    this.cardSuffix = cardSuffix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsSuccessResponseReceiptData1 paymentsSuccessResponseReceiptData1 = (PaymentsSuccessResponseReceiptData1) o;
    return Objects.equals(this.cardSuffix, paymentsSuccessResponseReceiptData1.cardSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardSuffix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsSuccessResponseReceiptData1 {\n");
    sb.append("    cardSuffix: ").append(toIndentedString(cardSuffix)).append("\n");
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

