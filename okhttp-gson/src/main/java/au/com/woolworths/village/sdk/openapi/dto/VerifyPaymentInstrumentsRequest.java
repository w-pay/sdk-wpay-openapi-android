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
import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsRequestFraudPayload;
import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsRequestPaymentInstruments;
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
 * The JSON request structure of the Verify Payment Instruments endpoint.
 */
@ApiModel(description = "The JSON request structure of the Verify Payment Instruments endpoint.")

public class VerifyPaymentInstrumentsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENTS = "paymentInstruments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENTS)
  private List<VerifyPaymentInstrumentsRequestPaymentInstruments> paymentInstruments = new ArrayList<VerifyPaymentInstrumentsRequestPaymentInstruments>();

  public static final String SERIALIZED_NAME_FRAUD_PAYLOAD = "fraudPayload";
  @SerializedName(SERIALIZED_NAME_FRAUD_PAYLOAD)
  private VerifyPaymentInstrumentsRequestFraudPayload fraudPayload;


  public VerifyPaymentInstrumentsRequest clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.
   * @return clientReference
  **/
  @ApiModelProperty(example = "T5ESYRPWJKPHF54", required = true, value = "A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public VerifyPaymentInstrumentsRequest paymentInstruments(List<VerifyPaymentInstrumentsRequestPaymentInstruments> paymentInstruments) {
    
    this.paymentInstruments = paymentInstruments;
    return this;
  }

  public VerifyPaymentInstrumentsRequest addPaymentInstrumentsItem(VerifyPaymentInstrumentsRequestPaymentInstruments paymentInstrumentsItem) {
    this.paymentInstruments.add(paymentInstrumentsItem);
    return this;
  }

   /**
   * Get paymentInstruments
   * @return paymentInstruments
  **/
  @ApiModelProperty(required = true, value = "")

  public List<VerifyPaymentInstrumentsRequestPaymentInstruments> getPaymentInstruments() {
    return paymentInstruments;
  }


  public void setPaymentInstruments(List<VerifyPaymentInstrumentsRequestPaymentInstruments> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  public VerifyPaymentInstrumentsRequest fraudPayload(VerifyPaymentInstrumentsRequestFraudPayload fraudPayload) {
    
    this.fraudPayload = fraudPayload;
    return this;
  }

   /**
   * Get fraudPayload
   * @return fraudPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VerifyPaymentInstrumentsRequestFraudPayload getFraudPayload() {
    return fraudPayload;
  }


  public void setFraudPayload(VerifyPaymentInstrumentsRequestFraudPayload fraudPayload) {
    this.fraudPayload = fraudPayload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyPaymentInstrumentsRequest verifyPaymentInstrumentsRequest = (VerifyPaymentInstrumentsRequest) o;
    return Objects.equals(this.clientReference, verifyPaymentInstrumentsRequest.clientReference) &&
        Objects.equals(this.paymentInstruments, verifyPaymentInstrumentsRequest.paymentInstruments) &&
        Objects.equals(this.fraudPayload, verifyPaymentInstrumentsRequest.fraudPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReference, paymentInstruments, fraudPayload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPaymentInstrumentsRequest {\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
    sb.append("    fraudPayload: ").append(toIndentedString(fraudPayload)).append("\n");
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

