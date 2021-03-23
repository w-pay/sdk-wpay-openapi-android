package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ImportPaymentInstrumentsResponseCreditCards
import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsSuccessResponse
import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsSuccessResponseFraudResponse
import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsSuccessResponseVerifyResponses
import java.math.BigDecimal
import java.util.*

class OpenApiVerifyPaymentInstrumentsSuccessResponse(
    private val importPaymentInstrumentsResponse: VerifyPaymentInstrumentsSuccessResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.VerifyPaymentInstrumentsSuccessResponse {
    override val transactionReceipt: String
        get() = importPaymentInstrumentsResponse.transactionReceipt
    override val partialSuccess: Boolean
        get() = importPaymentInstrumentsResponse.partialSuccess
    override val verifyResponses: List<au.com.woolworths.village.sdk.model.walletmanagement.VerifyResponse>
        get() = importPaymentInstrumentsResponse.verifyResponses!!.map(::toVerifyResponses)
    override val fraudResponse: au.com.woolworths.village.sdk.model.walletmanagement.FraudResponse
        get() = toFraudResponse(importPaymentInstrumentsResponse.fraudResponse)
}

private fun toFraudResponse(fraudResponse: VerifyPaymentInstrumentsSuccessResponseFraudResponse)
    : au.com.woolworths.village.sdk.model.walletmanagement.FraudResponse {
    return OpenApiFraudResponse(fraudResponse)
}
class OpenApiFraudResponse(
    private val verifyPaymentInstrumentsSuccessResponseFraudResponse: VerifyPaymentInstrumentsSuccessResponseFraudResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.FraudResponse {
    override val clientId: String
        get() = verifyPaymentInstrumentsSuccessResponseFraudResponse.clientId
    override val reasonCode: String
        get() = verifyPaymentInstrumentsSuccessResponseFraudResponse.reasonCode
    override val decision: String
        get() = verifyPaymentInstrumentsSuccessResponseFraudResponse.decision
}
private fun toVerifyResponses(verifyPaymentInstrumentsSuccessResponseVerifyResponses: VerifyPaymentInstrumentsSuccessResponseVerifyResponses?):
        au.com.woolworths.village.sdk.model.walletmanagement.VerifyResponse {
    return OpenApiVerifyResponse(verifyPaymentInstrumentsSuccessResponseVerifyResponses!!)
}

class OpenApiVerifyResponse(
    private val verifyPaymentInstrumentsSuccessResponseVerifyResponses: VerifyPaymentInstrumentsSuccessResponseVerifyResponses
) : au.com.woolworths.village.sdk.model.walletmanagement.VerifyResponse {
    override val paymentToken: String
        get() = verifyPaymentInstrumentsSuccessResponseVerifyResponses.paymentToken
    override val verifyTransactionRef: String
        get() = verifyPaymentInstrumentsSuccessResponseVerifyResponses.verifyTransactionRef
    override val externalServiceCode: String
        get() = verifyPaymentInstrumentsSuccessResponseVerifyResponses.externalServiceCode
    override val externalServiceMessage: String
        get() = verifyPaymentInstrumentsSuccessResponseVerifyResponses.externalServiceMessage
}


class OpenApiCreditCardResult(
    private val importPaymentInstrumentsResponseCreditCards: ImportPaymentInstrumentsResponseCreditCards
) : au.com.woolworths.village.sdk.model.walletmanagement.CreditCardResult{
    override val transactionRef: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionRef
    override val bin: String
        get() = importPaymentInstrumentsResponseCreditCards.bin
    override val transactionTimestamp: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionTimestamp
    override val transactionType: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionType
    override val transactionResponseCode: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionResponseCode
    override val transactionResponseText: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionResponseText
    override val orderNumber: String
        get() = importPaymentInstrumentsResponseCreditCards.orderNumber
    override val cardSuffix: String
        get() = importPaymentInstrumentsResponseCreditCards.cardSuffix
    override val expiryMonth: String
        get() = importPaymentInstrumentsResponseCreditCards.expiryMonth
    override val expiryYear: String
        get() = importPaymentInstrumentsResponseCreditCards.expiryYear
    override val amount: BigDecimal
        get() = importPaymentInstrumentsResponseCreditCards.amount
    override val result: au.com.woolworths.village.sdk.model.walletmanagement.ResultEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ResultEnum.valueOf(importPaymentInstrumentsResponseCreditCards.result.value)
    override val errorMessage: au.com.woolworths.village.sdk.model.walletmanagement.ErrorMessage
        get() = toErrorMessage(importPaymentInstrumentsResponseCreditCards.errorMessage.toString())

    private fun toErrorMessage(errorMessage: String): au.com.woolworths.village.sdk.model.walletmanagement.ErrorMessage {
        return OpenApiErrorMessage(errorMessage)
    }
}
class OpenApiErrorMessage(
    private val errorMessage: String
) : au.com.woolworths.village.sdk.model.walletmanagement.ErrorMessage {
    override val description: String
        get() = errorMessage
}
