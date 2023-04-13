package com.artsiomhanchar.exercises.section_11_loose_ends.Task_5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Solution {
    public static void main(String[] args) {
        LocalDate independanceDay = LocalDate.of(1776, 7, 4);
        LocalDate today = LocalDate.now();
        Period ageOfUS = Period.between(independanceDay, today);

        System.out.println("5");
        System.out.println(ageOfUS);

        LocalDate birth = LocalDate.of(1995, 12, 18);

        System.out.println("5.1");
        System.out.println(Period.between(birth, today));

        System.out.println("5.2");
        LocalDate nextNewYear = today.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(Period.between(nextNewYear, today));

        System.out.println("5.3");
        LocalTime start = LocalTime.parse("9:37:20", DateTimeFormatter.ofPattern("k:mm:ss"));
        LocalTime end = LocalTime.parse("19:31:41", DateTimeFormatter.ofPattern("kk:mm:ss"));

        System.out.println(Duration.between(end, start));

        System.out.println("5.3.1");
        System.out.println(Duration.between(start, end).toMinutes());
    }
}
