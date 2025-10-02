package com.pluralsight;
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String before = sc.nextLine().trim();
        String name = before.trim();
        String[] splitting = name.split("\\s+");

        if(splitting.length == 2){
            System.out.println("First: " + splitting[0]);
            System.out.println("Middle: (Nothing)");
            System.out.println("Last: " + splitting[1]);
        }
        else if (splitting.length == 3){
            System.out.println("First: " + splitting[0]);
            System.out.println("Middle: " + splitting[1]);
            System.out.println("Last: " + splitting[2]);
        }
    }
}
