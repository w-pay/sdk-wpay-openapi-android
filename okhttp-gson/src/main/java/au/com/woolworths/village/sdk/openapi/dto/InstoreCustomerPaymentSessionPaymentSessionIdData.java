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
import au.com.woolworths.village.sdk.openapi.dto.DynamicPayload;
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
 * Mandatory data object containing details of the payment session
 */
@ApiModel(description = "Mandatory data object containing details of the payment session")

public class InstoreCustomerPaymentSessionPaymentSessionIdData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CUSTOMER_INFO = "customerInfo";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_INFO)
  private DynamicPayload customerInfo;


  public InstoreCustomerPaymentSessionPaymentSessionIdData customerInfo(DynamicPayload customerInfo) {
    
    this.customerInfo = customerInfo;
    return this;
  }

   /**
   * Get customerInfo
   * @return customerInfo
  **/
  @ApiModelProperty(required = true, value = "")

  public DynamicPayload getCustomerInfo() {
    return customerInfo;
  }


  public void setCustomerInfo(DynamicPayload customerInfo) {
    this.customerInfo = customerInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstoreCustomerPaymentSessionPaymentSessionIdData instoreCustomerPaymentSessionPaymentSessionIdData = (InstoreCustomerPaymentSessionPaymentSessionIdData) o;
    return Objects.equals(this.customerInfo, instoreCustomerPaymentSessionPaymentSessionIdData.customerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstoreCustomerPaymentSessionPaymentSessionIdData {\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
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

