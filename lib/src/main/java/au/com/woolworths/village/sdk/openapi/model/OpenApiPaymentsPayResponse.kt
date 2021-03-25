package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.DynamicPayload
import au.com.woolworths.village.sdk.model.PaymentSession
import au.com.woolworths.village.sdk.model.digitalpay.*
import org.threeten.bp.OffsetDateTime

class OpenApiPaymentsPayResponse(
        private val paymentsSuccessResponse: au.com.woolworths.village.sdk.openapi.dto.PaymentsSuccessResponse
) : DigitalPayPaymentResponse {

    override val androidPay: List<Any>
        get() = paymentsSuccessResponse.androidPay

    override val applePay: List<DigitalPayApplePay>
        get() = paymentsSuccessResponse.applePay as List<DigitalPayApplePay>

    override val creditCards: List<DigitalPayCreditCard>
        get() = paymentsSuccessResponse.creditCards as List<DigitalPayCreditCard>

    override val fraudResponse: DigitalPayFraudResponse
        get() = paymentsSuccessResponse.fraudResponse as DigitalPayFraudResponse

    override val giftCards: List<DigitalPayGiftCard>
        get() = paymentsSuccessResponse.giftCards as List<DigitalPayGiftCard>

    override val googlePay: List<DigitalPayGooglePay>
        get() = paymentsSuccessResponse.googlePay as List<DigitalPayGooglePay>

    override val partialSuccess: Boolean?
        get() = paymentsSuccessResponse.partialSuccess

    override val payPal: List<DigitalPayPayPal>
        get() = paymentsSuccessResponse.payPal as List<DigitalPayPayPal>

    override val transactionReceipt: String
        get() = paymentsSuccessResponse.transactionReceipt

    override val unknown: List<DigitalPayPaymentInstrument>
        get() = paymentsSuccessResponse.unknown as List<DigitalPayPaymentInstrument>
}