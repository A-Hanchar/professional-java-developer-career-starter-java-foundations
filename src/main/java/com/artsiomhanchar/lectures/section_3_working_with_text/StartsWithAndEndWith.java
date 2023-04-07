package com.artsiomhanchar.lectures.section_3_working_with_text;

public class StartsWithAndEndWith {
    public static void main(String[] args) {
        String fileName = "file001.txt";

        System.out.println(fileName.endsWith(".txt"));
        System.out.println(fileName.endsWith("doc"));

        System.out.println("---------------");

        System.out.println(fileName.startsWith("file"));
        System.out.println(fileName.startsWith("az"));

        System.out.println("---------------");
    }
}
