package au.com.woolworths.village.sdk.openapi.model.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayGiftingProduct
import au.com.woolworths.village.sdk.model.digitalpay.GiftingProductDesign
import au.com.woolworths.village.sdk.model.digitalpay.GiftingProductDiscount
import au.com.woolworths.village.sdk.openapi.dto.GiftingProduct
import org.threeten.bp.OffsetDateTime
import java.util.*

open class OpenApiDigitalPayGiftingProduct(
    private val data: GiftingProduct
) : DigitalPayGiftingProduct {
    override val barCodeType: DigitalPayGiftingProduct.BarCodeType
        get() = DigitalPayGiftingProduct.BarCodeType.valueOf(
            data.barCodeType.value.toUpperCase(Locale.ROOT)
        )

    override val defaultDesign: GiftingProductDesign
        get() = OpenApiGiftingProductDesign(data.defaultDesign)

    override val discountOffered: GiftingProductDiscount?
        get() = data.discountOffered?.let { OpenApiGiftingProductDiscount(it) }

    override val lastUpdateDateTime: OffsetDateTime
        get() = OffsetDateTime.parse(data.lastUpdateDateTime)

    override val name: String
        get() = data.name

    override val productId: String
        get() = data.productId
}