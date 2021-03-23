package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ImportPaymentInstrumentsResponse
import java.util.*

class OpenApiImportPaymentInstrumentsResponse(
    private val importPaymentInstrumentsResponse: ImportPaymentInstrumentsResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.ImportPaymentInstrumentsResponse {
    override val uid: String
        get() = importPaymentInstrumentsResponse.uid
    override val shopperId: String
        get() = importPaymentInstrumentsResponse.shopperId
    override val creditCards: List<au.com.woolworths.village.sdk.model.walletmanagement.CreditCardResult>
        get() = importPaymentInstrumentsResponse.creditCards!!.map { OpenApiCreditCardResult(it) }
    override val payPal: au.com.woolworths.village.sdk.model.walletmanagement.PayPal
        get() = OpenApiPayPal(importPaymentInstrumentsResponse.payPal!!)
}
