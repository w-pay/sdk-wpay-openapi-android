package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponsePayPal


class OpenApiPaymentInstrumentsPayPalDetails(
    private val listPaymentInstrumentsResponsePayPal: ListPaymentInstrumentsResponsePayPal
) : au.com.woolworths.village.sdk.model.walletmanagement.PayPalDetails{
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponsePayPal.paymentInstrumentId
    override val paymentToken: String
        get() = listPaymentInstrumentsResponsePayPal.paymentToken
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponsePayPal.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponsePayPal.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponsePayPal.lastUsed
    override val primary: Boolean
        get() = listPaymentInstrumentsResponsePayPal.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponsePayPal.allowed
    override val payPalId: String
        get() = listPaymentInstrumentsResponsePayPal.payPalId
    override val customerId: String
        get() = listPaymentInstrumentsResponsePayPal.customerId
}