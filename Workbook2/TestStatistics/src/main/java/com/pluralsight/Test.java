package com.pluralsight;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        int[] testScores = {75, 20, 25, 90, 100, 56, 38, 100, 68, 85};

        int sum = 0;
        int high = testScores[0];
        int low = testScores[0];

        for (int scores : testScores){
            sum += scores;

            if (scores > high) {
                high = scores;
            }
            if ( scores < low){
                low = scores;
            }
        }
        double average = (double) sum / testScores.length;

        System.out.println(high);
        System.out.println(low);
        System.out.println(average);

    }
}
