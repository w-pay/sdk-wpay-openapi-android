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
 * The JSON request structure of the List Payment Instruments endpoint.
 */
@ApiModel(description = "The JSON request structure of the List Payment Instruments endpoint.")

public class ListPaymentInstrumentsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_SHOPPER_ID = "shopperId";
  @SerializedName(SERIALIZED_NAME_SHOPPER_ID)
  private String shopperId;


  public ListPaymentInstrumentsRequest uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * The IDM (Gigya) UID or merchant shopper id of the user. Do NOT use an email address!
   * @return uid
  **/
  @ApiModelProperty(example = "61ea4c7310df484d91e15cd6ad883ccb", required = true, value = "The IDM (Gigya) UID or merchant shopper id of the user. Do NOT use an email address!")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public ListPaymentInstrumentsRequest shopperId(String shopperId) {
    
    this.shopperId = shopperId;
    return this;
  }

   /**
   * The merchant shopper id of the user.
   * @return shopperId
  **/
  @ApiModelProperty(example = "12345", required = true, value = "The merchant shopper id of the user.")

  public String getShopperId() {
    return shopperId;
  }


  public void setShopperId(String shopperId) {
    this.shopperId = shopperId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPaymentInstrumentsRequest listPaymentInstrumentsRequest = (ListPaymentInstrumentsRequest) o;
    return Objects.equals(this.uid, listPaymentInstrumentsRequest.uid) &&
        Objects.equals(this.shopperId, listPaymentInstrumentsRequest.shopperId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, shopperId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaymentInstrumentsRequest {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    shopperId: ").append(toIndentedString(shopperId)).append("\n");
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

