package com.artsiomhanchar.lectures.section_4_regular_expressions;

public class ABCs {
    public static void main(String[] args) {
        System.out.println("cat".matches("cat"));
        System.out.println("Cat".matches("cat"));

        System.out.println("Cat".matches("[cC]at"));

        System.out.println("Rat".matches("[a-zA-Z]at"));

        System.out.println("cat".matches("[^c]at")); // ^ not (all characters except ^chars)
        System.out.println("Bat".matches("[^a-z]at"));

        System.out.println("_at".matches("\\wat")); // \\w word character [[:word:]] and sign _
        System.out.println("8".matches("\\d")); // \\d any digit [0-9]

        System.out.println("333-   123.3847".matches("\\d{3}[-.\\s]+\\d{3}[-.\\s]+\\d{4}")); // \\s - space symbol, + - one or more characters before sign +

        System.out.println("3331233847".matches("(\\d{3}[-.\\s]*){2}\\d{4}")); // * - zero or more characters before sign *
        System.out.println("333-1233847".matches("(\\d{3}[-.\\s]?)?\\d{3,9}")); // ? - zero or one character before sign ?, {n, m} - range between [n, m], where m is unnessessary {3,}

        System.out.println("1.333-1233847".matches("(\\d[-.\\s]?)?(\\d{3}[-.\\s]?)?\\d{3,9}"));
    }
}
