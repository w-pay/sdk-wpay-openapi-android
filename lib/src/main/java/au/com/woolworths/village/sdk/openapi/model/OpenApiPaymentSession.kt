package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.DynamicPayload
import au.com.woolworths.village.sdk.model.PaymentSession
import org.threeten.bp.OffsetDateTime

class OpenApiPaymentSession(
    private val session: au.com.woolworths.village.sdk.openapi.dto.PaymentSession
): PaymentSession {
    override fun paymentSessionId(): String {
        return session.paymentSessionId
    }

    override fun merchantId(): String {
        return session.merchantId
    }

    override fun walletId(): String? {
        return session.walletId
    }

    override fun expiryTime(): OffsetDateTime {
        return session.expiryTime
    }

    override fun location(): String {
        return session.location
    }

    override fun merchantInfo(): DynamicPayload {
        return OpenApiDynamicPayload(session.merchantInfo)
    }

    override fun customerInfo(): DynamicPayload? {
        return session.customerInfo?.let { OpenApiDynamicPayload(it) }
    }
}