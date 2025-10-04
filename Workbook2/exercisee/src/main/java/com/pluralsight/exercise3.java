package com.pluralsight;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a game Score: ");
        String input = sc.nextLine().trim();

        String[] parts = input.split("\\|");
        String[] names = parts[0].split(":");
        String[] scores = parts[1].split(":");

        int homeScore = Integer.parseInt(scores[0]);
        int opponent = Integer.parseInt(scores[1]);

        if (homeScore > opponent) {
            System.out.println("Winner: " + names[0]);
        } else if (opponent > homeScore) {
            System.out.println("Winner: " + names[1]);
        } else {
            System.out.println("Tied game");
        }

    }
}
