package com.artsiomhanchar.exercises.section_6_control_flow.Task_6;

public class Solution {
    public static void main(String[] args) {
        /**
         * 6. Repeat exercise #5 but use newer switch expression with as little repetition as possible.
         * 1. Add a private method that can capitalize the first letter of each word of the meal. So,
         * instead of “We eat spaghetti on Sunday”, it would print, “We eat Spaghetti on Sunday”.
         * Do not just capitalize the meal names yourself. Let your new method do it for you.
         * 2. Improve on 6.1 to make it smart enough to output: “We eat Pot Roast on Sunday”, i.e.,
         * it should capitalize each word of a multi-word meal name.
         */

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day: days) {
            String dish = switch (day) {
                case "Sunday" -> capitalizeAllWords("pot roast");
                case "Monday" -> capitalizeAllWords("spaghetti");
                case "Tuesday" -> capitalizeAllWords("tacos");
                case "Wednesday" -> capitalizeAllWords("chicken");
                case "Thursday" -> capitalizeAllWords("meatloaf");
                case "Friday" -> capitalizeAllWords("hamburgers");
                case "Saturday" -> capitalizeAllWords("pizza");
                default -> "";
            };

            System.out.printf("We eat %s on %s%n", dish, day);
        }
    }

    public static String capitalizeAllWords(String str) {
        String space = " ";

        String[] words = str.split(space);

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        return String.join(space, words);
    }
}
