package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;
public class GameOn {
    public static void main(String[] args) {
        String[] team = {"Peter", "MJ", "Ned", "Gwen", "Miles"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a mamber from the roster number 1-5 \n 1.peter\n2.mj\n3.ned\n4.gwen\n5.miles");
        try{
            int pick = Integer.parseInt(sc.nextLine()) - 1;
            System.out.println("You teamed up with " + team[pick]);
        } catch (NumberFormatException e) {
            System.out.println("thats not a number");
        } catch (Exception e) {
            System.out.println("number was out of bounds");
        }

    }
}

