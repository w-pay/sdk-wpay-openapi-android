# GiftingApi

All URIs are relative to *https://dev-api.wpay.com.au/wow/v1/pay*

Method | HTTP request | Description
------------- | ------------- | -------------
[**giftingProductsGet**](GiftingApi.md#giftingProductsGet) | **GET** /gifting/products | Retrieve Gift Card Products
[**giftingProductsOrderPost**](GiftingApi.md#giftingProductsOrderPost) | **POST** /gifting/products/order | Order Gift Card
[**giftingProductsProductIdGet**](GiftingApi.md#giftingProductsProductIdGet) | **GET** /gifting/products/{productId} | Retrieve Gift Card Product Detail
[**giftingProductsQuotePost**](GiftingApi.md#giftingProductsQuotePost) | **POST** /gifting/products/quote | Obtain Gift Card Quote


<a name="giftingProductsGet"></a>
# **giftingProductsGet**
> InlineResponse200 giftingProductsGet(xApiKey, xJWSSignature, xAuthKey, xAuthDigest, xMessageId, lastUpdateDateTime, pageSize, page)

Retrieve Gift Card Products

Obtains a list of available gift card products that can be purchased.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.GiftingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GiftingApi apiInstance = new GiftingApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible.
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    OffsetDateTime lastUpdateDateTime = 2017-11-06T19:38:09.890+11:00; // OffsetDateTime | If present, the date/time to limit products returned.  Only products changed since this time will be returned
    Integer pageSize = 25; // Integer | The number of records to return for this page.  Defaults to 25 if absent
    Integer page = 1; // Integer | The page of results to return with 1 indicating the first page.  Defaults to 1 if absent
    try {
      InlineResponse200 result = apiInstance.giftingProductsGet(xApiKey, xJWSSignature, xAuthKey, xAuthDigest, xMessageId, lastUpdateDateTime, pageSize, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftingApi#giftingProductsGet");
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
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]
 **lastUpdateDateTime** | **OffsetDateTime**| If present, the date/time to limit products returned.  Only products changed since this time will be returned | [optional]
 **pageSize** | **Integer**| The number of records to return for this page.  Defaults to 25 if absent | [optional] [default to 25]
 **page** | **Integer**| The page of results to return with 1 indicating the first page.  Defaults to 1 if absent | [optional] [default to 1]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Missing or invalid request payload or value. |  -  |
**401** | Invalid API Key or API Product Match Not Found or Invalid Token or Expired Token. |  -  |
**404** | Invalid API Route. |  -  |
**500** | An unknown error occurred. |  -  |
**501** | A Business Validation error occurred. |  -  |
**502** | An Internal System error occurred. |  -  |
**503** | The Service is currently unavailable. |  -  |
**504** | The request timed out. |  -  |

<a name="giftingProductsOrderPost"></a>
# **giftingProductsOrderPost**
> InlineResponse2003 giftingProductsOrderPost(xApiKey, xJWSSignature, inlineObject1, xAuthKey, xAuthDigest, xMessageId)

Order Gift Card

Order a gift card product.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.GiftingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GiftingApi apiInstance = new GiftingApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible.
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      InlineResponse2003 result = apiInstance.giftingProductsOrderPost(xApiKey, xJWSSignature, inlineObject1, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftingApi#giftingProductsOrderPost");
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Missing or invalid request payload or value. |  -  |
**401** | Invalid API Key or API Product Match Not Found or Invalid Token or Expired Token. |  -  |
**404** | Invalid API Route. |  -  |
**500** | An unknown error occurred. |  -  |
**501** | A Business Validation error occurred. |  -  |
**502** | An Internal System error occurred. |  -  |
**503** | The Service is currently unavailable. |  -  |
**504** | The request timed out. |  -  |

<a name="giftingProductsProductIdGet"></a>
# **giftingProductsProductIdGet**
> InlineResponse2001 giftingProductsProductIdGet(xApiKey, xJWSSignature, productId, xAuthKey, xAuthDigest, xMessageId)

Retrieve Gift Card Product Detail

Obtains a list of available gift card products that can be purchased.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.GiftingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GiftingApi apiInstance = new GiftingApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible.
    String productId = "productId_example"; // String | The ID of the specific gift card product
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      InlineResponse2001 result = apiInstance.giftingProductsProductIdGet(xApiKey, xJWSSignature, productId, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftingApi#giftingProductsProductIdGet");
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
 **productId** | **String**| The ID of the specific gift card product |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Missing or invalid request payload or value. |  -  |
**401** | Invalid API Key or API Product Match Not Found or Invalid Token or Expired Token. |  -  |
**404** | Invalid API Route. |  -  |
**500** | An unknown error occurred. |  -  |
**501** | A Business Validation error occurred. |  -  |
**502** | An Internal System error occurred. |  -  |
**503** | The Service is currently unavailable. |  -  |
**504** | The request timed out. |  -  |

<a name="giftingProductsQuotePost"></a>
# **giftingProductsQuotePost**
> InlineResponse2002 giftingProductsQuotePost(xApiKey, xJWSSignature, inlineObject, xAuthKey, xAuthDigest, xMessageId)

Obtain Gift Card Quote

Validates a gift card order and verifies discount prior to an order being placed.

### Example
```java
// Import classes:
import au.com.woolworths.village.sdk.openapi.client.ApiClient;
import au.com.woolworths.village.sdk.openapi.client.ApiException;
import au.com.woolworths.village.sdk.openapi.client.Configuration;
import au.com.woolworths.village.sdk.openapi.client.auth.*;
import au.com.woolworths.village.sdk.openapi.client.models.*;
import au.com.woolworths.village.sdk.openapi.api.GiftingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev-api.wpay.com.au/wow/v1/pay");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GiftingApi apiInstance = new GiftingApi(defaultClient);
    String xApiKey = haTdoUWVhnXm5n75u6d0VG67vCCvKjQC; // String | The API key for the request. The API keys (non-prod/prod) will be supplied by the Digital Pay team.
    String xJWSSignature = eyJhbGciOiJSUzI1NiIsImtpZCI6ImRldiIsInZlcmIiOiJQT1NUIiwidXJsIjoiaHR0cHM6Ly9kZXYubW9iaWxlLWFwaS53b29sd29ydGhzLmNvbS5hdS93b3cvdjEvandzZGVtby92YWxpZGF0ZSIsInRpbWVzdGFtcCI6MTU5NTIwNjcxNDQzOH0..muEr0b3GNORrP0FW1ohUh2XITRNaOO7uBz; // String | The JWS signature used to sign the request. The JWS signature authentication approach can only be used by API consumers that implement a server-to-server architecture (BFF, microservice, web server, etc.) for calling the Digital Pay APIs. The RSA private key, required to generate the signiture, has to be stored securely and should not be publicly accessible.
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    String xAuthKey = OHR1Ull5TVk53NjI5Ng==; // String | (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present.
    String xAuthDigest = c51e0ee540cd3893982d3539d81fddec0bcd832d; // String | (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present.
    String xMessageId = f23c096b2e816da158fdf1ad839298e2; // String | This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request.
    try {
      InlineResponse2002 result = apiInstance.giftingProductsQuotePost(xApiKey, xJWSSignature, inlineObject, xAuthKey, xAuthDigest, xMessageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftingApi#giftingProductsQuotePost");
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |
 **xAuthKey** | **String**| (Deprecated) You are required to use this header to provide the base64 encoded API key. Requires the X-Auth-Digest header to be present. | [optional]
 **xAuthDigest** | **String**| (Deprecated) You are required to use this header to provide the encrypted API key. The value is the API key encrypted with the client secret key. Requires the X-Auth-Key header to be present. | [optional]
 **xMessageId** | **String**| This id is used to keep track of the request and its response in the Digital Pay platform. If no value is provided for the request header, Apigee will auto generate an id to use for the request. This header will also be returned in the response and will have the value passed in (or auto generated) from the request. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Missing or invalid request payload or value. |  -  |
**401** | Invalid API Key or API Product Match Not Found or Invalid Token or Expired Token. |  -  |
**404** | Invalid API Route. |  -  |
**500** | An unknown error occurred. |  -  |
**501** | A Business Validation error occurred. |  -  |
**502** | An Internal System error occurred. |  -  |
**503** | The Service is currently unavailable. |  -  |
**504** | The request timed out. |  -  |

