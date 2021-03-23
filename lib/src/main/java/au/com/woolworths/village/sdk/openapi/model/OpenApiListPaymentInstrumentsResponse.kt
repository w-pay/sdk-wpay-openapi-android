package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.*
import java.math.BigDecimal
import java.util.*

class OpenApiListPaymentInstrumentsResponse(
    private val listPaymentInstrumentsResponse: ListPaymentInstrumentsResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.ListPaymentInstrumentsResponse {
    override val creditCards: List<au.com.woolworths.village.sdk.model.walletmanagement.CreditCardDetails>
        get() = listPaymentInstrumentsResponse.creditCards.map(::toCreditCardDetails)
    override val giftCards: List<au.com.woolworths.village.sdk.model.walletmanagement.GiftCardDetails>
        get() = listPaymentInstrumentsResponse.giftCards.map(::toGiftCardDetails)
    override val androidPay: String
        get() = listPaymentInstrumentsResponse.androidPay.toString()
    override val googlePay: au.com.woolworths.village.sdk.model.walletmanagement.GooglePayDetails
        get() = toGooglePayDetails(listPaymentInstrumentsResponse.googlePay)
    override val applePay: au.com.woolworths.village.sdk.model.walletmanagement.ApplePayDetails
        get() = toApplePayDetails(listPaymentInstrumentsResponse.applePay)
    override val payPal: List<au.com.woolworths.village.sdk.model.walletmanagement.PayPalDetails>
        get() = listPaymentInstrumentsResponse.payPal.map(::toPayPalDetails)
    override val paymentAgreements: List<au.com.woolworths.village.sdk.model.walletmanagement.PaymentAgreementDetails>
        get() = listPaymentInstrumentsResponse.paymentAgreements.map(::toPaymentAgreementDetails)
}

fun toPaymentAgreementDetails(listPaymentInstrumentsResponsePaymentAgreements: ListPaymentInstrumentsResponsePaymentAgreements?):
        au.com.woolworths.village.sdk.model.walletmanagement.PaymentAgreementDetails {
    return OpenApiPaymentAgreementDetails(listPaymentInstrumentsResponsePaymentAgreements!!)
}
class OpenApiPaymentAgreementDetails(
    private val listPaymentInstrumentsResponsePaymentAgreements: ListPaymentInstrumentsResponsePaymentAgreements
): au.com.woolworths.village.sdk.model.walletmanagement.PaymentAgreementDetails{
    override val paymentToken: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.paymentToken
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponsePaymentAgreements.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.lastUsed
    override val primary: Boolean
        get() = listPaymentInstrumentsResponsePaymentAgreements.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponsePaymentAgreements.allowed
    override val cardSuffix: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.cardSuffix!!
    override val type: au.com.woolworths.village.sdk.model.walletmanagement.PaymentAgreementTypeEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentAgreementTypeEnum.valueOf(listPaymentInstrumentsResponsePaymentAgreements.type.value)
    override val chargeFrequency: au.com.woolworths.village.sdk.model.walletmanagement.ChargeFrequencyEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ChargeFrequencyEnum.valueOf(listPaymentInstrumentsResponsePaymentAgreements.chargeFrequency.value)
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.paymentInstrumentId
    override val scheme: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.scheme!!
    override val expiryMonth: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.expiryMonth!!
    override val expiryYear: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.expiryYear!!
    override val startDate: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.startDate
    override val endDate: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.endDate!!
    override val chargeAmount: BigDecimal
        get() = listPaymentInstrumentsResponsePaymentAgreements.chargeAmount!!
    override val chargeCycle: BigDecimal
        get() = listPaymentInstrumentsResponsePaymentAgreements.chargeCycle!!
    override val expired: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.expired
    override val updateURL: String
        get() = listPaymentInstrumentsResponsePaymentAgreements.updateURL!!
    override val stepUp: au.com.woolworths.village.sdk.model.walletmanagement.StepUp
        get() = toStepUp(listPaymentInstrumentsResponsePaymentAgreements.stepUp)

    private fun toStepUp(stepUp: ListPaymentInstrumentsResponseStepUp1?):
            au.com.woolworths.village.sdk.model.walletmanagement.StepUp {
        return OpenApiStepUp(stepUp!!.mandatory, stepUp.type, stepUp.url)
    }
}

fun toPayPalDetails(listPaymentInstrumentsResponsePayPal: ListPaymentInstrumentsResponsePayPal?):
        au.com.woolworths.village.sdk.model.walletmanagement.PayPalDetails {
    return OpenApiPaymentInstrumentsPayPalDetails(listPaymentInstrumentsResponsePayPal!!)
}

class OpenApiPaymentInstrumentsPayPalDetails(
    private val listPaymentInstrumentsResponsePayPal: ListPaymentInstrumentsResponsePayPal
) : au.com.woolworths.village.sdk.model.walletmanagement.PayPalDetails{
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponsePayPal.paymentInstrumentId
    override val paymentToken: String
        get() = listPaymentInstrumentsResponsePayPal.paymentToken
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponsePayPal.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponsePayPal.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponsePayPal.lastUsed
    override val primary: Boolean
        get() = listPaymentInstrumentsResponsePayPal.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponsePayPal.allowed
    override val payPalId: String
        get() = listPaymentInstrumentsResponsePayPal.payPalId
    override val customerId: String
        get() = listPaymentInstrumentsResponsePayPal.customerId
}
private fun toGooglePayDetails(googlePay: ListPaymentInstrumentsResponseGooglePay?):
        au.com.woolworths.village.sdk.model.walletmanagement.GooglePayDetails {
    return OpenApiGooglePayDetails(googlePay!!)
}
class OpenApiGooglePayDetails(
    private val listPaymentInstrumentsResponseGooglePay: ListPaymentInstrumentsResponseGooglePay
) : au.com.woolworths.village.sdk.model.walletmanagement.GooglePayDetails{
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponseGooglePay.paymentInstrumentId
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponseGooglePay.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponseGooglePay.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponseGooglePay.lastUsed
    override val primary: Boolean
        get() = listPaymentInstrumentsResponseGooglePay.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponseGooglePay.allowed
    override val paymentToken: String
        get() = listPaymentInstrumentsResponseGooglePay.paymentToken
    override val expired: Boolean
        get() = listPaymentInstrumentsResponseGooglePay.expired
    override val stepUp: au.com.woolworths.village.sdk.model.walletmanagement.StepUp
        get() = toStepUp(listPaymentInstrumentsResponseGooglePay.stepUp)

    private fun toStepUp(stepUp: ListPaymentInstrumentsResponseGooglePayStepUp?):
            au.com.woolworths.village.sdk.model.walletmanagement.StepUp {
        return OpenApiStepUp(stepUp!!.mandatory, stepUp.type, stepUp.url)
    }
}
class OpenApiStepUp(
    private val mandatoryValue: Boolean,
    private val typeValue: String,
    private val urlValue: String
) : au.com.woolworths.village.sdk.model.walletmanagement.StepUp{
    override val mandatory: Boolean
        get() = mandatoryValue
    override val type: au.com.woolworths.village.sdk.model.walletmanagement.StepUpTypeEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.StepUpTypeEnum.valueOf(typeValue)
    override val url: String
        get() = urlValue
}
private fun toApplePayDetails(applePay: ListPaymentInstrumentsResponseApplePay):
        au.com.woolworths.village.sdk.model.walletmanagement.ApplePayDetails {
    return OpenApiApplePayDetails(applePay)
}
class OpenApiApplePayDetails(
    private val applePay: ListPaymentInstrumentsResponseApplePay
) : au.com.woolworths.village.sdk.model.walletmanagement.ApplePayDetails{
    override val paymentInstrumentId: String
        get() = applePay.paymentInstrumentId
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(applePay.status.value)
    override val lastUpdated: String
        get() = applePay.lastUpdated
    override val lastUsed: String
        get() = applePay.lastUsed
    override val paymentToken: String
        get() = applePay.paymentToken
    override val primary: Boolean
        get() = applePay.primary
    override val allowed: Boolean
        get() = applePay.allowed
    override val stepUp: au.com.woolworths.village.sdk.model.walletmanagement.StepUp
        get() = toStepUp(applePay.stepUp)

    private fun toStepUp(stepUp: ListPaymentInstrumentsResponseApplePayStepUp?):
            au.com.woolworths.village.sdk.model.walletmanagement.StepUp {
        return OpenApiStepUp(stepUp!!.mandatory, stepUp.type, stepUp.url)
    }
}
private fun toGiftCardDetails(listPaymentInstrumentsResponseGiftCards: ListPaymentInstrumentsResponseGiftCards?):
        au.com.woolworths.village.sdk.model.walletmanagement.GiftCardDetails {
    return OpenApiGiftCardDetails(listPaymentInstrumentsResponseGiftCards!!)
}
class OpenApiGiftCardDetails(
    private val listPaymentInstrumentsResponseGiftCards: ListPaymentInstrumentsResponseGiftCards
) : au.com.woolworths.village.sdk.model.walletmanagement.GiftCardDetails{
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponseGiftCards.paymentInstrumentId
    override val paymentToken: String
        get() = listPaymentInstrumentsResponseGiftCards.paymentToken
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponseGiftCards.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponseGiftCards.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponseGiftCards.lastUsed
    override val programName: String
        get() = listPaymentInstrumentsResponseGiftCards.programName
    override val cardSuffix: String
        get() = listPaymentInstrumentsResponseGiftCards.cardSuffix
    override val primary: Boolean
        get() = listPaymentInstrumentsResponseGiftCards.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponseGiftCards.allowed
}
private fun toCreditCardDetails(listPaymentInstrumentsResponseCreditCards: ListPaymentInstrumentsResponseCreditCards?):
        au.com.woolworths.village.sdk.model.walletmanagement.CreditCardDetails{
    return OpenApiCreditCardDetails(listPaymentInstrumentsResponseCreditCards!!)
}
class OpenApiCreditCardDetails(
    private val listPaymentInstrumentsResponseCreditCards: ListPaymentInstrumentsResponseCreditCards
) : au.com.woolworths.village.sdk.model.walletmanagement.CreditCardDetails{
    override val paymentInstrumentId: String
        get() = listPaymentInstrumentsResponseCreditCards.paymentInstrumentId
    override val status: au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.PaymentInstrumentStatus.valueOf(listPaymentInstrumentsResponseCreditCards.status.value)
    override val lastUpdated: String
        get() = listPaymentInstrumentsResponseCreditCards.lastUpdated
    override val lastUsed: String
        get() = listPaymentInstrumentsResponseCreditCards.lastUsed
    override val cardName: String
        get() = listPaymentInstrumentsResponseCreditCards.cardName
    override val cardSuffix: String
        get() = listPaymentInstrumentsResponseCreditCards.cardSuffix
    override val paymentToken: String
        get() = listPaymentInstrumentsResponseCreditCards.paymentToken
    override val expiryYear: String
        get() = listPaymentInstrumentsResponseCreditCards.expiryYear
    override val expiryMonth: String
        get() = listPaymentInstrumentsResponseCreditCards.expiryMonth
    override val scheme: String
        get() = listPaymentInstrumentsResponseCreditCards.scheme
    override val updateURL: String
        get() = listPaymentInstrumentsResponseCreditCards.updateURL
    override val expired: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.expired
    override val primary: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.primary
    override val allowed: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.allowed
    override val cvvValidated: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.cvvValidated
    override val requiresCVV: Boolean
        get() = listPaymentInstrumentsResponseCreditCards.requiresCVV
    override val stepUp: au.com.woolworths.village.sdk.model.walletmanagement.StepUp
        get() = toStepUp(listPaymentInstrumentsResponseCreditCards.stepUp)

    private fun toStepUp(stepUp: CreditCardStepUp?):
            au.com.woolworths.village.sdk.model.walletmanagement.StepUp {
        return OpenApiStepUp(stepUp!!.mandatory, stepUp.type, stepUp.url)
    }
}

private fun toVerifyResponses(importPaymentInstrumentsResponseCreditCards: ImportPaymentInstrumentsResponseCreditCards?):
        au.com.woolworths.village.sdk.model.walletmanagement.CreditCardResult {
    return OpenApiPaymentInstrumentsCreditCardResult(importPaymentInstrumentsResponseCreditCards!!)
}

class OpenApiPaymentInstrumentsCreditCardResult(
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
        get() = toErrorMessage(importPaymentInstrumentsResponseCreditCards.errorMessage.toString())

    private fun toErrorMessage(errorMessage: String): au.com.woolworths.village.sdk.model.walletmanagement.ErrorMessage {
        return OpenApiPaymentInstrumentsErrorMessage(errorMessage)
    }
}
class OpenApiPaymentInstrumentsErrorMessage(
    private val errorMessage: String
) : au.com.woolworths.village.sdk.model.walletmanagement.ErrorMessage {
    override val description: String
        get() = errorMessage
}
