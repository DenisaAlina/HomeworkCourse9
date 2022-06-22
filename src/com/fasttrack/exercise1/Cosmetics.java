package com.fasttrack.exercise1;

public class Cosmetics extends Product {
    private String color;
    private double weight;

    public Cosmetics(double price, String name, String color, double weight) {
        super(price, name);
        this.color = color;
        this.weight = weight;
    }

    public void getDiscount(double percentage) {
        System.out.println("Cosmetics discount");
        super.getDiscount(percentage);
    }

    public static String print() {
        return "Cosmetic";
    }

    public void chooseWhiteColor() {
        this.color = "white";
    }
}
