package com.artsiomhanchar.exercises.section_6_control_flow.Task_2;

public class Solution {
    public static void main(String[] args) {
        /**
         * Repeat all parts of exercise #1, but use ‘while-loop’ instead of ‘for-loop’ (where applicable).
         */

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int index = 0;

        while (index < days.length) {
            System.out.println(index % 2 == 0 ? days[index] : days[index].toUpperCase());

            index++;
        }
    }
}
