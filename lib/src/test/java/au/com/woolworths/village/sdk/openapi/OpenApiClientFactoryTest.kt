package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.*
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.nullValue
import org.junit.Assert.*
import org.junit.Test
import java.lang.IllegalStateException

class OpenApiClientFactoryTest {
    private val client = FakeOpenApiClientFactory(
        EmptyRequestHeadersFactory(),
        VillageOptions(
            baseUrl = "",
            apiKey = ""
        )
    )

    @Test
    fun shouldConvertApiExceptionToHttpErrorException() {
        val code = 500
        val headers: Map<String, List<String>> = emptyMap()
        val body = "{}"

        val ex = au.com.woolworths.village.sdk.openapi.client.ApiException(code, headers, body)

        val result: HttpErrorException = makeCall(ex).e as HttpErrorException

        assertThat(result.statusCode, equalTo(code))
        assertThat(result.responseHeaders, equalTo(headers))
        assertThat(result.responseBody, equalTo(body))
    }

    @Test
    fun shouldConvertApiExceptionWithNoResponseDetailsToApiException() {
        val ex = au.com.woolworths.village.sdk.openapi.client.ApiException(0, emptyMap(), null)

        val result: ApiException = makeCall(ex).e

        assertThat<Exception>(result.cause as Exception?, equalTo(ex))
    }

    @Test
    fun shouldConvertIllegalStateExceptionToJsonParsingException() {
        val message = "data can not be null"
        val ex = IllegalStateException(message)

        val result: JsonParsingException = makeCall(ex).e as JsonParsingException

        assertThat(result.message, equalTo(message))
        assertThat<Exception>(result.cause as Exception?, equalTo(ex))
        assertThat<Map<String, Any>>(result.details, nullValue())
    }

    private fun makeCall(e: Exception): ApiResult.Error {
        return client.doCall<Any> { throw e } as ApiResult.Error
    }
}

open class FakeOpenApiClientFactory
    (requestHeadersFactory: RequestHeadersFactory, options: VillageOptions) :
        OpenApiClientFactory(requestHeadersFactory, options) {
    fun<T : Any> doCall(call: () -> ApiResult.Success<T>): ApiResult<T> {
        return super.makeCall(call)
    }
}