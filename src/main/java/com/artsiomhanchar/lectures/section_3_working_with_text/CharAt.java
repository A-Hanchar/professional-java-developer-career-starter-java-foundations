package com.artsiomhanchar.lectures.section_3_working_with_text;

public class CharAt {
    public static void main(String[] args) {
        String myText = "Apples";

        System.out.println(myText.charAt(0));
        System.out.println(myText.charAt(3));
//        System.out.println(myText.charAt(9)); // Error

        int length = myText.length();

        if(length > 9) {
            System.out.println(myText.charAt(9));
        }
    }
}
