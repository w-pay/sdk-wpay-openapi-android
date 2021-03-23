package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.PaymentAgreement
import au.com.woolworths.village.sdk.model.PaymentAgreements
import au.com.woolworths.village.sdk.openapi.dto.PaymentAgreementListResponseData

class OpenApiPaymentAgreementsResponse(
    private val paymentAgreementList: PaymentAgreementListResponseData
) : PaymentAgreements {

    override val paymentAgreements: List<PaymentAgreement>
        get() = paymentAgreementList.paymentAgreements as List<PaymentAgreement>
}