package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.*

interface OpenApiCustomerTermsAndConditionsApiRepository {
    fun get(type: String?, version: String?): ApiResult<TermsAndConditionsAcceptances>

    fun accept(acceptTermsAndConditionsRequest: AcceptTermsAndConditionsRequest): ApiResult<Void>
}
