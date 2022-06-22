package com.fasttrack.exercise2_3;

import java.time.LocalDate;

public class Employee implements Person {

    private LocalDate dateOfEmployment;
    private String possition;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String adress;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setBirthday(int x, int y, int z) {
        this.birthday = LocalDate.of(x, y, z);
    }

    public String getPossition() {
        return possition;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return adress;
    }


    public String fullName() {
        return getFirstName() + " " + getLastName();

    }

    public int age() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int birthYear = (getBirthday()).getYear();
        return year - birthYear;
    }
}
