package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseGooglePay
import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseGooglePayStepUp


class OpenApiGooglePayDetails(
    private val listPaymentInstrumentsResponseGooglePay: ListPaymentInstrumentsResponseGooglePay
) : au.com.woolworths.village.sdk.model.walletmanagement.GooglePayDetails{
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponseGooglePay.paymentInstrumentId
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponseGooglePay.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponseGooglePay.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponseGooglePay.lastUsed
    override val primary: Boolean
        get() = listPaymentInstrumentsResponseGooglePay.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponseGooglePay.allowed
    override val paymentToken: String
        get() = listPaymentInstrumentsResponseGooglePay.paymentToken
    override val expired: Boolean
        get() = listPaymentInstrumentsResponseGooglePay.expired
    override val stepUp: au.com.woolworths.village.sdk.model.walletmanagement.StepUp
        get() = toStepUp(listPaymentInstrumentsResponseGooglePay.stepUp)

    private fun toStepUp(stepUp: ListPaymentInstrumentsResponseGooglePayStepUp?):
            au.com.woolworths.village.sdk.model.walletmanagement.StepUp {
        return OpenApiStepUp(stepUp!!.mandatory, stepUp.type, stepUp.url)
    }
}