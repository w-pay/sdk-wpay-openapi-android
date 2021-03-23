package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsCreditCard


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