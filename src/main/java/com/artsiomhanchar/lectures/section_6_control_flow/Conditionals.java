package com.artsiomhanchar.lectures.section_6_control_flow;

import java.util.Random;

public class Conditionals {
    public static void main(String[] args) {
//        int min = 1;
//        int max = 3;
//
//        int randomNumber = (int) Math.floor(Math.random() * (max - min) + min);
//        System.out.println(randomNumber);

        int randomNumber = new Random().nextInt(3) + 1; // new Random().nextInt(n) [0, n)

        System.out.printf("Generated number is: %d%n", randomNumber);

        if (randomNumber != 3) {
            System.out.println("You got it!");
        } else {
            System.out.println("Sorry, you didn't get it.");
        }

        if (!shouldGo()) {
            System.out.println("You got it!");
        } else {
            System.out.println("Sorry, you didn't get it.");
        }

        if (randomNumber == 1) {
            System.out.println("The color is RED");
        } else if (randomNumber == 2) {
            System.out.println("The color is GREEN");
        } else {
            System.out.println("The color is BLUE");
        }
    }

    private static Boolean shouldGo() {
        return true;
    }
}
