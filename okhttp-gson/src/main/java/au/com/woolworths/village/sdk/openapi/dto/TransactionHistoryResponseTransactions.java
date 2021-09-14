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
import java.io.Serializable;

/**
 * TransactionHistoryResponseTransactions
 */

public class TransactionHistoryResponseTransactions implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The container transaction type.
   */
  @JsonAdapter(TransactionTypeEnum.Adapter.class)
  public enum TransactionTypeEnum {
    PREAUTH("PREAUTH"),
    
    PURCHASE("PURCHASE"),
    
    COMPLETION("COMPLETION"),
    
    VOID("VOID"),
    
    REFUND("REFUND");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionTypeEnum fromValue(String value) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransactionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionTypeEnum transactionType;

  public static final String SERIALIZED_NAME_TRANSACTION_REF = "transactionRef";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REF)
  private String transactionRef;

  public static final String SERIALIZED_NAME_TRANSACTION_TIMESTAMP = "transactionTimestamp";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TIMESTAMP)
  private String transactionTimestamp;

  public static final String SERIALIZED_NAME_APPLICATION_REF = "applicationRef";
  @SerializedName(SERIALIZED_NAME_APPLICATION_REF)
  private String applicationRef;

  public static final String SERIALIZED_NAME_APPLICATION_NAME = "applicationName";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_CARD_SUFFIX = "cardSuffix";
  @SerializedName(SERIALIZED_NAME_CARD_SUFFIX)
  private String cardSuffix;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_TYPE = "paymentInstrumentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_TYPE)
  private String paymentInstrumentType;


  public TransactionHistoryResponseTransactions transactionType(TransactionTypeEnum transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * The container transaction type.
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "The container transaction type.")

  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }


  public TransactionHistoryResponseTransactions transactionRef(String transactionRef) {
    
    this.transactionRef = transactionRef;
    return this;
  }

   /**
   * Container reference in the transaction logs. This number uniquely identifies the transaction in the container.
   * @return transactionRef
  **/
  @ApiModelProperty(example = "1000000000671560", required = true, value = "Container reference in the transaction logs. This number uniquely identifies the transaction in the container.")

  public String getTransactionRef() {
    return transactionRef;
  }


  public void setTransactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
  }


  public TransactionHistoryResponseTransactions transactionTimestamp(String transactionTimestamp) {
    
    this.transactionTimestamp = transactionTimestamp;
    return this;
  }

   /**
   * The container transaction timestamp. The timestamp format is ISO8601.
   * @return transactionTimestamp
  **/
  @ApiModelProperty(example = "2017-11-08T05:06:57.513Z", required = true, value = "The container transaction timestamp. The timestamp format is ISO8601.")

  public String getTransactionTimestamp() {
    return transactionTimestamp;
  }


  public void setTransactionTimestamp(String transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
  }


  public TransactionHistoryResponseTransactions applicationRef(String applicationRef) {
    
    this.applicationRef = applicationRef;
    return this;
  }

   /**
   * A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system. The current implementation assigns the \&quot;clientReference\&quot; value to this property.
   * @return applicationRef
  **/
  @ApiModelProperty(example = "T5ESYRPWJKPHF54", required = true, value = "A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system. The current implementation assigns the \"clientReference\" value to this property.")

  public String getApplicationRef() {
    return applicationRef;
  }


  public void setApplicationRef(String applicationRef) {
    this.applicationRef = applicationRef;
  }


  public TransactionHistoryResponseTransactions applicationName(String applicationName) {
    
    this.applicationName = applicationName;
    return this;
  }

   /**
   * The container application name of the merchant.
   * @return applicationName
  **/
  @ApiModelProperty(example = "WowOnline", required = true, value = "The container application name of the merchant.")

  public String getApplicationName() {
    return applicationName;
  }


  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public TransactionHistoryResponseTransactions clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.
   * @return clientReference
  **/
  @ApiModelProperty(example = "T5ESYRPWJKPHF54", required = true, value = "A merchant application specific reference number. This number should uniquely identify the transaction in the merchant’s system.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public TransactionHistoryResponseTransactions orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * The merchant order number of the transaction.
   * @return orderNumber
  **/
  @ApiModelProperty(example = "20170505090", required = true, value = "The merchant order number of the transaction.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public TransactionHistoryResponseTransactions bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * The bin (first 4 digits) of the card number used in the transaction. Will be null for transactions where bin is not applicable.
   * @return bin
  **/
  @ApiModelProperty(example = "5468", required = true, value = "The bin (first 4 digits) of the card number used in the transaction. Will be null for transactions where bin is not applicable.")

  public String getBin() {
    return bin;
  }


  public void setBin(String bin) {
    this.bin = bin;
  }


  public TransactionHistoryResponseTransactions network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * The type of payment instrument used in the transaction. For credit card transactions this property will contain the scheme.
   * @return network
  **/
  @ApiModelProperty(example = "MASTERCARD", required = true, value = "The type of payment instrument used in the transaction. For credit card transactions this property will contain the scheme.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public TransactionHistoryResponseTransactions cardSuffix(String cardSuffix) {
    
    this.cardSuffix = cardSuffix;
    return this;
  }

   /**
   * The suffix (last 4 digits) of the card number used in the transaction. Will be null for transactions where suffix is not applicable.
   * @return cardSuffix
  **/
  @ApiModelProperty(example = "6106", required = true, value = "The suffix (last 4 digits) of the card number used in the transaction. Will be null for transactions where suffix is not applicable.")

  public String getCardSuffix() {
    return cardSuffix;
  }


  public void setCardSuffix(String cardSuffix) {
    this.cardSuffix = cardSuffix;
  }


  public TransactionHistoryResponseTransactions amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transaction.
   * @return amount
  **/
  @ApiModelProperty(example = "20.5", required = true, value = "The amount of the transaction.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public TransactionHistoryResponseTransactions comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * The comment set in the tokenization request of Google/Apple Pay instruments. Will be null for transactions where comment is not applicable.
   * @return comment
  **/
  @ApiModelProperty(example = "VISA-4405", required = true, value = "The comment set in the tokenization request of Google/Apple Pay instruments. Will be null for transactions where comment is not applicable.")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public TransactionHistoryResponseTransactions paymentInstrumentType(String paymentInstrumentType) {
    
    this.paymentInstrumentType = paymentInstrumentType;
    return this;
  }

   /**
   * The type of the payment instrument used in the transaction.
   * @return paymentInstrumentType
  **/
  @ApiModelProperty(example = "CREDIT_CARD", required = true, value = "The type of the payment instrument used in the transaction.")

  public String getPaymentInstrumentType() {
    return paymentInstrumentType;
  }


  public void setPaymentInstrumentType(String paymentInstrumentType) {
    this.paymentInstrumentType = paymentInstrumentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionHistoryResponseTransactions transactionHistoryResponseTransactions = (TransactionHistoryResponseTransactions) o;
    return Objects.equals(this.transactionType, transactionHistoryResponseTransactions.transactionType) &&
        Objects.equals(this.transactionRef, transactionHistoryResponseTransactions.transactionRef) &&
        Objects.equals(this.transactionTimestamp, transactionHistoryResponseTransactions.transactionTimestamp) &&
        Objects.equals(this.applicationRef, transactionHistoryResponseTransactions.applicationRef) &&
        Objects.equals(this.applicationName, transactionHistoryResponseTransactions.applicationName) &&
        Objects.equals(this.clientReference, transactionHistoryResponseTransactions.clientReference) &&
        Objects.equals(this.orderNumber, transactionHistoryResponseTransactions.orderNumber) &&
        Objects.equals(this.bin, transactionHistoryResponseTransactions.bin) &&
        Objects.equals(this.network, transactionHistoryResponseTransactions.network) &&
        Objects.equals(this.cardSuffix, transactionHistoryResponseTransactions.cardSuffix) &&
        Objects.equals(this.amount, transactionHistoryResponseTransactions.amount) &&
        Objects.equals(this.comment, transactionHistoryResponseTransactions.comment) &&
        Objects.equals(this.paymentInstrumentType, transactionHistoryResponseTransactions.paymentInstrumentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, transactionRef, transactionTimestamp, applicationRef, applicationName, clientReference, orderNumber, bin, network, cardSuffix, amount, comment, paymentInstrumentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionHistoryResponseTransactions {\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionRef: ").append(toIndentedString(transactionRef)).append("\n");
    sb.append("    transactionTimestamp: ").append(toIndentedString(transactionTimestamp)).append("\n");
    sb.append("    applicationRef: ").append(toIndentedString(applicationRef)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    cardSuffix: ").append(toIndentedString(cardSuffix)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    paymentInstrumentType: ").append(toIndentedString(paymentInstrumentType)).append("\n");
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

