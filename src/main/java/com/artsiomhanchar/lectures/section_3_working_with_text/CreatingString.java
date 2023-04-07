package com.artsiomhanchar.lectures.section_3_working_with_text;

public class CreatingString {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";

        System.out.println(fruit == anotherFruit);

        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        System.out.println(vegetable == anotherVegetable);
    }
}
