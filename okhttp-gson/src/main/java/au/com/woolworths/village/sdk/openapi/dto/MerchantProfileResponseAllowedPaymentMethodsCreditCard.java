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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The presence of this object in the response indicates that a credit card is an allowed payment method and instrument in the container for the relevant merchant.
 */
@ApiModel(description = "The presence of this object in the response indicates that a credit card is an allowed payment method and instrument in the container for the relevant merchant.")

public class MerchantProfileResponseAllowedPaymentMethodsCreditCard implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALLOWED_NETWORKS = "allowedNetworks";
  @SerializedName(SERIALIZED_NAME_ALLOWED_NETWORKS)
  private List<String> allowedNetworks = new ArrayList<String>();

  /**
   * Gets or Sets allowedTransactionTypes
   */
  @JsonAdapter(AllowedTransactionTypesEnum.Adapter.class)
  public enum AllowedTransactionTypesEnum {
    PREAUTH("PREAUTH"),
    
    PURCHASE("PURCHASE");

    private String value;

    AllowedTransactionTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedTransactionTypesEnum fromValue(String value) {
      for (AllowedTransactionTypesEnum b : AllowedTransactionTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AllowedTransactionTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedTransactionTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedTransactionTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AllowedTransactionTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALLOWED_TRANSACTION_TYPES = "allowedTransactionTypes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_TRANSACTION_TYPES)
  private List<AllowedTransactionTypesEnum> allowedTransactionTypes = new ArrayList<AllowedTransactionTypesEnum>();

  /**
   * This property indicates the status of the credit card service in the container.
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


  public MerchantProfileResponseAllowedPaymentMethodsCreditCard allowedNetworks(List<String> allowedNetworks) {
    
    this.allowedNetworks = allowedNetworks;
    return this;
  }

  public MerchantProfileResponseAllowedPaymentMethodsCreditCard addAllowedNetworksItem(String allowedNetworksItem) {
    this.allowedNetworks.add(allowedNetworksItem);
    return this;
  }

   /**
   * The allowed networks (schemes) for credit card transactions.
   * @return allowedNetworks
  **/
  @ApiModelProperty(required = true, value = "The allowed networks (schemes) for credit card transactions.")

  public List<String> getAllowedNetworks() {
    return allowedNetworks;
  }


  public void setAllowedNetworks(List<String> allowedNetworks) {
    this.allowedNetworks = allowedNetworks;
  }


  public MerchantProfileResponseAllowedPaymentMethodsCreditCard allowedTransactionTypes(List<AllowedTransactionTypesEnum> allowedTransactionTypes) {
    
    this.allowedTransactionTypes = allowedTransactionTypes;
    return this;
  }

  public MerchantProfileResponseAllowedPaymentMethodsCreditCard addAllowedTransactionTypesItem(AllowedTransactionTypesEnum allowedTransactionTypesItem) {
    this.allowedTransactionTypes.add(allowedTransactionTypesItem);
    return this;
  }

   /**
   * The allowed transaction types for credit card transactions.
   * @return allowedTransactionTypes
  **/
  @ApiModelProperty(required = true, value = "The allowed transaction types for credit card transactions.")

  public List<AllowedTransactionTypesEnum> getAllowedTransactionTypes() {
    return allowedTransactionTypes;
  }


  public void setAllowedTransactionTypes(List<AllowedTransactionTypesEnum> allowedTransactionTypes) {
    this.allowedTransactionTypes = allowedTransactionTypes;
  }


  public MerchantProfileResponseAllowedPaymentMethodsCreditCard serviceStatus(ServiceStatusEnum serviceStatus) {
    
    this.serviceStatus = serviceStatus;
    return this;
  }

   /**
   * This property indicates the status of the credit card service in the container.
   * @return serviceStatus
  **/
  @ApiModelProperty(required = true, value = "This property indicates the status of the credit card service in the container.")

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
    MerchantProfileResponseAllowedPaymentMethodsCreditCard merchantProfileResponseAllowedPaymentMethodsCreditCard = (MerchantProfileResponseAllowedPaymentMethodsCreditCard) o;
    return Objects.equals(this.allowedNetworks, merchantProfileResponseAllowedPaymentMethodsCreditCard.allowedNetworks) &&
        Objects.equals(this.allowedTransactionTypes, merchantProfileResponseAllowedPaymentMethodsCreditCard.allowedTransactionTypes) &&
        Objects.equals(this.serviceStatus, merchantProfileResponseAllowedPaymentMethodsCreditCard.serviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedNetworks, allowedTransactionTypes, serviceStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProfileResponseAllowedPaymentMethodsCreditCard {\n");
    sb.append("    allowedNetworks: ").append(toIndentedString(allowedNetworks)).append("\n");
    sb.append("    allowedTransactionTypes: ").append(toIndentedString(allowedTransactionTypes)).append("\n");
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
