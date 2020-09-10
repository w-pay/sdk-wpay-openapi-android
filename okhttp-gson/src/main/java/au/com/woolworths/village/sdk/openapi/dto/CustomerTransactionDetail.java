/*
 * Village Wallet
 * APIs for Village Wallet
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import au.com.woolworths.village.sdk.openapi.dto.Basket;
import au.com.woolworths.village.sdk.openapi.dto.CustomerTransactionDetailAllOf;
import au.com.woolworths.village.sdk.openapi.dto.CustomerTransactionSummary;
import au.com.woolworths.village.sdk.openapi.dto.CustomerTransactionSummaryAllOfInstruments;
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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * Detailed information for a single transaction
 */
@ApiModel(description = "Detailed information for a single transaction")

public class CustomerTransactionDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  /**
   * The type of transaction: PAYMENT or REFUND
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYMENT("PAYMENT"),
    
    REFUND("REFUND");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_EXECUTION_TIME = "executionTime";
  @SerializedName(SERIALIZED_NAME_EXECUTION_TIME)
  private OffsetDateTime executionTime;

  /**
   * The current status of the transactions
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSING("PROCESSING"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_DETAIL = "statusDetail";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAIL)
  private Object statusDetail;

  public static final String SERIALIZED_NAME_REFUND_REASON = "refundReason";
  @SerializedName(SERIALIZED_NAME_REFUND_REASON)
  private String refundReason;

  public static final String SERIALIZED_NAME_PAYMENT_REQUEST_ID = "paymentRequestId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUEST_ID)
  private String paymentRequestId;

  public static final String SERIALIZED_NAME_MERCHANT_REFERENCE_ID = "merchantReferenceId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFERENCE_ID)
  private String merchantReferenceId;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT = "grossAmount";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT)
  private BigDecimal grossAmount;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_INSTRUMENTS = "instruments";
  @SerializedName(SERIALIZED_NAME_INSTRUMENTS)
  private List<CustomerTransactionSummaryAllOfInstruments> instruments = new ArrayList<CustomerTransactionSummaryAllOfInstruments>();

  public static final String SERIALIZED_NAME_BASKET = "basket";
  @SerializedName(SERIALIZED_NAME_BASKET)
  private Basket basket;


  public CustomerTransactionDetail transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The ID of the transaction
   * @return transactionId
  **/
  @ApiModelProperty(example = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5", required = true, value = "The ID of the transaction")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public CustomerTransactionDetail clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * An optional client reference associated with the transaction.  If not supplied the transactionId will be used.
   * @return clientReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5", value = "An optional client reference associated with the transaction.  If not supplied the transactionId will be used.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public CustomerTransactionDetail type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of transaction: PAYMENT or REFUND
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of transaction: PAYMENT or REFUND")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CustomerTransactionDetail executionTime(OffsetDateTime executionTime) {
    
    this.executionTime = executionTime;
    return this;
  }

   /**
   * Date/time stamp of when the transaction occurred in ISO string format
   * @return executionTime
  **/
  @ApiModelProperty(example = "2017-11-06T19:38:09.890+11:00", required = true, value = "Date/time stamp of when the transaction occurred in ISO string format")

  public OffsetDateTime getExecutionTime() {
    return executionTime;
  }


  public void setExecutionTime(OffsetDateTime executionTime) {
    this.executionTime = executionTime;
  }


  public CustomerTransactionDetail status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the transactions
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The current status of the transactions")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CustomerTransactionDetail statusDetail(Object statusDetail) {
    
    this.statusDetail = statusDetail;
    return this;
  }

   /**
   * The error detail returned by downstream processes when the payment is REJECTED
   * @return statusDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error detail returned by downstream processes when the payment is REJECTED")

  public Object getStatusDetail() {
    return statusDetail;
  }


  public void setStatusDetail(Object statusDetail) {
    this.statusDetail = statusDetail;
  }


  public CustomerTransactionDetail refundReason(String refundReason) {
    
    this.refundReason = refundReason;
    return this;
  }

   /**
   * The reason provided for the refund.  Only provided for REFUND transactions
   * @return refundReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason provided for the refund.  Only provided for REFUND transactions")

  public String getRefundReason() {
    return refundReason;
  }


  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
  }


  public CustomerTransactionDetail paymentRequestId(String paymentRequestId) {
    
    this.paymentRequestId = paymentRequestId;
    return this;
  }

   /**
   * The ID of this payment request
   * @return paymentRequestId
  **/
  @ApiModelProperty(example = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5", required = true, value = "The ID of this payment request")

  public String getPaymentRequestId() {
    return paymentRequestId;
  }


  public void setPaymentRequestId(String paymentRequestId) {
    this.paymentRequestId = paymentRequestId;
  }


  public CustomerTransactionDetail merchantReferenceId(String merchantReferenceId) {
    
    this.merchantReferenceId = merchantReferenceId;
    return this;
  }

   /**
   * The unique reference for the payment as defined by the Merchant
   * @return merchantReferenceId
  **/
  @ApiModelProperty(example = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5", required = true, value = "The unique reference for the payment as defined by the Merchant")

  public String getMerchantReferenceId() {
    return merchantReferenceId;
  }


  public void setMerchantReferenceId(String merchantReferenceId) {
    this.merchantReferenceId = merchantReferenceId;
  }


  public CustomerTransactionDetail grossAmount(BigDecimal grossAmount) {
    
    this.grossAmount = grossAmount;
    return this;
  }

   /**
   * The gross amount to be paid.  Must be positive except for refunds
   * @return grossAmount
  **/
  @ApiModelProperty(required = true, value = "The gross amount to be paid.  Must be positive except for refunds")

  public BigDecimal getGrossAmount() {
    return grossAmount;
  }


  public void setGrossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
  }


  public CustomerTransactionDetail merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The ID of the merchant associated with this transaction
   * @return merchantId
  **/
  @ApiModelProperty(example = "75ba5b0b-7e5d-47fe-9508-29ca69fdb1d5", required = true, value = "The ID of the merchant associated with this transaction")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public CustomerTransactionDetail instruments(List<CustomerTransactionSummaryAllOfInstruments> instruments) {
    
    this.instruments = instruments;
    return this;
  }

  public CustomerTransactionDetail addInstrumentsItem(CustomerTransactionSummaryAllOfInstruments instrumentsItem) {
    this.instruments.add(instrumentsItem);
    return this;
  }

   /**
   * The instruments used to make the payment.  For refunds and cash back amounts will be negative
   * @return instruments
  **/
  @ApiModelProperty(required = true, value = "The instruments used to make the payment.  For refunds and cash back amounts will be negative")

  public List<CustomerTransactionSummaryAllOfInstruments> getInstruments() {
    return instruments;
  }


  public void setInstruments(List<CustomerTransactionSummaryAllOfInstruments> instruments) {
    this.instruments = instruments;
  }


  public CustomerTransactionDetail basket(Basket basket) {
    
    this.basket = basket;
    return this;
  }

   /**
   * Get basket
   * @return basket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Basket getBasket() {
    return basket;
  }


  public void setBasket(Basket basket) {
    this.basket = basket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerTransactionDetail customerTransactionDetail = (CustomerTransactionDetail) o;
    return Objects.equals(this.transactionId, customerTransactionDetail.transactionId) &&
        Objects.equals(this.clientReference, customerTransactionDetail.clientReference) &&
        Objects.equals(this.type, customerTransactionDetail.type) &&
        Objects.equals(this.executionTime, customerTransactionDetail.executionTime) &&
        Objects.equals(this.status, customerTransactionDetail.status) &&
        Objects.equals(this.statusDetail, customerTransactionDetail.statusDetail) &&
        Objects.equals(this.refundReason, customerTransactionDetail.refundReason) &&
        Objects.equals(this.paymentRequestId, customerTransactionDetail.paymentRequestId) &&
        Objects.equals(this.merchantReferenceId, customerTransactionDetail.merchantReferenceId) &&
        Objects.equals(this.grossAmount, customerTransactionDetail.grossAmount) &&
        Objects.equals(this.merchantId, customerTransactionDetail.merchantId) &&
        Objects.equals(this.instruments, customerTransactionDetail.instruments) &&
        Objects.equals(this.basket, customerTransactionDetail.basket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, clientReference, type, executionTime, status, statusDetail, refundReason, paymentRequestId, merchantReferenceId, grossAmount, merchantId, instruments, basket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerTransactionDetail {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
    sb.append("    refundReason: ").append(toIndentedString(refundReason)).append("\n");
    sb.append("    paymentRequestId: ").append(toIndentedString(paymentRequestId)).append("\n");
    sb.append("    merchantReferenceId: ").append(toIndentedString(merchantReferenceId)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
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

