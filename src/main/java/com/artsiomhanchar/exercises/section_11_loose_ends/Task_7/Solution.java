package com.artsiomhanchar.exercises.section_11_loose_ends.Task_7;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        String date1 = "2022-02-09T05:02:01Z";
        DateTimeFormatter date1Formatter = DateTimeFormatter.ISO_INSTANT;
        System.out.println(Instant.from(date1Formatter.parse(date1)));

        String date2 = "2022-02-09T05:02:01+0000";
        DateTimeFormatter date2Formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'kk:mm:ssZ");
        System.out.println(Instant.from(date2Formatter.parse(date2)));

        String date3 = "Wed, 09 Feb 2022 05:02:01 +0000";
        String date4 = "Wednesday, 09-Feb-22 05:02:01 UTC";
        String date5 = "Wed, 09 Feb 22 05:02:01 +0000";
        String date6 = "Wed, 09 Feb 2022 05:02:01 +0000";
        String date7 = "Wed, 09 Feb 22 05:02:01 +0000";
        String date8 = "2022-02-09T05:02:01+00:00";
        String date9 = "2022-02-09T05:02:01+00:00";
        String date10 = "Wednesday, 09-Feb-2022 05:02:01 UTC";
        String date11 = "Wed, 09 Feb 2022 05:02:01 +0000";
        String date12 = "2022-02-09T05:02:01+00:00";
        String date13 = "1644382921";
        String date14 = "2022-09-02 05:02:01";
        String date15 = "2022-09-02 05:02:01 AM";
        String date16 = "09-02-2022 05:02:01";
        String date17 = "02-09-2022 05:02:01";
    }
}
