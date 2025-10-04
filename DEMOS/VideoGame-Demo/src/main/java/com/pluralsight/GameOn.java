package com.pluralsight;
import java.util.Scanner;
public class GameOn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your pets name: ");
        String name = sc.nextLine();

        int hunger = 10;
        int energy = 10;
        int social = 10;

        while (hunger > 0 && energy > 0 && social > 0){
            System.out.println("Name of Sim is: " + name);
            System.out.println("|\\__/,|   (`\\\n" +
                    " |o o  |__ _)\n" +
                    " _.( T   )  `  /\n" +
                    "((_ `^--' /_<  \\\n" +
                    "`` `-'(((/  (((/");
            System.out.println("Hunger: " + hunger);
            System.out.println("Energy: " + energy);
            System.out.println("Social: " + social);

            System.out.println("\n Whats your next action?");
            System.out.println("[p] = play [e] = eat [f] = finish game");
            String play = sc.nextLine();
            if (play.equals("p")){
                hunger -= 1;
                energy -= 2;
                social += 1;
            } else if (play.equals("e")) {
                hunger += 2;
                energy += 1;
                social -= 1;
            } else {
                break;
            }
        }

    }
}
