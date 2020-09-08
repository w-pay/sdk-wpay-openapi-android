package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.DynamicPayload

class OpenApiDynamicPayload(
    private val dp: au.com.woolworths.village.sdk.openapi.dto.DynamicPayload
) : DynamicPayload {
    override val schemaId: String?
        get() = dp.schemaId

    override val payload: Map<String, Any>
        get() = dp.payload as Map<String, Any>
}