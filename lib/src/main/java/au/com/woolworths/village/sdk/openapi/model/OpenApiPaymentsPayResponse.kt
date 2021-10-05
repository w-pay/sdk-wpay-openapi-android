package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.CreditCardStepUp
import au.com.woolworths.village.sdk.model.digitalpay.*
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.digitalpay.OpenApiDigitalPayExtendedTransactionData
import au.com.woolworths.village.sdk.openapi.model.digitalpay.OpenApiDigitalPayFraudResponse
import java.net.URL
import java.util.*

class OpenApiPaymentsPayResponse(
    private val paymentsSuccessResponse: PaymentsSuccessResponse
) : DigitalPayPaymentResponse {
    override val androidPay: List<Any>
        get() = paymentsSuccessResponse.androidPay

    override val applePay: List<DigitalPayApplePay>
        get() = paymentsSuccessResponse.applePay.map { OpenApiDigitalPayApplePay(it) }

    override val creditCards: List<DigitalPayCreditCard>
        get() = paymentsSuccessResponse.creditCards.map { OpenApiDigitalPayCreditCard(it) }

    override val fraudResponse: DigitalPayFraudResponse
        get() = OpenApiDigitalPayFraudResponse(paymentsSuccessResponse.fraudResponse)

    override val giftCards: List<DigitalPayGiftCard>
        get() = paymentsSuccessResponse.giftCards.map { OpenApiDigitalPayGiftCard(it) }

    override val googlePay: List<DigitalPayGooglePay>
        get() = paymentsSuccessResponse.googlePay.map { OpenApiDigitalPayGoogle(it) }

    override val partialSuccess: Boolean?
        get() = paymentsSuccessResponse.partialSuccess

    override val payPal: List<DigitalPayPayPal>
        get() = paymentsSuccessResponse.payPal.map { OpenApiDigitalPayPayPal(it) }

    override val transactionReceipt: String
        get() = paymentsSuccessResponse.transactionReceipt

    override val unknown: List<DigitalPayPaymentInstrument>
        get() = paymentsSuccessResponse.unknown.map { OpenApiDigitalPayPaymentInstrument(it) }
}

class OpenApiDigitalPayPaymentInstrument(
    private val data: PaymentsSuccessResponseUnknown
) : DigitalPayPaymentInstrument {
    override val errorCode: String?
        get() = data.errorCode

    override val errorDetail: String?
        get() = data.errorDetail

    override val errorMessage: String?
        get() = data.errorMessage

    override val paymentInstrumentId: String
        get() = data.paymentInstrumentId

    override val paymentToken: String
        get() = data.paymentToken

    override val paymentTransactionRef: String
        get() = ""
}

class OpenApiDigitalPayApplePay(
    private val data: PaymentsSuccessResponseApplePay
) : DigitalPayApplePay {
    override val errorCode: String?
        get() = data.errorCode

    override val errorDetail: String?
        get() = data.errorDetail

    override val errorMessage: String?
        get() = data.errorMessage

    override val paymentInstrumentId: String
        get() = data.paymentInstrumentId

    override val paymentToken: String
        get() = data.paymentToken

    override val paymentTransactionRef: String
        get() = data.paymentTransactionRef

    override val stepUp: CreditCardStepUp?
        get() = data.stepUp?.let { OpenApiPaymentsSuccessResponseStepUp1(it) }
}

class OpenApiDigitalPayGoogle(
    private val data: PaymentsSuccessResponseGooglePay
) : DigitalPayGooglePay {
    override val errorCode: String?
        get() = data.errorCode

    override val errorDetail: String?
        get() = data.errorDetail

    override val errorMessage: String?
        get() = data.errorMessage

    override val extendedTransactionData: List<DigitalPayExtendedTransactionData>?
        get() = data.extendedTransactionData?.let { data ->
            data.map { OpenApiDigitalPayExtendedTransactionData1(it) }
        }

    override val externalServiceCode: String?
        get() = data.externalServiceCode

    override val externalServiceMessage: String?
        get() = data.externalServiceMessage

    override val paymentInstrumentId: String
        get() = data.paymentInstrumentId

    override val paymentToken: String
        get() = data.paymentToken

    override val paymentTransactionRef: String
        get() = data.paymentTransactionRef

    override val stepUp: CreditCardStepUp?
        get() = data.stepUp?.let { OpenApiPaymentsSuccessResponseStepUp(it) }
}

class OpenApiDigitalPayPayPal(
    private val data: PaymentsSuccessResponsePayPal
) : DigitalPayPayPal {
    override val errorCode: String?
        get() = data.errorCode

    override val errorDetail: String?
        get() = data.errorDetail

    override val errorMessage: String?
        get() = data.errorMessage

    override val externalServiceCode: String?
        get() = data.externalServiceCode

    override val externalServiceMessage: String?
        get() = data.externalServiceMessage

    override val paymentInstrumentId: String
        get() = data.paymentInstrumentId

    override val paymentToken: String
        get() = data.paymentToken

    override val paymentTransactionRef: String
        get() = data.paymentTransactionRef

    override val receiptData: DigitalPayPayPalReceiptData?
        get() = data.receiptData?.let { OpenApiDigitalPayPayPalReceiptData(it) }
}

class OpenApiPaymentsSuccessResponseStepUp(
    private val data: PaymentsSuccessResponseStepUp
) : CreditCardStepUp {
    override val mandatory: Boolean
        get() = data.mandatory

    override val type: String
        get() = data.type

    override val url: URL
        get() = URL(data.url)
}

