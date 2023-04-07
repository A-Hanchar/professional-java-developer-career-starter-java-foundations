package com.artsiomhanchar.lectures.section_3_working_with_text;

public class Split {
    public static void main(String[] args) {
        String text = """
                Smith,Fred,1/1/79,1111 ABC St.,Apple,CA
                McGuire,Jerry,2/2/80,2222 DEF St.,Orange,NY
                Flintstone,Fred,3/3/81,3333 GHI St.,Pear,MO
                Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
                Jetson,George,5/5/83,5555 MNO St.,Grapefruit,NY
                """;

        String[] people = text.split("\n");

        System.out.println(people.length);
        System.out.println(people[0]);

        String[] splitedMan = people[4].split(",");

        for (int i = 0; i < splitedMan.length; i++) {
            System.out.println(splitedMan[i]);
        }

        System.out.println("-----------------");

        String text2 = "Jetson,George,5/5/83,5555 MNO St.,Grapefruit,NY";
        String[] splitedText2 = text2.split(",", 3);

        System.out.println(splitedText2.length);

        for (int i = 0; i < splitedText2.length; i++) {
            System.out.println(splitedText2[i]);
        }
    }
}
