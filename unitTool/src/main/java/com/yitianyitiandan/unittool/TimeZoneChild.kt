package com.yitianyitiandan.unittool

import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime

class TimeZoneChild : UnitPaPa<ZonedDateTime, Long, TimeZoneChild.TimeZoneUnit>() {

    enum class TimeZoneUnit : UnitConvert<ZonedDateTime, Long> {
        TW {
            override fun toBase(value: ZonedDateTime): Long {
                return value.toEpochSecond()
            }

            override fun baseToValue(value: Long): ZonedDateTime {
                val instant = Instant.ofEpochSecond(value)
                return ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Taipei"))
            }

        },
        JP {
            override fun toBase(value: ZonedDateTime): Long {
                return value.toEpochSecond()
            }

            override fun baseToValue(value: Long): ZonedDateTime {
                val instant = Instant.ofEpochSecond(value)
                return ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Tokyo"))
            }

        },
        UK {
            override fun toBase(value: ZonedDateTime): Long {
                return value.toEpochSecond()
            }

            override fun baseToValue(value: Long): ZonedDateTime {
                val instant = Instant.ofEpochSecond(value)
                return ZonedDateTime.ofInstant(instant, ZoneId.of("Europe/London"))
            }

        },
        USA {
            override fun toBase(value: ZonedDateTime): Long {
                return value.toEpochSecond()
            }

            override fun baseToValue(value: Long): ZonedDateTime {
                val instant = Instant.ofEpochSecond(value)
                return ZonedDateTime.ofInstant(instant, ZoneId.of("America/Los_Angeles"))
            }

        }
    }
}