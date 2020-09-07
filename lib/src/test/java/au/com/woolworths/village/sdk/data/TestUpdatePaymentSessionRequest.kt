package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.CustomerUpdatePaymentSessionRequest
import au.com.woolworths.village.sdk.model.DynamicPayload
import au.com.woolworths.village.sdk.model.MerchantUpdatePaymentSessionRequest

class TestCustomerUpdatePaymentSessionRequest : CustomerUpdatePaymentSessionRequest {
    override val customerInfo: DynamicPayload
        get() = TestUpdatePaymentSessionRequestPayload()
}

class TestMerchantUpdatePaymentSessionRequest : MerchantUpdatePaymentSessionRequest {
    override val paymentRequestId: String?
        get() = null

    override val merchantInfo: DynamicPayload
        get() = TestUpdatePaymentSessionRequestPayload()
}


class TestUpdatePaymentSessionRequestPayload : DynamicPayload {
    override val schemaId: String?
        get() = "abc123"

    override val payload: Map<String, Any>
        get() = emptyMap()
}