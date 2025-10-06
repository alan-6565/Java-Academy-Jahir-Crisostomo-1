package com.pluralsight;

public class mainDice {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1, roll2;
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for (int i = 1; i <= 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " sum: " + (roll1 + roll2));
            if (roll1 + roll2 == 2){
                twoCounter += 1;
            } else if (roll1 + roll2 == 4) {
                fourCounter += 1;
            } else if (roll1 + roll2 == 6) {
                sixCounter += 1;
            } else if (roll1 + roll2 == 7) {
                sevenCounter += 1;
            }

            System.out.println("Two counter: " + twoCounter);
            System.out.println("Four counter: " + fourCounter);
            System.out.println("Six counter: " + sixCounter);
            System.out.println("Seven counter: " + sevenCounter);
        }
    }
}
