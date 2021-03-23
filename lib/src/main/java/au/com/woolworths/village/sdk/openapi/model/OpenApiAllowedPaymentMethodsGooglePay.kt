package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsGooglePay
import java.math.BigDecimal


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