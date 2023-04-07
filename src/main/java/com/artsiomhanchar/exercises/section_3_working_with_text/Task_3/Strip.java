package com.artsiomhanchar.exercises.section_3_working_with_text.Task_3;

public class Strip {
//    How can you make sure when people enter text into a program, there are no unintended
//spaces at the beginning or end of the text?

    public static void main(String[] args) {
        String text = "   ijiojij  piojiji    ";

        System.out.println(text.strip());
    }
}
