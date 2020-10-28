package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.MerchantPreferences
import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.model.CreatePaymentSessionRequest
import au.com.woolworths.village.sdk.model.MerchantPaymentDetails
import au.com.woolworths.village.sdk.model.MerchantSchema
import au.com.woolworths.village.sdk.model.MerchantSchemaSummary
import au.com.woolworths.village.sdk.model.MerchantTransactionSummary
import au.com.woolworths.village.sdk.model.PaymentSession
import au.com.woolworths.village.sdk.openapi.model.*
import au.com.woolworths.village.sdk.openapi.dto.*
import org.threeten.bp.OffsetDateTime

class OpenApiVillageMerchantApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    contextRoot: String
) : OpenApiClientFactory(requestHeadersFactory, contextRoot),
    VillageMerchantApiRepository
{
    override fun retrieveTransactions(
        page: Int?,
        pageSize: Int?,
        endTime: OffsetDateTime?,
        startTime: OffsetDateTime?
    ): ApiResult<MerchantTransactionSummaries> {
        return makeCall {
            val api = createMerchantApi()
            
            val data = api.getMerchantTransactions(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                startTime,
                endTime,
                pageSize,
                page).data

            ApiResult.Success(OpenApiMerchantTransactionSummaries(data.transactions))
        }
    }

    override fun retrieveTransactionDetails(transactionId: String): ApiResult<MerchantTransactionDetails> {
        return makeCall {
            val api = createMerchantApi()
            
            val data = api.getMerchantTransactionDetails(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                transactionId
            ).data

            ApiResult.Success(OpenApiMerchantTransactionDetails(data))
        }
    }

    override fun createPaymentRequestQRCode(details: NewPaymentRequestQRCode): ApiResult<QRCode> {
        return makeCall {
            val api = createMerchantApi()

            val body = PaymentQRCodeDetails()
            body.data = MerchantQrData().apply {
                referenceId = details.referenceId
                timeToLive = details.timeToLive

                referenceType = when (details.referenceType) {
                    QRCodePaymentReferenceType.PAYMENT_SESSION -> MerchantQrData.ReferenceTypeEnum.SESSION
                    QRCodePaymentReferenceType.PAYMENT_REQUEST -> MerchantQrData.ReferenceTypeEnum.REQUEST
                }
            }

            val data = api.createPaymentRequestQRCode(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                body
            ).data

            ApiResult.Success(OpenApiQRCode(data))
        }
    }

    override fun retrievePaymentRequestQRCodeContent(qrCodeId: String): ApiResult<QRCode> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getPaymentRequestQRCodeContent(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                qrCodeId
            ).data

            ApiResult.Success(OpenApiQRCode(data))
        }
    }

    override fun cancelPaymentQRCode(qrCodeId: String): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            api.cancelPaymentRequestQRCode(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                qrCodeId
            )

            ApiResult.Success(Unit)
        }
    }

    override fun retrievePaymentList(type: String?, page: Int?, pageSize: Int?): ApiResult<MerchantPaymentSummaries> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantPayments(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                type,
                pageSize,
                page
            ).data

            ApiResult.Success(OpenApiMerchantPaymentSummaries(data.payments))
        }
    }

    override fun createNewPaymentRequest(paymentRequest: NewPaymentRequest): ApiResult<CreatePaymentRequestResult> {
        return makeCall {
            val api = createMerchantApi()

            val body = MerchantPaymentRequest()
            body.data = MerchantPaymentsData().apply {
                merchantReferenceId = paymentRequest.merchantReferenceId
                grossAmount = paymentRequest.grossAmount
                generateQR = paymentRequest.generateQR
                paymentRequest.maxUses?.let { maxUses = it }
                paymentRequest.timeToLivePayment?.let { timeToLivePayment = it }
                paymentRequest.timeToLiveQR?.let { timeToLiveQR = it }
                paymentRequest.specificWalletId?.let { specificWalletId = it }

                paymentRequest.posPayload?.let { posPayload = it.run {
                    val dto = au.com.woolworths.village.sdk.openapi.dto.PosPayload()
                    dto.schemaId(schemaId)
                    dto.payload(payload)
                } }

                paymentRequest.merchantPayload?.let { merchantPayload = it.run {
                    val dto = au.com.woolworths.village.sdk.openapi.dto.MerchantPayload()
                    dto.schemaId(schemaId)
                    dto.payload(payload)
                } }

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
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                body
            ).data

            ApiResult.Success(OpenApiCreatePaymentRequestResult(data))
        }
    }

    override fun retrievePaymentRequestDetails(paymentRequestId: String): ApiResult<MerchantPaymentDetails> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantPaymentDetails(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                paymentRequestId
            ).data

            ApiResult.Success(OpenApiMerchantPaymentDetails(data))
        }
    }

    override fun deletePaymentRequest(paymentRequestId: String): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            api.deleteMerchantPaymentRequest(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                paymentRequestId
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
            body.data = MerchantTransactionsTransactionIdRefundData().apply {
                reason = refundDetails.reason
            }

            val data = api.refundMerchantTransaction(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                transactionId,
                body
            ).data

            ApiResult.Success(OpenApiMerchantTransactionSummary(data))
        }
    }

    override fun retrievePreferences(): ApiResult<MerchantPreferences> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantPreferences(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID)
            ).data

            ApiResult.Success(data)
        }
    }

    override fun setPreferences(preferences: MerchantPreferences): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.MerchantPreferences()
            body.data = preferences

            api.setMerchantPreferences(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                body
            )

            ApiResult.Success(Unit)
        }
    }

    override fun retrieveSchemas(): ApiResult<MerchantSchemaSummaries> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantSchemas(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID)
            ).data

            ApiResult.Success(OpenApiMerchantSchemaSummaries(data.schemas))
        }
    }

    override fun retrieveSchemaDetails(schemaId: String): ApiResult<MerchantSchema> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getMerchantSchemaDetails(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                schemaId
            ).data

            ApiResult.Success(OpenApiMerchantSchema(data))
        }
    }

    override fun createSchema(schema: MerchantSchema): ApiResult<MerchantSchemaSummary> {
        return makeCall {
            val api = createMerchantApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.MerchantSchema()
            body.data = MerchantSchemaData().apply {
                this.schema = schema.schema
                schema.type?.let { type = it }
                schema.description?.let { description = it }
            }

            val data = api.createMerchantSchema(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                body
            ).data

            ApiResult.Success(OpenApiMerchantSchemaSummary(data))
        }
    }

    override fun createPaymentSession(request: CreatePaymentSessionRequest): ApiResult<CreatePaymentSessionResult> {
        return makeCall {
            val api = createMerchantApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CreatePaymentSessionRequest()
            body.data = MerchantPaymentSessionData().apply {
                location = request.location
                merchantInfo = toDynamicPayload(request.merchantInfo)
                generateQR = request.generateQR
                timeToLivePaymentSession = request.timeToLivePaymentSession
                timeToLiveQR = request.timeToLiveQR
            }

            val data = api.createPaymentSession(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                body
            ).data

            ApiResult.Success(OpenApiCreatePaymentSessionResult(data))
        }
    }

    override fun retrievePaymentSession(paymentSessionId: String): ApiResult<PaymentSession> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getPaymentSession(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                paymentSessionId
            ).data

            ApiResult.Success(OpenApiPaymentSession(data))
        }
    }

    override fun updatePaymentSession(
        paymentSessionId: String,
        session: MerchantUpdatePaymentSessionRequest
    ): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            val body = UpdatePaymentSessionRequest1().apply {
                data = MerchantPaymentSessionPaymentSessionIdData().apply {
                    paymentRequestId = session.paymentRequestId
                    merchantInfo = toDynamicPayload(session.merchantInfo)
                }
            }

            api.merchantUpdatePaymentSession(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                paymentSessionId,
                body
            )

            ApiResult.Success(Unit)
        }
    }

    override fun deletePaymentSession(paymentSessionId: String): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            api.deletePaymentSession(
                getDefaultHeader(api.apiClient, X_MERCHANT_ID),
                paymentSessionId
            )

            ApiResult.Success(Unit)
        }
    }

    override fun checkHealth(): ApiResult<HealthCheck> {
        return makeCall {
            val api = createAdministrationApi()

            val data = api.checkHealth().data

            ApiResult.Success(OpenApiHealthCheck(data))
        }
    }
}