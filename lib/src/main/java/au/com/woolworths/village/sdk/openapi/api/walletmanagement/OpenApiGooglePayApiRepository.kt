package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGooglePayResponse

interface OpenApiGooglePayApiRepository {
    fun tokenize(
        tokenizeGooglePayRequest: TokenizeGooglePayRequest
    ): ApiResult<TokenizeGooglePayResponse>

    fun guestTokenize(
        tokenizeGooglePayRequest: TokenizeGooglePayRequest
    ): ApiResult<TokenizeGooglePayResponse>

    fun update(
        paymentToken: String,
        tokenizeGooglePayRequest: TokenizeGooglePayRequest
    ): ApiResult<TokenizeGooglePayRequest>
}
