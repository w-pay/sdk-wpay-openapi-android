package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.MerchantPayload
import au.com.woolworths.village.sdk.model.PosPayload

fun aNewPosPayload(): PosPayload {
    return TestPosPayload()
}

fun aNewMerchantPayload(): MerchantPayload {
    return TestMerchantPayload()
}

class TestPosPayload : PosPayload {
    override val schemaId: String?
        get() = "abc123"

    override val payload: Map<String, Any>
        get() = emptyMap()
}

class TestMerchantPayload : MerchantPayload {
    override val schemaId: String?
        get() = "abc123"

    override val payload: Map<String, Any>
        get() = emptyMap()
}