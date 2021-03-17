package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeAndroidPayRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeAndroidPayResponse

interface OpenApiAndroidPayApiRepository {
    fun tokenize(
        tokenizeAndroidPayRequest: TokenizeAndroidPayRequest
    ): ApiResult<TokenizeAndroidPayResponse>

    fun update(
        paymentInstrumentId: String,
        tokenizeAndroidPayRequest: TokenizeAndroidPayRequest
    ): ApiResult<TokenizeAndroidPayResponse>
}
