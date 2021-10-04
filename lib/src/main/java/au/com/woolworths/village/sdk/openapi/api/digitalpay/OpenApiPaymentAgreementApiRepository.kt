package au.com.woolworths.village.sdk.openapi.api.digitalpay

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.digitalpay.PaymentAgreementApiRepository
import au.com.woolworths.village.sdk.model.digitalpay.*
import au.com.woolworths.village.sdk.model.ext.digitalpay.fromDigitalPayAddress
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.*
import au.com.woolworths.village.sdk.openapi.model.digitalpay.OpenApiDigitalPayPaymentAgreementResponse
import java.util.*

class OpenApiPaymentAgreementApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), PaymentAgreementApiRepository {
    override fun create(
        paymentAgreementRequest: DigitalPayCreatePaymentAgreementRequest
    ): ApiResult<DigitalPayPaymentAgreementResponse> {
        return makeCall {
            val api = createPaymentAgreementsApi()

            val body = CreatePaymentAgreementRequest().apply {
                clientReference = paymentAgreementRequest.clientReference
                customerRef = paymentAgreementRequest.customerRef
                orderNumber = paymentAgreementRequest.orderNumber
                billingAddress = paymentAgreementRequest.billingAddress.fromDigitalPayAddress()
                paymentAgreement = CreatePaymentAgreementRequestPaymentAgreement().apply {
                    val paymentAgreement = paymentAgreementRequest.paymentAgreement

                    chargeAmount = paymentAgreement.chargeAmount
                    chargeFrequency =
                        CreatePaymentAgreementRequestPaymentAgreement.ChargeFrequencyEnum.valueOf(
                            paymentAgreement.chargeFrequency.toString()
                        )
                    endDate = paymentAgreement.endDate
                    immediateCharge = paymentAgreement.immediateCharge
                    paymentInstrumentId = paymentAgreement.paymentInstrumentId
                    startDate = paymentAgreement.startDate
                    stepUpToken = paymentAgreement.stepUpToken
                    type = CreatePaymentAgreementRequestPaymentAgreement.TypeEnum.valueOf(
                        paymentAgreement.type.toString()
                    )
                }

                paymentAgreementRequest.fraudPayload?.let { fraudPayload ->
                    this.fraudPayload = VerifyPaymentInstrumentsRequestFraudPayload().apply {
                        provider = fraudPayload.provider
                        version = fraudPayload.version
                    }
                }
            }

            val result = api.paymentagreementsPost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiDigitalPayPaymentAgreementResponse(result))
        }
    }

    override fun update(
        paymentToken: String,
        paymentAgreementRequest: DigitalPayUpdatePaymentAgreementRequest
    ): ApiResult<DigitalPayPaymentAgreementResponse> {
        return makeCall {
            val api = createPaymentAgreementsApi()

            val body = UpdatePaymentAgreementRequest().apply {
                clientReference = paymentAgreementRequest.clientReference
                customerRef = paymentAgreementRequest.customerRef
                billingAddress = paymentAgreementRequest.billingAddress?.fromDigitalPayAddress()
                paymentAgreement = UpdatePaymentAgreementRequestPaymentAgreement().apply {
                    val paymentAgreement = paymentAgreementRequest.paymentAgreement

                    chargeAmount = paymentAgreement?.chargeAmount
                    chargeFrequency = paymentAgreement?.chargeFrequency?.let {
                        UpdatePaymentAgreementRequestPaymentAgreement.ChargeFrequencyEnum.valueOf(
                            it.toString().toUpperCase(Locale.ROOT)
                        )
                    }
                    endDate = paymentAgreement?.endDate
                    paymentInstrumentId = paymentAgreement?.paymentInstrumentId
                    startDate = paymentAgreement?.startDate
                    stepUpToken = paymentAgreement?.stepUpToken
                }
                fraudPayload = paymentAgreementRequest.fraudPayload?.let { fraudPayload ->
                    UpdatePaymentAgreementRequestFraudPayload().apply {
                        provider = fraudPayload.provider
                        version = fraudPayload.version
                        message = fraudPayload.message
                        format = UpdatePaymentAgreementRequestFraudPayload.FormatEnum.valueOf(
                            fraudPayload.format.toString().toUpperCase(Locale.ROOT)
                        )
                        responseFormat = UpdatePaymentAgreementRequestFraudPayload.ResponseFormatEnum.valueOf(
                            fraudPayload.responseFormat.toString().toUpperCase(Locale.ROOT)
                        )
                    }
                }
            }

            val result = api.paymentagreementsPaymentTokenPost(
                paymentToken,
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiDigitalPayPaymentAgreementResponse(result))
        }
    }

    override fun charge(
        chargeRequest: DigitalPayChargePaymentAgreementRequest
    ): ApiResult<DigitalPayPaymentAgreementResponse> {
        return makeCall {
            val api = createPaymentAgreementsApi()

            val body = ChargePaymentAgreementRequest().apply {
                transactionType = ChargePaymentAgreementRequestTransactionType().apply {
                    val type = chargeRequest.transactionType

                    applePay = type.applePay?.let {
                        ChargePaymentAgreementRequestTransactionTypeApplePay().apply {
                            creditCard =
                                ChargePaymentAgreementRequestTransactionTypeApplePay.CreditCardEnum.valueOf(
                                    it.creditCard.toString().toUpperCase(Locale.ROOT)
                                )
                            debitCard =
                                ChargePaymentAgreementRequestTransactionTypeApplePay.DebitCardEnum.valueOf(
                                    it.debitCard.toString().toUpperCase(Locale.ROOT)
                                )
                        }
                    }

                    googlePay = type.googlePay?.let {
                        ChargePaymentAgreementRequestTransactionTypeGooglePay().apply {
                            creditCard =
                                ChargePaymentAgreementRequestTransactionTypeGooglePay.CreditCardEnum.valueOf(
                                    it.creditCard.toString().toUpperCase(Locale.ROOT)
                                )
                            debitCard =
                                ChargePaymentAgreementRequestTransactionTypeGooglePay.DebitCardEnum.valueOf(
                                    it.debitCard.toString().toUpperCase(Locale.ROOT)
                                )
                        }
                    }

                    creditCard = type.creditCard?.let {
                        ChargePaymentAgreementRequestTransactionType.CreditCardEnum.valueOf(
                            it.toString().toUpperCase(Locale.ROOT)
                        )
                    }

                    giftCard = type.giftCard?.let {
                        ChargePaymentAgreementRequestTransactionType.GiftCardEnum.valueOf(
                            it.toString().toUpperCase(Locale.ROOT)
                        )
                    }

                    payPal = type.payPal?.let {
                        ChargePaymentAgreementRequestTransactionType.PayPalEnum.valueOf(
                            it.toString().toUpperCase(Locale.ROOT)
                        )
                    }
                }
                amount = chargeRequest.amount
                clientReference = chargeRequest.clientReference
                customerRef = chargeRequest.customerRef
                orderNumber = chargeRequest.orderNumber
                paymentToken = chargeRequest.paymentToken
                fraudPayload = chargeRequest.fraudPayload?.let { fraudPayload ->
                    VerifyPaymentInstrumentsRequestFraudPayload().apply {
                        provider = fraudPayload.provider
                        version = fraudPayload.version
                        message = fraudPayload.message
                        format = VerifyPaymentInstrumentsRequestFraudPayload.FormatEnum.valueOf(
                            fraudPayload.format.toString().toUpperCase(Locale.ROOT)
                        )
                        responseFormat = VerifyPaymentInstrumentsRequestFraudPayload.ResponseFormatEnum.valueOf(
                            fraudPayload.responseFormat.toString().toUpperCase(Locale.ROOT)
                        )
                    }
                }
            }

            val result = api.paymentagreementsChargePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(OpenApiDigitalPayPaymentAgreementResponse(result))
        }
    }

    override fun delete(paymentToken: String): ApiResult<Unit> {
        return makeCall {
            val api = createPaymentAgreementsApi()

            api.paymentagreementsPaymentTokenDelete(
                paymentToken,
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                ""
            )

            return@makeCall ApiResult.Success(Unit)
        }
    }
}
