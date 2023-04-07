package com.artsiomhanchar.lectures.section_8_more_oop.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager extends Employee {
    private int orgSize = 0;
    private int dr = 0;

    private final String managerReges = "\\w+=(?<orgSize>\\w+),\\w+=(?<dr>\\w+)";
    private final Pattern managerPattern = Pattern.compile(managerReges);

    public Manager(String personText) {
        super(personText);

        Matcher programmerMatcher = managerPattern.matcher(employeeDetails);

        if (programmerMatcher.find()) {
            this.orgSize = Integer.parseInt(programmerMatcher.group("orgSize"));
            this.dr = Integer.parseInt(programmerMatcher.group("dr"));

            setSalary(3500 + orgSize * dr);
        }
    }

    @Override
    public double getBonus() {
        return getSalary();
    }

    public int getOrgSize() {
        return orgSize;
    }

    public void setOrgSize(int orgSize) {
        this.orgSize = orgSize;
    }
}
