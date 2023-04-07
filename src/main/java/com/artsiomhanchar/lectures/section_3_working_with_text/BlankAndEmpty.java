package com.artsiomhanchar.lectures.section_3_working_with_text;

public class BlankAndEmpty {
    public static void main(String[] args) {
        String myText = " ";
        System.out.println(myText.isEmpty());
        System.out.println(myText.isBlank()); // no visible characters
    }
}
