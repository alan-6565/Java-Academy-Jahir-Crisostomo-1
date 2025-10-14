package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class bedtime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of a story: ");
        String input = sc.nextLine();
        if (input.toLowerCase().equals("goldilocks.txt")) {
            try (BufferedReader br = new BufferedReader(new FileReader("goldilocks.txt"))) {
                String line = br.readLine();
                int lineNumber = 1;


                while ((line = br.readLine()) != null) {

                    System.out.printf("%3d: %s%n", lineNumber, line);
                    lineNumber++;
                }
                br.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
