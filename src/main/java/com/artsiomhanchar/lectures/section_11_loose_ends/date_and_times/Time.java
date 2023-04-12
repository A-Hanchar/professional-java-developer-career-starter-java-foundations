package com.artsiomhanchar.lectures.section_11_loose_ends.date_and_times;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Time {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);
        System.out.println(today.plusDays(5));
        System.out.println(today.plus(3, ChronoUnit.YEARS));
        System.out.println(today.minus(3, ChronoUnit.YEARS));

        System.out.println("--------------------");

        LocalDate newYears = LocalDate.of(2020, 1, 1);
        System.out.println(newYears);
        System.out.println(newYears.getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfYear());

        System.out.println("--------------------");

        System.out.println(newYears.datesUntil(today).count());
//        System.out.println(today.datesUntil(newYears).count()); // it error, because today < newYears
//        System.out.println(newYears.datesUntil(today, Period.ofDays(150)).count());

        System.out.println("--------------------");

        LocalDate d1 = LocalDate.of(2000, 1, 2);
        LocalDate d2 = LocalDate.of(2000, 1, 2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.compareTo(d2));

        System.out.println("--------------------");

        LocalTime lt1 = LocalTime.of(10, 30);
        LocalTime lt2 = LocalTime.of(10, 30, 1);

        System.out.println(lt1.equals(lt2));
        System.out.println(lt1.compareTo(lt2));

        System.out.println("--------------------");

        LocalDateTime ldt1 = LocalDateTime.of(d1, lt1);
        LocalDateTime ldt2 = LocalDateTime.of(d2, lt2);

        System.out.println(ldt1.equals(ldt2));

        ldt1.toLocalDate();
        ldt1.toLocalTime();

        System.out.println("--------------------");

        System.out.println(Instant.now()); // from 01.01.1970
    }
}
