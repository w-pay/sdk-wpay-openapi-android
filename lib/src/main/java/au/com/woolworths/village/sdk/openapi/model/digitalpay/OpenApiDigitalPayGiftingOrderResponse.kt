package au.com.woolworths.village.sdk.openapi.model.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayGiftingOrderResponse
import au.com.woolworths.village.sdk.openapi.dto.InlineResponse2003Data

class OpenApiDigitalPayGiftingOrderResponse(
    private val data: InlineResponse2003Data
) : DigitalPayGiftingOrderResponse {
    override val orderId: String
        get() = data.orderId

    override val quoteNo: String
        get() = data.quoteNo

    override val status: String
        get() = data.status
}