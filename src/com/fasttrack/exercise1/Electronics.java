package com.fasttrack.exercise1;

public class Electronics extends Product {
    private String type;
    private int length;
    private int width;
    private int height;
    private double weight;

    public Electronics(double price, String name, String type) {
        super(price, name);
        this.type = type;
    }

    void increaseStock(int increment) {
        super.increaseStock(increment);
    }

    void increaseStock() {
        super.increaseStock(2);
    }
}
