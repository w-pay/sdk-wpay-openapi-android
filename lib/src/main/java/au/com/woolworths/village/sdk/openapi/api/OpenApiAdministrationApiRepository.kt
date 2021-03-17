package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.api.AdministrationApiRepository
import au.com.woolworths.village.sdk.model.HealthCheck
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.model.OpenApiHealthCheck

class OpenApiAdministrationApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), AdministrationApiRepository {
    override fun checkHealth(): ApiResult<HealthCheck> {
        return makeCall {
            val api = createAdministrationApi()

            val data = api.checkHealth().data

            ApiResult.Success(OpenApiHealthCheck(data))
        }
    }
}