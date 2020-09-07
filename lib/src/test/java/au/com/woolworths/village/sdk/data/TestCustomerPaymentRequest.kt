package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.Basket
import au.com.woolworths.village.sdk.model.CustomerPaymentRequest
import java.math.BigDecimal

fun aNewCustomerPaymentRequest(): CustomerPaymentRequest = TestCustomerPaymentRequest()

class TestCustomerPaymentRequest : CustomerPaymentRequest {
    override val merchantId: String
        get() = "abc123"

    override val basket: Basket?
        get() = aNewBasket()

    override val paymentRequestId: String
        get() = "def456"

    override val merchantReferenceId: String
        get() = "hij789"

    override val grossAmount: BigDecimal
        get() = BigDecimal.TEN
}