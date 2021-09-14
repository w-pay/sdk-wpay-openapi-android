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
import au.com.woolworths.village.sdk.openapi.dto.GiftingProductOrderItem;
import au.com.woolworths.village.sdk.openapi.dto.GiftingProductOrderRequestDataBillingContact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * GiftingProductOrderRequestData
 */

public class GiftingProductOrderRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrumentId";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
  private String instrumentId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_SUB_TOTAL_AMOUNT = "subTotalAmount";
  @SerializedName(SERIALIZED_NAME_SUB_TOTAL_AMOUNT)
  private BigDecimal subTotalAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discountAmount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private BigDecimal discountAmount;

  public static final String SERIALIZED_NAME_TOTAL_ORDER_AMOUNT = "totalOrderAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_ORDER_AMOUNT)
  private BigDecimal totalOrderAmount;

  public static final String SERIALIZED_NAME_BILLING_CONTACT = "billingContact";
  @SerializedName(SERIALIZED_NAME_BILLING_CONTACT)
  private GiftingProductOrderRequestDataBillingContact billingContact;

  public static final String SERIALIZED_NAME_ORDER_ITEMS = "orderItems";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEMS)
  private List<GiftingProductOrderItem> orderItems = new ArrayList<GiftingProductOrderItem>();


  public GiftingProductOrderRequestData instrumentId(String instrumentId) {
    
    this.instrumentId = instrumentId;
    return this;
  }

   /**
   * The instrumentId to be used for the order.  Must not be a stored gift card
   * @return instrumentId
  **/
  @ApiModelProperty(required = true, value = "The instrumentId to be used for the order.  Must not be a stored gift card")

  public String getInstrumentId() {
    return instrumentId;
  }


  public void setInstrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
  }


  public GiftingProductOrderRequestData referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Unique reference for the order supplied by the client
   * @return referenceId
  **/
  @ApiModelProperty(required = true, value = "Unique reference for the order supplied by the client")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public GiftingProductOrderRequestData subTotalAmount(BigDecimal subTotalAmount) {
    
    this.subTotalAmount = subTotalAmount;
    return this;
  }

   /**
   * Face value of the gift card
   * @return subTotalAmount
  **/
  @ApiModelProperty(required = true, value = "Face value of the gift card")

  public BigDecimal getSubTotalAmount() {
    return subTotalAmount;
  }


  public void setSubTotalAmount(BigDecimal subTotalAmount) {
    this.subTotalAmount = subTotalAmount;
  }


  public GiftingProductOrderRequestData discountAmount(BigDecimal discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Eligible discount amount. In case of no discounts, value will be 0
   * @return discountAmount
  **/
  @ApiModelProperty(required = true, value = "Eligible discount amount. In case of no discounts, value will be 0")

  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }


  public GiftingProductOrderRequestData totalOrderAmount(BigDecimal totalOrderAmount) {
    
    this.totalOrderAmount = totalOrderAmount;
    return this;
  }

   /**
   * Net amount payable
   * @return totalOrderAmount
  **/
  @ApiModelProperty(required = true, value = "Net amount payable")

  public BigDecimal getTotalOrderAmount() {
    return totalOrderAmount;
  }


  public void setTotalOrderAmount(BigDecimal totalOrderAmount) {
    this.totalOrderAmount = totalOrderAmount;
  }


  public GiftingProductOrderRequestData billingContact(GiftingProductOrderRequestDataBillingContact billingContact) {
    
    this.billingContact = billingContact;
    return this;
  }

   /**
   * Get billingContact
   * @return billingContact
  **/
  @ApiModelProperty(required = true, value = "")

  public GiftingProductOrderRequestDataBillingContact getBillingContact() {
    return billingContact;
  }


  public void setBillingContact(GiftingProductOrderRequestDataBillingContact billingContact) {
    this.billingContact = billingContact;
  }


  public GiftingProductOrderRequestData orderItems(List<GiftingProductOrderItem> orderItems) {
    
    this.orderItems = orderItems;
    return this;
  }

  public GiftingProductOrderRequestData addOrderItemsItem(GiftingProductOrderItem orderItemsItem) {
    this.orderItems.add(orderItemsItem);
    return this;
  }

   /**
   * Gift cards to be included in the order.  Currently only supports a single entry.  Array is for future roadmap
   * @return orderItems
  **/
  @ApiModelProperty(required = true, value = "Gift cards to be included in the order.  Currently only supports a single entry.  Array is for future roadmap")

  public List<GiftingProductOrderItem> getOrderItems() {
    return orderItems;
  }


  public void setOrderItems(List<GiftingProductOrderItem> orderItems) {
    this.orderItems = orderItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftingProductOrderRequestData giftingProductOrderRequestData = (GiftingProductOrderRequestData) o;
    return Objects.equals(this.instrumentId, giftingProductOrderRequestData.instrumentId) &&
        Objects.equals(this.referenceId, giftingProductOrderRequestData.referenceId) &&
        Objects.equals(this.subTotalAmount, giftingProductOrderRequestData.subTotalAmount) &&
        Objects.equals(this.discountAmount, giftingProductOrderRequestData.discountAmount) &&
        Objects.equals(this.totalOrderAmount, giftingProductOrderRequestData.totalOrderAmount) &&
        Objects.equals(this.billingContact, giftingProductOrderRequestData.billingContact) &&
        Objects.equals(this.orderItems, giftingProductOrderRequestData.orderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentId, referenceId, subTotalAmount, discountAmount, totalOrderAmount, billingContact, orderItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftingProductOrderRequestData {\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    subTotalAmount: ").append(toIndentedString(subTotalAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    totalOrderAmount: ").append(toIndentedString(totalOrderAmount)).append("\n");
    sb.append("    billingContact: ").append(toIndentedString(billingContact)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
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

