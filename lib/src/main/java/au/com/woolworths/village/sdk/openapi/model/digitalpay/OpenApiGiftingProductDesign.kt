package au.com.woolworths.village.sdk.openapi.model.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.GiftingProductDesign
import java.util.*

class OpenApiGiftingProductDesign(
    private val data:  au.com.woolworths.village.sdk.openapi.dto.GiftingProductDesign
) : GiftingProductDesign {
    override val designId: String
        get() = data.designId

    override val designType: GiftingProductDesign.DesignType
        get() = GiftingProductDesign.DesignType.valueOf(
            data.designId.toString().toUpperCase(Locale.ROOT)
        )

    override val imageUrl: String
        get() = data.imageUrl
}
