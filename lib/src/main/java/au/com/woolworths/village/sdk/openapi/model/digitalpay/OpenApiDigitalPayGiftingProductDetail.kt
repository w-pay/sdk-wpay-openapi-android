package au.com.woolworths.village.sdk.openapi.model.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayGiftingProduct
import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayGiftingProductDetail
import au.com.woolworths.village.sdk.model.digitalpay.GiftingProductDesign
import au.com.woolworths.village.sdk.model.digitalpay.GiftingProductDiscount
import au.com.woolworths.village.sdk.openapi.dto.GiftingProductDetail
import org.threeten.bp.OffsetDateTime
import java.util.*

class OpenApiDigitalPayGiftingProductDetail(
    private val data: GiftingProductDetail
) : DigitalPayGiftingProductDetail {
    override val availability: DigitalPayGiftingProductDetail.Availability
        get() = DigitalPayGiftingProductDetail.Availability.valueOf(
            data.availability.value.toUpperCase(Locale.ROOT)
        )

    override val barCodeType: DigitalPayGiftingProduct.BarCodeType
        get() = DigitalPayGiftingProduct.BarCodeType.valueOf(
            data.barCodeType.value.toUpperCase(Locale.ROOT)
        )

    override val defaultDesign: GiftingProductDesign
        get() = OpenApiGiftingProductDesign(data.defaultDesign)

    override val designs: List<GiftingProductDesign>
        get() = data.designs.map { OpenApiGiftingProductDesign(it) }

    override val discountOffered: GiftingProductDiscount?
        get() = data.discountOffered?.let { OpenApiGiftingProductDiscount(it) }

    override val expiryPeriodInDays: Int?
        get() = data.expiryPeriodInDays

    override val expiryPeriodText: String?
        get() = data.expiryPeriodText

    override val isActive: Boolean
        get() = data.isActive

    override val lastUpdateDateTime: OffsetDateTime
        get() = OffsetDateTime.parse(data.lastUpdateDateTime)

    override val maxValue: Int
        get() = data.maxValue

    override val minValue: Int
        get() = data.minValue

    override val name: String
        get() = data.name

    override val productId: String
        get() = data.productId

    override val redemptionInstructions: String?
        get() = data.redemptionInstructions

    override val redemptionStores: List<String>?
        get() = data.redemptionStores

    override val redemptionType: DigitalPayGiftingProductDetail.RedemptionType
        get() = DigitalPayGiftingProductDetail.RedemptionType.valueOf(
            data.redemptionType.value.toUpperCase(Locale.ROOT)
        )

    override val termsAndConditions: String?
        get() = data.termsAndConditions
}