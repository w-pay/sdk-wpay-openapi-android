# PaymentsApi

All URIs are relative to *https://dev.wpay.com.au/wow/v1/pay*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completionsPost**](PaymentsApi.md#completionsPost) | **POST** /completions | Completions
[**guestPaymentsPost**](PaymentsApi.md#guestPaymentsPost) | **POST** /guest/payments | Guest Payments
[**paymentsPost**](PaymentsApi.md#paymentsPost) | **POST** /payments | Payments
[**refundsPost**](PaymentsApi.md#refundsPost) | **POST** /refunds | Refunds
[**voidsPost**](PaymentsApi.md#voidsPost) | **POST** /voids | Voids


<a name="completionsPost"></a>
# **completionsPost**
> CompletionsSuccessResponse completionsPost(xApiKey, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId)

Completions

Complete pre-authed payments. This API is IP restricted to allow unauthenticated server side calls.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible.
    CompletionsRequest body = new CompletionsRequest(); // CompletionsRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      CompletionsSuccessResponse result = apiInstance.completionsPost(xApiKey, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#completionsPost");
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
 **body** | [**CompletionsRequest**](CompletionsRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**CompletionsSuccessResponse**](CompletionsSuccessResponse.md)

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

<a name="guestPaymentsPost"></a>
# **guestPaymentsPost**
> PaymentsSuccessResponse guestPaymentsPost(xApiKey, authorization, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId)

Guest Payments

Make guest payments to a merchant using guest payment intruments.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    PaymentsRequest body = new PaymentsRequest(); // PaymentsRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      PaymentsSuccessResponse result = apiInstance.guestPaymentsPost(xApiKey, authorization, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#guestPaymentsPost");
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
 **body** | [**PaymentsRequest**](PaymentsRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**PaymentsSuccessResponse**](PaymentsSuccessResponse.md)

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

<a name="paymentsPost"></a>
# **paymentsPost**
> PaymentsSuccessResponse paymentsPost(xApiKey, authorization, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId, xEverydayPayWallet)

Payments

Make payments to a merchant using payment intruments.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String authorization = Bearer 7M8hv8tqpdfSnsEZIDBzJNo91MHF; // String | The Bearer token for the request. The Bearer token authentication approach can be used by API consumers that implement a client-to-server architecture (mobile app, browser site/page) or server-to-server architecture (BFF, microservice, web server, etc.) for calling Digital Pay APIs. However the Bearer token for a shopper/customer must be obtained from the IDM Server Token API which can only be accessed from a server-to-server architecture (BFF, microservice, web server, etc.). The Authorization header is only required if the X-JWS-Signature header is not present.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible. The X-JWS-Signature header is only required if the Authorization header is not present.
    PaymentsRequest body = new PaymentsRequest(); // PaymentsRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    String xEverydayPayWallet = true; // String | A flag to indicate if the Everyday Pay wallet should be used when processing the API request. Set the header value to \"true\" to use the Everyday Pay wallet. Set the header value to \"false\" or exclude the header completely to use the default merchant wallet.
    try {
      PaymentsSuccessResponse result = apiInstance.paymentsPost(xApiKey, authorization, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId, xEverydayPayWallet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#paymentsPost");
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
 **body** | [**PaymentsRequest**](PaymentsRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]
 **xEverydayPayWallet** | **String**| A flag to indicate if the Everyday Pay wallet should be used when processing the API request. Set the header value to \&quot;true\&quot; to use the Everyday Pay wallet. Set the header value to \&quot;false\&quot; or exclude the header completely to use the default merchant wallet. | [optional]

### Return type

[**PaymentsSuccessResponse**](PaymentsSuccessResponse.md)

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

<a name="refundsPost"></a>
# **refundsPost**
> RefundsSuccessResponse refundsPost(xApiKey, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId)

Refunds

Refund payments. This API is IP restricted to allow unauthenticated server side calls.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible.
    RefundsRequest body = new RefundsRequest(); // RefundsRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      RefundsSuccessResponse result = apiInstance.refundsPost(xApiKey, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#refundsPost");
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
 **body** | [**RefundsRequest**](RefundsRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**RefundsSuccessResponse**](RefundsSuccessResponse.md)

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

<a name="voidsPost"></a>
# **voidsPost**
> VoidsSuccessResponse voidsPost(xApiKey, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId)

Voids

Void (cancel) pre-authed payments. This API is IP restricted to allow unauthenticated server side calls.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible.
    VoidsRequest body = new VoidsRequest(); // VoidsRequest | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      VoidsSuccessResponse result = apiInstance.voidsPost(xApiKey, xJWSSignature, body, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#voidsPost");
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
 **body** | [**VoidsRequest**](VoidsRequest.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**VoidsSuccessResponse**](VoidsSuccessResponse.md)

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

