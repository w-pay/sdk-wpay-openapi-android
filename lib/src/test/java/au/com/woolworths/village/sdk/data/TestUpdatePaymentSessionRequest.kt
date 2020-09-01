package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.CustomerUpdatePaymentSessionRequest
import au.com.woolworths.village.sdk.model.DynamicPayload
import au.com.woolworths.village.sdk.model.MerchantUpdatePaymentSessionRequest

class TestCustomerUpdatePaymentSessionRequest: CustomerUpdatePaymentSessionRequest {
    override fun customerInfo(): DynamicPayload {
        return TestUpdatePaymentSessionRequestPayload()
    }
}

class TestMerchantUpdatePaymentSessionRequest: MerchantUpdatePaymentSessionRequest {
    override fun paymentRequestId(): String? {
        return null
    }

    override fun merchantInfo(): DynamicPayload {
        return TestUpdatePaymentSessionRequestPayload()
    }
}


class TestUpdatePaymentSessionRequestPayload: DynamicPayload {
    override fun schemaId(): String? {
        return "abc123"
    }

    override fun payload(): Map<String, Any> {
        return emptyMap()
    }
}