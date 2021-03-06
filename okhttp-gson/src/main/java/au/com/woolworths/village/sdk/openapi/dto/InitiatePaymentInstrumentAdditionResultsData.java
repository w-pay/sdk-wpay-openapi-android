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
 * Mandatory data object containing response
 */
@ApiModel(description = "Mandatory data object containing response")

public class InitiatePaymentInstrumentAdditionResultsData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARD_CAPTURE_U_R_L = "cardCaptureURL";
  @SerializedName(SERIALIZED_NAME_CARD_CAPTURE_U_R_L)
  private String cardCaptureURL;

  public static final String SERIALIZED_NAME_TRANSACTION_REF = "transactionRef";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REF)
  private String transactionRef;


  public InitiatePaymentInstrumentAdditionResultsData cardCaptureURL(String cardCaptureURL) {
    
    this.cardCaptureURL = cardCaptureURL;
    return this;
  }

   /**
   * The URL of an iframe. This iframe is used to capture a credit card number, expiry and CVV
   * @return cardCaptureURL
  **/
  @ApiModelProperty(required = true, value = "The URL of an iframe. This iframe is used to capture a credit card number, expiry and CVV")

  public String getCardCaptureURL() {
    return cardCaptureURL;
  }


  public void setCardCaptureURL(String cardCaptureURL) {
    this.cardCaptureURL = cardCaptureURL;
  }


  public InitiatePaymentInstrumentAdditionResultsData transactionRef(String transactionRef) {
    
    this.transactionRef = transactionRef;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the transaction in the container
   * @return transactionRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container reference in the transaction logs. This number uniquely identifies the transaction in the container")

  public String getTransactionRef() {
    return transactionRef;
  }


  public void setTransactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentInstrumentAdditionResultsData initiatePaymentInstrumentAdditionResultsData = (InitiatePaymentInstrumentAdditionResultsData) o;
    return Objects.equals(this.cardCaptureURL, initiatePaymentInstrumentAdditionResultsData.cardCaptureURL) &&
        Objects.equals(this.transactionRef, initiatePaymentInstrumentAdditionResultsData.transactionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardCaptureURL, transactionRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentInstrumentAdditionResultsData {\n");
    sb.append("    cardCaptureURL: ").append(toIndentedString(cardCaptureURL)).append("\n");
    sb.append("    transactionRef: ").append(toIndentedString(transactionRef)).append("\n");
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

