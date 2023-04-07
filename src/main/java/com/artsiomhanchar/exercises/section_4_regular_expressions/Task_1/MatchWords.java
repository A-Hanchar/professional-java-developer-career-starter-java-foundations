package com.artsiomhanchar.exercises.section_4_regular_expressions.Task_1;

public class MatchWords {
//    Write a regex that would match the following words: Dark, bark, Lark
//1. For extra challenge, could you additionally make it match: stark

    public static void main(String[] args) {
        String checkedText = "stark";

        System.out.println(checkedText.matches("([DbL]|(st))ark"));
    }
}
