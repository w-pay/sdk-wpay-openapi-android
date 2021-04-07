package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.digitalpay.PaymentApiRepository
import au.com.woolworths.village.sdk.model.digitalpay.*
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiCompletionsResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentsPayResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiRefundsResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiVoidsResponse


class OpenApiPaymentApiRepository (
        requestHeadersFactory: RequestHeadersFactory,
        options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), PaymentApiRepository {

    override fun pay(
            paymentRequest: DigitalPayPaymentRequest
    ): ApiResult<DigitalPayPaymentResponse>{
        return makeCall {
            val api = createPaymentsApi()
            val body = au.com.woolworths.village.sdk.openapi.dto.PaymentsRequest()

            body.transactionType = paymentRequest.transactionType as PaymentsRequestTransactionType
            body.clientReference = paymentRequest.clientReference
            body.orderNumber = paymentRequest.orderNumber
            body.shippingAddress = paymentRequest.shippingAddress as PaymentsRequestShippingAddress
            body.payments = paymentRequest.payments as List<PaymentsRequestPayments>
            body.extendedMerchantData = paymentRequest.extendedMerchantData as List<PaymentsRequestExtendedMerchantData>?
            body.storeData = paymentRequest.storeData as PaymentsRequestStoreData
            body.fraudPayload = paymentRequest.fraudPayload as PaymentsRequestFraudPayload

            val response = api.paymentsPost(
                "",
                getDefaultHeader(api.apiClient, X_API_KEY),
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
    ): ApiResult<DigitalPayPaymentResponse>{
        return makeCall {
            val api = createPaymentsApi()
            val body = au.com.woolworths.village.sdk.openapi.dto.PaymentsRequest()

            body.transactionType = paymentRequest.transactionType as PaymentsRequestTransactionType
            body.clientReference = paymentRequest.clientReference
            body.orderNumber = paymentRequest.orderNumber
            body.shippingAddress = paymentRequest.shippingAddress as PaymentsRequestShippingAddress
            body.payments = paymentRequest.payments as List<PaymentsRequestPayments>
            body.extendedMerchantData = paymentRequest.extendedMerchantData as List<PaymentsRequestExtendedMerchantData>?
            body.storeData = paymentRequest.storeData as PaymentsRequestStoreData
            body.fraudPayload = paymentRequest.fraudPayload as PaymentsRequestFraudPayload

            val response = api.paymentsPost(
                "",
                getDefaultHeader(api.apiClient, X_API_KEY),
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

    override fun complete(
            completionRequest: DigitalPayCompletionRequest
    ): ApiResult<DigitalPayCompletionResponse>{
        return makeCall {
            val api = createPaymentsApi()
            val body = au.com.woolworths.village.sdk.openapi.dto.CompletionsRequest()

            body.clientReference = completionRequest.clientReference
            body.orderNumber = completionRequest.orderNumber
            body.completions = completionRequest.completions as List<CompletionsRequestCompletions>

            val response = api.completionsPost(
                    "",
                    getDefaultHeader(api.apiClient, X_API_KEY),
                    body,
                    "",
                    "",
                    "")

            return@makeCall ApiResult.Success(OpenApiCompletionsResponse(response))
        }
    }

    override fun voidPayment(
            voidRequest: DigitalPayVoidRequest
    ): ApiResult<DigitalPayVoidResponse>{
        return makeCall {
            val api = createPaymentsApi()
            val body = au.com.woolworths.village.sdk.openapi.dto.VoidsRequest()

            body.clientReference = voidRequest.clientReference
            body.orderNumber = voidRequest.orderNumber
            body.voids = voidRequest.voids as List<VoidsRequestVoids>

            val response = api.voidsPost(
                    "",
                    getDefaultHeader(api.apiClient, X_API_KEY),
                    body,
                    "",
                    "",
                    "")

            return@makeCall ApiResult.Success(OpenApiVoidsResponse(response))
        }
    }

    override fun refund(
            refundRequest: DigitalPayRefundRequest
    ): ApiResult<DigitalPayRefundResponse>{
        return makeCall {
            val api = createPaymentsApi()
            val body = au.com.woolworths.village.sdk.openapi.dto.RefundsRequest()

            body.clientReference = refundRequest.clientReference
            body.orderNumber = refundRequest.orderNumber
            body.refunds = refundRequest.refunds as List<RefundsRequestRefunds>

            val response = api.refundsPost(
                    "",
                    getDefaultHeader(api.apiClient, X_API_KEY),
                    body,
                    "",
                    "",
                    "")

            return@makeCall ApiResult.Success(OpenApiRefundsResponse(response))
        }
    }
}
