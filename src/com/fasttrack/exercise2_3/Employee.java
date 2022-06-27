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
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int birthYear = (getBirthday()).getYear();
        int birthMonth = (getBirthday()).getMonthValue();
        int birthDay = (getBirthday()).getDayOfMonth();
        int age = 0;
        if (month < birthMonth) {
            age = year - birthYear - 1;
        } else if (month > birthMonth) {
            age = year - birthYear;
        } else if (month == birthMonth) {
            if (day < birthDay) {
                age = year - birthYear - 1;
            } else {
                age = year - birthYear;
            }
        }
        return age;
    }
}
