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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This object is only required if the payments request contains apple pay instruments.
 */
@ApiModel(description = "This object is only required if the payments request contains apple pay instruments.")

public class PaymentsRequestTransactionTypeApplePay implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The container transaction type to use for apple pay credit card instruments.
   */
  @JsonAdapter(CreditCardEnum.Adapter.class)
  public enum CreditCardEnum {
    PREAUTH("PREAUTH"),
    
    PURCHASE("PURCHASE");

    private String value;

    CreditCardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreditCardEnum fromValue(String value) {
      for (CreditCardEnum b : CreditCardEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CreditCardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreditCardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreditCardEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CreditCardEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CREDIT_CARD = "creditCard";
  @SerializedName(SERIALIZED_NAME_CREDIT_CARD)
  private CreditCardEnum creditCard;

  /**
   * The container transaction type to use for apple pay debit card instruments. Only PURCHASE is currently supported for apple pay debit card instruments.
   */
  @JsonAdapter(DebitCardEnum.Adapter.class)
  public enum DebitCardEnum {
    PURCHASE("PURCHASE");

    private String value;

    DebitCardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DebitCardEnum fromValue(String value) {
      for (DebitCardEnum b : DebitCardEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DebitCardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DebitCardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DebitCardEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DebitCardEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEBIT_CARD = "debitCard";
  @SerializedName(SERIALIZED_NAME_DEBIT_CARD)
  private DebitCardEnum debitCard;


  public PaymentsRequestTransactionTypeApplePay creditCard(CreditCardEnum creditCard) {
    
    this.creditCard = creditCard;
    return this;
  }

   /**
   * The container transaction type to use for apple pay credit card instruments.
   * @return creditCard
  **/
  @ApiModelProperty(required = true, value = "The container transaction type to use for apple pay credit card instruments.")

  public CreditCardEnum getCreditCard() {
    return creditCard;
  }


  public void setCreditCard(CreditCardEnum creditCard) {
    this.creditCard = creditCard;
  }


  public PaymentsRequestTransactionTypeApplePay debitCard(DebitCardEnum debitCard) {
    
    this.debitCard = debitCard;
    return this;
  }

   /**
   * The container transaction type to use for apple pay debit card instruments. Only PURCHASE is currently supported for apple pay debit card instruments.
   * @return debitCard
  **/
  @ApiModelProperty(required = true, value = "The container transaction type to use for apple pay debit card instruments. Only PURCHASE is currently supported for apple pay debit card instruments.")

  public DebitCardEnum getDebitCard() {
    return debitCard;
  }


  public void setDebitCard(DebitCardEnum debitCard) {
    this.debitCard = debitCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsRequestTransactionTypeApplePay paymentsRequestTransactionTypeApplePay = (PaymentsRequestTransactionTypeApplePay) o;
    return Objects.equals(this.creditCard, paymentsRequestTransactionTypeApplePay.creditCard) &&
        Objects.equals(this.debitCard, paymentsRequestTransactionTypeApplePay.debitCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCard, debitCard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsRequestTransactionTypeApplePay {\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    debitCard: ").append(toIndentedString(debitCard)).append("\n");
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

