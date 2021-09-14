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

public class PaymentsSuccessResponseReceiptData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARD_SUFFIX = "cardSuffix";
  @SerializedName(SERIALIZED_NAME_CARD_SUFFIX)
  private String cardSuffix;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_EXPIRY_MONTH = "expiryMonth";
  @SerializedName(SERIALIZED_NAME_EXPIRY_MONTH)
  private String expiryMonth;

  public static final String SERIALIZED_NAME_EXPIRY_YEAR = "expiryYear";
  @SerializedName(SERIALIZED_NAME_EXPIRY_YEAR)
  private String expiryYear;


  public PaymentsSuccessResponseReceiptData cardSuffix(String cardSuffix) {
    
    this.cardSuffix = cardSuffix;
    return this;
  }

   /**
   * The suffix (last 4 digits) of the credit card number used in the WebPay transaction.
   * @return cardSuffix
  **/
  @ApiModelProperty(example = "6106", required = true, value = "The suffix (last 4 digits) of the credit card number used in the WebPay transaction.")

  public String getCardSuffix() {
    return cardSuffix;
  }


  public void setCardSuffix(String cardSuffix) {
    this.cardSuffix = cardSuffix;
  }


  public PaymentsSuccessResponseReceiptData scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * The credit card scheme.
   * @return scheme
  **/
  @ApiModelProperty(example = "MASTERCARD", required = true, value = "The credit card scheme.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public PaymentsSuccessResponseReceiptData expiryMonth(String expiryMonth) {
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The month of the expiry date of the credit card.
   * @return expiryMonth
  **/
  @ApiModelProperty(example = "05", required = true, value = "The month of the expiry date of the credit card.")

  public String getExpiryMonth() {
    return expiryMonth;
  }


  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public PaymentsSuccessResponseReceiptData expiryYear(String expiryYear) {
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The year of the expiry date of the credit card.
   * @return expiryYear
  **/
  @ApiModelProperty(example = "21", required = true, value = "The year of the expiry date of the credit card.")

  public String getExpiryYear() {
    return expiryYear;
  }


  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsSuccessResponseReceiptData paymentsSuccessResponseReceiptData = (PaymentsSuccessResponseReceiptData) o;
    return Objects.equals(this.cardSuffix, paymentsSuccessResponseReceiptData.cardSuffix) &&
        Objects.equals(this.scheme, paymentsSuccessResponseReceiptData.scheme) &&
        Objects.equals(this.expiryMonth, paymentsSuccessResponseReceiptData.expiryMonth) &&
        Objects.equals(this.expiryYear, paymentsSuccessResponseReceiptData.expiryYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardSuffix, scheme, expiryMonth, expiryYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsSuccessResponseReceiptData {\n");
    sb.append("    cardSuffix: ").append(toIndentedString(cardSuffix)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
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

