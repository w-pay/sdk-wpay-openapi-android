package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsSuccessResponseFraudResponse


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