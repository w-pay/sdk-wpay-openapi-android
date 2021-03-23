package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.api.MerchantPreferences
import au.com.woolworths.village.sdk.api.MerchantPreferencesRepository
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory

class OpenApiMerchantPreferencesRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), MerchantPreferencesRepository {
    override fun get(): ApiResult<MerchantPreferences> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantPreferences(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                ""
            ).data

            ApiResult.Success(data)
        }
    }

    override fun set(preferences: MerchantPreferences): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.MerchantPreferences()
            body.data = preferences

            api.setMerchantPreferences(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }
}