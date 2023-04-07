package com.artsiomhanchar.exercises.section_8_more_oop.Task_8;

public enum COLOR {
    WHITE("White"),
    BLACK("Black");

    private String color;

    COLOR(String color) {
        this.color = color;
    }

    public String getValue() {
        return this.color;
    }
}
