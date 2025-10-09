package com.pluralsight;
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your full name");
        String name = sc.nextLine().trim();

        String[] finalName = name.split(" ");

        if (finalName.length == 2){
            System.out.println("First: " + finalName[0]);
            System.out.println("Last: " + finalName [1]);
        }
        if (finalName.length == 3){
            System.out.println("First: " + finalName[0]);
            System.out.println("Middle: " + finalName [1]);
            System.out.println("Last: " + finalName[2]);
        }

    }
}
