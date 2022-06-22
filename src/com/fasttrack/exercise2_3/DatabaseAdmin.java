package com.fasttrack.exercise2_3;


public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName) {
        super(firstName, lastName);

    }

    @Override
    public void setBirthday(int x, int y, int z) {
        super.setBirthday(x, y, z);
    }

    @Override
    public String getAddress() {
        return "db admin: " + super.getAddress();
    }
}
