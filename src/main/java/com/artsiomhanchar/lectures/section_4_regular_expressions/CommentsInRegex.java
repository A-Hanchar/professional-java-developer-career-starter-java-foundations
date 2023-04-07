package com.artsiomhanchar.lectures.section_4_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommentsInRegex {
    public static void main(String[] args) {
        String phoneNumberRegex = """
        # This is my regex to parse the parts of a phone number
        (?:(?<countryCode>\\d{1,2})[-.,\\s]?)? # Get's country code
        (?:(?<areaCode>\\d{3})[-.,\\s]?) # Get's area code
        (?:(?<exchange>\\d{3})[-.,\\s]?) # Get's exchange
        (?<lineNumber>\\d{4}) # Get's line number
        """;
        String phoneNumber = "12.232.333.2365";

        Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex, Pattern.COMMENTS);

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
