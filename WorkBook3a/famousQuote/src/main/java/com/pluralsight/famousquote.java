package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class famousquote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String[] quotes = {"never back down never what", "Be yourself; everyone else is already taken.", "So many books, so little time.", "A room without books is like a body without a soul", "You only live once, but if you do it right, once is enough.", "Be the change that you wish to see in the world.", "In three words I can sum up everything I've learned about life: it goes on.", "If you tell the truth, you don't have to remember anything", "To live is the rarest thing in the world. Most people exist, that is all.", "A friend is someone who knows all about you and still loves you"};
        boolean run = true;
        Random rd = new Random();
        while(run) {

            try {
                System.out.println("Pick a number 1-10 or type 'random' for surprise ortype 'exit' to quit");
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("exit")) {
                    run = false;
                    break;
                } else if (input.equalsIgnoreCase("random")) {
                    int parsed = rd.nextInt(quotes.length);
                    System.out.println(quotes[parsed]);
                } else{
                   int parsed = Integer.parseInt(input) - 1;
                    System.out.println(quotes[parsed]);
                }

            } catch (Exception e) {
                System.out.println("out of range");
            }
        }
        sc.close();
    }
}
