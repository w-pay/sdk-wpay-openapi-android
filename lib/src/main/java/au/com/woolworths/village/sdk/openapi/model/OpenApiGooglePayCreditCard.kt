package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.openapi.dto.MerchantProfileResponseAllowedPaymentMethodsGooglePayCreditCard


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