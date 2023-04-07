package com.artsiomhanchar.exercises.section_6_control_flow.Task_1;

public class Solution {
    public static void main(String[] args) {
        /**
         * 1. Write a method in 4 lines of code (not including method name/signature & curly braces) that
         * outputs the days of the week, one per line, using a regular ‘for-loop’ and an array.
         * 1. Do it again using the enhanced ‘for-loop’.
         * 2. Do it again but make every other output line fully capitalized.
         * Sunday
         * MONDAY
         * Tuesday
         * WEDNESDAY
         * etc…
         * 3. Do it again but use only 4 lines of code (not including method and curly braces of
         * method
         */

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println("----------------");

        for (String day: days) {
            System.out.println(day);
        }

        System.out.println("----------------");

        for (int i = 0; i < days.length; i++) {
            System.out.println(i % 2 == 0 ? days[i] : days[i].toUpperCase());
        }
    }
}
