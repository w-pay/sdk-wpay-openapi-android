package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ImportPaymentInstrumentsResponse
import au.com.woolworths.village.sdk.openapi.dto.ImportPaymentInstrumentsResponseCreditCards
import au.com.woolworths.village.sdk.openapi.dto.ImportPaymentInstrumentsResponsePayPal
import java.util.*

class OpenApiImportPaymentInstrumentsResponse(
    private val importPaymentInstrumentsResponse: ImportPaymentInstrumentsResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.ImportPaymentInstrumentsResponse {
    override val uid: String
        get() = importPaymentInstrumentsResponse.uid
    override val shopperId: String
        get() = importPaymentInstrumentsResponse.shopperId
    override val creditCards: List<au.com.woolworths.village.sdk.model.walletmanagement.CreditCardResult>
        get() = importPaymentInstrumentsResponse.creditCards!!.map(::toCreditCards)

    override val payPal: au.com.woolworths.village.sdk.model.walletmanagement.PayPal
        get() = toPayPal(importPaymentInstrumentsResponse.payPal)

    private fun toCreditCards(importPaymentInstrumentsResponseCreditCards: ImportPaymentInstrumentsResponseCreditCards?):
            au.com.woolworths.village.sdk.model.walletmanagement.CreditCardResult {
        return OpenApiCreditCardResult(importPaymentInstrumentsResponseCreditCards!!)
    }

    private fun toPayPal(importPaymentInstrumentsResponseCreditCards: ImportPaymentInstrumentsResponsePayPal?):
            au.com.woolworths.village.sdk.model.walletmanagement.PayPal {
        return OpenApiPayPal(importPaymentInstrumentsResponseCreditCards!!)
    }
}

class OpenApiPayPal(
    private val importPaymentInstrumentsResponseCreditCards: ImportPaymentInstrumentsResponsePayPal
) : au.com.woolworths.village.sdk.model.walletmanagement.PayPal{
    override val customerId: String
        get() = importPaymentInstrumentsResponseCreditCards.customerId
    override val payPalId: String
        get() = importPaymentInstrumentsResponseCreditCards.payPalId!!
    override val paymentMethodToken: String
        get() = importPaymentInstrumentsResponseCreditCards.paymentMethodToken!!
    override val result: au.com.woolworths.village.sdk.model.walletmanagement.ResultEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ResultEnum.valueOf(importPaymentInstrumentsResponseCreditCards.result.value)
    override val errorMessage: au.com.woolworths.village.sdk.model.walletmanagement.ErrorMessage
        get() = OpenApiErrorMessage(importPaymentInstrumentsResponseCreditCards.errorMessage.toString())
}
