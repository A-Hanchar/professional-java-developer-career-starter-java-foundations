package com.artsiomhanchar.lectures.section_4_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {
    public static void main(String[] args) {
        String phoneNumberRegex = "((\\d{1,2})[-.,\\s]?)?((\\d{3})[-.,\\s]?)((\\d{3})[-.,\\s]?)(\\d{4})";
        String phoneNumber = "12.232.333.2365";

        Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex);

        Matcher matcher = phoneNumberPattern.matcher(phoneNumber);

        System.out.println(phoneNumber.matches(phoneNumberRegex));

        if(matcher.matches()) {
            System.out.println(matcher.group(0)); // entire string
            System.out.println(matcher.group(1));
            System.out.format("Country code: %s\n", matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.format("Area code: %s\n", matcher.group(4));
            System.out.println(matcher.group(5));
            System.out.format("Exchange: %s\n", matcher.group(6));
            System.out.format("Line number: %s\n", matcher.group(7));
        }
    }
}
