package com.artsiomhanchar.exercises.section_6_control_flow.Task_5;

public class Solution {
    public static void main(String[] args) {
        /**
         * Repeat exercise #4 but instead of if/else, use traditional switch/case
         */

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day: days) {
            String dish = switch (day) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                case "Saturday" -> "pizza";
                default -> "";
            };

            System.out.printf("We eat %s on %s%n", dish, day);
        }
    }
}
