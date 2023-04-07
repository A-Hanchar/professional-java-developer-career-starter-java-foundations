package com.artsiomhanchar.lectures.section_4_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WrapUpPhoneNumberParsing {
    public static void main(String[] args) {
        String phoneNumberRegex = """
        (\\(?(?<areaCode>\\d{3})\\)?)[\\s]
        (?<exchange>\\d{3})[-]
        (?<lineNumber>\\d{4})
        """;
        String phoneNumber = "232 333-2365";

        Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex, Pattern.COMMENTS);

        Matcher matcher = phoneNumberPattern.matcher(phoneNumber);

        System.out.println(phoneNumber.matches(phoneNumberRegex));

        if(matcher.matches()) {
            System.out.format("Area code: %s\n", matcher.group("areaCode"));
            System.out.format("Exchange: %s\n", matcher.group("exchange"));
            System.out.format("Line number: %s\n", matcher.group("lineNumber"));
        }
    }
}
