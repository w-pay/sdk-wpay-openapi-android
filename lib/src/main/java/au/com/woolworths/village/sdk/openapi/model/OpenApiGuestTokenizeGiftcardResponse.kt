package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.walletmanagement.TokenizedGiftCard
import au.com.woolworths.village.sdk.openapi.dto.*
import java.math.BigDecimal
import java.util.*

class OpenApiGuestTokenizeGiftcardResponse(
    private val tokenizeGiftcardResponse: GuestTokenizeGiftcardResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.TokenizeGiftcardResponse {
    override val giftCard: au.com.woolworths.village.sdk.model.walletmanagement.TokenizedGiftCard
        get() = OpenApiGuestTokenizedGiftCard(tokenizeGiftcardResponse.giftCard)

    override val balance: BigDecimal
        get() = tokenizeGiftcardResponse.balance
    override val expiryDay: String
        get() = tokenizeGiftcardResponse.expiryDay
    override val expiryMonth: String
        get() = tokenizeGiftcardResponse.expiryMonth
    override val expiryYear: String
        get() = tokenizeGiftcardResponse.expiryYear
    override val expired: Boolean
        get() = tokenizeGiftcardResponse.expired
}
