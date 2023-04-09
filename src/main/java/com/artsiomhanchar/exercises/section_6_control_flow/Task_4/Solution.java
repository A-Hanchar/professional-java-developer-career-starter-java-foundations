package com.artsiomhanchar.exercises.section_6_control_flow.Task_4;

public class Solution {
    public static void main(String[] args) {
        /**
         * Use an array of days of the week, enhanced "for-loop" and if/else to create the following
         * output.
         * We eat pot roast on Sunday
         * We eat spaghetti on Monday
         * We eat tacos on Tuesday
         * We eat chicken on Wednesday
         * We eat meatloaf on Thursday
         * We eat hamburgers on Friday
         * We eat pizza on Saturday
         */

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day: days) {
            String dish = "";

            if(day == "Sunday") {
                dish = "pot roast";
            } else if (day == "Monday") {
                dish = "spaghetti";
            } else if (day == "Tuesday") {
                dish = "tacos";
            } else if (day == "Wednesday") {
                dish = "chicken";
            } else if (day == "Thursday") {
                dish = "meatloaf";
            } else if (day == "Friday") {
                dish = "hamburgers";
            } else if (day == "Saturday") {
                dish = "pizza";
            }

            System.out.printf("We eat %s on %s%n", dish, day);
        }
    }
}
