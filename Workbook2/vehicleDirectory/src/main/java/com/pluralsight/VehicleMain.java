package com.pluralsight;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] inventory = new Vehicle[20];
        int numVehicles = 6;

        inventory[0] = new Vehicle(1012345, "ford explorer", "red", 32000, 13500);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(102123, "Chevrolet Malibu", "orange", 75000, 9500);
        inventory[4] = new Vehicle(120321, "toyota supra", "green", 30000, 12300);
        inventory[5] = new Vehicle(103213, "nissan pathfinder", "yellow", 65000, 9800);

        int choice = 0;
        while (choice != 6) {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    listAllVehicles(inventory, numVehicles);
                    break;
                case 2:
                    findVehiclesByPrice(inventory, numVehicles);
                    break;
                case 5:
                    addVehicle(inventory, numVehicles);
                    break;
                case 6:
                    choice = 6;
            }

        }
    }

    private static void addVehicle(Vehicle[] inventory, int numVehicles) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle details...");
        System.out.print("ID: ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.print("Make/Model: ");
        String model = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Odometer: ");
        int miles = sc.nextInt();
        System.out.print("Price: ");
        float price = sc.nextFloat();
        inventory[numVehicles++] = new Vehicle(id, model, color, miles, price);
        System.out.println("Vehicle added successfully!");
    }

    private static void findVehiclesByPrice(Vehicle[] inventory, int numVehicles) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter make/model to search: ");
        String search = sc.nextLine().trim().toLowerCase();
        for (int i = 0; i < numVehicles; i++) {
            if (inventory[i].getMakeModel().toLowerCase().contains(search)) {
                System.out.println(inventory[i]);
            }
        }
    }

    private static void listAllVehicles(Vehicle[] inventory, int numVehicles) {
        for (int i = 0; i < numVehicles; i++) {
            System.out.println(inventory[i]);
        }
    }


}
