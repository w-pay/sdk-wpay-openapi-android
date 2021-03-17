package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeApplePayRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeApplePayResponse

interface OpenApiApplePayApiRepository {
    fun tokenize(tokenizeApplePayRequest: TokenizeApplePayRequest): ApiResult<TokenizeApplePayResponse>

    fun guestTokenize(
        tokenizeApplePayRequest: TokenizeApplePayRequest
    ): ApiResult<TokenizeApplePayResponse>

    fun update(
        paymentInstrumentId: String,
        tokenizeApplePayRequest: TokenizeApplePayRequest
    ): ApiResult<TokenizeApplePayResponse>
}
