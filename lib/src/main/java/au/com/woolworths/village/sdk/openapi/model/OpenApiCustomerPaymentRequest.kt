package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.Basket
import au.com.woolworths.village.sdk.model.CustomerPaymentRequest
import java.math.BigDecimal

class OpenApiCustomerPaymentRequest(
    private val customerPaymentDetails: au.com.woolworths.village.sdk.openapi.dto.CustomerPaymentRequestDetails
): CustomerPaymentRequest {
    override val paymentRequestId: String
        get() = customerPaymentDetails.paymentRequestId

    override val merchantReferenceId: String
        get() = customerPaymentDetails.merchantReferenceId

    override val grossAmount: BigDecimal
        get() = customerPaymentDetails.grossAmount

    override val merchantId: String
        get() = customerPaymentDetails.merchantId

    override val basket: Basket?
        get() = customerPaymentDetails.basket?.let { OpenApiBasket(it) }
}