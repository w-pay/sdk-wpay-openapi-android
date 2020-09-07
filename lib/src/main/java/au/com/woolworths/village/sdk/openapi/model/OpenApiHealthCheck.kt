package au.com.woolworths.village.sdk.openapi.model

import au.com.woolworths.village.sdk.model.HealthCheck
import au.com.woolworths.village.sdk.openapi.dto.HealthCheckResultData
import java.util.*

class OpenApiHealthCheck(
    private val check: HealthCheckResultData
) : HealthCheck {
    override val result: HealthCheck.Status
        get() = HealthCheck.Status.valueOf(check.healthCheck.value.toUpperCase(Locale.ROOT))
}