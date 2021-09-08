/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.6
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
 * Mandatory data object containing request
 */
@ApiModel(description = "Mandatory data object containing request")

public class InstoreCustomerTermsandconditionsAcceptanceData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public InstoreCustomerTermsandconditionsAcceptanceData type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of Ts and Cs that the shopper/customer has agreed to.
   * @return type
  **/
  @ApiModelProperty(example = "EVERYDAY_PAY", required = true, value = "The type of Ts and Cs that the shopper/customer has agreed to.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public InstoreCustomerTermsandconditionsAcceptanceData version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The current version of the Ts and Cs that the shopper/customer has agreed to.
   * @return version
  **/
  @ApiModelProperty(example = "1.0.0", required = true, value = "The current version of the Ts and Cs that the shopper/customer has agreed to.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstoreCustomerTermsandconditionsAcceptanceData instoreCustomerTermsandconditionsAcceptanceData = (InstoreCustomerTermsandconditionsAcceptanceData) o;
    return Objects.equals(this.type, instoreCustomerTermsandconditionsAcceptanceData.type) &&
        Objects.equals(this.version, instoreCustomerTermsandconditionsAcceptanceData.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstoreCustomerTermsandconditionsAcceptanceData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

