package com.yitianyitiandan.unittool

interface UnitConvert<U, V> {
    fun toBase(value: U): V
    fun baseToValue(value: V): U
}