package au.com.woolworths.village.sdk.openapi.model.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.GiftingProductDiscount
import org.threeten.bp.OffsetDateTime

class OpenApiGiftingProductDiscount(
    private val data: au.com.woolworths.village.sdk.openapi.dto.GiftingProductDiscount
) : GiftingProductDiscount {
    override val description: String
        get() = data.description

    override val discountId: String
        get() = data.discountId

    override val endDate: OffsetDateTime
        get() = OffsetDateTime.parse(data.endDate)

    override val percentageDiscount: Int
        get() = data.percentageDiscount

    override val startDate: OffsetDateTime
        get() = OffsetDateTime.parse(data.startDate)
}