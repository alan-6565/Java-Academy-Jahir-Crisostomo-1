package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Theater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = sc.nextLine().trim();
        String[] nameSplit = name.split("\\s+");

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String day = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(day, formatter);

        System.out.println("How many tickets would you like: ");
        int tickets = sc.nextInt();

        if (tickets > 1) {
            System.out.println(tickets + " tickets reserved for " + date + " under " + nameSplit[1] + ", " + nameSplit[0]);
        } else if (tickets == 1) {
            System.out.println(tickets + " ticket reserved for " + date + " under " + nameSplit[1] + ", " + nameSplit[0]);
        }


    }
}
