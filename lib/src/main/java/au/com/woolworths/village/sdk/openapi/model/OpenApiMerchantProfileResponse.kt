package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.*
import java.math.BigDecimal
import java.util.*

class OpenApiMerchantProfileResponse(
    private val merchantProfileResponse: MerchantProfileResponse
) : au.com.woolworths.village.sdk.model.walletmanagement.MerchantProfileResponse {
    override val allowedPaymentMethods: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethods
        get() = toAllowedPaymentMethods(merchantProfileResponse.allowedPaymentMethods)

    fun toAllowedPaymentMethods(allowedPaymentMethods: MerchantProfileResponseAllowedPaymentMethods): au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethods {
        return OpenApiAllowedPaymentMethods(allowedPaymentMethods)
    }
}

class OpenApiAllowedPaymentMethods(
    private val allowedPaymentMethods: MerchantProfileResponseAllowedPaymentMethods
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethods {
    override val giftCard: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsGiftCard
        get() = OpenApiAllowedPaymentMethodsGiftCard(allowedPaymentMethods.giftCard)
    override val creditCard: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsCreditCard
        get() = OpenApiAllowedPaymentMethodsCreditCard(allowedPaymentMethods.creditCard)
    override val paypal: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsPaypal
        get() = OpenApiAllowedPaymentMethodsPaypal(allowedPaymentMethods.payPal)
    override val googlePay: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsGooglePay
        get() = OpenApiAllowedPaymentMethodsGooglePay(allowedPaymentMethods.googlePay)
    override val applePay: au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsApplePay
        get() = OpenApiAllowedPaymentMethodsApplePay(allowedPaymentMethods.applePay)
}

class OpenApiAllowedPaymentMethodsGiftCard(
    private val giftCard: MerchantProfileResponseAllowedPaymentMethodsGiftCard?
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsGiftCard {
    override val allowedBins: List<String>
        get() = giftCard!!.allowedBins
    override val serviceStatus: au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus.valueOf(giftCard!!.serviceStatus.value)
    override val pinAlwaysRequired: Boolean?
        get() = giftCard!!.pinAlwaysRequired
}

class OpenApiAllowedPaymentMethodsCreditCard(
    private val creditCard: MerchantProfileResponseAllowedPaymentMethodsCreditCard?
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsCreditCard {
    override val allowedNetworks: List<String>
        get() = creditCard!!.allowedNetworks
    override val serviceStatus: au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus.valueOf(
            creditCard!!.serviceStatus.value
        )
    override val allowedTransactionTypes: List<au.com.woolworths.village.sdk.model.walletmanagement.TransactionTypeEnum>
        get() = creditCard!!.allowedTransactionTypes?.map(::toAllowedTransactionTypes) ?: emptyList()

    fun toAllowedTransactionTypes(transactionType: MerchantProfileResponseAllowedPaymentMethodsCreditCard.AllowedTransactionTypesEnum): au.com.woolworths.village.sdk.model.walletmanagement.TransactionTypeEnum {
        return au.com.woolworths.village.sdk.model.walletmanagement.TransactionTypeEnum.valueOf(
            transactionType.value
        )
    }
}

class OpenApiAllowedPaymentMethodsPaypal(
    private val payPal: MerchantProfileResponseAllowedPaymentMethodsPayPal?
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsPaypal {
    override val clientToken: String
        get() = payPal!!.clientToken
    override val serviceStatus: au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus.valueOf(payPal!!.serviceStatus.value)
}

class OpenApiAllowedPaymentMethodsGooglePay(
    private val googlePay: MerchantProfileResponseAllowedPaymentMethodsGooglePay?
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsGooglePay {
    override val publicKey: String
        get() = googlePay!!.publicKey
    override val publicKeyHash: String
        get() = googlePay!!.publicKeyHash
    override val merchantId: String
        get() = googlePay!!.merchantId
    override val publicKeyExpiry: BigDecimal
        get() = googlePay!!.publicKeyExpiry
    override val merchantName: String
        get() = googlePay!!.merchantName
    override val creditCard: au.com.woolworths.village.sdk.model.walletmanagement.Card
        get() = OpenApiGooglePayCreditCard(googlePay!!.creditCard)
    override val debitCard: au.com.woolworths.village.sdk.model.walletmanagement.Card
        get() = OpenApiGooglePayDebitCard(googlePay!!.debitCard)
    override val serviceStatus: au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus.valueOf(googlePay!!.serviceStatus.value)
}

class OpenApiAllowedPaymentMethodsApplePay(
    private val applePay: MerchantProfileResponseAllowedPaymentMethodsApplePay
) : au.com.woolworths.village.sdk.model.walletmanagement.AllowedPaymentMethodsApplePay {
    override val creditCard: au.com.woolworths.village.sdk.model.walletmanagement.Card
        get() = OpenApiGooglePayCreditCard(applePay.creditCard)
    override val debitCard: au.com.woolworths.village.sdk.model.walletmanagement.Card
        get() = OpenApiGooglePayDebitCard(applePay.debitCard)
    override val serviceStatus: au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus
        get() = au.com.woolworths.village.sdk.model.walletmanagement.ServiceStatus.valueOf(applePay.serviceStatus.value)
}

class OpenApiGooglePayCreditCard(
    private val card: MerchantProfileResponseAllowedPaymentMethodsGooglePayCreditCard
) : au.com.woolworths.village.sdk.model.walletmanagement.Card {
    override val allowedNetworks: List<String>
        get() = card.allowedNetworks
    override val allowedTransactionTypes: List<au.com.woolworths.village.sdk.model.walletmanagement.TransactionTypeEnum>
        get() = card.allowedTransactionTypes.map(::toAllowedTransactionTypes)

    fun toAllowedTransactionTypes(transactionType: MerchantProfileResponseAllowedPaymentMethodsGooglePayCreditCard.AllowedTransactionTypesEnum): au.com.woolworths.village.sdk.model.walletmanagement.TransactionTypeEnum {
        return au.com.woolworths.village.sdk.model.walletmanagement.TransactionTypeEnum.valueOf(
            transactionType.value
        )
    }
}

class OpenApiGooglePayDebitCard(
    private val card: MerchantProfileResponseAllowedPaymentMethodsGooglePayDebitCard
) : au.com.woolworths.village.sdk.model.walletmanagement.Card {
    override val allowedNetworks: List<String>
        get() = card.allowedNetworks
    override val allowedTransactionTypes: List<au.com.woolworths.village.sdk.model.walletmanagement.TransactionTypeEnum>
        get() = card.allowedTransactionTypes.map(::toAllowedTransactionTypes)

    fun toAllowedTransactionTypes(transactionType: MerchantProfileResponseAllowedPaymentMethodsGooglePayDebitCard.AllowedTransactionTypesEnum): au.com.woolworths.village.sdk.model.walletmanagement.TransactionTypeEnum {
        return au.com.woolworths.village.sdk.model.walletmanagement.TransactionTypeEnum.valueOf(
            transactionType.value
        )
    }
}