package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponseApplePay


class OpenApiApplePayDetails(
    private val applePay: ListPaymentInstrumentsResponseApplePay
) : au.com.woolworths.village.sdk.model.walletmanagement.ApplePayDetails{
    override val paymentInstrumentId: String
        get() = applePay.paymentInstrumentId
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(applePay.status.value)
    override val lastUpdated: String
        get() = applePay.lastUpdated
    override val lastUsed: String
        get() = applePay.lastUsed
    override val paymentToken: String
        get() = applePay.paymentToken
    override val primary: Boolean
        get() = applePay.primary
    override val allowed: Boolean
        get() = applePay.allowed
    override val stepUp: au.com.woolworths.village.sdk.model.walletmanagement.StepUp
        get() = OpenApiStepUp(applePay.stepUp!!.mandatory, applePay.stepUp!!.type, applePay.stepUp!!.url)
}