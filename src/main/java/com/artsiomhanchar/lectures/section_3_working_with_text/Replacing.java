package com.artsiomhanchar.lectures.section_3_working_with_text;

public class Replacing {
    public static void main(String[] args) {
        String myText = "HerE's FIRF my awesome firf text firf";

        System.out.println(myText);
        System.out.println(myText.replace("firf", "nice"));
        System.out.println(myText);

        System.out.println(myText.replace('e', 'Z'));
    }
}
