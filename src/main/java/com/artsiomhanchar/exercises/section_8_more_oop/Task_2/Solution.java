package com.artsiomhanchar.exercises.section_8_more_oop.Task_2;

public class Solution {
    /**
     *Write code to print the following using only an Enum & loop without using any conditionals
     * (if/else/switch/etc.)
     * We eat pot roast on Sunday
     * We eat spaghetti on Monday
     * We eat tacos on Tuesday
     * We eat chicken on Wednesday
     * We eat meatloaf on Thursday
     * We eat hamburgers on Friday
     * We eat pizza on Saturday
     * 1. Do it again but capitalize the meal names too. “pot roast” should become “Pot Roast”.
     * (No solution provided because you’ve done this before in earlier exercise - but try to do
     * it without looking at previous work - for practice)
     */

    public static void main(String[] args) {
        printMealByDays();

        System.out.println("--------------");

        printMealCapitalizeByDays();
    }

    private static void printMealByDays() {
        for (MEALS_BY_DAYS mealsByDays : MEALS_BY_DAYS.values()) {
            String dayName = mealsByDays.name();
            String meal = MEALS_BY_DAYS.valueOf(dayName).getValue();

            String dayNameNormal = dayName.substring(0, 1) + dayName.substring(1).toLowerCase();

            System.out.printf("We eat %s on %s%n", meal, dayNameNormal);
        }
    }

    private static void printMealCapitalizeByDays() {
        for (MEALS_BY_DAYS mealsByDays : MEALS_BY_DAYS.values()) {
            String dayName = mealsByDays.name();
            String dayNameNormal = dayName.substring(0, 1) + dayName.substring(1).toLowerCase();

            String meal = MEALS_BY_DAYS.valueOf(dayName).getValue();

            String SPACE = " ";

            String[] mealWords = meal.split(SPACE);

            for (int i = 0; i < mealWords.length; i++) {
                mealWords[i] = mealWords[i].substring(0, 1).toUpperCase() + mealWords[i].substring(1);
            }

            String mealCapitalize = String.join(SPACE, mealWords);

            System.out.printf("We eat %s on %s%n", mealCapitalize, dayNameNormal);
        }
    }
}
