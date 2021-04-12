package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.*
import au.com.woolworths.village.sdk.openapi.dto.PreferencePayments
import au.com.woolworths.village.sdk.openapi.dto.PreferencesCustomer
import java.util.*

class OpenApiCustomerPreferences(
    private val preferences: PreferencesCustomer
) : CustomerPreferences {
    override val general: Preferences?
        get() = preferences.general

    override val payments: PaymentPreferences?
        get() = preferences.payments?.let {
            OpenApiPaymentPreferences(it)
        }
}

class OpenApiPaymentPreferences(
    private val preferences: PreferencePayments
) : PaymentPreferences {
    override val primaryInstrumentId: String?
        get() = preferences.primaryInstrumentId

    override val secondaryInstruments: SecondaryInstrumentPreferences?
        get() = preferences.secondaryInstruments?.let {
            object : SecondaryInstrumentPreferences {
                override val enableSecondaryInstruments: Boolean
                    get() = it.enableSecondaryInstruments ?: false

                override val exclude: List<String>?
                    get() = it.exclude

                override val include: List<String>?
                    get() = it.include

                override val order: SecondaryInstrumentOrder?
                    get() = it.order?.let { order ->
                        SecondaryInstrumentOrder.valueOf(order.value.toUpperCase(Locale.ROOT))
                    }
            }
        }
}