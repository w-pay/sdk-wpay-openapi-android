package au.com.woolworths.village.sdk.openapi.api.walletmanagement

import au.com.woolworths.village.sdk.*
import au.com.woolworths.village.sdk.api.walletmanagement.WalletApiRepository
import au.com.woolworths.village.sdk.model.walletmanagement.WalletDeleteRequest
import au.com.woolworths.village.sdk.model.walletmanagement.WalletDeleteResponse
import au.com.woolworths.village.sdk.openapi.ClientOptions
import au.com.woolworths.village.sdk.openapi.OpenApiClientFactory
import au.com.woolworths.village.sdk.openapi.dto.DeleteWalletRequest

class OpenApiWalletApiRepository(
    requestHeadersFactory: RequestHeadersFactory,
    options: VillageOptions,
    clientOptions: ClientOptions = ClientOptions()
) : OpenApiClientFactory(requestHeadersFactory, options, clientOptions), WalletApiRepository {
    override fun delete(walletDeleteRequest: WalletDeleteRequest): ApiResult<WalletDeleteResponse> {
        return makeCall {
            val api = createWalletManagementApi()

            val body = DeleteWalletRequest()
            body.uid = walletDeleteRequest.uid
            body.shopperId = walletDeleteRequest.shopperId

            api.walletDeletePost(
                getDefaultHeader(api.apiClient, X_API_KEY),
                "",
                body,
                "",
                "",
                "",
                getDefaultHeader(api.apiClient, X_EVERYDAY_PAY_WALLET)
            )

            return@makeCall ApiResult.Success(object : WalletDeleteResponse {})
        }
    }
}
