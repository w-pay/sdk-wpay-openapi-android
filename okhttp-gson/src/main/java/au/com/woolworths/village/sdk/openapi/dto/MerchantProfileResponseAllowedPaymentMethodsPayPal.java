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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The presence of this object in the response indicates that paypal is an allowed payment method and instrument in the container for the relevant merchant.
 */
@ApiModel(description = "The presence of this object in the response indicates that paypal is an allowed payment method and instrument in the container for the relevant merchant.")

public class MerchantProfileResponseAllowedPaymentMethodsPayPal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CLIENT_TOKEN = "clientToken";
  @SerializedName(SERIALIZED_NAME_CLIENT_TOKEN)
  private String clientToken;

  /**
   * This property indicates the status of the paypal service in the container.
   */
  @JsonAdapter(ServiceStatusEnum.Adapter.class)
  public enum ServiceStatusEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED");

    private String value;

    ServiceStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceStatusEnum fromValue(String value) {
      for (ServiceStatusEnum b : ServiceStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServiceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ServiceStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SERVICE_STATUS = "serviceStatus";
  @SerializedName(SERIALIZED_NAME_SERVICE_STATUS)
  private ServiceStatusEnum serviceStatus;


  public MerchantProfileResponseAllowedPaymentMethodsPayPal clientToken(String clientToken) {
    
    this.clientToken = clientToken;
    return this;
  }

   /**
   * The paypal client token used for configuration and authorization of paypal transactions.
   * @return clientToken
  **/
  @ApiModelProperty(example = "eyJ2ZXJzaW9usIn1vIjoib2ZmIn0=", required = true, value = "The paypal client token used for configuration and authorization of paypal transactions.")

  public String getClientToken() {
    return clientToken;
  }


  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }


  public MerchantProfileResponseAllowedPaymentMethodsPayPal serviceStatus(ServiceStatusEnum serviceStatus) {
    
    this.serviceStatus = serviceStatus;
    return this;
  }

   /**
   * This property indicates the status of the paypal service in the container.
   * @return serviceStatus
  **/
  @ApiModelProperty(required = true, value = "This property indicates the status of the paypal service in the container.")

  public ServiceStatusEnum getServiceStatus() {
    return serviceStatus;
  }


  public void setServiceStatus(ServiceStatusEnum serviceStatus) {
    this.serviceStatus = serviceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProfileResponseAllowedPaymentMethodsPayPal merchantProfileResponseAllowedPaymentMethodsPayPal = (MerchantProfileResponseAllowedPaymentMethodsPayPal) o;
    return Objects.equals(this.clientToken, merchantProfileResponseAllowedPaymentMethodsPayPal.clientToken) &&
        Objects.equals(this.serviceStatus, merchantProfileResponseAllowedPaymentMethodsPayPal.serviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, serviceStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProfileResponseAllowedPaymentMethodsPayPal {\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
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

