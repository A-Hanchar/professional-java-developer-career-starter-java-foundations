package com.artsiomhanchar.lectures.section_5_numbers;

import java.security.SecureRandom;
import java.util.Random;

public class RandomMoreInfo {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));

        System.out.println("---------------");

        SecureRandom secureRandom = new SecureRandom();

        System.out.println(secureRandom.nextInt());
        System.out.println(secureRandom.nextInt());
        System.out.println(secureRandom.nextInt(10));
        System.out.println(secureRandom.nextInt(10));
    }
}
