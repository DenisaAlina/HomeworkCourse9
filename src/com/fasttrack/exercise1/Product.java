package com.fasttrack.exercise1;

public class Product {
    private double price;
    private String name;
    private String description;
    private int quantity;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static String print() {
        return "Product";
    }

    void increaseStock(int increment) {
        this.quantity += increment;
    }

    protected void getDiscount(double percentage) {
        System.out.println("Product discount:");
        this.price = this.price - ((percentage / 100) * this.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
