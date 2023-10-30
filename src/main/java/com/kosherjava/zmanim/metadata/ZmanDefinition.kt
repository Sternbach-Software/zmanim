package com.kosherjava.zmanim.metadata

/**
 *
 * */
data class ZmanDefinition(
    val type: ZmanType,
    val calculationMethod: ZmanCalculationMethod<*>,
    val isElevationUsed: UsesElevation = UsesElevation.UNSPECIFIED,
    val supportingAuthorities: List<ZmanAuthority> = listOf()
) {
    enum class UsesElevation {
        IF_SET, NEVER, ALWAYS, UNSPECIFIED
    }
}