package com.yitianyitiandan.unittool

class WeightChild : UnitPaPa<WeightChild.WeightUnit>() {

    enum class WeightUnit : UnitConvert {
        KG {
            override fun toBase(value: Double): Double {
                return value
            }

            override fun baseToValue(value: Double): Double {
                return value
            }

        },
        T {
            override fun toBase(value: Double): Double {
                return value * 1000
            }

            override fun baseToValue(value: Double): Double {
                return value / 1000
            }

        },
        TKG {
            override fun toBase(value: Double): Double {
                return value / 0.6
            }

            override fun baseToValue(value: Double): Double {
                return value * 0.6
            }

        },
        G {
            override fun toBase(value: Double): Double {
                return value / 1000
            }

            override fun baseToValue(value: Double): Double {
                return value * 1000
            }

        },
        LB {
            override fun toBase(value: Double): Double {
                return value / 2.20462262
            }

            override fun baseToValue(value: Double): Double {
                return value * 2.20462262
            }

        }
    }
}