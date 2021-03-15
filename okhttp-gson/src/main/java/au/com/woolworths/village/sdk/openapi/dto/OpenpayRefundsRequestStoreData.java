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
 * OpenpayRefundsRequestStoreData
 */

public class OpenpayRefundsRequestStoreData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;


  public OpenpayRefundsRequestStoreData storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The refund transaction store id.
   * @return storeId
  **/
  @ApiModelProperty(example = "4952110", required = true, value = "The refund transaction store id.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenpayRefundsRequestStoreData openpayRefundsRequestStoreData = (OpenpayRefundsRequestStoreData) o;
    return Objects.equals(this.storeId, openpayRefundsRequestStoreData.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenpayRefundsRequestStoreData {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

