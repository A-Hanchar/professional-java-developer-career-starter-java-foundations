package com.artsiomhanchar.lectures.section_11_loose_ends.date_and_times;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodsAndDurations {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2000, 1, 1);
        LocalDate d2 = LocalDate.of(2002, 6, 10);

        System.out.println(Period.between(d1, d2));
        System.out.println(Period.between(d2, d1));
        System.out.println(Period.between(d1, d1));

        Period difference = Period.between(d1, d2);
        System.out.printf("%d years, %d months, %d days%n", difference.getYears(), difference.getMonths(), difference.getDays());

        System.out.println("-------------");

        LocalTime lt1 = LocalTime.of(10, 30);
        LocalTime lt2 = LocalTime.of(13, 57, 39);

        System.out.println(Duration.between(lt1, lt2));
        System.out.println(Duration.between(lt2, lt1));
        System.out.println(Duration.between(lt1, lt1));
//        System.out.println(D);
    }
}
