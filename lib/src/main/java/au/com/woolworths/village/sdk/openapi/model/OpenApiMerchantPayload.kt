package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.MerchantPayload

class OpenApiMerchantPayload(
    private val mp: au.com.woolworths.village.sdk.openapi.dto.MerchantPayload
) : MerchantPayload {
    override val schemaId: String?
        get() = mp.schemaId

    override val payload: Map<String, Any>
        get() = mp.payload as Map<String, Any>
}