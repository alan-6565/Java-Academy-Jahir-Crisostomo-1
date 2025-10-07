package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class famousquote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();


        try {
            String[] quotes = {"never back down never what", "Be yourself; everyone else is already taken.", "So many books, so little time.", "A room without books is like a body without a soul", "You only live once, but if you do it right, once is enough.", "Be the change that you wish to see in the world.", "In three words I can sum up everything I've learned about life: it goes on.", "If you tell the truth, you don't have to remember anything", "To live is the rarest thing in the world. Most people exist, that is all.", "A friend is someone who knows all about you and still loves you"};
            System.out.println("Pick a number 1-10 or 0 for random");
            int index = sc.nextInt();

            if (index == 0){
                index = rd.nextInt(10) + 1;
                index--;
            }else {
                index--;
            }
            sc.nextLine();
            System.out.println(quotes[index]);
        } catch (Exception e) {
            System.out.println("out of range");
            e.printStackTrace();
        }

        System.out.println("would you like to try again? (say yes or no)");
        String tryAgain = sc.nextLine();

        while (tryAgain.equals("yes")){
            try {
                String[] quotes = {"never back down never what", "Be yourself; everyone else is already taken.", "So many books, so little time.", "A room without books is like a body without a soul", "You only live once, but if you do it right, once is enough.", "Be the change that you wish to see in the world.", "In three words I can sum up everything I've learned about life: it goes on.", "If you tell the truth, you don't have to remember anything", "To live is the rarest thing in the world. Most people exist, that is all.", "A friend is someone who knows all about you and still loves you"};
                System.out.println("Pick a number 1-10");
                int index = sc.nextInt();

                if (index == 0){
                    index = rd.nextInt(10) + 1;
                    index--;
                }else {
                    index--;
                }
                sc.nextLine();

                System.out.println(quotes[index]);
            } catch (Exception e) {
                System.out.println("out of range");
                e.printStackTrace();
            }

            System.out.println("would you like to try again? (say yes or no)");
            tryAgain = sc.nextLine();

        }
        sc.close();
    }
}
