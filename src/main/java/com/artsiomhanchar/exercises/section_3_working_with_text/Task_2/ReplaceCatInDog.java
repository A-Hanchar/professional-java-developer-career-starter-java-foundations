package com.artsiomhanchar.exercises.section_3_working_with_text.Task_2;

public class ReplaceCatInDog {
//    Write code that replaces the word “cat” with the word “dog” wherever it shows up in a
//sentence.

    public static void main(String[] args) {
        String testText = "This is cat. Cat name is Tom. CAT says something";

        System.out.println(replaceCatInDog(testText));
    }

    private static String replaceCatInDog(String text) {
        return text.replaceAll("cat", "dog");
    }
}
