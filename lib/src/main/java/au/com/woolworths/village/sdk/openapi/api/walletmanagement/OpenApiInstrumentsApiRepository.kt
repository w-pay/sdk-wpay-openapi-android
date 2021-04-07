package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.model.walletmanagement.*
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiImportPaymentInstrumentsResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiListPaymentInstrumentsResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiVerifyPaymentInstrumentsSuccessResponse

class OpenApiInstrumentsApiRepository (
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options),
    au.com.woolworths.village.sdk.api.walletmanagement.InstrumentsApiRepository {
    override fun import(
        importPaymentInstrumentsRequest: au.com.woolworths.village.sdk.model.walletmanagement.ImportPaymentInstrumentsRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.ImportPaymentInstrumentsResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.ImportPaymentInstrumentsRequest()
            body.uid = importPaymentInstrumentsRequest.uid
            body.shopperId = importPaymentInstrumentsRequest.shopperId
            body.payPal = toPayPal(importPaymentInstrumentsRequest.payPal)
            body.creditCards = importPaymentInstrumentsRequest.creditCards!!.map(::toCreditCard)

            val response = api.instrumentsImportPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiImportPaymentInstrumentsResponse(
                    response
                )
            )
        }
    }

    override fun verify(
        verifyPaymentInstrumentsRequest: au.com.woolworths.village.sdk.model.walletmanagement.VerifyPaymentInstrumentsRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.VerifyPaymentInstrumentsSuccessResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.VerifyPaymentInstrumentsRequest()
            body.clientReference = verifyPaymentInstrumentsRequest.clientReference
            body.paymentInstruments = verifyPaymentInstrumentsRequest.paymentInstruments.map(::toPaymentInstruments)
            body.fraudPayload = toFraudPayload(verifyPaymentInstrumentsRequest.fraudPayload)

            val response = api.instrumentsVerifyPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                "",
                getDefaultHeader(api.apiClient, X_EVERYDAY_PAY_WALLET)
            )

            return@makeCall ApiResult.Success(
                OpenApiVerifyPaymentInstrumentsSuccessResponse(
                    response
                )
            )
        }
    }

    override fun getList(): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.ListPaymentInstrumentsResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val response = api.instrumentsGet(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                "",
                "",
                "",
                getDefaultHeader(api.apiClient, X_EVERYDAY_PAY_WALLET)
            )

            return@makeCall ApiResult.Success(
                OpenApiListPaymentInstrumentsResponse(
                    response
                )
            )
        }
    }

    override fun postList(
        listPaymentInstrumentsRequest: au.com.woolworths.village.sdk.model.walletmanagement.ListPaymentInstrumentsRequest
    ): ApiResult<au.com.woolworths.village.sdk.model.walletmanagement.ListPaymentInstrumentsResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.ListPaymentInstrumentsRequest()
            body.uid = listPaymentInstrumentsRequest.uid
            body.shopperId = listPaymentInstrumentsRequest.shopperId

            val response = api.instrumentsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(
                OpenApiListPaymentInstrumentsResponse(
                    response
                )
            )
        }
    }

    override fun delete(paymentInstrumentId: String): ApiResult<Map<String, Any>> {
        return makeCall {
            val api = createWalletManagementApi()

            val response : Map<String, Any> = api.instrumentsPaymentInstrumentIdDelete(
                paymentInstrumentId,
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                "",
                "",
                "",
                getDefaultHeader(api.apiClient, X_EVERYDAY_PAY_WALLET)
            ) as Map<String, Any>
            return@makeCall ApiResult.Success(
                response
            )
        }
    }

    private fun toCreditCard(creditCard: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentRequestCreditCard): ImportPaymentInstrumentsRequestCreditCards {
        val instrumentCreditCard = ImportPaymentInstrumentsRequestCreditCards()
        instrumentCreditCard.transactionRef = creditCard.transactionRef
        instrumentCreditCard.transactionTimestamp = creditCard.transactionTimestamp
        instrumentCreditCard.orderNumber = creditCard.orderNumber
        instrumentCreditCard.bin = creditCard.bin
        instrumentCreditCard.cardSuffix = creditCard.cardSuffix
        instrumentCreditCard.amount = creditCard.amount
        return instrumentCreditCard
    }

    private fun toPayPal(payPal: au.com.woolworths.village.sdk.model.walletmanagement.PayPalDetail?):  ImportPaymentInstrumentsRequestPayPal{
        val instrumentPayPal = ImportPaymentInstrumentsRequestPayPal()
        instrumentPayPal.customerId = payPal!!.customerId
        instrumentPayPal.payPalId = payPal.payPalId
        instrumentPayPal.paymentMethodToken = payPal.paymentMethodToken
        return instrumentPayPal
    }

    private fun toFraudPayload(fraudPayload: au.com.woolworths.village.sdk.model.walletmanagement.FraudPayload?): VerifyPaymentInstrumentsRequestFraudPayload {
        val verifyPaymentInstrumentsRequestFraudPayload = VerifyPaymentInstrumentsRequestFraudPayload()
        verifyPaymentInstrumentsRequestFraudPayload.provider = fraudPayload!!.provider
        verifyPaymentInstrumentsRequestFraudPayload.version = fraudPayload.version
        verifyPaymentInstrumentsRequestFraudPayload.format= VerifyPaymentInstrumentsRequestFraudPayload.FormatEnum.valueOf(fraudPayload.format.toString())
        verifyPaymentInstrumentsRequestFraudPayload.message = fraudPayload.message
        verifyPaymentInstrumentsRequestFraudPayload.responseFormat = VerifyPaymentInstrumentsRequestFraudPayload.ResponseFormatEnum.valueOf(fraudPayload.responseFormat.toString())
        return verifyPaymentInstrumentsRequestFraudPayload
    }

    private fun toPaymentInstruments(instrument: au.com.woolworths.village.sdk.model.walletmanagement.VerifyPaymentInstrumentsRequestInstrument): VerifyPaymentInstrumentsRequestPaymentInstruments {
        val i = VerifyPaymentInstrumentsRequestPaymentInstruments()
        i.paymentToken = instrument.paymentToken
        i.stepUpToken = instrument.stepUpToken
        return i
    }
}
