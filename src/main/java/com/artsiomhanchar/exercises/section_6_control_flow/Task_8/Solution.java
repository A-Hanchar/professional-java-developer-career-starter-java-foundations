package com.artsiomhanchar.exercises.section_6_control_flow.Task_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        /**
         * Use Regex with named parameters and a loop to parse the addresses below and print out
         * the street address, city, state & postal code. Transfer this list of addresses into your
         * program using a Java text block “”” String.
         * 12345 First Street, First City, AA 90210
         * 22222 Second Street, Second City, BB 22222
         * 33333 Third Street, Third City, CC 33333
         * 44444 Fourth Street, Fourth City, DD 44444
         * 55555 Fifth Street, Fifth City, EE 55555
         * 66666 Sixth Street, Sixth City, FF 66666
         * 77777 Seventh Street, Seventh City, GG 77777
         * 88888 Eighth Street, Eighth City, HH 88888
         * 99999 Ninth Street, Ninth City, II 99999
         * 00000 Tenth Street, Tenth City, JJ 00000
         *
         * Comment:
         * You’ll need to enable the
         * MULTILINE option on Java’s regex
         * engine. You can try building the
         * regex piece by piece using the
         * regex tester at https://
         * regex101.com. If you do use the
         * regex tester, be sure to enable it
         * for “java” and note that it does
         * NOT use double backspaces ‘\’ as
         * are needed in the Java IDE.
         */

        String text = """
                12345 First Street, First City, AA 90210
                22222 Second Street, Second City, BB 22222
                33333 Third Street, Third City, CC 33333
                44444 Fourth Street, Fourth City, DD 44444
                55555 Fifth Street, Fifth City, EE 55555
                66666 Sixth Street, Sixth City, FF 66666
                77777 Seventh Street, Seventh City, GG 77777
                88888 Eighth Street, Eighth City, HH 88888
                99999 Ninth Street, Ninth City, II 99999
                00000 Tenth Street, Tenth City, JJ 00000
                """;

//        String regex = "(?<street>\\d+\\s(\\w\\s)+)\\,\\s*(?<city>(\\w\\s)+),*";

        String regex = "(?<street>\\d+\\s\\w+\\s\\w+),\\s(?<city>(\\w+\\s\\w+)),*";

        Pattern textPattern = Pattern.compile(regex);
        Matcher textMatcher = textPattern.matcher(text);

        while (textMatcher.find()) {
            System.out.printf("%s %s %n", textMatcher.group("street"), textMatcher.group("city"));
        }
    }
}
