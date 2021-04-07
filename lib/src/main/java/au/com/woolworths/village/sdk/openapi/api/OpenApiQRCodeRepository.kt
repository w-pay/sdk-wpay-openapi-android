package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.QRCodeRepository
import au.com.woolworths.village.sdk.model.NewPaymentRequestQRCode
import au.com.woolworths.village.sdk.model.QRCode
import au.com.woolworths.village.sdk.model.QRCodePaymentReferenceType
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.InstoreMerchantQrData
import au.com.woolworths.village.sdk.openapi.dto.PaymentQRCodeDetails
import au.com.woolworths.village.sdk.openapi.model.OpenApiQRCode

class OpenApiQRCodeRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), QRCodeRepository {
    override fun createPaymentRequestQRCode(details: NewPaymentRequestQRCode): ApiResult<QRCode> {
        return makeCall {
            val api = createMerchantApi()

            val body = PaymentQRCodeDetails()
            body.data = InstoreMerchantQrData().apply {
                referenceId = details.referenceId
                timeToLive = details.timeToLive

                referenceType = when (details.referenceType) {
                    QRCodePaymentReferenceType.PAYMENT_SESSION -> InstoreMerchantQrData.ReferenceTypeEnum.SESSION
                    QRCodePaymentReferenceType.PAYMENT_REQUEST -> InstoreMerchantQrData.ReferenceTypeEnum.REQUEST
                }
            }

            val data = api.createPaymentRequestQRCode(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                body,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiQRCode(data))
        }
    }

    override fun getPaymentRequestQRCodeContent(qrCodeId: String): ApiResult<QRCode> {
        return makeCall {
            val api = createMerchantApi()

            val data = api.getPaymentRequestQRCodeContent(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                qrCodeId,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiQRCode(data))
        }
    }

    override fun cancelPaymentQRCode(qrCodeId: String): ApiResult<Unit> {
        return makeCall {
            val api = createMerchantApi()

            api.cancelPaymentRequestQRCode(
                getDefaultHeader(api.apiClient, X_API_KEY),
                getDefaultHeader(api.apiClient, AUTHORISATION),
                "",
                qrCodeId,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }
}