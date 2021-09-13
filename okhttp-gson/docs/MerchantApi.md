# MerchantApi

All URIs are relative to *https://dev-api.wpay.com.au/wow/v1/pay*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelPaymentRequestQRCode**](MerchantApi.md#cancelPaymentRequestQRCode) | **DELETE** /instore/merchant/qr/{qrId} | Invalidate QR Code
[**chargeMerchantPaymentAgreement**](MerchantApi.md#chargeMerchantPaymentAgreement) | **PUT** /instore/merchant/payments/agreements/{paymentToken} | Charge Payment Agreement
[**createMerchantSchema**](MerchantApi.md#createMerchantSchema) | **POST** /instore/merchant/schema | Add Schema
[**createPaymentRequest**](MerchantApi.md#createPaymentRequest) | **POST** /instore/merchant/payments | Create Payment
[**createPaymentRequestQRCode**](MerchantApi.md#createPaymentRequestQRCode) | **POST** /instore/merchant/qr | Create QR Code for a payment request
[**createPaymentSession**](MerchantApi.md#createPaymentSession) | **POST** /instore/merchant/payment/session | Create Payment Session
[**deleteMerchantPaymentAgreement**](MerchantApi.md#deleteMerchantPaymentAgreement) | **DELETE** /instore/merchant/payments/agreements/{paymentToken} | Delete Payment Agreement
[**deleteMerchantPaymentRequest**](MerchantApi.md#deleteMerchantPaymentRequest) | **DELETE** /instore/merchant/payments/{paymentRequestId} | Delete Payment Request
[**deletePaymentSession**](MerchantApi.md#deletePaymentSession) | **DELETE** /instore/merchant/payment/session/{paymentSessionId} | Delete Payment Session
[**getMerchantPaymentDetails**](MerchantApi.md#getMerchantPaymentDetails) | **GET** /instore/merchant/payments/{paymentRequestId} | Get Payment Details
[**getMerchantPayments**](MerchantApi.md#getMerchantPayments) | **GET** /instore/merchant/payments | Get Payment List
[**getMerchantPreferences**](MerchantApi.md#getMerchantPreferences) | **GET** /instore/merchant/preferences | Get Preferences
[**getMerchantSchemaDetails**](MerchantApi.md#getMerchantSchemaDetails) | **GET** /instore/merchant/schema/{schemaId} | Get Schema Details
[**getMerchantSchemas**](MerchantApi.md#getMerchantSchemas) | **GET** /instore/merchant/schema | Get Schema List
[**getMerchantTransactionDetails**](MerchantApi.md#getMerchantTransactionDetails) | **GET** /instore/merchant/transactions/{transactionId} | Get Transaction Details
[**getMerchantTransactions**](MerchantApi.md#getMerchantTransactions) | **GET** /instore/merchant/transactions | Get Transaction List
[**getPaymentRequestQRCodeContent**](MerchantApi.md#getPaymentRequestQRCodeContent) | **GET** /instore/merchant/qr/{qrId} | Get QR Code Content
[**getPaymentSession**](MerchantApi.md#getPaymentSession) | **GET** /instore/merchant/payment/session/{paymentSessionId} | Get Payment Session
[**merchantUpdatePaymentSession**](MerchantApi.md#merchantUpdatePaymentSession) | **POST** /instore/merchant/payment/session/{paymentSessionId} | Update Payment Session
[**refundMerchantTransaction**](MerchantApi.md#refundMerchantTransaction) | **POST** /instore/merchant/transactions/{transactionId}/refund | Refund Transaction
[**setMerchantPreferences**](MerchantApi.md#setMerchantPreferences) | **POST** /instore/merchant/preferences | Set Preferences


<a name="cancelPaymentRequestQRCode"></a>
# **cancelPaymentRequestQRCode**
> cancelPaymentRequestQRCode(xApiKey, authorization, xJWSSignature, qrId, xAuthKey, xAuthDigest, xMessageId)

Invalidate QR Code

Cancel an existing QC code.  Effectively expires the QR code

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String qrId = dca8edc5-bbb7-44c0-8056-a5daf4327601; // String | The ID of the specific QR Code
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      apiInstance.cancelPaymentRequestQRCode(xApiKey, authorization, xJWSSignature, qrId, xAuthKey, xAuthDigest, xMessageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#cancelPaymentRequestQRCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **qrId** | **String**| The ID of the specific QR Code |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | QR code has been successfully expired.  Not content returned |  -  |
**422** | The QR code specified doesn&#39;t exist |  -  |

<a name="chargeMerchantPaymentAgreement"></a>
# **chargeMerchantPaymentAgreement**
> ChargePaymentAgreementResponse chargeMerchantPaymentAgreement(xMerchantID, paymentToken, merchantChargePaymentAgreementRequest)

Charge Payment Agreement

Charge a payment agreement

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xMerchantID = 10001; // String | 
    String paymentToken = "paymentToken_example"; // String | The ID of the specific payment agreement
    MerchantChargePaymentAgreementRequest merchantChargePaymentAgreementRequest = new MerchantChargePaymentAgreementRequest(); // MerchantChargePaymentAgreementRequest | 
    try {
      ChargePaymentAgreementResponse result = apiInstance.chargeMerchantPaymentAgreement(xMerchantID, paymentToken, merchantChargePaymentAgreementRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#chargeMerchantPaymentAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xMerchantID** | **String**|  |
 **paymentToken** | **String**| The ID of the specific payment agreement |
 **merchantChargePaymentAgreementRequest** | [**MerchantChargePaymentAgreementRequest**](MerchantChargePaymentAgreementRequest.md)|  |

### Return type

[**ChargePaymentAgreementResponse**](ChargePaymentAgreementResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response for charge payment agreement |  -  |

<a name="createMerchantSchema"></a>
# **createMerchantSchema**
> CreateMerchantSchemaResults createMerchantSchema(xApiKey, authorization, xJWSSignature, merchantSchema, xAuthKey, xAuthDigest, xMessageId)

Add Schema

Add a new schema that can be used in schema based payloads for this merchant

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    MerchantSchema merchantSchema = new MerchantSchema(); // MerchantSchema | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      CreateMerchantSchemaResults result = apiInstance.createMerchantSchema(xApiKey, authorization, xJWSSignature, merchantSchema, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#createMerchantSchema");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **merchantSchema** | [**MerchantSchema**](MerchantSchema.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**CreateMerchantSchemaResults**](CreateMerchantSchemaResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="createPaymentRequest"></a>
# **createPaymentRequest**
> CreatePaymentRequestResults createPaymentRequest(xApiKey, authorization, xJWSSignature, merchantPaymentRequest, xAuthKey, xAuthDigest, xMessageId)

Create Payment

Create a new payment request that can then be presented to a customer for payment

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    MerchantPaymentRequest merchantPaymentRequest = new MerchantPaymentRequest(); // MerchantPaymentRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      CreatePaymentRequestResults result = apiInstance.createPaymentRequest(xApiKey, authorization, xJWSSignature, merchantPaymentRequest, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#createPaymentRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **merchantPaymentRequest** | [**MerchantPaymentRequest**](MerchantPaymentRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**CreatePaymentRequestResults**](CreatePaymentRequestResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="createPaymentRequestQRCode"></a>
# **createPaymentRequestQRCode**
> CreatePaymentRequestQRCodeResults createPaymentRequestQRCode(xApiKey, authorization, xJWSSignature, paymentQRCodeDetails, xAuthKey, xAuthDigest, xMessageId)

Create QR Code for a payment request

Create a new QR code for an existing payment request

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    PaymentQRCodeDetails paymentQRCodeDetails = new PaymentQRCodeDetails(); // PaymentQRCodeDetails | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      CreatePaymentRequestQRCodeResults result = apiInstance.createPaymentRequestQRCode(xApiKey, authorization, xJWSSignature, paymentQRCodeDetails, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#createPaymentRequestQRCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **paymentQRCodeDetails** | [**PaymentQRCodeDetails**](PaymentQRCodeDetails.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**CreatePaymentRequestQRCodeResults**](CreatePaymentRequestQRCodeResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**422** | The specified payment request doesn&#39;t exist or has already been closed |  -  |

<a name="createPaymentSession"></a>
# **createPaymentSession**
> CreateMerchantPaymentSessionResponse createPaymentSession(xApiKey, authorization, xJWSSignature, createPaymentSessionRequest, xAuthKey, xAuthDigest, xMessageId)

Create Payment Session

Create a new payment session

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    CreatePaymentSessionRequest createPaymentSessionRequest = new CreatePaymentSessionRequest(); // CreatePaymentSessionRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      CreateMerchantPaymentSessionResponse result = apiInstance.createPaymentSession(xApiKey, authorization, xJWSSignature, createPaymentSessionRequest, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#createPaymentSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **createPaymentSessionRequest** | [**CreatePaymentSessionRequest**](CreatePaymentSessionRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**CreateMerchantPaymentSessionResponse**](CreateMerchantPaymentSessionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**422** | The specified Payment Session ID doesn&#39;t exist or has expired |  -  |

<a name="deleteMerchantPaymentAgreement"></a>
# **deleteMerchantPaymentAgreement**
> deleteMerchantPaymentAgreement(xMerchantID, paymentToken)

Delete Payment Agreement

Delete an existing payment agreement.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xMerchantID = 10001; // String | 
    String paymentToken = "paymentToken_example"; // String | The ID of the specific payment agreement
    try {
      apiInstance.deleteMerchantPaymentAgreement(xMerchantID, paymentToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#deleteMerchantPaymentAgreement");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xMerchantID** | **String**|  |
 **paymentToken** | **String**| The ID of the specific payment agreement |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Payment request has been successfully deleted. No content returned |  -  |
**422** | The payment agreement specified doesn&#39;t exist |  -  |

<a name="deleteMerchantPaymentRequest"></a>
# **deleteMerchantPaymentRequest**
> deleteMerchantPaymentRequest(xApiKey, authorization, xJWSSignature, paymentRequestId, xAuthKey, xAuthDigest, xMessageId)

Delete Payment Request

Cancel an existing payment by setting the expiration date/time to now and setting the remaining uses to 0.  Will only be successful if the payment is still pending.  Completed payments need to be refunded using the dedicated API for that purpose

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String paymentRequestId = "paymentRequestId_example"; // String | The ID of the specific payment request
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      apiInstance.deleteMerchantPaymentRequest(xApiKey, authorization, xJWSSignature, paymentRequestId, xAuthKey, xAuthDigest, xMessageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#deleteMerchantPaymentRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **paymentRequestId** | **String**| The ID of the specific payment request |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Payment request has been successfully expired.  Not content returned |  -  |
**422** | The payment request specified doesn&#39;t exist |  -  |

<a name="deletePaymentSession"></a>
# **deletePaymentSession**
> deletePaymentSession(xApiKey, authorization, xJWSSignature, paymentSessionId, xAuthKey, xAuthDigest, xMessageId)

Delete Payment Session

Deletes a payment session by setting its expiration date/time to now

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String paymentSessionId = "paymentSessionId_example"; // String | The ID of the specific payment session to delete
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      apiInstance.deletePaymentSession(xApiKey, authorization, xJWSSignature, paymentSessionId, xAuthKey, xAuthDigest, xMessageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#deletePaymentSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **paymentSessionId** | **String**| The ID of the specific payment session to delete |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The payment session has been successfully deleted. No content returned. |  -  |

<a name="getMerchantPaymentDetails"></a>
# **getMerchantPaymentDetails**
> GetMerchantPaymentDetailsResults getMerchantPaymentDetails(xApiKey, authorization, xJWSSignature, paymentRequestId, xAuthKey, xAuthDigest, xMessageId)

Get Payment Details

Get the details for a specific payment.  Provides all types of payments and all payment content

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String paymentRequestId = "paymentRequestId_example"; // String | The ID of the specific payment request
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      GetMerchantPaymentDetailsResults result = apiInstance.getMerchantPaymentDetails(xApiKey, authorization, xJWSSignature, paymentRequestId, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchantPaymentDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **paymentRequestId** | **String**| The ID of the specific payment request |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**GetMerchantPaymentDetailsResults**](GetMerchantPaymentDetailsResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**422** | The specified Payment Request ID doesn&#39;t exist |  -  |

<a name="getMerchantPayments"></a>
# **getMerchantPayments**
> GetMerchantPaymentsResults getMerchantPayments(xApiKey, authorization, xJWSSignature, xAuthKey, xAuthDigest, xMessageId, type, pageSize, page)

Get Payment List

Get a list of the payments initiated by the merchant, both pending and complete

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    String type = ACTIVE; // String | The type of payment requests to return: active, inactive or both
    Integer pageSize = 25; // Integer | The number of records to return for this page.  Defaults to 25 if absent
    Integer page = 1; // Integer | The page of results to return with 1 indicating the first page.  Defaults to 1 if absent
    try {
      GetMerchantPaymentsResults result = apiInstance.getMerchantPayments(xApiKey, authorization, xJWSSignature, xAuthKey, xAuthDigest, xMessageId, type, pageSize, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchantPayments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]
 **type** | **String**| The type of payment requests to return: active, inactive or both | [optional] [default to ACTIVE] [enum: ACTIVE, INACTIVE, ALL]
 **pageSize** | **Integer**| The number of records to return for this page.  Defaults to 25 if absent | [optional] [default to 25]
 **page** | **Integer**| The page of results to return with 1 indicating the first page.  Defaults to 1 if absent | [optional] [default to 1]

### Return type

[**GetMerchantPaymentsResults**](GetMerchantPaymentsResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getMerchantPreferences"></a>
# **getMerchantPreferences**
> MerchantPreferencesResult getMerchantPreferences(xApiKey, authorization, xJWSSignature, xAuthKey, xAuthDigest, xMessageId)

Get Preferences

Get the preferences previously set by the customer or merchant (depending on calling identity)

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      MerchantPreferencesResult result = apiInstance.getMerchantPreferences(xApiKey, authorization, xJWSSignature, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchantPreferences");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**MerchantPreferencesResult**](MerchantPreferencesResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getMerchantSchemaDetails"></a>
# **getMerchantSchemaDetails**
> MerchantSchemaDetailsResult getMerchantSchemaDetails(xApiKey, authorization, xJWSSignature, schemaId, xAuthKey, xAuthDigest, xMessageId)

Get Schema Details

Get the list of currently usable schema previously added for the merchant

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String schemaId = "schemaId_example"; // String | The ID of the specific schema to get details for
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      MerchantSchemaDetailsResult result = apiInstance.getMerchantSchemaDetails(xApiKey, authorization, xJWSSignature, schemaId, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchantSchemaDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **schemaId** | **String**| The ID of the specific schema to get details for |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**MerchantSchemaDetailsResult**](MerchantSchemaDetailsResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getMerchantSchemas"></a>
# **getMerchantSchemas**
> MerchantSchemaResult getMerchantSchemas(xApiKey, authorization, xJWSSignature, xAuthKey, xAuthDigest, xMessageId)

Get Schema List

Get the list of currently usable schema previously added for the merchant

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      MerchantSchemaResult result = apiInstance.getMerchantSchemas(xApiKey, authorization, xJWSSignature, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchantSchemas");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**MerchantSchemaResult**](MerchantSchemaResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getMerchantTransactionDetails"></a>
# **getMerchantTransactionDetails**
> GetMerchantTransactionDetailsResults getMerchantTransactionDetails(xApiKey, authorization, xJWSSignature, transactionId, xAuthKey, xAuthDigest, xMessageId)

Get Transaction Details

Get the details for a specific transaction previously executed with the merchant.  Note that amounts are relative to the merchant.  A positive amount is a positive amount transferred to a merchant

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String transactionId = "transactionId_example"; // String | The ID of the specific transaction
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      GetMerchantTransactionDetailsResults result = apiInstance.getMerchantTransactionDetails(xApiKey, authorization, xJWSSignature, transactionId, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchantTransactionDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **transactionId** | **String**| The ID of the specific transaction |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**GetMerchantTransactionDetailsResults**](GetMerchantTransactionDetailsResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getMerchantTransactions"></a>
# **getMerchantTransactions**
> GetMerchantTransactionsResults getMerchantTransactions(xApiKey, authorization, xJWSSignature, xAuthKey, xAuthDigest, xMessageId, startTime, endTime, pageSize, page)

Get Transaction List

Get a list of the previously executed transactions with the merchant.  Note that amounts are relative to the merchant.  A positive amount is a positive amount transferred to a merchant

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    OffsetDateTime startTime = 2017-11-06T19:38:09.890+11:00; // OffsetDateTime | If present, the date/time to limit transactions returned.  Transactions older than this time will not be returned
    OffsetDateTime endTime = 2017-11-06T19:38:09.890+11:00; // OffsetDateTime | If present, the date/time to limit transactions returned.  Transactions newer than this time will not be returned
    Integer pageSize = 25; // Integer | The number of records to return for this page.  Defaults to 25 if absent
    Integer page = 1; // Integer | The page of results to return with 1 indicating the first page.  Defaults to 1 if absent
    try {
      GetMerchantTransactionsResults result = apiInstance.getMerchantTransactions(xApiKey, authorization, xJWSSignature, xAuthKey, xAuthDigest, xMessageId, startTime, endTime, pageSize, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchantTransactions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]
 **startTime** | **OffsetDateTime**| If present, the date/time to limit transactions returned.  Transactions older than this time will not be returned | [optional]
 **endTime** | **OffsetDateTime**| If present, the date/time to limit transactions returned.  Transactions newer than this time will not be returned | [optional]
 **pageSize** | **Integer**| The number of records to return for this page.  Defaults to 25 if absent | [optional] [default to 25]
 **page** | **Integer**| The page of results to return with 1 indicating the first page.  Defaults to 1 if absent | [optional] [default to 1]

### Return type

[**GetMerchantTransactionsResults**](GetMerchantTransactionsResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getPaymentRequestQRCodeContent"></a>
# **getPaymentRequestQRCodeContent**
> CreatePaymentRequestQRCodeResults getPaymentRequestQRCodeContent(xApiKey, authorization, xJWSSignature, qrId, xAuthKey, xAuthDigest, xMessageId)

Get QR Code Content

Obtain the content or an image for an existing QR code.  If requested content type is application/json then a payload will be returned.  if requested content is image/png an image will be returned

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String qrId = "qrId_example"; // String | The ID of the specific QR Code
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      CreatePaymentRequestQRCodeResults result = apiInstance.getPaymentRequestQRCodeContent(xApiKey, authorization, xJWSSignature, qrId, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getPaymentRequestQRCodeContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **qrId** | **String**| The ID of the specific QR Code |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**CreatePaymentRequestQRCodeResults**](CreatePaymentRequestQRCodeResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**422** | The specified payment request doesn&#39;t exist or has already been closed |  -  |

<a name="getPaymentSession"></a>
# **getPaymentSession**
> CustomerPaymentSessionResult getPaymentSession(xApiKey, authorization, xJWSSignature, paymentSessionId, xAuthKey, xAuthDigest, xMessageId)

Get Payment Session

Get the details of a payment session

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String paymentSessionId = "paymentSessionId_example"; // String | The ID of the specific payment session to retrieve
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      CustomerPaymentSessionResult result = apiInstance.getPaymentSession(xApiKey, authorization, xJWSSignature, paymentSessionId, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getPaymentSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **paymentSessionId** | **String**| The ID of the specific payment session to retrieve |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**CustomerPaymentSessionResult**](CustomerPaymentSessionResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**422** | The specified Payment Session ID doesn&#39;t exist or has expired |  -  |

<a name="merchantUpdatePaymentSession"></a>
# **merchantUpdatePaymentSession**
> merchantUpdatePaymentSession(xApiKey, authorization, xJWSSignature, paymentSessionId, updatePaymentSessionRequest1, xAuthKey, xAuthDigest, xMessageId)

Update Payment Session

Update the payment session details

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String paymentSessionId = "paymentSessionId_example"; // String | The ID of the specific payment session to retrieve
    UpdatePaymentSessionRequest1 updatePaymentSessionRequest1 = new UpdatePaymentSessionRequest1(); // UpdatePaymentSessionRequest1 | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      apiInstance.merchantUpdatePaymentSession(xApiKey, authorization, xJWSSignature, paymentSessionId, updatePaymentSessionRequest1, xAuthKey, xAuthDigest, xMessageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantUpdatePaymentSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **paymentSessionId** | **String**| The ID of the specific payment session to retrieve |
 **updatePaymentSessionRequest1** | [**UpdatePaymentSessionRequest1**](UpdatePaymentSessionRequest1.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The payment session has been successfully updated. No content returned. |  -  |

<a name="refundMerchantTransaction"></a>
# **refundMerchantTransaction**
> RefundMerchantTransactionResults refundMerchantTransaction(xApiKey, authorization, xJWSSignature, transactionId, refundMerchantTransactionRequest, xAuthKey, xAuthDigest, xMessageId)

Refund Transaction

Refund a previously executed transaction

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    String transactionId = "transactionId_example"; // String | The ID of the specific transaction to reverse
    RefundMerchantTransactionRequest refundMerchantTransactionRequest = new RefundMerchantTransactionRequest(); // RefundMerchantTransactionRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      RefundMerchantTransactionResults result = apiInstance.refundMerchantTransaction(xApiKey, authorization, xJWSSignature, transactionId, refundMerchantTransactionRequest, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#refundMerchantTransaction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **transactionId** | **String**| The ID of the specific transaction to reverse |
 **refundMerchantTransactionRequest** | [**RefundMerchantTransactionRequest**](RefundMerchantTransactionRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**RefundMerchantTransactionResults**](RefundMerchantTransactionResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**422** | The transaction specified doesn&#39;t exist or is a refund transaction already |  -  |

<a name="setMerchantPreferences"></a>
# **setMerchantPreferences**
> setMerchantPreferences(xApiKey, authorization, xJWSSignature, merchantPreferences, xAuthKey, xAuthDigest, xMessageId)

Set Preferences

Change the preferences for the customer or merchant (depending on calling identity)

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    MerchantPreferences merchantPreferences = new MerchantPreferences(); // MerchantPreferences | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      apiInstance.setMerchantPreferences(xApiKey, authorization, xJWSSignature, merchantPreferences, xAuthKey, xAuthDigest, xMessageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#setMerchantPreferences");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **merchantPreferences** | [**MerchantPreferences**](MerchantPreferences.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Preferences successfully updated.  No content returned |  -  |

