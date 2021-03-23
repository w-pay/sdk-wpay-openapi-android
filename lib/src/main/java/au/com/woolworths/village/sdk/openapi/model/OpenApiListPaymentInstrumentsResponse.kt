package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.*
import java.util.*

class OpenApiListPaymentInstrumentsResponse(
    private val listPaymentInstrumentsResponse: ListPaymentInstrumentsResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.ListPaymentInstrumentsResponse {
    override val creditCards: List<au.com.woolworths.village.sdk.model.walletmanagement.CreditCardDetails>
        get() = listPaymentInstrumentsResponse.creditCards.map{OpenApiCreditCardDetails(it)}
    override val giftCards: List<au.com.woolworths.village.sdk.model.walletmanagement.GiftCardDetails>
        get() = listPaymentInstrumentsResponse.giftCards.map{OpenApiGiftCardDetails(it)}
    override val androidPay: String
        get() = listPaymentInstrumentsResponse.androidPay.toString()
    override val googlePay: au.com.woolworths.village.sdk.model.walletmanagement.GooglePayDetails
        get() = OpenApiGooglePayDetails(listPaymentInstrumentsResponse.googlePay)
    override val applePay: au.com.woolworths.village.sdk.model.walletmanagement.ApplePayDetails
        get() = OpenApiApplePayDetails(listPaymentInstrumentsResponse.applePay)
    override val payPal: List<au.com.woolworths.village.sdk.model.walletmanagement.PayPalDetails>
        get() = listPaymentInstrumentsResponse.payPal.map{OpenApiPaymentInstrumentsPayPalDetails(it)}
    override val paymentAgreements: List<au.com.woolworths.village.sdk.model.walletmanagement.PaymentAgreementDetails>
        get() = listPaymentInstrumentsResponse.paymentAgreements.map{OpenApiPaymentAgreementDetails(it)}
}
