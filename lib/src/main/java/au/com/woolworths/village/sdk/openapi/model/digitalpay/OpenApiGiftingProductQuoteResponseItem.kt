package au.com.woolworths.village.sdk.openapi.model.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.GiftingProductQuoteResponseItem
import au.com.woolworths.village.sdk.openapi.dto.InlineResponse2002DataOrderItems
import java.math.BigDecimal

class OpenApiGiftingProductQuoteResponseItem(
    private val data: InlineResponse2002DataOrderItems
) : GiftingProductQuoteResponseItem {
    override val amount: BigDecimal
        get() = data.amount

    override val designId: String
        get() = data.designId

    override val isGifting: Boolean
        get() = data.isGifting

    override val mobileNumber: String?
        get() = data.mobileNumber

    override val quantity: Int
        get() = data.quantity

    override val totalPrice: BigDecimal
        get() = data.totalPrice

    override val unitPrice: BigDecimal
        get() = data.unitPrice
}