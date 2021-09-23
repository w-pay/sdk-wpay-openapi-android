package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.digitalpay.PaymentApiRepository
import au.com.woolworths.village.sdk.model.digitalpay.*
import au.com.woolworths.village.sdk.model.digitalpay.PaymentTransactionType
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.OpenApiCompletionsResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentsPayResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiRefundsResponse
import au.com.woolworths.village.sdk.openapi.model.OpenApiVoidsResponse

class OpenApiPaymentApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), PaymentApiRepository {
    override fun pay(
        paymentRequest: DigitalPayPaymentRequest
    ): ApiResult<DigitalPayPaymentResponse> {
        return makeCall {
            val api = createPaymentsApi()
            val body = fromDigitalPayPaymentRequest(paymentRequest)

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
            val body = fromDigitalPayPaymentRequest(paymentRequest)

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

fun fromPaymentTransactionType(
    transactionType: PaymentTransactionType
): au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType {
    val dto = au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType()

    transactionType.applePay?.let { detail ->
        dto.applePay = PaymentTransactionTypeApplePay(). apply {
            creditCard = PaymentTransactionTypeApplePay.CreditCardEnum.fromValue(detail.creditCard.toString())
            debitCard = PaymentTransactionTypeApplePay.DebitCardEnum.fromValue(detail.debitCard.toString())
        }
    }

    transactionType.creditCard?.let {
        dto.creditCard =
            au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType.CreditCardEnum.fromValue(
                it.toString()
            )
    }

    transactionType.giftCard?.let {
        dto.giftCard =
            au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType.GiftCardEnum.fromValue(
                it.toString()
            )
    }

    transactionType.googlePay?.let { detail ->
        dto.googlePay = PaymentTransactionTypeGooglePay().apply {
            creditCard = PaymentTransactionTypeGooglePay.CreditCardEnum.fromValue(detail.creditCard.toString())
            debitCard = PaymentTransactionTypeGooglePay.DebitCardEnum.fromValue(detail.debitCard.toString())
        }
    }

    transactionType.payPal?.let {
        dto.payPal =
            au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType.PayPalEnum.fromValue(
                it.toString()
            )
    }

    return dto
}

fun fromDigitalPayPaymentRequest(paymentRequest: DigitalPayPaymentRequest): PaymentsRequest {
    val dto = PaymentsRequest()

    dto.transactionType = fromPaymentTransactionType(paymentRequest.transactionType)
    dto.clientReference = paymentRequest.clientReference
    dto.orderNumber = paymentRequest.orderNumber
    dto.shippingAddress = fromShippingAddress(paymentRequest.shippingAddress)
    dto.payments = paymentRequest.payments.map(::fromPaymentsRequestPayments)

    paymentRequest.extendedMerchantData?.let {
        dto.extendedMerchantData = it.map(::fromExtendedMerchantData)
    }

    paymentRequest.storeData?.let {
        dto.storeData = fromDigitalPayStoreData(it)
    }

    paymentRequest.fraudPayload?.let {
        dto.fraudPayload = fromDigitalPayFraudPayload(it)
    }

    return dto
}

fun fromShippingAddress(address: DigitalPayAddress): PaymentsRequestShippingAddress =
    PaymentsRequestShippingAddress().apply {
        company = address.company
        countryCode = address.countryCode
        email = address.email
        extendedAddress = address.extendedAddress
        firstName = address.firstName
        lastName = address.lastName
        postalCode = address.postalCode
        stateOrTerritory = address.stateOrTerritory
        streetAddress = address.streetAddress
        suburb = address.suburb
    }

fun fromPaymentsRequestPayments(payment: DigitalPayPayment): PaymentsRequestPayments =
    PaymentsRequestPayments().apply {
        amount = payment.amount

        payment.controlData?.let { data ->
            controlData = PaymentsRequestControlData().apply {
                tokenType = PaymentsRequestControlData.TokenTypeEnum.fromValue(data.tokenType.toString())
            }
        }

        passcode = payment.passcode
        paymentInstrumentId = payment.paymentInstrumentId
        paymentToken = payment.paymentToken
        stepUpToken = payment.stepUpToken

        payment.threeDS?.let {
            threeDS = fromDigitalPayThreeDS(it)
        }
    }

fun fromDigitalPayThreeDS(threeDS: DigitalPayThreeDS): PaymentsRequestThreeDS =
    PaymentsRequestThreeDS().apply {
        aresStatus = PaymentsRequestThreeDS.AresStatusEnum.fromValue(threeDS.aresStatus.statusCode)
        authenticationValue = threeDS.authenticationValue
        dsTransID = threeDS.dsTransID
        eci = threeDS.eci
        messageVersion = threeDS.messageVersion
        sli = threeDS.sli
        transStatus = PaymentsRequestThreeDS.TransStatusEnum.fromValue(threeDS.transStatus.statusCode)
        veresEnrolled = PaymentsRequestThreeDS.VeresEnrolledEnum.fromValue(threeDS.veresEnrolled.statusCode)
        xid = threeDS.xid
    }

fun fromExtendedMerchantData(data: ExtendedMerchantData): PaymentsRequestExtendedMerchantData =
    PaymentsRequestExtendedMerchantData().apply {
        field = PaymentsRequestExtendedMerchantData.FieldEnum.valueOf(data.field.toString())
        value = data.value
    }

fun fromDigitalPayStoreData(data: DigitalPayStoreData): PaymentsRequestStoreData =
    PaymentsRequestStoreData().apply {
        groupId = data.groupId
        laneId = data.laneId
        rrn = data.rrn
        stan = data.stan
        storeId = data.storeId
        terminalId = data.terminalId
        transactionTimestamp = data.transactionTimestamp
    }

fun fromDigitalPayFraudPayload(payload: DigitalPayFraudPayload): PaymentsRequestFraudPayload =
    PaymentsRequestFraudPayload().apply {
        format = PaymentsRequestFraudPayload.FormatEnum.valueOf(payload.format.toString())
        message = payload.message
        provider = payload.provider
        responseFormat =
            PaymentsRequestFraudPayload.ResponseFormatEnum.valueOf(payload.responseFormat.toString())
        version = payload.version
    }