package com.artsiomhanchar.lectures.section_8_more_oop.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CEO extends Employee implements IEmployee, Apple, IFlyer {
    private int avgStockPrice = 0;
    private IFlyer pilot = new Pilot(1000, true);

    private final String ceoReges = "\\w+=(?<avgStockPrice>\\w+)";
    private final Pattern ceoPattern = Pattern.compile(ceoReges);

    public CEO(String personText) {
        super(personText);

        if(personText == "") return;

        Matcher programmerMatcher = ceoPattern.matcher(employeeDetails);

        if (programmerMatcher.find()) {
            this.avgStockPrice = Integer.parseInt(programmerMatcher.group("avgStockPrice"));

            setSalary(5000 * avgStockPrice);
        }
    }

    @Override
    public double getBonus() {
        return getSalary();
    }

    public void fly() {
        pilot.fly();
    }

    public int getHoursFlown() {
        return pilot.getHoursFlown();
    }

    public void setHoursFlown(int hoursFlown) {
        pilot.setHoursFlown(hoursFlown);
    }

    public boolean isIft() {
        return pilot.isIft();
    }

    public void setIft(boolean ift) {
        pilot.setIft(ift);
    }
}
