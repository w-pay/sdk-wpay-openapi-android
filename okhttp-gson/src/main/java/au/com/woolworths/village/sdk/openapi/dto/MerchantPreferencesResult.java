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

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * MerchantPreferencesResult
 */

public class MerchantPreferencesResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Meta meta = new Meta();


  public MerchantPreferencesResult data(Map<String, Map<String, String>> data) {
    
    this.data = data;
    return this;
  }

  public MerchantPreferencesResult putDataItem(String key, Map<String, String> dataItem) {
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * A set of groups of key/value based preferences
   * @return data
  **/
  @ApiModelProperty(required = true, value = "A set of groups of key/value based preferences")

  public Map<String, Map<String, String>> getData() {
    return data;
  }


  public void setData(Map<String, Map<String, String>> data) {
    this.data = data;
  }


  public MerchantPreferencesResult meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantPreferencesResult merchantPreferencesResult = (MerchantPreferencesResult) o;
    return Objects.equals(this.data, merchantPreferencesResult.data) &&
        Objects.equals(this.meta, merchantPreferencesResult.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantPreferencesResult {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

