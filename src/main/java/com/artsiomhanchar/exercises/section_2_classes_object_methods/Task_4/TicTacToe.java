package com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_4;

public class TicTacToe {
//    Try creating an array to represent the tic-tac-toe board to the right.
//    4.1.How would you access the value in the bottom right square with
//    Java code?2

    public static void main(String[] args) {
        char zero = '0';
        char cross = 'X';

        char[][] ticTacToe = new char[][] {{zero, cross, cross}, {cross, zero, zero}, {cross, zero, zero}};

        System.out.println(ticTacToe[2][2]);
    }
}
