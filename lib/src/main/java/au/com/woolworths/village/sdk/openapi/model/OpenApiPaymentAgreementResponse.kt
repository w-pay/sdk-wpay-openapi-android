package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.PaymentAgreement
import au.com.woolworths.village.sdk.model.PaymentAgreementStepUp
import au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
import java.math.BigDecimal
import org.threeten.bp.OffsetDateTime
import java.util.*

class OpenApiPaymentAgreementResponse(
    private val paymentAgreement: au.com.woolworths.village.sdk.openapi.dto.PaymentAgreement
) : PaymentAgreement {

    override val type: au.com.woolworths.village.sdk.model.PaymentAgreementType
        get() = au.com.woolworths.village.sdk.model.PaymentAgreementType.valueOf(paymentAgreement.type.value.toUpperCase(Locale.ROOT))

    override val paymentInstrumentId: String
        get() = paymentAgreement.paymentInstrumentId

    override val scheme: String?
        get() = paymentAgreement.scheme

    override val cardSuffix: String?
        get() = paymentAgreement.cardSuffix

    override val expiryMonth: String?
        get() = paymentAgreement.expiryMonth

    override val expiryYear: String?
        get() = paymentAgreement.expiryYear

    override val startDate: OffsetDateTime
        get() = paymentAgreement.startDate

    override val endDate: OffsetDateTime
        get() = paymentAgreement.endDate

    override val chargeFrequency: au.com.woolworths.village.sdk.model.PaymentAgreementChargeFrequency
        get() = au.com.woolworths.village.sdk.model.PaymentAgreementChargeFrequency.valueOf(paymentAgreement.chargeFrequency.value.toUpperCase(Locale.ROOT))

    override val chargeAmount: BigDecimal
        get() = paymentAgreement.chargeAmount

    override val allowed: Boolean?
        get() = paymentAgreement.allowed

    override val chargeCycle: BigDecimal
        get() = paymentAgreement.chargeCycle

    override val createdOn: OffsetDateTime?
        get() = paymentAgreement.createdOn

    override val description: String?
        get() = paymentAgreement.description

    override val expired: Boolean
        get() = paymentAgreement.expired === "true"

    override val lastUpdated: OffsetDateTime?
        get() = paymentAgreement.lastUpdated

    override val lastUsed: OffsetDateTime?
        get() = paymentAgreement.lastUsed

    override val paymentToken: String
        get() = paymentAgreement.paymentToken

    override val primary: Boolean?
        get() = paymentAgreement.primary

    override val status: PaymentInstrumentStatus
        get() = paymentAgreement.status as PaymentInstrumentStatus

    override val stepUp: PaymentAgreementStepUp?
        get() = paymentAgreement.stepUp as PaymentAgreementStepUp

    override val updateURL: String
        get() = paymentAgreement.updateURL
}