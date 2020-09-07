package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.CreatePaymentRequestResult
import au.com.woolworths.village.sdk.model.QRCode
import au.com.woolworths.village.sdk.openapi.dto.CreatePaymentRequestResultsData

class OpenApiCreatePaymentRequestResult(
    private val result: CreatePaymentRequestResultsData
) : CreatePaymentRequestResult {
    override val paymentRequestId: String
        get() = result.paymentRequestId

    override val qr: QRCode?
        get() = result.qr?.let { OpenApiQRCode(it) }
}