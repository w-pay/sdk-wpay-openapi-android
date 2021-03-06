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
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Payment preferences for a customer
 */
@ApiModel(description = "Payment preferences for a customer")

public class PreferencePayments implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRIMARY_INSTRUMENT_ID = "primaryInstrumentId";
  @SerializedName(SERIALIZED_NAME_PRIMARY_INSTRUMENT_ID)
  private String primaryInstrumentId;

  public static final String SERIALIZED_NAME_SECONDARY_INSTRUMENTS = "secondaryInstruments";
  @SerializedName(SERIALIZED_NAME_SECONDARY_INSTRUMENTS)
  private PreferencePaymentsSecondaryInstruments secondaryInstruments;


  public PreferencePayments primaryInstrumentId(String primaryInstrumentId) {
    
    this.primaryInstrumentId = primaryInstrumentId;
    return this;
  }

   /**
   * The primary instrument that will be used by default for a payment if a specific instrument is not specified.  The primary instrument will be used for the balance of the payment after any specified secondary instruments are used first.
   * @return primaryInstrumentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "90271", value = "The primary instrument that will be used by default for a payment if a specific instrument is not specified.  The primary instrument will be used for the balance of the payment after any specified secondary instruments are used first.")

  public String getPrimaryInstrumentId() {
    return primaryInstrumentId;
  }


  public void setPrimaryInstrumentId(String primaryInstrumentId) {
    this.primaryInstrumentId = primaryInstrumentId;
  }


  public PreferencePayments secondaryInstruments(PreferencePaymentsSecondaryInstruments secondaryInstruments) {
    
    this.secondaryInstruments = secondaryInstruments;
    return this;
  }

   /**
   * Get secondaryInstruments
   * @return secondaryInstruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PreferencePaymentsSecondaryInstruments getSecondaryInstruments() {
    return secondaryInstruments;
  }


  public void setSecondaryInstruments(PreferencePaymentsSecondaryInstruments secondaryInstruments) {
    this.secondaryInstruments = secondaryInstruments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreferencePayments preferencePayments = (PreferencePayments) o;
    return Objects.equals(this.primaryInstrumentId, preferencePayments.primaryInstrumentId) &&
        Objects.equals(this.secondaryInstruments, preferencePayments.secondaryInstruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryInstrumentId, secondaryInstruments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferencePayments {\n");
    sb.append("    primaryInstrumentId: ").append(toIndentedString(primaryInstrumentId)).append("\n");
    sb.append("    secondaryInstruments: ").append(toIndentedString(secondaryInstruments)).append("\n");
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

