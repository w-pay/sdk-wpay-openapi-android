package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.MerchantProfileResponse

interface OpenApiMerchantsApiRepository {
    fun profile(): ApiResult<MerchantProfileResponse>
}
