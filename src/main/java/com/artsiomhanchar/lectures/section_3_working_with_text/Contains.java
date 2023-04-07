package com.artsiomhanchar.lectures.section_3_working_with_text;

public class Contains {
    public static void main(String[] args) {
        String myText = "Four score and five years ago";

        System.out.println(myText.contains("score"));
        System.out.println(myText.contains("ago"));
        System.out.println(myText.contains("Qwerty"));
        System.out.println(myText.contains("four"));
        System.out.println(myText.contains("Fo"));
    }
}
