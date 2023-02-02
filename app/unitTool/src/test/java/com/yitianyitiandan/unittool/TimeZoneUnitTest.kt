package com.yitianyitiandan.unittool

import org.junit.Assert
import org.junit.Test
import java.time.ZoneId
import java.time.ZonedDateTime

class TimeZoneUnitTest {
    @Test
    fun tw_to_jp() {
        val twTime = ZonedDateTime.of(2022, 2, 2, 2, 2, 2, 0, ZoneId.of("Asia/Taipei"))
        val jpTime = ZonedDateTime.of(2022, 2, 2, 3, 2, 2, 0, ZoneId.of("Asia/Tokyo"))
        Assert.assertEquals(
            TimeZoneChild().trans(
                twTime,
                TimeZoneChild.TimeZoneUnit.TW,
                TimeZoneChild.TimeZoneUnit.JP
            ), jpTime to TimeZoneChild.TimeZoneUnit.JP
        )
    }

    @Test
    fun tw_to_all() {
        val twTime = ZonedDateTime.of(2022, 2, 2, 14, 2, 2, 0, ZoneId.of("Asia/Taipei"))
        val jpTime = ZonedDateTime.of(2022, 2, 2, 15, 2, 2, 0, ZoneId.of("Asia/Tokyo"))
        val ukTime = ZonedDateTime.of(2022, 2, 2, 6, 2, 2, 0, ZoneId.of("Europe/London"))
        val usaTime = ZonedDateTime.of(2022, 2, 1, 22, 2, 2, 0, ZoneId.of("America/Los_Angeles"))

        Assert.assertEquals(
            TimeZoneChild().transAll(twTime, TimeZoneChild.TimeZoneUnit.TW, enumValues()),
            listOf(
                twTime to TimeZoneChild.TimeZoneUnit.TW,
                jpTime to TimeZoneChild.TimeZoneUnit.JP,
                ukTime to TimeZoneChild.TimeZoneUnit.UK,
                usaTime to TimeZoneChild.TimeZoneUnit.USA
            )
        )
    }
}