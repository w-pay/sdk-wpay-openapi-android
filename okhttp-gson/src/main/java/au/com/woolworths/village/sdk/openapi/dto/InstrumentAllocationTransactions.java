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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * Information about the transaction.
 */
@ApiModel(description = "Information about the transaction.")

public class InstrumentAllocationTransactions implements Serializable {
  private static final long serialVersionUID = 1L;

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

  public static final String SERIALIZED_NAME_PAYMENT_TRANSACTION_REF = "paymentTransactionRef";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TRANSACTION_REF)
  private String paymentTransactionRef;

  public static final String SERIALIZED_NAME_REFUND_TRANSACTION_REF = "refundTransactionRef";
  @SerializedName(SERIALIZED_NAME_REFUND_TRANSACTION_REF)
  private String refundTransactionRef;

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

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;


  public InstrumentAllocationTransactions type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of transaction: PAYMENT or REFUND
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of transaction: PAYMENT or REFUND")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InstrumentAllocationTransactions executionTime(OffsetDateTime executionTime) {
    
    this.executionTime = executionTime;
    return this;
  }

   /**
   * Date/time stamp of when the transaction occurred in ISO string format
   * @return executionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-06T19:38:09.890+11:00", value = "Date/time stamp of when the transaction occurred in ISO string format")

  public OffsetDateTime getExecutionTime() {
    return executionTime;
  }


  public void setExecutionTime(OffsetDateTime executionTime) {
    this.executionTime = executionTime;
  }


  public InstrumentAllocationTransactions paymentTransactionRef(String paymentTransactionRef) {
    
    this.paymentTransactionRef = paymentTransactionRef;
    return this;
  }

   /**
   * The reference for the payment.  If a refund this is the reference to the transaction being refunded
   * @return paymentTransactionRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference for the payment.  If a refund this is the reference to the transaction being refunded")

  public String getPaymentTransactionRef() {
    return paymentTransactionRef;
  }


  public void setPaymentTransactionRef(String paymentTransactionRef) {
    this.paymentTransactionRef = paymentTransactionRef;
  }


  public InstrumentAllocationTransactions refundTransactionRef(String refundTransactionRef) {
    
    this.refundTransactionRef = refundTransactionRef;
    return this;
  }

   /**
   * The reference for the refund.
   * @return refundTransactionRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference for the refund.")

  public String getRefundTransactionRef() {
    return refundTransactionRef;
  }


  public void setRefundTransactionRef(String refundTransactionRef) {
    this.refundTransactionRef = refundTransactionRef;
  }


  public InstrumentAllocationTransactions status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the transactions
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current status of the transactions")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public InstrumentAllocationTransactions amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount charged against or refunded to this instrument
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount charged against or refunded to this instrument")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentAllocationTransactions instrumentAllocationTransactions = (InstrumentAllocationTransactions) o;
    return Objects.equals(this.type, instrumentAllocationTransactions.type) &&
        Objects.equals(this.executionTime, instrumentAllocationTransactions.executionTime) &&
        Objects.equals(this.paymentTransactionRef, instrumentAllocationTransactions.paymentTransactionRef) &&
        Objects.equals(this.refundTransactionRef, instrumentAllocationTransactions.refundTransactionRef) &&
        Objects.equals(this.status, instrumentAllocationTransactions.status) &&
        Objects.equals(this.amount, instrumentAllocationTransactions.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, executionTime, paymentTransactionRef, refundTransactionRef, status, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentAllocationTransactions {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
    sb.append("    paymentTransactionRef: ").append(toIndentedString(paymentTransactionRef)).append("\n");
    sb.append("    refundTransactionRef: ").append(toIndentedString(refundTransactionRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

