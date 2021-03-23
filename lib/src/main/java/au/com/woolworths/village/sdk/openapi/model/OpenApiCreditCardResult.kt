package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.ImportPaymentInstrumentsResponseCreditCards
import java.math.BigDecimal


class OpenApiCreditCardResult(
    private val importPaymentInstrumentsResponseCreditCards: ImportPaymentInstrumentsResponseCreditCards
) : au.com.woolworths.village.sdk.model.walletmanagement.CreditCardResult{
    override val transactionRef: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionRef
    override val bin: String
        get() = importPaymentInstrumentsResponseCreditCards.bin
    override val transactionTimestamp: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionTimestamp
    override val transactionType: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionType
    override val transactionResponseCode: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionResponseCode
    override val transactionResponseText: String
        get() = importPaymentInstrumentsResponseCreditCards.transactionResponseText
    override val orderNumber: String
        get() = importPaymentInstrumentsResponseCreditCards.orderNumber
    override val cardSuffix: String
        get() = importPaymentInstrumentsResponseCreditCards.cardSuffix
    override val expiryMonth: String
        get() = importPaymentInstrumentsResponseCreditCards.expiryMonth
    override val expiryYear: String
        get() = importPaymentInstrumentsResponseCreditCards.expiryYear
    override val amount: BigDecimal
        get() = importPaymentInstrumentsResponseCreditCards.amount
    override val result: au.com.woolworths.village.sdk.model.walletmanagement.ResultEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ResultEnum.valueOf(importPaymentInstrumentsResponseCreditCards.result.value)
    override val errorMessage: au.com.woolworths.village.sdk.model.walletmanagement.ErrorMessage
        get() = OpenApiErrorMessage(importPaymentInstrumentsResponseCreditCards.errorMessage.toString())
}