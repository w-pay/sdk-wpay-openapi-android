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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * The presence of this object in the response indicates that a gift card is an allowed payment method and instrument in the container for the relevant merchant.
 */
@ApiModel(description = "The presence of this object in the response indicates that a gift card is an allowed payment method and instrument in the container for the relevant merchant.")

public class MerchantProfileResponseAllowedPaymentMethodsGiftCard implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALLOWED_BINS = "allowedBins";
  @SerializedName(SERIALIZED_NAME_ALLOWED_BINS)
  private List<String> allowedBins = new ArrayList<String>();

  /**
   * This property indicates the status of the gift card service in the container.
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

  public static final String SERIALIZED_NAME_PIN_ALWAYS_REQUIRED = "pinAlwaysRequired";
  @SerializedName(SERIALIZED_NAME_PIN_ALWAYS_REQUIRED)
  private Boolean pinAlwaysRequired;


  public MerchantProfileResponseAllowedPaymentMethodsGiftCard allowedBins(List<String> allowedBins) {
    
    this.allowedBins = allowedBins;
    return this;
  }

  public MerchantProfileResponseAllowedPaymentMethodsGiftCard addAllowedBinsItem(String allowedBinsItem) {
    this.allowedBins.add(allowedBinsItem);
    return this;
  }

   /**
   * The gift card bin numbers that are allowed for the relevant merchant. This does not indicate sub-bins, ie. exact gift card programs.
   * @return allowedBins
  **/
  @ApiModelProperty(required = true, value = "The gift card bin numbers that are allowed for the relevant merchant. This does not indicate sub-bins, ie. exact gift card programs.")

  public List<String> getAllowedBins() {
    return allowedBins;
  }


  public void setAllowedBins(List<String> allowedBins) {
    this.allowedBins = allowedBins;
  }


  public MerchantProfileResponseAllowedPaymentMethodsGiftCard serviceStatus(ServiceStatusEnum serviceStatus) {
    
    this.serviceStatus = serviceStatus;
    return this;
  }

   /**
   * This property indicates the status of the gift card service in the container.
   * @return serviceStatus
  **/
  @ApiModelProperty(required = true, value = "This property indicates the status of the gift card service in the container.")

  public ServiceStatusEnum getServiceStatus() {
    return serviceStatus;
  }


  public void setServiceStatus(ServiceStatusEnum serviceStatus) {
    this.serviceStatus = serviceStatus;
  }


  public MerchantProfileResponseAllowedPaymentMethodsGiftCard pinAlwaysRequired(Boolean pinAlwaysRequired) {
    
    this.pinAlwaysRequired = pinAlwaysRequired;
    return this;
  }

   /**
   * Flag to indicate if the pin is always required for gift card transactions.
   * @return pinAlwaysRequired
  **/
  @ApiModelProperty(example = "false", required = true, value = "Flag to indicate if the pin is always required for gift card transactions.")

  public Boolean getPinAlwaysRequired() {
    return pinAlwaysRequired;
  }


  public void setPinAlwaysRequired(Boolean pinAlwaysRequired) {
    this.pinAlwaysRequired = pinAlwaysRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProfileResponseAllowedPaymentMethodsGiftCard merchantProfileResponseAllowedPaymentMethodsGiftCard = (MerchantProfileResponseAllowedPaymentMethodsGiftCard) o;
    return Objects.equals(this.allowedBins, merchantProfileResponseAllowedPaymentMethodsGiftCard.allowedBins) &&
        Objects.equals(this.serviceStatus, merchantProfileResponseAllowedPaymentMethodsGiftCard.serviceStatus) &&
        Objects.equals(this.pinAlwaysRequired, merchantProfileResponseAllowedPaymentMethodsGiftCard.pinAlwaysRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedBins, serviceStatus, pinAlwaysRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProfileResponseAllowedPaymentMethodsGiftCard {\n");
    sb.append("    allowedBins: ").append(toIndentedString(allowedBins)).append("\n");
    sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
    sb.append("    pinAlwaysRequired: ").append(toIndentedString(pinAlwaysRequired)).append("\n");
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

