package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.*
import java.util.*

class OpenApiGiftcardsBalanceResponse(
    private val tokenizeGiftcardResponse: GiftcardsBalanceResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.GiftcardsBalanceResponse {
    override val giftCardBalances: List<au.com.woolworths.village.sdk.model.walletmanagement.GiftCardBalance>
        get() = tokenizeGiftcardResponse.giftCardBalances!!.map{OpenApiGiftCardBalance(it)}
}