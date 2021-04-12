/*
 * Wpay APIs
 * Wpay APIs for payments and gifting
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package au.com.woolworths.village.sdk.openapi.dto;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The JSON request structure of the Transaction History endpoint.
 */
@ApiModel(description = "The JSON request structure of the Transaction History endpoint.")

public class TransactionHistoryRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets transactionTypes
   */
  @JsonAdapter(TransactionTypesEnum.Adapter.class)
  public enum TransactionTypesEnum {
    PREAUTH("PREAUTH"),
    
    PURCHASE("PURCHASE"),
    
    COMPLETION("COMPLETION"),
    
    VOID("VOID"),
    
    REFUND("REFUND");

    private String value;

    TransactionTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionTypesEnum fromValue(String value) {
      for (TransactionTypesEnum b : TransactionTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransactionTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_TYPES = "transactionTypes";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPES)
  private List<TransactionTypesEnum> transactionTypes = new ArrayList<TransactionTypesEnum>();

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_IDS = "paymentInstrumentIds";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_IDS)
  private List<String> paymentInstrumentIds = null;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_TRANSACTION_REF = "transactionRef";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REF)
  private String transactionRef;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_MAX_RECORDS = "maxRecords";
  @SerializedName(SERIALIZED_NAME_MAX_RECORDS)
  private BigDecimal maxRecords;


  public TransactionHistoryRequest transactionTypes(List<TransactionTypesEnum> transactionTypes) {
    
    this.transactionTypes = transactionTypes;
    return this;
  }

  public TransactionHistoryRequest addTransactionTypesItem(TransactionTypesEnum transactionTypesItem) {
    this.transactionTypes.add(transactionTypesItem);
    return this;
  }

   /**
   * The container transaction types to include in the results.
   * @return transactionTypes
  **/
  @ApiModelProperty(required = true, value = "The container transaction types to include in the results.")

  public List<TransactionTypesEnum> getTransactionTypes() {
    return transactionTypes;
  }


  public void setTransactionTypes(List<TransactionTypesEnum> transactionTypes) {
    this.transactionTypes = transactionTypes;
  }


  public TransactionHistoryRequest paymentInstrumentIds(List<String> paymentInstrumentIds) {
    
    this.paymentInstrumentIds = paymentInstrumentIds;
    return this;
  }

  public TransactionHistoryRequest addPaymentInstrumentIdsItem(String paymentInstrumentIdsItem) {
    if (this.paymentInstrumentIds == null) {
      this.paymentInstrumentIds = new ArrayList<String>();
    }
    this.paymentInstrumentIds.add(paymentInstrumentIdsItem);
    return this;
  }

   /**
   * The ids of the payment instruments to include in the results.
   * @return paymentInstrumentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the payment instruments to include in the results.")

  public List<String> getPaymentInstrumentIds() {
    return paymentInstrumentIds;
  }


  public void setPaymentInstrumentIds(List<String> paymentInstrumentIds) {
    this.paymentInstrumentIds = paymentInstrumentIds;
  }


  public TransactionHistoryRequest clientReference(String clientReference) {
    
    this.clientReference = clientReference;
    return this;
  }

   /**
   * A merchant application specific reference number to include in the results.
   * @return clientReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T5ESYRPWJKPHF54", value = "A merchant application specific reference number to include in the results.")

  public String getClientReference() {
    return clientReference;
  }


  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }


  public TransactionHistoryRequest transactionRef(String transactionRef) {
    
    this.transactionRef = transactionRef;
    return this;
  }

   /**
   * A container reference number to include in the results.
   * @return transactionRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000000000670621", value = "A container reference number to include in the results.")

  public String getTransactionRef() {
    return transactionRef;
  }


  public void setTransactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
  }


  public TransactionHistoryRequest orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * A merchant order number to include in the results.
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170505090", value = "A merchant order number to include in the results.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public TransactionHistoryRequest startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Limit transactions included in the results FROM this timestamp. The timestamp format is ISO8601.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01T00:00:00.000+1100", value = "Limit transactions included in the results FROM this timestamp. The timestamp format is ISO8601.")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public TransactionHistoryRequest endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Limit transactions included in the results TO this timestamp . The timestamp format is ISO8601.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-12-31T23:59:59.999+1100", value = "Limit transactions included in the results TO this timestamp . The timestamp format is ISO8601.")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public TransactionHistoryRequest maxRecords(BigDecimal maxRecords) {
    
    this.maxRecords = maxRecords;
    return this;
  }

   /**
   * The max number of transactions to include in the results.
   * @return maxRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The max number of transactions to include in the results.")

  public BigDecimal getMaxRecords() {
    return maxRecords;
  }


  public void setMaxRecords(BigDecimal maxRecords) {
    this.maxRecords = maxRecords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionHistoryRequest transactionHistoryRequest = (TransactionHistoryRequest) o;
    return Objects.equals(this.transactionTypes, transactionHistoryRequest.transactionTypes) &&
        Objects.equals(this.paymentInstrumentIds, transactionHistoryRequest.paymentInstrumentIds) &&
        Objects.equals(this.clientReference, transactionHistoryRequest.clientReference) &&
        Objects.equals(this.transactionRef, transactionHistoryRequest.transactionRef) &&
        Objects.equals(this.orderNumber, transactionHistoryRequest.orderNumber) &&
        Objects.equals(this.startDate, transactionHistoryRequest.startDate) &&
        Objects.equals(this.endDate, transactionHistoryRequest.endDate) &&
        Objects.equals(this.maxRecords, transactionHistoryRequest.maxRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionTypes, paymentInstrumentIds, clientReference, transactionRef, orderNumber, startDate, endDate, maxRecords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionHistoryRequest {\n");
    sb.append("    transactionTypes: ").append(toIndentedString(transactionTypes)).append("\n");
    sb.append("    paymentInstrumentIds: ").append(toIndentedString(paymentInstrumentIds)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    transactionRef: ").append(toIndentedString(transactionRef)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    maxRecords: ").append(toIndentedString(maxRecords)).append("\n");
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
