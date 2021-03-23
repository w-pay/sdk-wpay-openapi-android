package au.com.woolworths.village.sdk.openapi.model


class OpenApiStepUp(
    private val mandatoryValue: Boolean,
    private val typeValue: String,
    private val urlValue: String
) : au.com.woolworths.village.sdk.model.walletmanagement.StepUp{
    override val mandatory: Boolean
        get() = mandatoryValue
    override val type: au.com.woolworths.village.sdk.model.walletmanagement.StepUpTypeEnum
        get() = au.com.woolworths.village.sdk.model.walletmanagement.StepUpTypeEnum.valueOf(typeValue)
    override val url: String
        get() = urlValue
}