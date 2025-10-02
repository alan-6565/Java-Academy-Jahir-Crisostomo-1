package com.pluralsight;

public class New {
    public static void main(String[] args) {
        //Todo: a powerpuff fighting game
        //features
        //play online
        //customize characters
        //
        powerPuffGirl blossom = new powerPuffGirl("Blossom", "pink");
        blossom.setHealth(20);
        System.out.println(blossom.getHealth());
        blossom.setHealth(80);
        System.out.println(blossom.getHealth());
        blossom.Heal(50);
        System.out.println(blossom.getHealth());



    }
}
