package au.com.woolworths.village.sdk.openapi.model.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayGiftingQuoteResponse
import au.com.woolworths.village.sdk.model.digitalpay.GiftingProductQuoteResponseItem
import au.com.woolworths.village.sdk.openapi.dto.InlineResponse2002Data
import java.math.BigDecimal

class OpenApiDigitalPayGiftingQuoteResponse(
    private val data: InlineResponse2002Data
) : DigitalPayGiftingQuoteResponse {
    override val discountAmount: BigDecimal
        get() = data.discountAmount

    override val orderItems: GiftingProductQuoteResponseItem
        get() = OpenApiGiftingProductQuoteResponseItem(data.orderItems)

    override val quoteId: String
        get() = data.quoteId

    override val subTotalAmount: BigDecimal
        get() = data.subTotalAmount

    override val totalOrderAmount: BigDecimal
        get() = data.totalOrderAmount
}