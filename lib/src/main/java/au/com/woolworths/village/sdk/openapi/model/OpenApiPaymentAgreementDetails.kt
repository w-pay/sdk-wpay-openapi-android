package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsResponsePaymentAgreements
import java.math.BigDecimal


class OpenApiPaymentAgreementDetails(
    private val listPaymentInstrumentsResponsePaymentAgreements: ListPaymentInstrumentsResponsePaymentAgreements
): au.com.woolworths.village.sdk.model.walletmanagement.PaymentAgreementDetails{
    override val paymentToken: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.paymentToken
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponsePaymentAgreements.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.lastUsed
    override val primary: Boolean
        get() = listPaymentInstrumentsResponsePaymentAgreements.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponsePaymentAgreements.allowed
    override val cardSuffix: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.cardSuffix!!
    override val type: au.com.woolworths.village.sdk.model.walletmanagement.PaymentAgreementTypeEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentAgreementTypeEnum.valueOf(listPaymentInstrumentsResponsePaymentAgreements.type.value)
    override val chargeFrequency: au.com.woolworths.village.sdk.model.walletmanagement.ChargeFrequencyEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ChargeFrequencyEnum.valueOf(listPaymentInstrumentsResponsePaymentAgreements.chargeFrequency.value)
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.paymentInstrumentId
    override val scheme: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.scheme!!
    override val expiryMonth: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.expiryMonth!!
    override val expiryYear: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.expiryYear!!
    override val startDate: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.startDate
    override val endDate: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.endDate!!
    override val chargeAmount: BigDecimal
        get() = listPaymentInstrumentsResponsePaymentAgreements.chargeAmount!!
    override val chargeCycle: BigDecimal
        get() = listPaymentInstrumentsResponsePaymentAgreements.chargeCycle!!
    override val expired: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.expired
    override val updateURL: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.updateURL!!
    override val stepUp: au.com.woolworths.village.sdk.model.walletmanagement.StepUp
        get() = OpenApiStepUp(
            listPaymentInstrumentsResponsePaymentAgreements.stepUp!!.mandatory,
            listPaymentInstrumentsResponsePaymentAgreements.stepUp!!.type,
            listPaymentInstrumentsResponsePaymentAgreements.stepUp!!.url)
}