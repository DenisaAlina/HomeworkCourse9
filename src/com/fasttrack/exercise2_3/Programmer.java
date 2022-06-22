package com.fasttrack.exercise2_3;


public class Programmer extends Employee {

    private String language;

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);

    }

    @Override
    public void setBirthday(int x, int y, int z) {
        super.setBirthday(x, y, z);
    }

    @Override
    public String getPossition() {
        return "programmer";
    }


}
