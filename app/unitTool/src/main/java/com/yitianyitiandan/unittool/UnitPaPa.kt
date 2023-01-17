package com.yitianyitiandan.unittool

abstract class UnitPaPa<T : UnitConvert> {

    fun trans(value: Double, unit: T, outputUnit: T): Pair<Double, T> {
        val base = unit.toBase(value)
        return outputUnit.baseToValue(base) to outputUnit
    }

    fun transAll(value: Double, unit: T, list: Array<T>): List<Pair<Double, T>> {
        val base = unit.toBase(value)
        return list.map { it.baseToValue(base) to it }
    }

}