package com.artsiomhanchar.lectures.section_11_loose_ends.date_and_times;

import java.time.*;

public class TimeZones {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now());

        System.out.println("------------------");

        LocalDate d1 = LocalDate.of(2000, 1, 2);
        LocalDate d2 = LocalDate.of(2002, 6, 10);

        LocalTime lt1 = LocalTime.of(10, 30);
        LocalTime lt2 = LocalTime.of(13, 57, 39);

        LocalDateTime ldt1 = LocalDateTime.of(d1, lt1);
        LocalDateTime ldt2 = LocalDateTime.of(d2, lt2);

        System.out.println(ZonedDateTime.of(ldt1, ZoneId.systemDefault()));
        System.out.println(ZonedDateTime.of(ldt1, ZoneId.of("-5")));

        System.out.println("------------------");

        LocalDateTime xmas = LocalDateTime.of(2021, 12, 25, 12, 00);
//        California - GMT-8

        ZonedDateTime zXmas = ZonedDateTime.of(xmas, ZoneId.of("-8"));
        System.out.println(zXmas.withZoneSameInstant(ZoneId.of("+0")));

        System.out.println("------------------");

        LocalDateTime xmas2 = LocalDateTime.of(2021, 12, 25, 20, 00);
//        California - GMT-8

        ZonedDateTime zXmas2 = ZonedDateTime.of(xmas2, ZoneId.of("-8"));
        System.out.println(zXmas2.withZoneSameInstant(ZoneId.of("+0")));
    }
}
