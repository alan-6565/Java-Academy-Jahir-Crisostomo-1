package com.pluralsight;

public class VehicleMain {
    public static void main(String[] args) {
        Moped harley = new Moped();
        harley.setColor("Blue");
        harley.setFuelCapacity(6);
        System.out.println(harley.getColor());
        System.out.println(harley.getFuelCapacity());
    }
}
