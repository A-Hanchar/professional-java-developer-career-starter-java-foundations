package com.artsiomhanchar.exercises.section_8_more_oop.Task_3;

public class Solution {
    /**
     * Write a method that takes the following input String (in bold) and returns the following
     * output String using an Enum like (print the output):
     * getMealsForDays(“friday, thursday, monday, saturday, tuesday”)
     * Output: hamburgers, meatloaf, spaghetti, etc…
     */

    public static void main(String[] args) {
        String meals = getMealsForDays("friday, thursday, monday, saturday, tuesday");

        System.out.println(meals);
    }

    private static String getMealsForDays(String days) {
        String delimeter = ", ";

        String[] dayNames = days.split(delimeter);

        String[] meals = new String[dayNames.length];

        for(int i = 0; i < dayNames.length; i++) {
            String dayUppercase = dayNames[i].toUpperCase();

            meals[i] = MEALS_BY_DAYS.valueOf(dayUppercase).getValue();
        }

        return String.join(delimeter, meals);
    }
}
