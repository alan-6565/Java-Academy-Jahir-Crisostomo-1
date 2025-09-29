package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // salary
        int bobSalary = 150000;
        int garySalary = 145000;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is.... " + highestSalary);
       // car prices
        int carPrice = 7000;
        int truckPrice = 10000;

        int lowestCarPrice = Math.min(carPrice, truckPrice);
        System.out.println("lowest car price is " + lowestCarPrice);
        // find radius

        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("the area is " + area);


    }
}