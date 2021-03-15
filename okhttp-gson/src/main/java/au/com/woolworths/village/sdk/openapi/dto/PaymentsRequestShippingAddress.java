/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.2
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
 * This object is only required if the payments request contains paypal instruments.
 */
@ApiModel(description = "This object is only required if the payments request contains paypal instruments.")

public class PaymentsRequestShippingAddress implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_EXTENDED_ADDRESS = "extendedAddress";
  @SerializedName(SERIALIZED_NAME_EXTENDED_ADDRESS)
  private String extendedAddress;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "streetAddress";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private String streetAddress;

  public static final String SERIALIZED_NAME_SUBURB = "suburb";
  @SerializedName(SERIALIZED_NAME_SUBURB)
  private String suburb;

  public static final String SERIALIZED_NAME_STATE_OR_TERRITORY = "stateOrTerritory";
  @SerializedName(SERIALIZED_NAME_STATE_OR_TERRITORY)
  private String stateOrTerritory;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;


  public PaymentsRequestShippingAddress firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The recipient&#39;s first name.
   * @return firstName
  **/
  @ApiModelProperty(example = "Francois", required = true, value = "The recipient's first name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PaymentsRequestShippingAddress lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The recipient&#39;s last name.
   * @return lastName
  **/
  @ApiModelProperty(example = "van der Merwe", required = true, value = "The recipient's last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public PaymentsRequestShippingAddress email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The recipient’s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fvandermerwe@woolworths.com.au", value = "The recipient’s email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PaymentsRequestShippingAddress company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * The recipient&#39;s company name.
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Woolworths Limited", value = "The recipient's company name.")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public PaymentsRequestShippingAddress extendedAddress(String extendedAddress) {
    
    this.extendedAddress = extendedAddress;
    return this;
  }

   /**
   * The recipient&#39;s extended address line.
   * @return extendedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Level 1", value = "The recipient's extended address line.")

  public String getExtendedAddress() {
    return extendedAddress;
  }


  public void setExtendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
  }


  public PaymentsRequestShippingAddress streetAddress(String streetAddress) {
    
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * The recipient&#39;s street address line.
   * @return streetAddress
  **/
  @ApiModelProperty(example = "22 River Oak Circuit", required = true, value = "The recipient's street address line.")

  public String getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public PaymentsRequestShippingAddress suburb(String suburb) {
    
    this.suburb = suburb;
    return this;
  }

   /**
   * The recipient&#39;s suburb.
   * @return suburb
  **/
  @ApiModelProperty(example = "Kellyville", required = true, value = "The recipient's suburb.")

  public String getSuburb() {
    return suburb;
  }


  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }


  public PaymentsRequestShippingAddress stateOrTerritory(String stateOrTerritory) {
    
    this.stateOrTerritory = stateOrTerritory;
    return this;
  }

   /**
   * The recipient&#39;s abbreviated state or territory.
   * @return stateOrTerritory
  **/
  @ApiModelProperty(example = "NSW", required = true, value = "The recipient's abbreviated state or territory.")

  public String getStateOrTerritory() {
    return stateOrTerritory;
  }


  public void setStateOrTerritory(String stateOrTerritory) {
    this.stateOrTerritory = stateOrTerritory;
  }


  public PaymentsRequestShippingAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The recipient&#39;s postal code
   * @return postalCode
  **/
  @ApiModelProperty(example = "2155", required = true, value = "The recipient's postal code")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PaymentsRequestShippingAddress countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The recipient&#39;s Alpha-2 (2-character) ISO-3166-1 country code.
   * @return countryCode
  **/
  @ApiModelProperty(example = "AU", required = true, value = "The recipient's Alpha-2 (2-character) ISO-3166-1 country code.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsRequestShippingAddress paymentsRequestShippingAddress = (PaymentsRequestShippingAddress) o;
    return Objects.equals(this.firstName, paymentsRequestShippingAddress.firstName) &&
        Objects.equals(this.lastName, paymentsRequestShippingAddress.lastName) &&
        Objects.equals(this.email, paymentsRequestShippingAddress.email) &&
        Objects.equals(this.company, paymentsRequestShippingAddress.company) &&
        Objects.equals(this.extendedAddress, paymentsRequestShippingAddress.extendedAddress) &&
        Objects.equals(this.streetAddress, paymentsRequestShippingAddress.streetAddress) &&
        Objects.equals(this.suburb, paymentsRequestShippingAddress.suburb) &&
        Objects.equals(this.stateOrTerritory, paymentsRequestShippingAddress.stateOrTerritory) &&
        Objects.equals(this.postalCode, paymentsRequestShippingAddress.postalCode) &&
        Objects.equals(this.countryCode, paymentsRequestShippingAddress.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, company, extendedAddress, streetAddress, suburb, stateOrTerritory, postalCode, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRequestShippingAddress {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    extendedAddress: ").append(toIndentedString(extendedAddress)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    stateOrTerritory: ").append(toIndentedString(stateOrTerritory)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

