package com.artsiomhanchar.lectures.section_4_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleMatches {
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

        matcherPeople.find();
        System.out.println(matcherPeople.group("firstName"));
        System.out.println(matcherPeople.group("lastName"));
        System.out.println(matcherPeople.group("dob"));

        matcherPeople.find();
        System.out.println(matcherPeople.group("firstName"));
        System.out.println(matcherPeople.group("lastName"));
        System.out.println(matcherPeople.group("dob"));

        System.out.println("-------------------");

        matcherPeople.find(25); // start index of text
        System.out.println(matcherPeople.group("firstName"));
        System.out.println(matcherPeople.group("lastName"));
        System.out.println(matcherPeople.group("dob"));

        System.out.println("-------------------");

        System.out.println(matcherPeople.start());
        System.out.println(matcherPeople.end());

        System.out.println("-------------------");

        System.out.println(matcherPeople.start("firstName"));
        System.out.println(matcherPeople.end("firstName"));
    }
}
