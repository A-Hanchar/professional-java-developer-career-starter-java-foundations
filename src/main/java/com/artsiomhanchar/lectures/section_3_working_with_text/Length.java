package com.artsiomhanchar.lectures.section_3_working_with_text;

public class Length {
    public static void main(String[] args) {
        String myText = "for";
        System.out.println(myText.length());

        char[] chars = myText.toCharArray();

        int index = 3;

        if(index < myText.length()) {
            System.out.println(chars[index]);
        }

        System.out.println("-----------------------");

        String secondText = "score";

        StringBuilder builder = new StringBuilder(myText.length() + secondText.length())
                .append(myText)
                .append(secondText);

        System.out.println(builder.toString());
    }
}
