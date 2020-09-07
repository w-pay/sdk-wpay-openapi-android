package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.CreatePaymentSessionRequest
import au.com.woolworths.village.sdk.model.DynamicPayload

class TestCreatePaymentSessionRequest : CreatePaymentSessionRequest {
    override val location: String
        get() = "somewhere"

    override val merchantInfo: DynamicPayload
        get() = TestCreatePaymentSessionRequestPayload()
}

class TestCreatePaymentSessionRequestPayload : DynamicPayload {
    override val schemaId: String?
        get() = "abc123"

    override val payload: Map<String, Any>
        get() = emptyMap()
}