package com.pluralsight;

public class Drink implements LineItem {
    private String flavor;
    private double price;

    public Drink(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public double price(){
        return price;
    }

    @Override
    public String describe(){
        return "A " + flavor + " drink for $" + price;
    }
}
