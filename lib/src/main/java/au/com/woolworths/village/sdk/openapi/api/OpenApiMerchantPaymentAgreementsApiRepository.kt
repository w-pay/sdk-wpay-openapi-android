package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.model.ChargePaymentAgreementRequest
import au.com.woolworths.village.sdk.openapi.model.digitalpay.OpenApiDigitalPayPaymentAgreementResponse
import au.com.woolworths.village.sdk.openapi.dto.InstoreMerchantPaymentsAgreementsPaymentTokenData
import au.com.woolworths.village.sdk.openapi.dto.MerchantChargePaymentAgreementRequest
import au.com.woolworths.village.sdk.openapi.dto.TransactionType
import au.com.woolworths.village.sdk.api.MerchantPaymentAgreementsRepository
import au.com.woolworths.village.sdk.model.digitalpay.DigitalPayPaymentAgreementResponse
import java.util.*

class OpenApiMerchantPaymentAgreementsApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), MerchantPaymentAgreementsRepository {
    override fun charge(
        paymentToken: String,
        chargePaymentAgreementRequest: ChargePaymentAgreementRequest
    ): ApiResult<DigitalPayPaymentAgreementResponse> {
        return makeCall {
            val api = createMerchantApi()

            val body = MerchantChargePaymentAgreementRequest()
            body.data = InstoreMerchantPaymentsAgreementsPaymentTokenData().apply {
                this.paymentToken = chargePaymentAgreementRequest.paymentToken
                amount = chargePaymentAgreementRequest.amount
                clientReference = chargePaymentAgreementRequest.clientReference
                orderNumber = chargePaymentAgreementRequest.orderNumber
                transactionType = TransactionType.valueOf(
                    chargePaymentAgreementRequest.transactionType.toString()
                )
                customerRef = chargePaymentAgreementRequest.customerRef
            }

            val data = api.chargeMerchantPaymentAgreement(
                getDefaultHeader(api.apiClient, X_API_KEY),
                paymentToken,
                body
            ).data

            return@makeCall ApiResult.Success(OpenApiDigitalPayPaymentAgreementResponse(data))
        }
    }

    override fun delete(
        paymentToken: String
    ): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            api.deleteMerchantPaymentAgreement(
                getDefaultHeader(api.apiClient, X_API_KEY),
                paymentToken
            )

            return@makeCall ApiResult.Success(Unit)
        }
    }
}