package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.PaymentInstrumentsRepository
import au.com.woolworths.village.sdk.model.IndividualPaymentInstrument
import au.com.woolworths.village.sdk.model.PaymentInstrumentAddition
import au.com.woolworths.village.sdk.model.PaymentInstrumentAdditionResult
import au.com.woolworths.village.sdk.model.WalletContents
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.InstoreCustomerInstrumentsData
import au.com.woolworths.village.sdk.openapi.dto.InstrumentAdditionDetails
import au.com.woolworths.village.sdk.openapi.model.OpenApiIndividualPaymentInstrument
import au.com.woolworths.village.sdk.openapi.model.OpenApiPaymentInstrumentAdditionResult
import au.com.woolworths.village.sdk.openapi.model.OpenApiWalletContents

class OpenApiPaymentInstrumentsRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), PaymentInstrumentsRepository {
    override fun getByToken(
        paymentToken: String,
        publicKey: String?
    ): ApiResult<IndividualPaymentInstrument> {
       return makeCall {
           val api = createCustomerApi()

           val result = api.getCustomerPaymentInstrument(
               paymentToken,
               getDefaultHeader(api.apiClient, X_API_KEY),
               "",
               "",
               "",
               "",
               "",
               getDefaultHeader(api.apiClient, X_EVERYDAY_PAY_WALLET),
               ""
           )

           return@makeCall ApiResult.Success(OpenApiIndividualPaymentInstrument(result))
       }
    }

    override fun list(): ApiResult<WalletContents> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPaymentInstruments(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                ""
            ).data

            ApiResult.Success(
                OpenApiWalletContents(
                    data.creditCards,
                    data.giftCards,
                    data.everydayPay
                )
            )
        }
    }

    override fun delete(instrument: String): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            api.deletePaymentInstrument(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                instrument,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }

    override fun initiateAddition(
        instrument: PaymentInstrumentAddition
    ): ApiResult<PaymentInstrumentAdditionResult> {
        return makeCall {
            val api = createCustomerApi()

            val body = InstrumentAdditionDetails()
            body.data = InstoreCustomerInstrumentsData().apply {
                clientReference = instrument.clientReference
            }

            val data = api.initiatePaymentInstrumentAddition(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiPaymentInstrumentAdditionResult(data))
        }
    }
}