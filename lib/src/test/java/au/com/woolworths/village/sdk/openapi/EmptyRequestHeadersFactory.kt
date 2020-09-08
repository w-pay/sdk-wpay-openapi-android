package au.com.woolworths.village.sdk.openapi

import au.com.woolworths.village.sdk.RequestHeadersFactory

class EmptyRequestHeadersFactory : RequestHeadersFactory {
    override fun createHeaders(): Map<String, String> {
        return emptyMap()
    }
}