package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ImportPaymentInstrumentsResponsePayPal


class OpenApiPayPal(
    private val importPaymentInstrumentsResponseCreditCards: ImportPaymentInstrumentsResponsePayPal
) : au.com.woolworths.village.sdk.model.walletmanagement.PayPal{
    override val customerId: String
        get() = importPaymentInstrumentsResponseCreditCards.customerId
    override val payPalId: String
        get() = importPaymentInstrumentsResponseCreditCards.payPalId!!
    override val paymentMethodToken: String
        get() = importPaymentInstrumentsResponseCreditCards.paymentMethodToken!!
    override val result: au.com.woolworths.village.sdk.model.walletmanagement.ResultEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ResultEnum.valueOf(importPaymentInstrumentsResponseCreditCards.result.value)
    override val errorMessage: au.com.woolworths.village.sdk.model.walletmanagement.ErrorMessage
        get() = OpenApiErrorMessage(importPaymentInstrumentsResponseCreditCards.errorMessage.toString())
}