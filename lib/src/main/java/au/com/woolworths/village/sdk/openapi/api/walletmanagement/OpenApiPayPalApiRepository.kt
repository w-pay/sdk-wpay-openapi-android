package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizePaypalRequest
import au.com.woolworths.village.sdk.model.TokenizePaypalResponse

interface OpenApiPayPalApiRepository {
    fun tokenize(tokenizePaypalRequest: TokenizePaypalRequest): ApiResult<TokenizePaypalResponse>

    fun guestTokenize(tokenizePaypalRequest: TokenizePaypalRequest): ApiResult<TokenizePaypalResponse>
}
