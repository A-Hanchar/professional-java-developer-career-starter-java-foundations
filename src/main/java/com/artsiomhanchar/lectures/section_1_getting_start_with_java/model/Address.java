package com.artsiomhanchar.lectures.section_1_getting_start_with_java.model;

public class Address {
    private String addres1;
    private String addres2;
    private String city;
    private String state;

    public Address(String addres1, String addres2, String city, String state) {
        this.addres1 = addres1;
        this.addres2 = addres2;
        this.city = city;
        this.state = state;
    }

    public String getAddres1() {
        return addres1;
    }

    public void setAddres1(String addres1) {
        this.addres1 = addres1;
    }

    public String getAddres2() {
        return addres2;
    }

    public void setAddres2(String addres2) {
        this.addres2 = addres2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
