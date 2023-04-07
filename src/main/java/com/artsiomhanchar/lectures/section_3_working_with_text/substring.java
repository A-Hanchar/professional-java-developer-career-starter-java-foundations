package com.artsiomhanchar.lectures.section_3_working_with_text;

public class substring {
    public static void main(String[] args) {
        String myText = "apple";

        String firstPart = myText.substring(0, 1);
        String firstPartCapitalized = firstPart.toUpperCase();

        String secondPart = myText.substring(1);

//        String myNewText = firstPartCapitalized.concat(secondPart);

        int totalLength = firstPartCapitalized.length() + secondPart.length();
        String myNewText = new StringBuilder(totalLength)
                .append(firstPartCapitalized)
                .append(secondPart)
                .toString();

        System.out.println(myNewText);
    }
}
