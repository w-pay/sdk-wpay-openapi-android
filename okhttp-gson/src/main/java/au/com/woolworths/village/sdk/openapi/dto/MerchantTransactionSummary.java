/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import java.util.Objects;
import java.util.Arrays;
import au.com.woolworths.village.sdk.openapi.dto.CommonTransactionSummary;
import au.com.woolworths.village.sdk.openapi.dto.InstrumentAllocation;
import au.com.woolworths.village.sdk.openapi.dto.MerchantTransactionSummaryAllOf;
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
 * Summary information of the resulting transaction
 */
@ApiModel(description = "Summary information of the resulting transaction")

public class MerchantTransactionSummary implements Serializable {
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

  /**
   * The rollback state of this transaction
   */
  @JsonAdapter(RollbackEnum.Adapter.class)
  public enum RollbackEnum {
    REQUIRED("REQUIRED"),
    
    NOT_REQUIRED("NOT_REQUIRED"),
    
    FAILED("FAILED"),
    
    SUCCESSFUL("SUCCESSFUL");

    private String value;

    RollbackEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RollbackEnum fromValue(String value) {
      for (RollbackEnum b : RollbackEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RollbackEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RollbackEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RollbackEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RollbackEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLLBACK = "rollback";
  @SerializedName(SERIALIZED_NAME_ROLLBACK)
  private RollbackEnum rollback;

  public static final String SERIALIZED_NAME_SUB_TRANSACTIONS = "subTransactions";
  @SerializedName(SERIALIZED_NAME_SUB_TRANSACTIONS)
  private List<Object> subTransactions = null;

  public static final String SERIALIZED_NAME_REFUND_REASON = "refundReason";
  @SerializedName(SERIALIZED_NAME_REFUND_REASON)
  private String refundReason;

  public static final String SERIALIZED_NAME_INSTRUMENTS = "instruments";
  @SerializedName(SERIALIZED_NAME_INSTRUMENTS)
  private List<InstrumentAllocation> instruments = new ArrayList<InstrumentAllocation>();

  public static final String SERIALIZED_NAME_PAYMENT_REQUEST_ID = "paymentRequestId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUEST_ID)
  private String paymentRequestId;

  public static final String SERIALIZED_NAME_MERCHANT_REFERENCE_ID = "merchantReferenceId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFERENCE_ID)
  private String merchantReferenceId;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT = "grossAmount";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT)
  private BigDecimal grossAmount;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;


  public MerchantTransactionSummary transactionId(String transactionId) {
    
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


  public MerchantTransactionSummary clientReference(String clientReference) {
    
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


  public MerchantTransactionSummary type(TypeEnum type) {
    
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


  public MerchantTransactionSummary executionTime(OffsetDateTime executionTime) {
    
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


  public MerchantTransactionSummary status(StatusEnum status) {
    
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


  public MerchantTransactionSummary rollback(RollbackEnum rollback) {
    
    this.rollback = rollback;
    return this;
  }

   /**
   * The rollback state of this transaction
   * @return rollback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rollback state of this transaction")

  public RollbackEnum getRollback() {
    return rollback;
  }


  public void setRollback(RollbackEnum rollback) {
    this.rollback = rollback;
  }


  public MerchantTransactionSummary subTransactions(List<Object> subTransactions) {
    
    this.subTransactions = subTransactions;
    return this;
  }

  public MerchantTransactionSummary addSubTransactionsItem(Object subTransactionsItem) {
    if (this.subTransactions == null) {
      this.subTransactions = new ArrayList<Object>();
    }
    this.subTransactions.add(subTransactionsItem);
    return this;
  }

   /**
   * Array of transaction responses returned by downstream processes
   * @return subTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of transaction responses returned by downstream processes")

  public List<Object> getSubTransactions() {
    return subTransactions;
  }


  public void setSubTransactions(List<Object> subTransactions) {
    this.subTransactions = subTransactions;
  }


  public MerchantTransactionSummary refundReason(String refundReason) {
    
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


  public MerchantTransactionSummary instruments(List<InstrumentAllocation> instruments) {
    
    this.instruments = instruments;
    return this;
  }

  public MerchantTransactionSummary addInstrumentsItem(InstrumentAllocation instrumentsItem) {
    this.instruments.add(instrumentsItem);
    return this;
  }

   /**
   * The instruments used to make the payment.  For refunds and cash back amounts will be negative
   * @return instruments
  **/
  @ApiModelProperty(required = true, value = "The instruments used to make the payment.  For refunds and cash back amounts will be negative")

  public List<InstrumentAllocation> getInstruments() {
    return instruments;
  }


  public void setInstruments(List<InstrumentAllocation> instruments) {
    this.instruments = instruments;
  }


  public MerchantTransactionSummary paymentRequestId(String paymentRequestId) {
    
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


  public MerchantTransactionSummary merchantReferenceId(String merchantReferenceId) {
    
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


  public MerchantTransactionSummary grossAmount(BigDecimal grossAmount) {
    
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


  public MerchantTransactionSummary walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The ID of the wallet associated with this transaction
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "The ID of the wallet associated with this transaction")

  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantTransactionSummary merchantTransactionSummary = (MerchantTransactionSummary) o;
    return Objects.equals(this.transactionId, merchantTransactionSummary.transactionId) &&
        Objects.equals(this.clientReference, merchantTransactionSummary.clientReference) &&
        Objects.equals(this.type, merchantTransactionSummary.type) &&
        Objects.equals(this.executionTime, merchantTransactionSummary.executionTime) &&
        Objects.equals(this.status, merchantTransactionSummary.status) &&
        Objects.equals(this.rollback, merchantTransactionSummary.rollback) &&
        Objects.equals(this.subTransactions, merchantTransactionSummary.subTransactions) &&
        Objects.equals(this.refundReason, merchantTransactionSummary.refundReason) &&
        Objects.equals(this.instruments, merchantTransactionSummary.instruments) &&
        Objects.equals(this.paymentRequestId, merchantTransactionSummary.paymentRequestId) &&
        Objects.equals(this.merchantReferenceId, merchantTransactionSummary.merchantReferenceId) &&
        Objects.equals(this.grossAmount, merchantTransactionSummary.grossAmount) &&
        Objects.equals(this.walletId, merchantTransactionSummary.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, clientReference, type, executionTime, status, rollback, subTransactions, refundReason, instruments, paymentRequestId, merchantReferenceId, grossAmount, walletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantTransactionSummary {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rollback: ").append(toIndentedString(rollback)).append("\n");
    sb.append("    subTransactions: ").append(toIndentedString(subTransactions)).append("\n");
    sb.append("    refundReason: ").append(toIndentedString(refundReason)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
    sb.append("    paymentRequestId: ").append(toIndentedString(paymentRequestId)).append("\n");
    sb.append("    merchantReferenceId: ").append(toIndentedString(merchantReferenceId)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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

