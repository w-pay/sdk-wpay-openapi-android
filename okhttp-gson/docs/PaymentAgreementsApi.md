# PaymentAgreementsApi

All URIs are relative to *https://dev.wpay.com.au/wow/v1/pay*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentagreementsChargePost**](PaymentAgreementsApi.md#paymentagreementsChargePost) | **POST** /paymentagreements/charge | Charge Payment Agreement
[**paymentagreementsPaymentTokenDelete**](PaymentAgreementsApi.md#paymentagreementsPaymentTokenDelete) | **DELETE** /paymentagreements/{paymentToken} | Delete Payment Agreement
[**paymentagreementsPaymentTokenPost**](PaymentAgreementsApi.md#paymentagreementsPaymentTokenPost) | **POST** /paymentagreements/{paymentToken} | Update Payment Agreement
[**paymentagreementsPost**](PaymentAgreementsApi.md#paymentagreementsPost) | **POST** /paymentagreements | Create Payment Agreement


<a name="paymentagreementsChargePost"></a>
# **paymentagreementsChargePost**
> PaymentAgreementResponse paymentagreementsChargePost(xApiKey, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId)

Charge Payment Agreement

Perform charge transaction against a payment agreement. This service will use the provided information to perform the charge transaction. A charge payment is made by the merchant to charge a customer as per their payment agreement. This API is IP restricted to allow unauthenticated server side calls.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.PaymentAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PaymentAgreementsApi apiInstance = new PaymentAgreementsApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible.
    ChargePaymentAgreementRequest body = new ChargePaymentAgreementRequest(); // ChargePaymentAgreementRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      PaymentAgreementResponse result = apiInstance.paymentagreementsChargePost(xApiKey, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentAgreementsApi#paymentagreementsChargePost");
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
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. |
 **body** | [**ChargePaymentAgreementRequest**](ChargePaymentAgreementRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**PaymentAgreementResponse**](PaymentAgreementResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Missing or invalid request payload or value. |  -  |
**401** | Invalid API Key or API Product Match Not Found or Invalid Token or Expired Token. |  -  |
**404** | Invalid API Route. |  -  |
**500** | An unknown error occurred. |  -  |
**501** | A Business Validation error occurred. |  -  |
**502** | An Internal System error occurred. |  -  |
**503** | The Service is currently unavailable. |  -  |
**504** | The request timed out. |  -  |

<a name="paymentagreementsPaymentTokenDelete"></a>
# **paymentagreementsPaymentTokenDelete**
> Object paymentagreementsPaymentTokenDelete(paymentToken, xApiKey, xAuthKey, xAuthDigest, xMessageId)

Delete Payment Agreement

Delete an existing payment agreement. This API is IP restricted to allow unauthenticated server side calls.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.PaymentAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PaymentAgreementsApi apiInstance = new PaymentAgreementsApi(defaultClient);
    String paymentToken = "paymentToken_example"; // String | The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement.
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      Object result = apiInstance.paymentagreementsPaymentTokenDelete(paymentToken, xApiKey, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentAgreementsApi#paymentagreementsPaymentTokenDelete");
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
 **paymentToken** | **String**| The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement. |
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Missing or invalid request payload or value. |  -  |
**401** | Invalid API Key or API Product Match Not Found or Invalid Token or Expired Token. |  -  |
**404** | Invalid API Route. |  -  |
**500** | An unknown error occurred. |  -  |
**501** | A Business Validation error occurred. |  -  |
**502** | An Internal System error occurred. |  -  |
**503** | The Service is currently unavailable. |  -  |
**504** | The request timed out. |  -  |

<a name="paymentagreementsPaymentTokenPost"></a>
# **paymentagreementsPaymentTokenPost**
> PaymentAgreementResponse paymentagreementsPaymentTokenPost(paymentToken, xApiKey, authorization, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId)

Update Payment Agreement

Update an existing payment agreement and validate the payment instrument if changed. This API is IP restricted to allow unauthenticated server side calls.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.PaymentAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PaymentAgreementsApi apiInstance = new PaymentAgreementsApi(defaultClient);
    String paymentToken = 27e07e4e-58df-4072-8e75-33dd464af667; // String | The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement.
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    UpdatePaymentAgreementRequest body = new UpdatePaymentAgreementRequest(); // UpdatePaymentAgreementRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      PaymentAgreementResponse result = apiInstance.paymentagreementsPaymentTokenPost(paymentToken, xApiKey, authorization, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentAgreementsApi#paymentagreementsPaymentTokenPost");
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
 **paymentToken** | **String**| The payment token of the payment agreement. The payment token is a unique identifier for the payment agreement. |
 **xApiKey** | **String**| The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team. |
 **authorization** | **String**| The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present. |
 **xJWSSignature** | **String**| The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present. |
 **body** | [**UpdatePaymentAgreementRequest**](UpdatePaymentAgreementRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**PaymentAgreementResponse**](PaymentAgreementResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Missing or invalid request payload or value. |  -  |
**401** | Invalid API Key or API Product Match Not Found or Invalid Token or Expired Token. |  -  |
**404** | Invalid API Route. |  -  |
**500** | An unknown error occurred. |  -  |
**501** | A Business Validation error occurred. |  -  |
**502** | An Internal System error occurred. |  -  |
**503** | The Service is currently unavailable. |  -  |
**504** | The request timed out. |  -  |

<a name="paymentagreementsPost"></a>
# **paymentagreementsPost**
> PaymentAgreementResponse paymentagreementsPost(xApiKey, authorization, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId)

Create Payment Agreement

Create a new payment agreement which will be added to the users wallet after validating the payment instrument. This API is IP restricted to allow unauthenticated server side calls.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.PaymentAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PaymentAgreementsApi apiInstance = new PaymentAgreementsApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    CreatePaymentAgreementRequest body = new CreatePaymentAgreementRequest(); // CreatePaymentAgreementRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      PaymentAgreementResponse result = apiInstance.paymentagreementsPost(xApiKey, authorization, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentAgreementsApi#paymentagreementsPost");
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
 **body** | [**CreatePaymentAgreementRequest**](CreatePaymentAgreementRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**PaymentAgreementResponse**](PaymentAgreementResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Missing or invalid request payload or value. |  -  |
**401** | Invalid API Key or API Product Match Not Found or Invalid Token or Expired Token. |  -  |
**404** | Invalid API Route. |  -  |
**500** | An unknown error occurred. |  -  |
**501** | A Business Validation error occurred. |  -  |
**502** | An Internal System error occurred. |  -  |
**503** | The Service is currently unavailable. |  -  |
**504** | The request timed out. |  -  |

