package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.digitalpay.OpenPayPaymentResponse
import au.com.woolworths.village.sdk.model.digitalpay.OpenPayPaymentResponseDetails
import au.com.woolworths.village.sdk.openapi.dto.OpenpayPaymentsSuccessResponse

class OpenApiOpenPayPaymentResponse(
        private val openpayPaymentsSuccessResponse: OpenpayPaymentsSuccessResponse
) : OpenPayPaymentResponse {

    override val transactionReceipt: String
        get() = openpayPaymentsSuccessResponse.transactionReceipt

    override val paymentResponses: List<OpenPayPaymentResponseDetails>
        get() = openpayPaymentsSuccessResponse.paymentResponses as List<OpenPayPaymentResponseDetails>
}