package com.artsiomhanchar.lectures.section_3_working_with_text;

public class Concat {
    public static void main(String[] args) {
        String text1 = "this is my text1";
        String text2 = "this is my text2";

        System.out.println(text1 + " " + text2 + " hello");

        System.out.println("-----------------------");

        System.out.println(text1.concat(" ".concat(text2)));
        System.out.println("literal string".concat(text1));
        System.out.println("literal string".concat(" one more literal string"));

        System.out.println("-----------------------");

        String finalString = new StringBuilder(text1.length() + text2.length() + 1)
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();

        System.out.println(finalString);

        String otherFinalString = new StringBuffer() // this method older than StringBuilder
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();

        System.out.println(otherFinalString);

        System.out.println("finalString == otherFinalString");
        System.out.println(finalString == otherFinalString);

        System.out.println("-----------------------");

        System.out.format("%s %s\n", text1, text2);

        System.out.println("-----------------------");

        String oneMoreFinalString = String.format("%s %s", text1, text2);
        System.out.println(oneMoreFinalString);

        System.out.println("Hello");
    }
}
