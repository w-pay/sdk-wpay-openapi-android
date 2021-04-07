package au.com.woolworths.village.sdk.openapi.api

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.RequestHeadersFactory
import au.com.woolworths.village.sdk.VillageOptions
import au.com.woolworths.village.sdk.X_API_KEY
import au.com.woolworths.village.sdk.api.CustomerPreferencesRepository
import au.com.woolworths.village.sdk.model.CustomerPreferences
import au.com.woolworths.village.sdk.model.PaymentPreferences
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.PreferencePayments
import au.com.woolworths.village.sdk.openapi.dto.PreferencePaymentsSecondaryInstruments
import au.com.woolworths.village.sdk.openapi.dto.PreferencesCustomer
import au.com.woolworths.village.sdk.openapi.model.OpenApiCustomerPreferences
import java.util.*

class OpenApiCustomerPreferencesRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions
) : OpenApiClientFactory(requestHeadersFactory, options), CustomerPreferencesRepository {
    override fun get(): ApiResult<CustomerPreferences> {
        return makeCall {
            val api = createCustomerApi()

            val data = api.getCustomerPreferences(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                "",
                "",
                ""
            ).data

            ApiResult.Success(OpenApiCustomerPreferences(data))
        }
    }

    override fun set(preferences: CustomerPreferences): ApiResult<Unit> {
        return makeCall {
            val api = createCustomerApi()

            val body = au.com.woolworths.village.sdk.openapi.dto.CustomerPreferences()
            body.data = PreferencesCustomer().apply {
                this.general = preferences.general

                this.payments = preferences.payments?.let {
                    fromPaymentPreferences(it)
                }
            }

            api.setCustomerPreferences(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                "",
                body,
                "",
                "",
                ""
            )

            ApiResult.Success(Unit)
        }
    }
}

fun fromPaymentPreferences(preferences: PaymentPreferences): PreferencePayments =
    PreferencePayments().apply {
        primaryInstrumentId = preferences.primaryInstrumentId
        secondaryInstruments = preferences.secondaryInstruments?.let {
            PreferencePaymentsSecondaryInstruments().apply {
                enableSecondaryInstruments = it.enableSecondaryInstruments
                exclude = it.exclude
                include = it.include
                order = it.order?.let {
                    PreferencePaymentsSecondaryInstruments.OrderEnum.valueOf(
                        it.toString().toUpperCase(Locale.ROOT)
                    )
                }
            }
        }
    }