package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseGiftCards


class OpenApiGiftCardDetails(
    private val listPaymentInstrumentsResponseGiftCards: ListPaymentInstrumentsResponseGiftCards
) : au.com.woolworths.village.sdk.model.walletmanagement.GiftCardDetails{
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponseGiftCards.paymentInstrumentId
    override val paymentToken: String
        get() = listPaymentInstrumentsResponseGiftCards.paymentToken
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponseGiftCards.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponseGiftCards.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponseGiftCards.lastUsed
    override val programName: String
        get() = listPaymentInstrumentsResponseGiftCards.programName
    override val cardSuffix: String
        get() = listPaymentInstrumentsResponseGiftCards.cardSuffix
    override val primary: Boolean
        get() = listPaymentInstrumentsResponseGiftCards.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponseGiftCards.allowed
}