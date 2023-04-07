package com.artsiomhanchar.lectures.section_4_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyOperators {
    public static void main(String[] args) {
//        sign * is greedy. It means, that this sign grab as many possible characters. Grabs everything and then goes backward.
//        ? - make greedy into ungreedy
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;

        String regex = """
        Student\\sNumber:\\s(?<studentNumber>\\d{10}).* # Grab student number
        Grade:\\s+(?<grade>\\d{1,2}).* # Grab the grade
        Birthdate:\\s+(?<birthMonth>\\d{2})/(?<birthDay>\\d{2})/(?<birthYear>\\d{4}).* # Grab birthdate
        Gender:\\s+(?<gender>\\w+)\\b.* # Grab the gender
        State\\sID:\\s+(?<stateId>\\d+)\\b.*? # Grab the state ID
        Cumulative.*?(?<gpaWeighted>[\\d\\.]+)\\b.* # Cumulative GPA (Weighted)
        #\\(Weighted\\)\\s+(?<gpaWeighted>[\\d\\.]+)\\b.* # Cumulative GPA (Weighted)
        #\\(Unweighted\\)\\s+(?<gpaUnweighted>[\\d\\.]+)\\b # Cumulative GPA (Unweighted)
        .*
        """;

        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher matcher = pattern.matcher(transcript);

        if (matcher.matches()) {
            System.out.println(matcher.group("studentNumber"));
            System.out.println(matcher.group("grade"));
            System.out.println(matcher.group("birthMonth"));
            System.out.println(matcher.group("birthDay"));
            System.out.println(matcher.group("birthYear"));
            System.out.println(matcher.group("gender"));
            System.out.println(matcher.group("stateId"));
            System.out.println(matcher.group("gpaWeighted"));
//            System.out.println(matcher.group("gpaUnweighted"));
        }
    }
}
