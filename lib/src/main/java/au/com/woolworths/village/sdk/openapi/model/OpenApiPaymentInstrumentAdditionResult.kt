package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.PaymentInstrumentAdditionResult
import au.com.woolworths.village.sdk.openapi.dto.InitiatePaymentInstrumentAdditionResultsData

class OpenApiPaymentInstrumentAdditionResult(
    private val result: InitiatePaymentInstrumentAdditionResultsData
) : PaymentInstrumentAdditionResult {
    override val cardCaptureURL: String
        get() = result.cardCaptureURL

    override val transactionRef: String?
        get() = result.transactionRef
}