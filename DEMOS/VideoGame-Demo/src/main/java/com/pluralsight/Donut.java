package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

/**
 * Donut class demonstrates:
 *  - "is-a" relationship (implements LineItem)
 *  - "has-a" relationship (owns a list of toppings)
 */
public class Donut implements LineItem {
    private String flavor;                // encapsulated property
    private double basePrice;             // base cost of donut
    private List<String> toppings = new ArrayList<>(); // composition relationship

    // Constructor initializes base flavor and price
    public Donut(String flavor, double basePrice) {
        this.flavor = flavor;
        this.basePrice = basePrice;
    }

    // Add a topping to this donut (composition behavior)
    public void addTopping(String topping) {
        toppings.add(topping);
    }

    // From LineItem: calculate full price (base + toppings)
    @Override
    public double price() {
        return basePrice + (0.50 * toppings.size());
    }

    // From LineItem: describe the donut in words
    @Override
    public String describe() {
        return flavor + " donut with " + toppings + " for $" + price();
    }
}
