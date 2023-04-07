package com.artsiomhanchar.lectures.section_6_control_flow;

import java.util.Random;

public class Inequalities {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(10) + 1; // new Random().nextInt(n) [0, n)

        System.out.printf("Generated number is: %d%n", randomNumber);

        if (randomNumber <= 2) {
            System.out.println("The color is RED");
        } else if (randomNumber > 4 && (randomNumber % 2 == 0)) {
            System.out.println("The color is BLUE");
        } else {
            System.out.println("The color is GREEN");
        }
    }
}
