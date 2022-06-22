package com.fasttrack.exercise1;

public class Main {
    public static void main(String[] args) {
        Cosmetics cosmeticProduct = new Cosmetics(150.0, "Face cream", "white", 100.0);
        cosmeticProduct.increaseStock(10);
        cosmeticProduct.getDiscount(10.0);
        Product product = new Product(100.0, "Curling iron");
        Fridge fridge = new Fridge(1000.0, "Miele", "fridge", 5);
        fridge.setDescription("integrated");
        fridge.increaseStock(1);
        ((Product) fridge).toString();
        fridge.lowerTemperature();
        Electronics electronic = new Electronics(1500.0, "Bosch", "fridge");
        electronic.increaseStock();
        Product.print();
        Cosmetics.print();

    }
}
