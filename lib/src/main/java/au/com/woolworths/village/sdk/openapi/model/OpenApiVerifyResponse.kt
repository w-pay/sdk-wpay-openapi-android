package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsSuccessResponseVerifyResponses


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