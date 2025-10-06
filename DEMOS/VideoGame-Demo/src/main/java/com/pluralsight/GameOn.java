package com.pluralsight;
import java.util.Scanner;
public class GameOn {
    public static void main(String[] args) {
        Person p1 = new Person("Dana", 63);

        Person p2 = new Person();
        p2.setName("Natalie");
        p2.setAge(37);
        System.out.println("P1's name is " + p1.getName());
        System.out.println("P2's name is " + p2.getName());
    }
}

