package com.artsiomhanchar.lectures.section_8_more_oop.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyst extends Employee {
    private int projectCount = 0;

    private final String analystReges = "\\w+=(?<projectCount>\\w+)";
    private final Pattern analystPattern = Pattern.compile(analystReges);

    public Analyst(String personText) {
        super(personText);

        Matcher programmerMatcher = analystPattern.matcher(employeeDetails);

        if (programmerMatcher.find()) {
            this.projectCount = Integer.parseInt(programmerMatcher.group("projectCount"));

            setSalary(2500 + projectCount * 2);
        }
    }

    @Override
    public double getBonus() {
        return getSalary();
    }
}
