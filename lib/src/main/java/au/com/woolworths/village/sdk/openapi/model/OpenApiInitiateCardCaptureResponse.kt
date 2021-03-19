package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.InitiateCardCaptureResponse
import java.util.*

class OpenApiInitiateCardCaptureResponse(
    private val initiateCardCaptureResponse: InitiateCardCaptureResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.InitiateCardCaptureResponse {
    override val cardCaptureURL: String
        get() = initiateCardCaptureResponse.cardCaptureURL
    override val transactionRef: String
        get() = initiateCardCaptureResponse.transactionRef!!
}