package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsSuccessResponse
import java.util.*

class OpenApiVerifyPaymentInstrumentsSuccessResponse(
    private val importPaymentInstrumentsResponse: VerifyPaymentInstrumentsSuccessResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.VerifyPaymentInstrumentsSuccessResponse {
    override val transactionReceipt: String
        get() = importPaymentInstrumentsResponse.transactionReceipt
    override val partialSuccess: Boolean
        get() = importPaymentInstrumentsResponse.partialSuccess
    override val verifyResponses: List<au.com.woolworths.village.sdk.model.walletmanagement.VerifyResponse>
        get() = importPaymentInstrumentsResponse.verifyResponses!!.map{OpenApiVerifyResponse(it)}
    override val fraudResponse: au.com.woolworths.village.sdk.model.walletmanagement.FraudResponse
        get() = OpenApiFraudResponse(importPaymentInstrumentsResponse.fraudResponse)
}
