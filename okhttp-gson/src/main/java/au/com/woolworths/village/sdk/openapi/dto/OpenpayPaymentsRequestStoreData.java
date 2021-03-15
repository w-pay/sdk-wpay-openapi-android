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

import io.swagger.annotations.ApiModelProperty;

/**
 * OpenpayPaymentsRequestStoreData
 */

public class OpenpayPaymentsRequestStoreData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_PIN = "pin";
  @SerializedName(SERIALIZED_NAME_PIN)
  private String pin;


  public OpenpayPaymentsRequestStoreData storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The payment transaction store id.
   * @return storeId
  **/
  @ApiModelProperty(example = "4952110", required = true, value = "The payment transaction store id.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public OpenpayPaymentsRequestStoreData pin(String pin) {
    
    this.pin = pin;
    return this;
  }

   /**
   * A pin for the payment method id.
   * @return pin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "A pin for the payment method id.")

  public String getPin() {
    return pin;
  }


  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenpayPaymentsRequestStoreData openpayPaymentsRequestStoreData = (OpenpayPaymentsRequestStoreData) o;
    return Objects.equals(this.storeId, openpayPaymentsRequestStoreData.storeId) &&
        Objects.equals(this.pin, openpayPaymentsRequestStoreData.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, pin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayPaymentsRequestStoreData {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

