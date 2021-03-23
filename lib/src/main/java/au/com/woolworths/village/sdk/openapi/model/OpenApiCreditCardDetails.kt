package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseCreditCards


class OpenApiCreditCardDetails(
    private val listPaymentInstrumentsResponseCreditCards: ListPaymentInstrumentsResponseCreditCards
) : au.com.woolworths.village.sdk.model.walletmanagement.CreditCardDetails{
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponseCreditCards.paymentInstrumentId
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponseCreditCards.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponseCreditCards.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponseCreditCards.lastUsed
    override val cardName: String
        get() = listPaymentInstrumentsResponseCreditCards.cardName
    override val cardSuffix: String
        get() = listPaymentInstrumentsResponseCreditCards.cardSuffix
    override val paymentToken: String
        get() = listPaymentInstrumentsResponseCreditCards.paymentToken
    override val expiryYear: String
        get() = listPaymentInstrumentsResponseCreditCards.expiryYear
    override val expiryMonth: String
        get() = listPaymentInstrumentsResponseCreditCards.expiryMonth
    override val scheme: String
        get() = listPaymentInstrumentsResponseCreditCards.scheme
    override val updateURL: String
        get() = listPaymentInstrumentsResponseCreditCards.updateURL
    override val expired: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.expired
    override val primary: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.allowed
    override val cvvValidated: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.cvvValidated
    override val requiresCVV: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.requiresCVV
    override val stepUp: au.com.woolworths.village.sdk.model.walletmanagement.StepUp
        get() = OpenApiStepUp(
            listPaymentInstrumentsResponseCreditCards.stepUp!!.mandatory,
            listPaymentInstrumentsResponseCreditCards.stepUp!!.type,
            listPaymentInstrumentsResponseCreditCards.stepUp!!.url)
}