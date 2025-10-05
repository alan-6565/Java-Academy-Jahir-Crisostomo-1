package com.pluralsight;
import java.util.Scanner;
public class GameOn {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Full name: ");
       String FullName = sc.nextLine().trim();

        System.out.println("Billing Street: ");
        String bS = sc.nextLine().trim();
        System.out.println("Billing City: ");
        String bC = sc.nextLine().trim();
        System.out.println("Billing State: ");
        String bst = sc.nextLine().trim();
        System.out.println("Billing Zip: ");
        String bz = sc.nextLine().trim();


    }
}

