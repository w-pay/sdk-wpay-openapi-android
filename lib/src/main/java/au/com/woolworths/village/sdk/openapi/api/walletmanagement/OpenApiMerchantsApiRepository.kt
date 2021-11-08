package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.model.walletmanagement.MerchantProfileResponse
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantProfileResponse

class   OpenApiMerchantsApiRepository (
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions),
    au.com.woolworths.village.sdk.api.walletmanagement.MerchantsApiRepository
{
    override fun profile(): ApiResult<MerchantProfileResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val response = api.merchantsProfileGet(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiMerchantProfileResponse(
                    response
                )
            )
        }
    }
}
