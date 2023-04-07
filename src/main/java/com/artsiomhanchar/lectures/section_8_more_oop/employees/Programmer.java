package com.artsiomhanchar.lectures.section_8_more_oop.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programmer extends Employee implements IEmployee, Apple, IChef {
    private int linesOfCode = 0;
    private int yearsOfExp = 0;
    private int iq = 0;

    private final String progReges = "\\w+=(?<locpd>\\w+),\\w+=(?<yoe>\\w+),\\w+=(?<iq>\\w+)";
    private final Pattern programmerPattern = Pattern.compile(progReges);

    public Programmer(String personText) {
        super(personText);

        if(personText == "") return;

        Matcher programmerMatcher = programmerPattern.matcher(employeeDetails);

        if (programmerMatcher.find()) {
            this.linesOfCode = Integer.parseInt(programmerMatcher.group("locpd"));
            this.yearsOfExp = Integer.parseInt(programmerMatcher.group("yoe"));
            this.iq = Integer.parseInt(programmerMatcher.group("iq"));

            setSalary(3000 + linesOfCode * yearsOfExp * iq);
        }
    }

    @Override
    public double getBonus() {
        return getSalary() - getSalary();
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
