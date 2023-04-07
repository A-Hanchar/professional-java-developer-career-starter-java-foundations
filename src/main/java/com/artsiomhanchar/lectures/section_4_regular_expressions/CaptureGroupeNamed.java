package com.artsiomhanchar.lectures.section_4_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroupeNamed {
    public static void main(String[] args) {
//        ?: - this sign is not select group
//        String phoneNumberRegex = "(?:(\\d{1,2})[-.,\\s]?)?(?:(\\d{3})[-.,\\s]?)(?:(\\d{3})[-.,\\s]?)(\\d{4})";

//        ?<name> - pass a name for regular group
        String phoneNumberRegex = "(?:(?<countryCode>\\d{1,2})[-.,\\s]?)?(?:(?<areaCode>\\d{3})[-.,\\s]?)(?:(?<exchange>\\d{3})[-.,\\s]?)(?<lineNumber>\\d{4})";
        String phoneNumber = "12.232.333.2365";

        Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex);

        Matcher matcher = phoneNumberPattern.matcher(phoneNumber);

        System.out.println(phoneNumber.matches(phoneNumberRegex));

        if(matcher.matches()) {
            System.out.println(matcher.group(0)); // entire string
            System.out.format("Country code: %s\n", matcher.group("countryCode"));
            System.out.format("Area code: %s\n", matcher.group("areaCode"));
            System.out.format("Exchange: %s\n", matcher.group("exchange"));
            System.out.format("Line number: %s\n", matcher.group("lineNumber"));
        }
    }
}
