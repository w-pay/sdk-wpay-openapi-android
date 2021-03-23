package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.CreatePaymentAgreementRequest
import au.com.woolworths.village.sdk.model.PaymentAgreement
import au.com.woolworths.village.sdk.model.PaymentAgreements
import au.com.woolworths.village.sdk.model.UpdatePaymentAgreementRequest

interface OpenApiCustomerPaymentAgreementsApiRepository {
    fun list(): ApiResult<PaymentAgreements>

    fun getById(paymentToken: String): ApiResult<PaymentAgreement>

    fun create(paymentAgreement: CreatePaymentAgreementRequest): ApiResult<PaymentAgreement>

    fun update(
        paymentToken: String,
        paymentAgreement: UpdatePaymentAgreementRequest
    ): ApiResult<PaymentAgreement>
}
