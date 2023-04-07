package com.artsiomhanchar.lectures.section_2_classes_object_methods.package1;

import com.artsiomhanchar.lectures.section_2_classes_object_methods.package2.ClassB;

public class ClassA {
    public static void main(String[] args) {
        ClassB classB = new ClassB();

        classB.publicMethod();
    }
}
