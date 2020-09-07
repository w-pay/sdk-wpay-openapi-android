package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.QRCode
import au.com.woolworths.village.sdk.model.QRCodePaymentReferenceType
import au.com.woolworths.village.sdk.openapi.dto.Qr
import org.threeten.bp.OffsetDateTime
import java.util.*

class OpenApiQRCode(
    private val code: Qr
) : QRCode {
    override val qrId: String
        get() = code.qrId

    override val referenceId: String
        get() = code.referenceId

    override val referenceType: QRCodePaymentReferenceType
        get() = QRCodePaymentReferenceType.valueOf(code.referenceType.value.toUpperCase(Locale.ROOT))

    override val content: String
        get() = code.content

    override val image: String
        get() = code.image

    override val expiryTime: OffsetDateTime?
        get() = code.expiryTime
}