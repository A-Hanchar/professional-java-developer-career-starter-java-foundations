package com.artsiomhanchar.exercises.section_8_more_oop.Task_1;

import java.util.Random;

public class Solution {
    /**
     * Use an Enum to model the days of the week and print them using a loop.
     * 1. Print them with the first letter capitalized (without changing the Enum constants).
     * 2. Alternate between printing the first letter capitalized or whatever letter is approximately
     * in the middle of the word. For example: Sunday, monDay, Tuesday, wednEsday, etc.
     * 3. Print 10 randomly-chosen days of the week
     */

    public static void main(String[] args) {
        printDays();

        System.out.println("------------------");

        printAlternateDays();

        System.out.println("------------------");

        printRandomCountDays(10);
    }

    private static void printDays() {
       DAYS[] daysValues = DAYS.values();

       for (int i = 0; i < daysValues.length; i++) {
           String day = daysValues[i].toString().toLowerCase();

           System.out.println(day.substring(0, 1).toUpperCase() + day.substring(1));
       }
    }

    private static void printAlternateDays() {
       DAYS[] daysValues = DAYS.values();

       for (int i = 0; i < daysValues.length; i++) {
           String day = daysValues[i].toString().toLowerCase();

           if (i % 2 == 0) {
               System.out.println(day.substring(0, 1).toUpperCase() + day.substring(1));
           } else {
               int countOfLetters = day.length();
               int middleIndex = (int)Math.floor(countOfLetters / 2);

               System.out.println(day.substring(0, middleIndex) + day.substring(middleIndex, middleIndex + 1).toUpperCase() + day.substring(middleIndex + 1));
           }
       }
    }

    private static void printRandomCountDays(int randomCount) {
        DAYS[] daysValues = DAYS.values();

        for (int i = 0; i < randomCount; i++) {
            int randomIndex = new Random().nextInt(daysValues.length);

            System.out.println(daysValues[randomIndex]);
        }
    }
}
