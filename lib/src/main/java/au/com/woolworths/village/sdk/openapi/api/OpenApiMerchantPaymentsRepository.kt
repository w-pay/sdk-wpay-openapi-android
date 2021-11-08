package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.MerchantPaymentsRepository
import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.model.MerchantPaymentDetails
import au.com.woolworths.village.sdk.model.MerchantTransactionSummary
import au.com.woolworths.village.sdk.model.ext.fromMerchantPayload
import au.com.woolworths.village.sdk.model.ext.fromPosPayload
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiCreatePaymentRequestResult
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantPaymentDetails
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantPaymentSummaries
import au.com.woolworths.village.sdk.openapi.model.OpenApiMerchantTransactionSummary

class OpenApiMerchantPaymentsRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions),
    MerchantPaymentsRepository
{
    override fun listPayments(
        type: String?,
        page: Int?,
        pageSize: Int?
    ): ApiResult<MerchantPaymentSummaries> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantPayments(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                "",
                "", "",
                type,
                pageSize,
                page
            ).data

            ApiResult.Success(OpenApiMerchantPaymentSummaries(data.payments))
        }
    }

    /**
     * Create a new payment request for a customer
     *
     * @param paymentRequest The details of the new payment request
     */
    override fun createPaymentRequest(
        paymentRequest: NewPaymentRequest
    ): ApiResult<CreatePaymentRequestResult> {
        return makeCall {
            val api = createMerchantApi()

            val body = MerchantPaymentRequest()
            body.data = InstoreMerchantPaymentsData().apply {
                merchantReferenceId = paymentRequest.merchantReferenceId
                grossAmount = paymentRequest.grossAmount
                generateQR = paymentRequest.generateQR
                paymentRequest.maxUses?.let { maxUses = it }
                paymentRequest.timeToLivePayment?.let { timeToLivePayment = it }
                paymentRequest.timeToLiveQR?.let { timeToLiveQR = it }
                paymentRequest.specificWalletId?.let { specificWalletId = it }

                paymentRequest.posPayload?.fromPosPayload()
                paymentRequest.merchantPayload?.fromMerchantPayload()

                paymentRequest.basket?.let { aBasket ->
                    basket = aBasket.run {
                        val basket = au.com.woolworths.village.sdk.openapi.dto.Basket()

                        basket.items = items.map { anItem ->
                            val item = au.com.woolworths.village.sdk.openapi.dto.BasketItems()
                            item.label = anItem.label
                            anItem.description?.let { item.description = it }
                            anItem.quantity?.let { item.quantity = it }
                            anItem.unitPrice?.let { item.unitPrice = it }
                            anItem.unitMeasure?.let { item.unitMeasure = it }
                            anItem.totalPrice?.let { item.totalPrice = it }
                            item.tags = anItem.tags

                            return@map item
                        }

                        return@run basket
                    }
                }
            }

            val data = api.createPaymentRequest(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiCreatePaymentRequestResult(data))
        }
    }

    override fun getPaymentRequestDetailsBy(
        paymentRequestId: String
    ): ApiResult<MerchantPaymentDetails> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantPaymentDetails(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                paymentRequestId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiMerchantPaymentDetails(data))
        }
    }

    override fun deletePaymentRequest(paymentRequestId: String): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            api.deleteMerchantPaymentRequest(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                paymentRequestId,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }

    override fun refundTransaction(
        transactionId: String,
        refundDetails: TransactionRefundDetails
    ): ApiResult<MerchantTransactionSummary> {
        return makeCall {
            val api = createMerchantApi()

            val body = RefundMerchantTransactionRequest()
            body.data = InstoreMerchantTransactionsTransactionIdRefundData().apply {
                reason = refundDetails.reason
            }

            val data = api.refundMerchantTransaction(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                transactionId,
                body,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiMerchantTransactionSummary(data))
        }
    }

    override fun completeTransaction(
        transactionId: String,
        completionDetails: TransactionCompletionDetails
    ): ApiResult<MerchantTransactionSummary> {
        return makeCall {
            val api = createMerchantApi()

            val body = InlineObject()
            body.data = InstoreMerchantTransactionsTransactionIdCompletionData().apply {
                clientReference = completionDetails.clientReference
                orderNumber = completionDetails.orderNumber
                completions = completionDetails.completions?.map { item ->
                    InstoreMerchantTransactionsTransactionIdCompletionDataCompletions().apply {
                        paymentTransactionRef = item.paymentTransactionRef
                        amount = item.amount
                    }
                }
            }

            val data = api.instoreMerchantTransactionsTransactionIdCompletionPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                transactionId,
                "",
                "",
                "",
                body
            ).data

            ApiResult.Success(OpenApiMerchantTransactionSummary(data))
        }
    }

    override fun voidTransaction(
        transactionId: String,
        voidDetails: TransactionVoidDetails
    ): ApiResult<MerchantTransactionSummary> {
        return makeCall {
            val api = createMerchantApi()

            val body = InlineObject1()
            body.data = InstoreMerchantTransactionsTransactionIdVoidData().apply {
                clientReference = voidDetails.clientReference
                orderNumber = voidDetails.orderNumber
                voids = voidDetails.voids?.map { item ->
                    InstoreMerchantTransactionsTransactionIdVoidDataVoids().apply {
                        paymentTransactionRef = item.paymentTransactionRef
                    }
                }
            }

            val data = api.instoreMerchantTransactionsTransactionIdVoidPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                transactionId,
                "",
                "",
                "",
                body
            ).data

            ApiResult.Success(OpenApiMerchantTransactionSummary(data))
        }
    }
}
