package com.artsiomhanchar.lectures.section_6_control_flow;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "pear", "plum"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("--------------------");

        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
