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


        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        String[] colors = {"red", "white", "blue"};
        String[] colorCopy = new String[3];
// copy colors to colorCopy 1 at a time
        for (int i = 0; i < 3; i++) {
            colorCopy[i] = colors[i];
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(colorCopy[i]);
        }
    }
}

