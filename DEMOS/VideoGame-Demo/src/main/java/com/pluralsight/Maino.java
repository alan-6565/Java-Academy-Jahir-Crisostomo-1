package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Maino {
    public static void main(String[] args) {
        List<String> donuts = new ArrayList<>();
        Donut d = new Donut("Chocolate", 2.00);
        d.addTopping("sprinkles");
        d.addTopping("Caramel Drizzle");

        System.out.println(d.describe());

        Shelf<String> donutShelf = new Shelf<>();
        donutShelf.add("Chocolate Donut");
        donutShelf.add("Maple Donut");
        donutShelf.showAll();

        donuts.add("glazed");
        donuts.add("choco");
        donuts.add("vanilla");
        int sum = 0;
        for (String donut : donuts){
            System.out.println(donut);
            sum += 1;
        }
        System.out.println("Total donuts: " + sum);
    }
}
