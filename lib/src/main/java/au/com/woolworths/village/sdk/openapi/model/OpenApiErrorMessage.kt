package au.com.woolworths.village.sdk.openapi.model



class OpenApiErrorMessage(
    private val errorMessage: String
) : au.com.woolworths.village.sdk.model.walletmanagement.ErrorMessage {
    override val description: String
        get() = errorMessage
}