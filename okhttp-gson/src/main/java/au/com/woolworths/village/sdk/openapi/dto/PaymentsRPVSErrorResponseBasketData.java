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
import au.com.woolworths.village.sdk.openapi.dto.PaymentsRPVSErrorResponseValidationErrors;
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
 * PaymentsRPVSErrorResponseBasketData
 */

public class PaymentsRPVSErrorResponseBasketData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ITEM_ID = "itemId";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_SUBCATEGORY = "subcategory";
  @SerializedName(SERIALIZED_NAME_SUBCATEGORY)
  private String subcategory;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<PaymentsRPVSErrorResponseValidationErrors> validationErrors = new ArrayList<PaymentsRPVSErrorResponseValidationErrors>();


  public PaymentsRPVSErrorResponseBasketData itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The item id, article id or SKU. Present if &#39;itemId&#39; was sent in the basket data of the payments request.
   * @return itemId
  **/
  @ApiModelProperty(example = "105609", required = true, value = "The item id, article id or SKU. Present if 'itemId' was sent in the basket data of the payments request.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public PaymentsRPVSErrorResponseBasketData category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The items category code. Present if &#39;category&#39; was sent in the basket data of the payments request.
   * @return category
  **/
  @ApiModelProperty(example = "Dairy", required = true, value = "The items category code. Present if 'category' was sent in the basket data of the payments request.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public PaymentsRPVSErrorResponseBasketData subcategory(String subcategory) {
    
    this.subcategory = subcategory;
    return this;
  }

   /**
   * The items subcategory code. Present if &#39;subcategory&#39; was sent in the basket data of the payments request.
   * @return subcategory
  **/
  @ApiModelProperty(example = "Condiment", required = true, value = "The items subcategory code. Present if 'subcategory' was sent in the basket data of the payments request.")

  public String getSubcategory() {
    return subcategory;
  }


  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }


  public PaymentsRPVSErrorResponseBasketData validationErrors(List<PaymentsRPVSErrorResponseValidationErrors> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public PaymentsRPVSErrorResponseBasketData addValidationErrorsItem(PaymentsRPVSErrorResponseValidationErrors validationErrorsItem) {
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * This array contains the details of the restricted product validation (RPVS) errors.
   * @return validationErrors
  **/
  @ApiModelProperty(required = true, value = "This array contains the details of the restricted product validation (RPVS) errors.")

  public List<PaymentsRPVSErrorResponseValidationErrors> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(List<PaymentsRPVSErrorResponseValidationErrors> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsRPVSErrorResponseBasketData paymentsRPVSErrorResponseBasketData = (PaymentsRPVSErrorResponseBasketData) o;
    return Objects.equals(this.itemId, paymentsRPVSErrorResponseBasketData.itemId) &&
        Objects.equals(this.category, paymentsRPVSErrorResponseBasketData.category) &&
        Objects.equals(this.subcategory, paymentsRPVSErrorResponseBasketData.subcategory) &&
        Objects.equals(this.validationErrors, paymentsRPVSErrorResponseBasketData.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, category, subcategory, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRPVSErrorResponseBasketData {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

