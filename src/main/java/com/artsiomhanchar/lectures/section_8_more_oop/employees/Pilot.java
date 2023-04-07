package com.artsiomhanchar.lectures.section_8_more_oop.employees;

public class Pilot implements IFlyer {
    private int hoursFlown = 0;
    private boolean ift = false;

    public Pilot(int hoursFlown, boolean ift) {
        this.hoursFlown = hoursFlown;
        this.ift = ift;
    }

    @Override
    public void fly() {
        System.out.println("Prepare for take off");
    }

    @Override
    public int getHoursFlown() {
        return hoursFlown;
    }

    @Override
    public void setHoursFlown(int hoursFlown) {
        this.hoursFlown = hoursFlown;
    }

    @Override
    public boolean isIft() {
        return ift;
    }

    @Override
    public void setIft(boolean ift) {
        this.ift = ift;
    }
}
