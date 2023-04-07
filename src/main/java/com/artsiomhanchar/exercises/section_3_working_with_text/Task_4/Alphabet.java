package com.artsiomhanchar.exercises.section_3_working_with_text.Task_4;

public class Alphabet {
//    If someone enters “ alphabet “ (notice the spaces) as input into a method, make that
//method output “alphabeT” instead.
    public static void main(String[] args) {
        String text = " alphabet ";
        String text2 = "alphabet";

        System.out.println(checkPhraseOnAlphabet(text));
        System.out.println(checkPhraseOnAlphabet(text2));
    }

    private static String checkPhraseOnAlphabet(String text) {
        if(text.contentEquals(" alphabet ")) {
            return text.strip().replace('t', 'T');
        }

        return text;
    }
}
