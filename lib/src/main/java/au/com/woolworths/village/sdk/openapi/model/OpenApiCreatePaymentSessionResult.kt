package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.CreatePaymentSessionResult
import au.com.woolworths.village.sdk.model.QRCode
import au.com.woolworths.village.sdk.openapi.dto.CreateMerchantPaymentSessionResponseData

class OpenApiCreatePaymentSessionResult(
    private val result: CreateMerchantPaymentSessionResponseData
) : CreatePaymentSessionResult {
    override val paymentSessionId: String
        get() = result.paymentSessionId

    override val qr: QRCode?
        get() = result.qr?.let { OpenApiQRCode(it) }
}