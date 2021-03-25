package au.com.woolworths.village.sdk.openapi.model.digitalpay

import au.com.woolworths.village.sdk.model.PaymentAgreementChargeFrequency
import au.com.woolworths.village.sdk.model.PaymentAgreementType
import au.com.woolworths.village.sdk.model.digitalpay.*
import au.com.woolworths.village.sdk.openapi.dto.PaymentAgreementResponse
import au.com.woolworths.village.sdk.openapi.dto.PaymentAgreementResponsePaymentAgreement
import au.com.woolworths.village.sdk.openapi.dto.PaymentsSuccessResponseExtendedTransactionData
import au.com.woolworths.village.sdk.openapi.dto.PaymentsSuccessResponseFraudResponse
import java.math.BigDecimal
import java.util.*

class OpenApiDigitalPayPaymentAgreementResponse(
    private val paymentAgreementResponse: PaymentAgreementResponse
) : DigitalPayPaymentAgreementResponse {
    override val transactionReceipt: String
        get() = paymentAgreementResponse.transactionReceipt

    override val paymentToken: String?
        get() = paymentAgreementResponse.paymentToken

    override val paymentAgreement: DigitalPayResponsePaymentAgreement
        get() = OpenApiDigitalPayResponsePaymentAgreement(paymentAgreementResponse.paymentAgreement)

    override val fraudResponse: DigitalPayFraudResponse?
        get() = paymentAgreementResponse.fraudResponse?.let { OpenApiDigitalPayFraudResponse(it) }

    override val extendedTransactionData: List<DigitalPayExtendedTransactionData>?
        get() = paymentAgreementResponse.extendedTransactionData?.map { OpenApiDigitalPayExtendedTransactionData(it) }

    override val externalServiceCode: String?
        get() = paymentAgreementResponse.externalServiceCode

    override val externalServiceMessage: String?
        get() = paymentAgreementResponse.externalServiceMessage
}

class OpenApiDigitalPayResponsePaymentAgreement(
    private val paymentAgreement: PaymentAgreementResponsePaymentAgreement
) : DigitalPayResponsePaymentAgreement {
    override val type: PaymentAgreementType
        get() = PaymentAgreementType.valueOf(
            paymentAgreement.type.toString().toUpperCase(Locale.ROOT)
        )

    override val paymentInstrumentId: String
        get() = paymentAgreement.paymentInstrumentId

    override val paymentInstrumentType: String
        get() = paymentAgreement.paymentInstrumentType

    override val scheme: String
        get() = paymentAgreement.scheme

    override val cardSuffix: String
        get() = paymentAgreement.cardSuffix

    override val expiryMonth: String
        get() = paymentAgreement.expiryMonth

    override val expiryYear: String
        get() = paymentAgreement.expiryYear

    override val startDate: String
        get() = paymentAgreement.startDate

    override val endDate: String
        get() = paymentAgreement.endDate

    override val chargeFrequency: PaymentAgreementChargeFrequency
        get() = PaymentAgreementChargeFrequency.valueOf(
            paymentAgreement.chargeFrequency.value.toUpperCase(Locale.ROOT)
        )

    override val chargeAmount: BigDecimal
        get() = paymentAgreement.chargeAmount
}

class OpenApiDigitalPayExtendedTransactionData(
    private val data: PaymentsSuccessResponseExtendedTransactionData
) : DigitalPayExtendedTransactionData {
    override val field: DigitalPayExtendedTransactionDataFieldName
        get() = DigitalPayExtendedTransactionDataFieldName.valueOf(
            data.field.value.toUpperCase(Locale.ROOT)
        )

    override val value: String
        get() = data.value
}

class OpenApiDigitalPayFraudResponse(
    private val fraudData: PaymentsSuccessResponseFraudResponse
) : DigitalPayFraudResponse {
    override val clientId: String
        get() = fraudData.clientId

    override val reasonCode: String
        get() = fraudData.reasonCode

    override val decision: String
        get() = fraudData.decision
}