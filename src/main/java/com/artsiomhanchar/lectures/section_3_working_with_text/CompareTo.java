package com.artsiomhanchar.lectures.section_3_working_with_text;

public class CompareTo {
    public static void main(String[] args) {
        String firstWord = "Apple";
        String secondWord = "Banana";

        System.out.println(firstWord.compareTo(secondWord));

        System.out.println("banana".compareToIgnoreCase(secondWord));

//        which string comes first
        System.out.println("a".compareTo("b")); // -1
        System.out.println("b".compareTo("b")); // 0
        System.out.println("b".compareTo("a")); // 1

        System.out.println(compareToIgnoreCase("a", "b")); // -1
    }

    public static int compareToIgnoreCase(String text1, String text2) {
        String lowerText1 = text1.toLowerCase();
        String lowerText2 = text2.toLowerCase();

        return lowerText1.compareTo(lowerText2);
    }
}
