package com.artsiomhanchar.lectures.section_2_classes_object_methods.package2;

public class OtherClass {
    public void method1() {
        ClassB classB = new ClassB();

        classB.protectedMethod();
        classB.packageProtected();
    }
}
