package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.MerchantSchema
import au.com.woolworths.village.sdk.model.MerchantSchemaSummaries
import au.com.woolworths.village.sdk.model.MerchantSchemaSummary
import au.com.woolworths.village.sdk.openapi.dto.MerchantSchemaDetailsResultData
import org.threeten.bp.OffsetDateTime

class OpenApiMerchantSchemaSummaries(
    private val summaries: List<au.com.woolworths.village.sdk.openapi.dto.MerchantSchemaSummary>
) : MerchantSchemaSummaries {
    override val schemas: List<MerchantSchemaSummary>
        get() = summaries.map { OpenApiMerchantSchemaSummary(it) }
}

class OpenApiMerchantSchemaSummary(
    private val summary: au.com.woolworths.village.sdk.openapi.dto.MerchantSchemaSummary
) : MerchantSchemaSummary {
    override val schemaId: String
        get() = summary.schemaId

    override val type: String
        get() = summary.type

    override val description: String?
        get() = summary.description
}

class OpenApiMerchantSchema(
    private val details: MerchantSchemaDetailsResultData
) : MerchantSchema {
    override val schema: Map<String, Any>
        get() = details.schema

    override val type: String?
        get() = details.type

    override val description: String?
        get() = details.description

    override val created: OffsetDateTime?
        get() = details.created
}