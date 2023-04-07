package com.artsiomhanchar.exercises.section_4_regular_expressions.Task_5;

public class IsEmail {
//    Write a regex that tests whether a String is an email address.
//1. Note: Doing this in regex is actually notoriously difficult to comply with ALL the ways an
//email address can be written. However, you can just do the simplest form of email
//address you can think of, such as: first.last@domain.com

    public static void main(String[] args) {
        String email1 = "first.last@domain.com";
        String email2 = "first@domain.ru";
        String email3 = "first@domainru";
        String email4 = "firstdomain.ru";

        String emailRegex = "((\\w+\\.?)+)@(\\w+)\\.\\w{2,3}";

        System.out.println(email1.matches(emailRegex));
        System.out.println(email2.matches(emailRegex));
        System.out.println(email3.matches(emailRegex));
        System.out.println(email4.matches(emailRegex));
    }
}
