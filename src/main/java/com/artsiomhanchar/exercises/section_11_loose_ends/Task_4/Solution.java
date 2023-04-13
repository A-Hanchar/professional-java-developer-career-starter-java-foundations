package com.artsiomhanchar.exercises.section_11_loose_ends.Task_4;

import com.artsiomhanchar.lectures.section_11_loose_ends.date_and_times.TimeZones;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Solution {
    public static void main(String[] args) {
        String date = "July 12, 1984 13:47:00"; // GMT -8

        LocalDateTime ldt = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("MMMM dd, yyyy kk:mm:ss"));

        System.out.println(ldt);

        ZonedDateTime zLdt = ZonedDateTime.of(ldt, ZoneId.of("-8"));
        System.out.println(zLdt.withZoneSameInstant(ZoneId.of("+0")));

//        String dateTimeText = "July 12, 1984 13:47:00";
//
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM dd, yyyy kk:mm:ss"); //
//        TemporalAccessor dateTime = df.parse(dateTimeText);
//        LocalDateTime localDateTime = LocalDateTime.from(dateTime);
//        ZonedDateTime startZDT = ZonedDateTime.of(localDateTime, ZoneId.of("-8"));
//        ZonedDateTime endZDT = startZDT.withZoneSameInstant(ZoneId.of("+0"));
//        System.out.println(startZDT);
//        System.out.println(endZDT);


        // Get the full list of ZoneIds by googling or this code...
//        ZoneId.getAvailableZoneIds().stream()
//                .map(String::toLowerCase)
//                .sorted()
//                .forEach(System.out::println);

        ZonedDateTime japan = zLdt
                .plusDays(179)
                .plusHours(7)
                .plusMinutes(27)
                .withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println(japan);
    }
}
