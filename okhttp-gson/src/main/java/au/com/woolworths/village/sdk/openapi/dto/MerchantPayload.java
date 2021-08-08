/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.5
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * Payload provided by the merchant to support other types of messaging.  This payload originates in the payment request and is carried with any resulting transactions.  Provided in a generic schema previous configured by the merchant
 */
@ApiModel(description = "Payload provided by the merchant to support other types of messaging.  This payload originates in the payment request and is carried with any resulting transactions.  Provided in a generic schema previous configured by the merchant")

public class MerchantPayload implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schemaId";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private Map<String, Object> payload = null;


  public MerchantPayload schemaId(String schemaId) {
    
    this.schemaId = schemaId;
    return this;
  }

   /**
   * The ID of the previously configured schema that will be used to validate the contents of the payload
   * @return schemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the previously configured schema that will be used to validate the contents of the payload")

  public String getSchemaId() {
    return schemaId;
  }


  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public MerchantPayload payload(Map<String, Object> payload) {
    
    this.payload = payload;
    return this;
  }

  public MerchantPayload putPayloadItem(String key, Object payloadItem) {
    if (this.payload == null) {
      this.payload = new HashMap<String, Object>();
    }
    this.payload.put(key, payloadItem);
    return this;
  }

   /**
   * The ID of the previously configured schema that will be used to validate the contents of the payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the previously configured schema that will be used to validate the contents of the payload")

  public Map<String, Object> getPayload() {
    return payload;
  }


  public void setPayload(Map<String, Object> payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantPayload merchantPayload = (MerchantPayload) o;
    return Objects.equals(this.schemaId, merchantPayload.schemaId) &&
        Objects.equals(this.payload, merchantPayload.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantPayload {\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

