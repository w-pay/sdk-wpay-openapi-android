/*
 * Village Wallet
 * APIs for Village Wallet
 *
 * The version of the OpenAPI document: 0.0.5
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
 * CreatePaymentRequestResults
 */

public class CreatePaymentRequestResults implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private CreatePaymentRequestResultsData data;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, Object> meta = new HashMap<String, Object>();


  public CreatePaymentRequestResults data(CreatePaymentRequestResultsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")

  public CreatePaymentRequestResultsData getData() {
    return data;
  }


  public void setData(CreatePaymentRequestResultsData data) {
    this.data = data;
  }


  public CreatePaymentRequestResults meta(Map<String, Object> meta) {
    
    this.meta = meta;
    return this;
  }

  public CreatePaymentRequestResults putMetaItem(String key, Object metaItem) {
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Object to contain any metadata
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "Object to contain any metadata")

  public Map<String, Object> getMeta() {
    return meta;
  }


  public void setMeta(Map<String, Object> meta) {
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
    CreatePaymentRequestResults createPaymentRequestResults = (CreatePaymentRequestResults) o;
    return Objects.equals(this.data, createPaymentRequestResults.data) &&
        Objects.equals(this.meta, createPaymentRequestResults.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentRequestResults {\n");
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

