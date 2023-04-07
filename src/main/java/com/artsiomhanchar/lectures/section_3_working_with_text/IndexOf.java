package com.artsiomhanchar.lectures.section_3_working_with_text;

public class IndexOf {
    public static void main(String[] args) {
        String myText = "A four score and seven years ago seven";

        System.out.println(myText.indexOf("seven")); // 15
        System.out.println(myText.indexOf("wejifojwef")); // -1

        System.out.println(myText.indexOf(65)); // 65 - code of letter A => 0

        System.out.println("---------------------------");

        System.out.println(myText.lastIndexOf("seven"));
        System.out.println(myText.lastIndexOf("wejifojwef"));

        System.out.println(myText.lastIndexOf(65));

        System.out.println("---------------------------");

        System.out.println(myText.indexOf("seven", 20));

        System.out.println("---------------------------");

        String phoneNumber = "(763) 872-6633";

        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
    }

    public static String parseAreaCode(String phoneNumber) {
        String parenthesisOpened = "(";
        int indexOfParenthesisOpened = phoneNumber.indexOf(parenthesisOpened);

        String parenthesisClosed = ")";
        int indexOfParenthesisClosed = phoneNumber.indexOf(parenthesisClosed);

        String areaCode = phoneNumber.substring(indexOfParenthesisOpened + 1, indexOfParenthesisClosed);

        return areaCode;
    }

    private static int getPhonedHyphenIndex(String phoneNumber) {
        String hyphen = "-";
        int indexOfHyphen = phoneNumber.indexOf(hyphen);

        return indexOfHyphen;
    }

    public static String parseExchange(String phoneNumber) {
        String stripedPhoneNumber = phoneNumber.strip();

        String space = " ";
        int indexOfSpace = stripedPhoneNumber.indexOf(space);

        int indexOfHyphen = getPhonedHyphenIndex(stripedPhoneNumber);

        String exchange = stripedPhoneNumber.substring(indexOfSpace + 1, indexOfHyphen);

        return exchange;
    }

    public static String parseLineNumber(String phoneNumber) {
        int indexOfHyphen = getPhonedHyphenIndex(phoneNumber);

        String lineNumber = phoneNumber.substring(indexOfHyphen + 1);

        return lineNumber;
    }
}
