package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.DynamicPayload
import au.com.woolworths.village.sdk.model.PaymentSession
import org.threeten.bp.OffsetDateTime

class OpenApiPaymentSession(
    private val session: au.com.woolworths.village.sdk.openapi.dto.PaymentSession
) : PaymentSession {
    override val paymentSessionId: String
        get() = session.paymentSessionId

    override val merchantId: String
        get() = session.merchantId

    override val walletId: String?
        get() = session.walletId

    override val expiryTime: OffsetDateTime
        get() = session.expiryTime

    override val location: String
        get() = session.location

    override val merchantInfo: DynamicPayload
        get() = OpenApiDynamicPayload(session.merchantInfo)

    override val customerInfo: DynamicPayload?
        get() = session.customerInfo?.let { OpenApiDynamicPayload(it) }
}