package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.CustomerTermsAndConditionsApiRepository
import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.CustomerTermsAndConditions
import au.com.woolworths.village.sdk.openapi.dto.InstoreCustomerTermsandconditionsAcceptanceData
import au.com.woolworths.village.sdk.openapi.model.OpenApiTermsAndConditionsAcceptances

class OpenApiCustomerTermsAndConditionsApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), CustomerTermsAndConditionsApiRepository {
    override fun get(type: String?, version: String?): ApiResult<TermsAndConditionsAcceptances> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerTermsAndConditionsAcceptance(
                getDefaultHeader(api.apiClient, X_WALLET_ID),
                type,
                version
            ).data

            return@makeCall ApiResult.Success(OpenApiTermsAndConditionsAcceptances(data))
        }
    }

    override fun accept(
        acceptTermsAndConditionsRequest: AcceptTermsAndConditionsRequest
    ): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            val body = CustomerTermsAndConditions().apply {
                data = InstoreCustomerTermsandconditionsAcceptanceData().apply {
                    type = acceptTermsAndConditionsRequest.type
                    version = acceptTermsAndConditionsRequest.version
                }
            }

            api.acceptCustomerTermsAndConditions(
                getDefaultHeader(api.apiClient, X_WALLET_ID),
                body
            )

            return@makeCall ApiResult.Success(Unit)
        }
    }
}
