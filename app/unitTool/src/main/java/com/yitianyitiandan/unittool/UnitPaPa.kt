package com.yitianyitiandan.unittool

abstract class UnitPaPa<U, V, T : UnitConvert<U, V>> {

    fun trans(value: U, unit: T, outputUnit: T): Pair<U, T> {
        val base = unit.toBase(value)
        return outputUnit.baseToValue(base) to outputUnit
    }

    fun transAll(value: U, unit: T, list: Array<T>): List<Pair<U, T>> {
        val base = unit.toBase(value)
        return list.map { it.baseToValue(base) to it }
    }

}