package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.PosPayload

class OpenApiPosPayload(
    private val pp: au.com.woolworths.village.sdk.openapi.dto.PosPayload
) : PosPayload {
    override val schemaId: String?
        get() = pp.schemaId

    override val payload: Map<String, Any>
        get() = pp.payload as Map<String, Any>
}