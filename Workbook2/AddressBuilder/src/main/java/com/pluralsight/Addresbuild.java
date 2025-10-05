package com.pluralsight;

import java.util.Scanner;

public class Addresbuild {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //name entry
        System.out.println("Full name: ");
        String FullName = sc.nextLine().trim();

        //billling address input
        System.out.println("Billing Street: ");
        String bS = sc.nextLine().trim();
        System.out.println("Billing City: ");
        String bC = sc.nextLine().trim();
        System.out.println("Billing State: ");
        String bst = sc.nextLine().trim();
        System.out.println("Billing Zip: ");
        String bz = sc.nextLine().trim();

        //stringbuilder for billing address
        StringBuilder ba = new StringBuilder();
        ba.append("Billing Address:\n");
        ba.append(bS).append("\n");
        ba.append(bC).append(", ").append(bst).append(" ").append(bz);
        String Billing = ba.toString();

        //input for shipping address
        System.out.println("Shipping Street: ");
        String sS = sc.nextLine().trim();
        System.out.println("Shipping City: ");
        String sC = sc.nextLine().trim();
        System.out.println("Shipping State: ");
        String sst = sc.nextLine().trim();
        System.out.println("Shipping Zip: ");
        String sz = sc.nextLine().trim();

        StringBuilder sa = new StringBuilder();
        sa.append("Shipping Address:\n");
        sa.append(sS).append("\n");
        sa.append(sC).append(", ").append(sst).append(" ").append(sz);
        String Shipping = sa.toString();


        System.out.println(FullName + "\n");
        System.out.println(Billing + "\n");
        System.out.println(Shipping + "\n");
    }
}
