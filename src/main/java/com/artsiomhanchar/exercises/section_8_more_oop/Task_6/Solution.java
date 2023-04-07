package com.artsiomhanchar.exercises.section_8_more_oop.Task_6;

public class Solution {
    /**
     * Write a method that takes the following inputs and returns the corresponding outputs:
     * 8->0, 7->1, 6->2, 5->3, 4->4, 3->5, 2->6, 1->7
     */

    public static void main(String[] args) {
        System.out.println(correspondingDigit(8));
        System.out.println(correspondingDigit(7));
        System.out.println(correspondingDigit(6));
        System.out.println(correspondingDigit(5));
        System.out.println(correspondingDigit(4));
        System.out.println(correspondingDigit(3));
        System.out.println(correspondingDigit(2));
        System.out.println(correspondingDigit(1));
    }

    private static String correspondingDigit(int inputDigit) {
        int maxValue = 8;

        return String.format("%d->%d", inputDigit, maxValue - inputDigit);
    }
}
