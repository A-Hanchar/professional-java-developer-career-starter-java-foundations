package com.artsiomhanchar.lectures.section_6_control_flow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplyingLoopsToRegex {
    public static void main(String[] args) {
        String people = """
            Flinstone, Fred, 1/1/1900
            Rubble, Barney, 2/2/1905
            Flinstone, Wilma, 3/3/1910
            Rubble, Betty, 4/4/1915
            """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4})\\n";

        Pattern patternPeople = Pattern.compile(regex);
        Matcher matcherPeople = patternPeople.matcher(people);

        while (matcherPeople.find()) {
            System.out.printf("%s %s %s%n", matcherPeople.group("firstName"), matcherPeople.group("lastName"), matcherPeople.group("dob"));
        }
    }
}
