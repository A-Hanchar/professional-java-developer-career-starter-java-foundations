package com.artsiomhanchar.exercises.section_4_regular_expressions.Task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingAddress {
//    . Write a regex that tests whether a String is an address and allows you to extract the parts
//(your choice for address format).

    public static void main(String[] args) {
//          1. The building number: 12345
//          2. The Street: "Big St."
//          3. City: "Alphabet City"
//          4. State: "CA"
//          5. Postal Code: 90210
        String address = "12345 Big St., Alphabet City, CA 90210";

        String addressRegex = """
            (?<buildingNumber>\\d+)\\b\\s+
            (?<street>.*?),\\s+
            (?<city>.*?),\\s+
            (?<state>\\w{2,})\\b\\s+
            (?<postalCode>\\d+)\\b
            .*
            """;

        Pattern addressPatern = Pattern.compile(addressRegex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher addressMatcher = addressPatern.matcher(address);

        if(addressMatcher.matches()) {
            System.out.format("1. The building number: %s\n", addressMatcher.group("buildingNumber"));
            System.out.format("2. The Street: %s\n", addressMatcher.group("street"));
            System.out.format("3. City: %s\n", addressMatcher.group("city"));
            System.out.format("4. State: %s\n", addressMatcher.group("state"));
            System.out.format("5. Postal Code: %s", addressMatcher.group("postalCode"));
        }
    }
}
