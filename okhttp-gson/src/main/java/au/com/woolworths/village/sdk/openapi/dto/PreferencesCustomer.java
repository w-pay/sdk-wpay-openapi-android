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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Available preference settings for a customer
 */
@ApiModel(description = "Available preference settings for a customer")

public class PreferencesCustomer implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private PreferencePayments payments;

  public static final String SERIALIZED_NAME_GENERAL = "general";
  @SerializedName(SERIALIZED_NAME_GENERAL)
  private Map<String, Map<String, String>> general = null;


  public PreferencesCustomer payments(PreferencePayments payments) {
    
    this.payments = payments;
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PreferencePayments getPayments() {
    return payments;
  }


  public void setPayments(PreferencePayments payments) {
    this.payments = payments;
  }


  public PreferencesCustomer general(Map<String, Map<String, String>> general) {
    
    this.general = general;
    return this;
  }

  public PreferencesCustomer putGeneralItem(String key, Map<String, String> generalItem) {
    if (this.general == null) {
      this.general = new HashMap<String, Map<String, String>>();
    }
    this.general.put(key, generalItem);
    return this;
  }

   /**
   * A set of groups of key/value based preferences
   * @return general
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of groups of key/value based preferences")

  public Map<String, Map<String, String>> getGeneral() {
    return general;
  }


  public void setGeneral(Map<String, Map<String, String>> general) {
    this.general = general;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreferencesCustomer preferencesCustomer = (PreferencesCustomer) o;
    return Objects.equals(this.payments, preferencesCustomer.payments) &&
        Objects.equals(this.general, preferencesCustomer.general);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments, general);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferencesCustomer {\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
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

