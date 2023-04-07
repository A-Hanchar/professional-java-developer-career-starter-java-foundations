package com.artsiomhanchar.exercises.section_6_control_flow.Task_7;

public class Solution {

    public static void main(String[] args) {
        /**
         * . Iterate over all the days of the week in an array and add up the total number of characters
         * in all the days of the week. E.g., “Sunday”=6, “Monday”=6, etc. therefore, answer should
         * be 50.
         */

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day: days) {
            System.out.printf("\"%s\"=%d%n", day, day.length());
        }
    }
}
