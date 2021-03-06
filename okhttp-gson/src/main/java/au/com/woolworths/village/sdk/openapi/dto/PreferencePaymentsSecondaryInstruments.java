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
 * Rules for the creation of a default set of secondary instruments to be used for a payment if a specific set is not specified.  Secondary instruments are used in order until the full amount of the payment has been paid.
 */
@ApiModel(description = "Rules for the creation of a default set of secondary instruments to be used for a payment if a specific set is not specified.  Secondary instruments are used in order until the full amount of the payment has been paid.")

public class PreferencePaymentsSecondaryInstruments implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ENABLE_SECONDARY_INSTRUMENTS = "enableSecondaryInstruments";
  @SerializedName(SERIALIZED_NAME_ENABLE_SECONDARY_INSTRUMENTS)
  private Boolean enableSecondaryInstruments = true;

  /**
   * The order that the secondary instruments will be used for a specific payment.
   */
  @JsonAdapter(OrderEnum.Adapter.class)
  public enum OrderEnum {
    BALANCE_ASC("BALANCE_ASC"),
    
    BALANCE_DESC("BALANCE_DESC"),
    
    EXPIRY_ASC("EXPIRY_ASC"),
    
    EXPIRY_DESC("EXPIRY_DESC"),
    
    FIFO("FIFO"),
    
    LIFO("LIFO"),
    
    INCLUDE_ORDER("INCLUDE_ORDER");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderEnum fromValue(String value) {
      for (OrderEnum b : OrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderEnum order;

  public static final String SERIALIZED_NAME_EXCLUDE = "exclude";
  @SerializedName(SERIALIZED_NAME_EXCLUDE)
  private List<String> exclude = null;

  public static final String SERIALIZED_NAME_INCLUDE = "include";
  @SerializedName(SERIALIZED_NAME_INCLUDE)
  private List<String> include = null;


  public PreferencePaymentsSecondaryInstruments enableSecondaryInstruments(Boolean enableSecondaryInstruments) {
    
    this.enableSecondaryInstruments = enableSecondaryInstruments;
    return this;
  }

   /**
   * Flag indicating whether secondary instruments are enabled or disabled.  If not present defaults to enabled.  Used to specifically disable secondary instruments without losing customer configure preferences.
   * @return enableSecondaryInstruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Flag indicating whether secondary instruments are enabled or disabled.  If not present defaults to enabled.  Used to specifically disable secondary instruments without losing customer configure preferences.")

  public Boolean getEnableSecondaryInstruments() {
    return enableSecondaryInstruments;
  }


  public void setEnableSecondaryInstruments(Boolean enableSecondaryInstruments) {
    this.enableSecondaryInstruments = enableSecondaryInstruments;
  }


  public PreferencePaymentsSecondaryInstruments order(OrderEnum order) {
    
    this.order = order;
    return this;
  }

   /**
   * The order that the secondary instruments will be used for a specific payment.
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXPIRY_ASC", value = "The order that the secondary instruments will be used for a specific payment.")

  public OrderEnum getOrder() {
    return order;
  }


  public void setOrder(OrderEnum order) {
    this.order = order;
  }


  public PreferencePaymentsSecondaryInstruments exclude(List<String> exclude) {
    
    this.exclude = exclude;
    return this;
  }

  public PreferencePaymentsSecondaryInstruments addExcludeItem(String excludeItem) {
    if (this.exclude == null) {
      this.exclude = new ArrayList<String>();
    }
    this.exclude.add(excludeItem);
    return this;
  }

   /**
   * Array of instruments to exclude from the secondary instruments set.  Indicates that the set of secondary instruments should include all valid instruments excluding those in this list.
   * @return exclude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of instruments to exclude from the secondary instruments set.  Indicates that the set of secondary instruments should include all valid instruments excluding those in this list.")

  public List<String> getExclude() {
    return exclude;
  }


  public void setExclude(List<String> exclude) {
    this.exclude = exclude;
  }


  public PreferencePaymentsSecondaryInstruments include(List<String> include) {
    
    this.include = include;
    return this;
  }

  public PreferencePaymentsSecondaryInstruments addIncludeItem(String includeItem) {
    if (this.include == null) {
      this.include = new ArrayList<String>();
    }
    this.include.add(includeItem);
    return this;
  }

   /**
   * Array of instruments to specifically include in the secondary instruments set.  Indicates that the set of secondary instruments should start as empty and only include all valid instruments excluding those in this list.
   * @return include
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of instruments to specifically include in the secondary instruments set.  Indicates that the set of secondary instruments should start as empty and only include all valid instruments excluding those in this list.")

  public List<String> getInclude() {
    return include;
  }


  public void setInclude(List<String> include) {
    this.include = include;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreferencePaymentsSecondaryInstruments preferencePaymentsSecondaryInstruments = (PreferencePaymentsSecondaryInstruments) o;
    return Objects.equals(this.enableSecondaryInstruments, preferencePaymentsSecondaryInstruments.enableSecondaryInstruments) &&
        Objects.equals(this.order, preferencePaymentsSecondaryInstruments.order) &&
        Objects.equals(this.exclude, preferencePaymentsSecondaryInstruments.exclude) &&
        Objects.equals(this.include, preferencePaymentsSecondaryInstruments.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableSecondaryInstruments, order, exclude, include);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferencePaymentsSecondaryInstruments {\n");
    sb.append("    enableSecondaryInstruments: ").append(toIndentedString(enableSecondaryInstruments)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

