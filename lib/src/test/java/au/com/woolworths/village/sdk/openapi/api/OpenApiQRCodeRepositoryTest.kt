package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.data.aNewPaymentRequestQRCode
import au.com.woolworths.village.sdk.matchers.aQrCode
import au.com.woolworths.village.sdk.matchers.isSuccessful
import au.com.woolworths.village.sdk.matchers.isSuccessfulWith
import au.com.woolworths.village.sdk.openapi.OpenApiSdkFactory
import org.junit.Assert
import org.junit.Test

class OpenApiQRCodeRepositoryTest {
    private val apiFactory = OpenApiSdkFactory()
    private val api = apiFactory.createMerchantApi()

    @Test
    fun shouldCreatePaymentRequestQRCode() {
        val result = api.qr.createPaymentRequestQRCode(aNewPaymentRequestQRCode())

        Assert.assertThat(result, isSuccessfulWith(aQrCode()))
    }

    @Test
    fun shouldRetrievePaymentRequestQRCodeContent() {
        val qrCodeId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.qr.getPaymentRequestQRCodeContent(qrCodeId)

        Assert.assertThat(result, isSuccessfulWith(aQrCode()))
    }

    @Test
    fun shouldCancelPaymentQRCode() {
        val qrCodeId = "a5bbfe1a-c1b9-11ea-924f-33c96a9759eb"

        val result = api.qr.cancelPaymentQRCode(qrCodeId)

        Assert.assertThat(result, isSuccessful())
    }
}