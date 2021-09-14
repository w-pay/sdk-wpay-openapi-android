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
 * GiftingProductQuoteRequest
 */

public class GiftingProductQuoteRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORDER_ITEMS = "orderItems";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEMS)
  private List<GiftingProductOrderItem> orderItems = new ArrayList<GiftingProductOrderItem>();


  public GiftingProductQuoteRequest orderItems(List<GiftingProductOrderItem> orderItems) {
    
    this.orderItems = orderItems;
    return this;
  }

  public GiftingProductQuoteRequest addOrderItemsItem(GiftingProductOrderItem orderItemsItem) {
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
    GiftingProductQuoteRequest giftingProductQuoteRequest = (GiftingProductQuoteRequest) o;
    return Objects.equals(this.orderItems, giftingProductQuoteRequest.orderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftingProductQuoteRequest {\n");
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

