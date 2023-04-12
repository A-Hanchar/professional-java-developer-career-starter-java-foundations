package com.artsiomhanchar.exercises.section_11_loose_ends.Task_6;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        ZonedDateTime departue = ZonedDateTime.of(2022, 2, 3, 13, 15, 0, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime arrival = ZonedDateTime.of(2022, 2, 3, 20, 02, 13, 0, ZoneId.of("Europe/London"));

        System.out.println(Duration.between(departue, arrival));
        System.out.println(arrival.withZoneSameInstant(ZoneId.of("America/Los_Angeles")));
    }
}
