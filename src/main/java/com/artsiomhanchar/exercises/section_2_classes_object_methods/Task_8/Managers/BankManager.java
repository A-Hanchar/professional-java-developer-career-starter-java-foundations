package com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_8.Managers;//package Task_8.Managers;

import com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_8.Bank;

public class BankManager extends Bank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println(bank.name);
        System.out.println(bank.vault);
    }
}
