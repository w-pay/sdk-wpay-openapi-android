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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentAgreementListResponseData
 */

public class PaymentAgreementListResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAYMENT_AGREEMENTS = "paymentAgreements";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AGREEMENTS)
  private List<List<Object>> paymentAgreements = new ArrayList<>();

  public PaymentAgreementListResponseData paymentAgreements(List<List<Object>> paymentAgreements) {
    
    this.paymentAgreements = paymentAgreements;
    return this;
  }

  public PaymentAgreementListResponseData addPaymentAgreementsItem(List<Object> paymentAgreementsItem) {
    this.paymentAgreements.add(paymentAgreementsItem);
    return this;
  }

   /**
   * Get paymentAgreements
   * @return paymentAgreements
  **/
  @ApiModelProperty(required = true, value = "")

  public List<List<Object>> getPaymentAgreements() {
    return paymentAgreements;
  }


  public void setPaymentAgreements(List<List<Object>> paymentAgreements) {
    this.paymentAgreements = paymentAgreements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAgreementListResponseData paymentAgreementListResponseData = (PaymentAgreementListResponseData) o;
    return Objects.equals(this.paymentAgreements, paymentAgreementListResponseData.paymentAgreements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentAgreements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAgreementListResponseData {\n");
    sb.append("    paymentAgreements: ").append(toIndentedString(paymentAgreements)).append("\n");
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

