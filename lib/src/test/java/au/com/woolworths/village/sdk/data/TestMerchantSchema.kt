package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.MerchantSchema
import org.threeten.bp.OffsetDateTime

fun aNewSchema(): MerchantSchema = TestMerchantSchema()

class TestMerchantSchema : MerchantSchema {
    override val schema: Map<String, Any>
        get() = emptyMap()

    override val type: String?
        get() = null

    override val description: String?
        get() = null

    override val created: OffsetDateTime?
        get() = null
}