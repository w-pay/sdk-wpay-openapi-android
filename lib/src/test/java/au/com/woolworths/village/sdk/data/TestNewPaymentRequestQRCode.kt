package au.com.woolworths.village.sdk.data

import au.com.woolworths.village.sdk.model.NewPaymentRequestQRCode
import au.com.woolworths.village.sdk.model.QRCodePaymentReferenceType

fun aNewPaymentRequestQRCode(): NewPaymentRequestQRCode {
    return TestNewPaymentRequestQRCode()
}

class TestNewPaymentRequestQRCode : NewPaymentRequestQRCode {
    override val referenceId: String
        get() = "abc123def"

    override val referenceType: QRCodePaymentReferenceType
        get() = QRCodePaymentReferenceType.PAYMENT_SESSION
}