/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import com.google.gson.annotations.SerializedName;

import org.threeten.bp.OffsetDateTime;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * MerchantSchemaSummary
 */

public class MerchantSchemaSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schemaId";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;


  public MerchantSchemaSummary schemaId(String schemaId) {
    
    this.schemaId = schemaId;
    return this;
  }

   /**
   * The unique ID assigned to the newly created schema
   * @return schemaId
  **/
  @ApiModelProperty(required = true, value = "The unique ID assigned to the newly created schema")

  public String getSchemaId() {
    return schemaId;
  }


  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public MerchantSchemaSummary type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the schema e.g. pos, merchant
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the schema e.g. pos, merchant")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MerchantSchemaSummary description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description for the schema
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for the schema")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public MerchantSchemaSummary created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The ISO date/time when the schema was created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-06T19:38:09.890+11:00", value = "The ISO date/time when the schema was created")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantSchemaSummary merchantSchemaSummary = (MerchantSchemaSummary) o;
    return Objects.equals(this.schemaId, merchantSchemaSummary.schemaId) &&
        Objects.equals(this.type, merchantSchemaSummary.type) &&
        Objects.equals(this.description, merchantSchemaSummary.description) &&
        Objects.equals(this.created, merchantSchemaSummary.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId, type, description, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantSchemaSummary {\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

