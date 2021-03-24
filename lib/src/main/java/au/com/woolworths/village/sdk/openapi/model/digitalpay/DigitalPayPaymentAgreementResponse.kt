package au.com.woolworths.village.sdk.openapi.model.digitalpay;

import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayExtendedTransactionData
import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayFraudResponse
import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayPaymentAgreementResponse
import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayResponsePaymentAgreement

class DigitalPayPaymentAgreementResponse(
    private val paymentAgreementResponse: au.com.woolworths.village.sdk.openapi.model.digitalpay.DigitalPayPaymentAgreementResponse
) : DigitalPayPaymentAgreementResponse {
    override val transactionReceipt: String
        get() = paymentAgreementResponse.transactionReceipt

    override val paymentToken: String?
        get() = paymentAgreementResponse.paymentToken

    override val paymentAgreement: DigitalPayResponsePaymentAgreement
        get() = paymentAgreementResponse.paymentAgreement

    override val fraudResponse: DigitalPayFraudResponse?
        get() = paymentAgreementResponse.fraudResponse

    override val extendedTransactionData: DigitalPayExtendedTransactionData?
        get() = paymentAgreementResponse.extendedTransactionData

    override val externalServiceCode: String?
        get() = paymentAgreementResponse.externalServiceCode

    override val externalServiceMessage: String?
        get() = paymentAgreementResponse.externalServiceMessage
}