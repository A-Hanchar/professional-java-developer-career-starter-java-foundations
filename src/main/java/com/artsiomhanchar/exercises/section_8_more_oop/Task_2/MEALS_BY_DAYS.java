package com.artsiomhanchar.exercises.section_8_more_oop.Task_2;

public enum MEALS_BY_DAYS {
    SATURDAY("pizza"),
    MONDAY("spaghetti"),
    TUESDAY("tacos"),
    WEDNESDAY("chicken"),
    THURSDAY("meatloaf"),
    FRIDAY("hamburgers"),
    SUNDAY("pot roast");

    private String meal;

    MEALS_BY_DAYS(String meal) {
        this.meal = meal;
    }

    public String getValue() {
        return meal;
    }
}
