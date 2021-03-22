package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.model.walletmanagement.MerchantProfileResponse
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantProfileResponse

class OpenApiMerchantsApiRepository (
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), au.com.woolworths.village.sdk.api.walletmanagement.MerchantsApiRepository {
    override fun profile(): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.MerchantProfileResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val response = api.merchantsProfileGet(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
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