class OpenApiPaymentsSuccessResponseStepUp1(
    private val data: PaymentsSuccessResponseStepUp1
) : CreditCardStepUp {
    override val mandatory: Boolean
        get() = data.mandatory

    override val type: String
        get() = data.type

    override val url: URL
        get() = URL(data.url)
}

class OpenApiPaymentInstrumentsResponseStepUp(
    private val data: ListPaymentInstrumentsResponseStepUp
) : CreditCardStepUp {
    override val mandatory: Boolean
        get() = data.mandatory

    override val type: String
        get() = data.type

    override val url: URL
        get() = URL(data.url)
}

class OpenApiVerifyPaymentInstrumentsStepUp(
    private val data: VerifyPaymentInstrumentsErrorResponseStepUp
) : CreditCardStepUp {
    override val mandatory: Boolean
        get() = data.mandatory

    override val type: String
        get() = data.type

    override val url: URL
        get() = URL(data.url)
}

class OpenApiDigitalPayCreditCard(
    private val data: PaymentsSuccessResponseCreditCards
) : DigitalPayCreditCard {
    override val errorCode: String?
        get() = data.errorCode

    override val errorDetail: String?
        get() = data.errorDetail

    override val errorMessage: String?
        get() = data.errorMessage

    override val extendedTransactionData: List<DigitalPayExtendedTransactionData>?
        get() = data.extendedTransactionData?.let { data ->
            data.map { OpenApiDigitalPayExtendedTransactionData(it) }
        }

    override val externalServiceCode: String?
        get() = data.externalServiceCode

    override val externalServiceMessage: String?
        get() = data.externalServiceMessage

    override val handlingInstructions: DigitalPayHandlingInstructions?
        get() = data.handlingInstructions?.let { OpenApiDigitalPayHandlingInstructions(it) }

    override val paymentInstrumentId: String
        get() = data.paymentInstrumentId

    override val paymentToken: String
        get() = data.paymentToken

    override val paymentTransactionRef: String
        get() = data.paymentTransactionRef

    override val receiptData: DigitalPayCreditCardReceiptData?
        get() = data.receiptData?.let { OpenApiDigitalPayReceiptData(it) }

    override val stepUp: CreditCardStepUp?
        get() = data.stepUp?.let { OpenApiVerifyPaymentInstrumentsStepUp(it) }

    override val threeDS: DigitalPayThreeDSResponse?
        get() = data.threeDS?.let { OpenApiDigitalPayThreeDSResponse(it) }
}

class OpenApiDigitalPayHandlingInstructions(
    private val data: PaymentsSuccessResponseHandlingInstructions
) : DigitalPayHandlingInstructions {
    override val instructionCode: DigitalPayInstructionCode
        get() = DigitalPayInstructionCode.valueOf(data.instructionCode.value.toUpperCase(Locale.ROOT))

    override val instructionMessage: String
        get() = data.instructionMessage
}

class OpenApiDigitalPayReceiptData(
    private val data: PaymentsSuccessResponseReceiptData
) : DigitalPayCreditCardReceiptData {
    override val cardSuffix: String
        get() = data.cardSuffix

    override val expiryMonth: String
        get() = data.expiryMonth

    override val expiryYear: String
        get() = data.expiryYear

    override val scheme: String
        get() = data.scheme
}

class OpenApiDigitalPayGiftCardReceiptData(
    private val data: PaymentsSuccessResponseReceiptData1
) : DigitalPayGiftCardReceiptData {
    override val cardSuffix: String
        get() = data.cardSuffix
}

class OpenApiDigitalPayPayPalReceiptData(
    private val data: PaymentsSuccessResponseReceiptData2
) : DigitalPayPayPalReceiptData {
    override val customerId: String
        get() = data.customerId

    override val payPalId: String
        get() = data.payPalId
}

class OpenApiDigitalPayThreeDSResponse(
    private val data: PaymentsSuccessResponseThreeDS
) : DigitalPayThreeDSResponse {
    override val car: String?
        get() = data.car

    override val dsTransID: String
        get() = data.dsTransID

    override val sli: String
        get() = data.sli
}

class OpenApiDigitalPayGiftCard(
    private val data: PaymentsSuccessResponseGiftCards
) : DigitalPayGiftCard {
    override val errorCode: String?
        get() = data.errorCode

    override val errorDetail: String?
        get() = data.errorDetail

    override val errorMessage: String?
        get() = data.errorMessage

    override val externalServiceCode: String?
        get() = data.externalServiceCode

    override val externalServiceMessage: String?
        get() = data.externalServiceMessage

    override val paymentInstrumentId: String
        get() = data.paymentInstrumentId

    override val paymentToken: String
        get() = data.paymentToken

    override val paymentTransactionRef: String
        get() = data.paymentTransactionRef

    override val receiptData: DigitalPayGiftCardReceiptData?
        get() = data.receiptData?.let { OpenApiDigitalPayGiftCardReceiptData(it) }

    override val stepUp: CreditCardStepUp?
        get() = data.stepUp?.let { OpenApiPaymentInstrumentsResponseStepUp(it) }
}

class OpenApiDigitalPayExtendedTransactionData1(
    private val data: PaymentsSuccessResponseExtendedTransactionData1
) : DigitalPayExtendedTransactionData {
    override val field: DigitalPayExtendedTransactionDataFieldName
        get() = DigitalPayExtendedTransactionDataFieldName.valueOf(
            data.field.value.toUpperCase(Locale.ROOT)
        )

    override val value: String
        get() = data.value
}