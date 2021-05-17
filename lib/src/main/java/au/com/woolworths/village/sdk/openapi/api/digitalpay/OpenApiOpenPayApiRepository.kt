package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.digitalpay.OpenPayApiRepository
import au.com.woolworths.village.sdk.model.digitalpay.*
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiOpenPayCompletionResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiOpenPayPaymentResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiOpenPayRefundsResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiOpenPayVoidResponse


class OpenApiOpenPayApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), OpenPayApiRepository {

    override fun pay(paymentRequest: OpenPayPaymentRequest): ApiResult<OpenPayPaymentResponse> {
        return makeCall {
            val api = createOpenpayApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.OpenpayPaymentsRequest().apply {
                clientReference = paymentRequest.clientReference
                channel = paymentRequest.channel
                customerRef = paymentRequest.customerRef
                merchantTransactedAt = paymentRequest.merchantTransactedAt
                orderNumber = paymentRequest.orderNumber
                transactionType = OpenpayPaymentsRequestTransactionType().apply {
                    openPay = OpenpayPaymentsRequestTransactionType.OpenPayEnum.valueOf(
                        paymentRequest.transactionType.openPay.toString()
                    )
                }
            }

            val response = api.openpayPaymentsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiOpenPayPaymentResponse(response))
        }
    }

    override fun complete(completionRequest: OpenPayCompletionRequest): ApiResult<OpenPayCompletionResponse> {
        return makeCall {
            val api = createOpenpayApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.OpenpayCompletionsRequest()
            body.clientReference = completionRequest.clientReference
            body.orderNumber = completionRequest.orderNumber
            body.merchantTransactedAt = completionRequest.merchantTransactedAt
            body.completions =
                completionRequest.completions as List<OpenpayCompletionsRequestCompletions>

            val response = api.openpayCompletionsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiOpenPayCompletionResponse(response))
        }
    }

    override fun voidPayment(voidRequest: OpenPayVoidRequest): ApiResult<OpenPayVoidResponse> {
        return makeCall {
            val api = createOpenpayApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.OpenpayVoidsRequest()
            body.clientReference = voidRequest.clientReference
            body.orderNumber = voidRequest.orderNumber
            body.voids = voidRequest.voids as List<OpenpayVoidsRequestVoids>

            val response = api.openpayVoidsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiOpenPayVoidResponse(response))
        }
    }

    override fun refund(refundRequest: OpenPayRefundRequest): ApiResult<OpenPayRefundResponse> {
        return makeCall {
            val api = createOpenpayApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.OpenpayRefundsRequest()
            body.clientReference = refundRequest.clientReference
            body.orderNumber = refundRequest.orderNumber
            body.merchantTransactedAt = refundRequest.merchantTransactedAt
            body.refunds = refundRequest.refunds as List<OpenpayRefundsRequestRefunds>
            body.storeData = refundRequest.storeData as OpenpayRefundsRequestStoreData

            val response = api.openpayRefundsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiOpenPayRefundsResponse(response))
        }
    }
}
