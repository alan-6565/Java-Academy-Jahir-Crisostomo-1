package com.pluralsight;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Name: ");
        String firstName = input.nextLine().trim();
        System.out.println("Middle name: (press enter if no answer)");
        String middleName = input.nextLine().trim();
        System.out.println("Last name: ");
        String lastName = input.nextLine().trim();
        System.out.println("Suffix: ");
        String suffix = input.nextLine().trim();

        String fullName = firstName;

        if(!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        System.out.println("Fullname: " + fullName);


    }
}
