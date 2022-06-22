package com.fasttrack.exercise1;

public class Fridge extends Electronics {
    private int temperature;

    public Fridge(double price, String name, String type, int temperature) {
        super(price, name, type);
        this.temperature = temperature;
    }

    public void lowerTemperature() {
        this.temperature--;
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "temperature=" + temperature +
                '}';
    }
}
