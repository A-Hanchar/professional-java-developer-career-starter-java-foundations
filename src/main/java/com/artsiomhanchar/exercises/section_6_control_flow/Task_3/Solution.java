package com.artsiomhanchar.exercises.section_6_control_flow.Task_3;

public class Solution {
    public static void main(String[] args) {
        /**
         * Do #2 again but use a "do-while-loop". (No solutions provided for this one)
         */

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int index = 0;

        do {
            if (index < days.length) {
                System.out.println(index % 2 == 0 ? days[index] : days[index].toUpperCase());

                index++;
            }
        } while (index < days.length);
    }
}
