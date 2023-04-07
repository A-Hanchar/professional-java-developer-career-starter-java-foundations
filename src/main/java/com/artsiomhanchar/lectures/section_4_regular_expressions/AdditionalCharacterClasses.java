package com.artsiomhanchar.lectures.section_4_regular_expressions;

public class AdditionalCharacterClasses {
    public static void main(String[] args) {
//        . - any character
        System.out.println("doggy".matches(".*"));

//        ^ === not or start of a string line
        System.out.println("doggy".matches("[^abcd]*"));

//        $ - end of the text
        System.out.println("doggy".matches("^..$...$"));

//        \\s - space
//        \\b - boundary -
        System.out.println("cat doggy".matches("...\\s\\b....."));

//        W - not word characters and underscore (_)
        System.out.println("111".matches("\\W\\W\\W"));
    }
}
