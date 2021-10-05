package au.com.woolworths.village.sdk.model.ext.digitalpay

import au.com.woolworths.village.sdk.model.digitalpay.PaymentTransactionType
import au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionTypeApplePay
import au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionTypeGooglePay

fun PaymentTransactionType.fromPaymentTransactionType(): au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType =
    au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType().apply {
        this@fromPaymentTransactionType.applePay?.let { detail ->
            this.applePay = PaymentTransactionTypeApplePay(). apply {
                creditCard = PaymentTransactionTypeApplePay.CreditCardEnum.fromValue(detail.creditCard.toString())
                debitCard = PaymentTransactionTypeApplePay.DebitCardEnum.fromValue(detail.debitCard.toString())
            }
        }

        this@fromPaymentTransactionType.creditCard?.let {
            this.creditCard =
                au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType.CreditCardEnum.fromValue(
                    it.toString()
                )
        }

        this@fromPaymentTransactionType.giftCard?.let {
            this.giftCard =
                au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType.GiftCardEnum.fromValue(
                    it.toString()
                )
        }

        this@fromPaymentTransactionType.googlePay?.let { detail ->
            this.googlePay = PaymentTransactionTypeGooglePay().apply {
                creditCard = PaymentTransactionTypeGooglePay.CreditCardEnum.fromValue(detail.creditCard.toString())
                debitCard = PaymentTransactionTypeGooglePay.DebitCardEnum.fromValue(detail.debitCard.toString())
            }
        }

        this@fromPaymentTransactionType.payPal?.let {
            this.payPal =
                au.com.woolworths.village.sdk.openapi.dto.PaymentTransactionType.PayPalEnum.fromValue(
                    it.toString()
                )
        }
    }