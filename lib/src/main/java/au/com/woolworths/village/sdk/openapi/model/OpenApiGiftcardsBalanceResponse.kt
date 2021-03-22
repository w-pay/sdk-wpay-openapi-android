package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.*
import java.math.BigDecimal
import java.util.*

class OpenApiGiftcardsBalanceResponse(
    private val tokenizeGiftcardResponse: GiftcardsBalanceResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.GiftcardsBalanceResponse {
    override val giftCardBalances: List<au.com.woolworths.village.sdk.model.walletmanagement.GiftCardBalance>
        get() = tokenizeGiftcardResponse.giftCardBalances?.map(::toGiftCardBalances) ?: emptyList()

    fun toGiftCardBalances(card: GiftcardsBalanceResponseGiftCardBalances): au.com.woolworths.village.sdk.model.walletmanagement.GiftCardBalance {
        return OpenApiGiftCardBalance(card)
    }
}

class OpenApiGiftCardBalance(
    private val card: GiftcardsBalanceResponseGiftCardBalances
) : au.com.woolworths.village.sdk.model.walletmanagement.GiftCardBalance {
    override val cardNumber: String
        get() = card.cardNumber.toString()
    override val paymentInstrumentId: String
        get() = card.paymentInstrumentId.toString()
    override val balance: BigDecimal
        get() = card.balance
    override val expiryDay: String
        get() = card.expiryDay
    override val expiryMonth: String
        get() = card.expiryMonth
    override val expiryYear: String
        get() = card.expiryYear
    override val expired: Boolean
        get() = card.expired
}