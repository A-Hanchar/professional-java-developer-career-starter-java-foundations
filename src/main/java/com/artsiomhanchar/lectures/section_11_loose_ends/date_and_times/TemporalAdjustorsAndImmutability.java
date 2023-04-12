package com.artsiomhanchar.lectures.section_11_loose_ends.date_and_times;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustorsAndImmutability {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2000, 1, 1);
        System.out.println(d1);

        System.out.println("-------------");

        System.out.println(d1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println(d1.with(TemporalAdjusters.lastDayOfYear()).getDayOfWeek());

        System.out.println("-------------");

        System.out.println(d1.withMonth(3));
        System.out.println(d1.withMonth(3).withDayOfMonth(15));
    }
}
