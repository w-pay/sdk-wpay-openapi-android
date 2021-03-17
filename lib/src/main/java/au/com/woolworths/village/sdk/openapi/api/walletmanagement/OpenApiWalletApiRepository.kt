package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.ApiResult
import au.com.woolworths.village.sdk.model.walletmanagement.WalletDeleteRequest
import au.com.woolworths.village.sdk.model.walletmanagement.WalletDeleteResponse

interface OpenApiWalletApiRepository {
    fun delete(walletDeleteRequest: WalletDeleteRequest): ApiResult<WalletDeleteResponse>
}
