package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.api.CustomerPreferences
import au.com.woolworths.village.sdk.api.CustomerPreferencesRepository
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.PreferencesCustomer

class OpenApiCustomerPreferencesRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), CustomerPreferencesRepository {
    override fun get(): ApiResult<CustomerPreferences> {
        return makeCall {
            val api = createCustomerApi()

            val data: Map<String, Map<String, String>> = api.getCustomerPreferences(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                ""
            ).data.general as Map<String, Map<String, String>>

            ApiResult.Success(data)
        }
    }

    override fun set(preferences: CustomerPreferences): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CustomerPreferences()
            body.data = PreferencesCustomer()
            body.data.general = preferences

            api.setCustomerPreferences(
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