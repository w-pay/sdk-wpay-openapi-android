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
import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Results of the gifting quote
 */
@ApiModel(description = "Results of the gifting quote")

public class InlineResponse2002Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_QUOTE_ID = "quoteId";
  @SerializedName(SERIALIZED_NAME_QUOTE_ID)
  private String quoteId;

  public static final String SERIALIZED_NAME_SUB_TOTAL_AMOUNT = "subTotalAmount";
  @SerializedName(SERIALIZED_NAME_SUB_TOTAL_AMOUNT)
  private BigDecimal subTotalAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discountAmount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private BigDecimal discountAmount;

  public static final String SERIALIZED_NAME_TOTAL_ORDER_AMOUNT = "totalOrderAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_ORDER_AMOUNT)
  private BigDecimal totalOrderAmount;

  public static final String SERIALIZED_NAME_ORDER_ITEMS = "orderItems";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEMS)
  private InlineResponse2002DataOrderItems orderItems;


  public InlineResponse2002Data quoteId(String quoteId) {
    
    this.quoteId = quoteId;
    return this;
  }

   /**
   * Quote reference. Can be used as a reference when placing the actual order
   * @return quoteId
  **/
  @ApiModelProperty(required = true, value = "Quote reference. Can be used as a reference when placing the actual order")

  public String getQuoteId() {
    return quoteId;
  }


  public void setQuoteId(String quoteId) {
    this.quoteId = quoteId;
  }


  public InlineResponse2002Data subTotalAmount(BigDecimal subTotalAmount) {
    
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


  public InlineResponse2002Data discountAmount(BigDecimal discountAmount) {
    
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


  public InlineResponse2002Data totalOrderAmount(BigDecimal totalOrderAmount) {
    
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


  public InlineResponse2002Data orderItems(InlineResponse2002DataOrderItems orderItems) {
    
    this.orderItems = orderItems;
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @ApiModelProperty(required = true, value = "")

  public InlineResponse2002DataOrderItems getOrderItems() {
    return orderItems;
  }


  public void setOrderItems(InlineResponse2002DataOrderItems orderItems) {
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
    InlineResponse2002Data inlineResponse2002Data = (InlineResponse2002Data) o;
    return Objects.equals(this.quoteId, inlineResponse2002Data.quoteId) &&
        Objects.equals(this.subTotalAmount, inlineResponse2002Data.subTotalAmount) &&
        Objects.equals(this.discountAmount, inlineResponse2002Data.discountAmount) &&
        Objects.equals(this.totalOrderAmount, inlineResponse2002Data.totalOrderAmount) &&
        Objects.equals(this.orderItems, inlineResponse2002Data.orderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteId, subTotalAmount, discountAmount, totalOrderAmount, orderItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Data {\n");
    sb.append("    quoteId: ").append(toIndentedString(quoteId)).append("\n");
    sb.append("    subTotalAmount: ").append(toIndentedString(subTotalAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    totalOrderAmount: ").append(toIndentedString(totalOrderAmount)).append("\n");
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

