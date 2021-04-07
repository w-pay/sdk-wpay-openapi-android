package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.*
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

class TestCustomerPreferences : CustomerPreferences {
    override val general: Preferences
        get() = emptyMap()

    override val payments: PaymentPreferences?
        get() = TestPaymentPreferences()
}

class TestPaymentPreferences : PaymentPreferences {
    override val primaryInstrumentId: String
        get() = "90271"

    override val secondaryInstruments: SecondaryInstrumentPreferences?
        get() = null
}