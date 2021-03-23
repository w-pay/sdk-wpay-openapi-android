package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.GiftcardsBalanceRequest
import au.com.woolworths.village.sdk.model.walletmanagement.GiftcardsBalanceResponse
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardRequest
import au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardResponse

interface OpenApiGiftcardsApiRepository {
    fun tokenize(tokenizeGiftcardRequest: TokenizeGiftcardRequest): ApiResult<TokenizeGiftcardResponse>

    fun guestTokenize(
        tokenizeGiftcardRequest: TokenizeGiftcardRequest
    ): ApiResult<TokenizeGiftcardResponse>

    fun balance(giftcardsBalanceRequest: GiftcardsBalanceRequest): ApiResult<GiftcardsBalanceResponse>
}
