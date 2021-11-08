package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.digitalpay.PaymentApiRepository
import au.com.woolworths.village.sdk.model.digitalpay.*
import au.com.woolworths.village.sdk.model.ext.digitalpay.fromDigitalPayPaymentRequest
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiCompletionsResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentsPayResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiRefundsResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiVoidsResponse

class OpenApiPaymentApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions), PaymentApiRepository {
    override fun pay(
        paymentRequest: DigitalPayPaymentRequest
    ): ApiResult<DigitalPayPaymentResponse> {
        return makeCall {
            val api = createPaymentsApi()
            val body = paymentRequest.fromDigitalPayPaymentRequest()

            val response = api.paymentsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                "",
                getDefaultHeader(api.apiClient, X_EVERYDAY_PAY_WALLET)
            )

            return@makeCall ApiResult.Success(OpenApiPaymentsPayResponse(response))
        }
    }

    override fun guestPayment(
        paymentRequest: DigitalPayPaymentRequest
    ): ApiResult<DigitalPayPaymentResponse> {
        return makeCall {
            val api = createPaymentsApi()
            val body = paymentRequest.fromDigitalPayPaymentRequest()

            val response = api.guestPaymentsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiPaymentsPayResponse(response))
        }
    }

    override fun complete(
        completionRequest: DigitalPayCompletionRequest
    ): ApiResult<DigitalPayCompletionResponse> {
        return makeCall {
            val api = createPaymentsApi()
            val body = au.com.woolworths.village.sdk.openapi.dto.CompletionsRequest()

            body.clientReference = completionRequest.clientReference
            body.orderNumber = completionRequest.orderNumber
            body.completions = completionRequest.completions.map { completion ->
                InstoreMerchantTransactionsTransactionIdCompletionDataCompletions().apply {
                    amount = completion.amount
                    paymentTransactionRef = completion.paymentTransactionRef
                }
            }

            val response = api.completionsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiCompletionsResponse(response))
        }
    }

    override fun voidPayment(
        voidRequest: DigitalPayVoidRequest
    ): ApiResult<DigitalPayVoidResponse> {
        return makeCall {
            val api = createPaymentsApi()
            val body = au.com.woolworths.village.sdk.openapi.dto.VoidsRequest()

            body.clientReference = voidRequest.clientReference
            body.orderNumber = voidRequest.orderNumber
            body.voids = voidRequest.voids.map { void ->
                InstoreMerchantTransactionsTransactionIdVoidDataVoids().apply {
                    paymentTransactionRef = void.paymentTransactionRef
                }
            }

            val response = api.voidsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiVoidsResponse(response))
        }
    }

    override fun refund(
        refundRequest: DigitalPayRefundRequest
    ): ApiResult<DigitalPayRefundResponse> {
        return makeCall {
            val api = createPaymentsApi()
            val body = au.com.woolworths.village.sdk.openapi.dto.RefundsRequest()

            body.clientReference = refundRequest.clientReference
            body.orderNumber = refundRequest.orderNumber
            body.refunds = refundRequest.refunds.map { refund ->
                RefundsRequestRefunds().apply {
                    amount = refund.amount
                    paymentTransactionRef = refund.paymentTransactionRef
                }
            }

            val response = api.refundsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiRefundsResponse(response))
        }
    }
}
