package com.michielswaanen.objects;

public class Contact {

    private String name;
    private String phoneNumber;
    private int birthYear;

    public Contact(String name, String phoneNumber, int birthYear) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
