package com.artsiomhanchar.exercises.section_2_classes_object_methods.Task_11;

public class Test {
    public static void main(String[] args) {
        Classmates classmates = new Classmates();

        Classmate artsiom = new Classmate("Artsiom", "Hanchar");
        Classmate luda = new Classmate("Liudmila", "Hanchar");

        classmates.addClassmate(artsiom);
        classmates.addClassmate(luda);

        classmates.showClassmates();
    }
}
