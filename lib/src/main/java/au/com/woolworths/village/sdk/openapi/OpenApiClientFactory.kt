package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.openapi.api.*
import au.com.woolworths.village.sdk.openapi.client.ApiClient
import au.com.woolworths.village.sdk.openapi.dto.DynamicPayload
import java.lang.IllegalStateException

data class ClientOptions(
    val debug: Boolean = false
)

open class OpenApiClientFactory(
    private val requestHeadersFactory: RequestHeadersFactory,
    private var options: VillageOptions,
    private var clientOptions: ClientOptions = ClientOptions()
) {
    protected fun createAdministrationApi(): AdministrationApi {
        return AdministrationApi(createApiClient())
    }

    protected fun createCustomerApi(): CustomerApi {
        return CustomerApi(createApiClient())
    }

    protected fun createMerchantApi(): MerchantApi {
        return MerchantApi(createApiClient())
    }

    protected fun createWalletManagementApi(): WalletManagementApi {
        return WalletManagementApi(createApiClient())
    }

    protected fun createPaymentAgreementsApi(): PaymentAgreementsApi {
        return PaymentAgreementsApi(createApiClient())
    }

    protected fun createPaymentsApi(): PaymentsApi {
        return PaymentsApi(createApiClient())
    }

    protected fun createOpenpayApi(): OpenpayApi {
        return OpenpayApi(createApiClient())
    }

    protected fun createGiftingApi(): GiftingApi {
        return GiftingApi(createApiClient())
    }

    protected fun getDefaultHeader(client: ApiClient, name: String): String? {
        return (client as ExtendedApiClient).getDefaultHeader(name)
    }

    protected fun<T : Any> makeCall(call: () -> ApiResult.Success<T>): ApiResult<T> {
        return try {
            call()
        }
        catch (e: au.com.woolworths.village.sdk.openapi.client.ApiException) {
            ApiResult.Error(toHttpError(e))
        }
        catch (e: Exception) {
            ApiResult.Error(examineException(e))
        }
    }

    protected fun toDynamicPayload(payload: au.com.woolworths.village.sdk.model.DynamicPayload): DynamicPayload {
        val dto = DynamicPayload()

        dto.schemaId = payload.schemaId
        dto.payload = payload.payload

        return dto
    }

    private fun examineException(e: Exception): ApiException {
        /**
         * This allows us to dynamically examine/convert the exception. Not all exception types
         * may be on the classpath depending on what flavour is being used.
         */
        if (e is IllegalStateException) {
            return JsonParsingException(e.message!!, e, null)
        }

        return ApiException(e.message ?: "An error occurred", e)
    }

    private fun toHttpError(e: au.com.woolworths.village.sdk.openapi.client.ApiException): ApiException {
        if (e.code > 0) {
            return HttpErrorException(e.code, e.responseHeaders, e.responseBody)
        }

        return ApiException(e.message ?: "Some HTTP error", e)
    }

    private fun createApiClient(): ApiClient {
        val apiClient = ExtendedApiClient()
        apiClient.basePath = options.baseUrl
        apiClient.isDebugging = clientOptions.debug

        requestHeadersFactory.createHeaders().forEach { (name, value) ->
            apiClient.addDefaultHeader(name, value)
        }

        return apiClient
    }
}