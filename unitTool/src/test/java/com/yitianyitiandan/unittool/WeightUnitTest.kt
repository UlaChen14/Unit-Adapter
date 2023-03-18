package com.yitianyitiandan.unittool

import com.yitianyitiandan.unittool.WeightChild.WeightUnit
import org.junit.Assert
import org.junit.Test

class WeightUnitTest {
    @Test
    fun t_to_kg() {
        Assert.assertEquals(
            WeightChild().trans(1.0, WeightUnit.T, WeightUnit.KG),
            1000.0 to WeightUnit.KG
        )
    }

    @Test
    fun kg_to_all() {
        Assert.assertEquals(
            WeightChild().transAll(1.0, WeightUnit.KG, enumValues()),
            listOf(
                1.0 to WeightUnit.KG,
                0.001 to WeightUnit.T,
                0.6 to WeightUnit.TKG,
                1000.0 to WeightUnit.G,
                2.20462262 to WeightUnit.LB,
            )
        )
    }
}