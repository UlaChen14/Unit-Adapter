package com.yitianyitiandan.unittool

interface UnitConvert<U> {
    fun toBase(value: U): U
    fun baseToValue(value: U): U
}