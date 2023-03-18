package com.yitianyitiandan.unittool

import com.yitianyitiandan.unittool.HeightChild.HeightUnit
import org.junit.Assert
import org.junit.Test

class HeightUnitTest {
    @Test
    fun m_to_km() {
        Assert.assertEquals(
            HeightChild().trans(1.0, HeightUnit.M, HeightUnit.KM),
            0.001 to HeightUnit.KM
        )
    }

    @Test
    fun km_to_all() {
        Assert.assertEquals(
            HeightChild().transAll(1.0, HeightUnit.KM, enumValues()),
            listOf(
                100000.0 to HeightUnit.CM,
                1000.0 to HeightUnit.M,
                1.0 to HeightUnit.KM,
                1000000.0 to HeightUnit.MM,
                0.621371192237334 to HeightUnit.MI,
            )
        )
    }
}