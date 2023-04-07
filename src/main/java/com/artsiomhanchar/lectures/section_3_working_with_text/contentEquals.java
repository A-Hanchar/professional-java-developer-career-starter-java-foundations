package com.artsiomhanchar.lectures.section_3_working_with_text;

public class contentEquals {
    public static void main(String[] args) {
        String firstText = "Apple";
        StringBuffer secondText = new StringBuffer("Apple");

        System.out.println(firstText.contentEquals("Apple")); // boolean => true. For any type of character sequence
        System.out.println(firstText.contentEquals("apple"));
        System.out.println(firstText.contentEquals("ap"));
        System.out.println(firstText.contentEquals(secondText));

        System.out.println("----------------------");

        System.out.println(firstText.equals("Apple"));
        System.out.println(firstText.equals(secondText)); // also compare type of variable
    }
}
