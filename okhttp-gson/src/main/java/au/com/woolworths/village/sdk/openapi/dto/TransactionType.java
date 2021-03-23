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

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The container transaction type.
 */
@JsonAdapter(TransactionType.Adapter.class)
public enum TransactionType {
  
  PREAUTH("PREAUTH"),
  
  PURCHASE("PURCHASE"),
  
  COMPLETION("COMPLETION"),
  
  VOID("VOID"),
  
  REFUND("REFUND");

  private String value;

  TransactionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionType fromValue(String value) {
    for (TransactionType b : TransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TransactionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionType.fromValue(value);
    }
  }
}

