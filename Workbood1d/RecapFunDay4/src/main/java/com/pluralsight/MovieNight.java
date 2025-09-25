package com.pluralsight;

public class MovieNight {
    public static void main(String[] args) {
//Create a new Java class with a main method.
//Declare variables for:
//Movie title (String)
//Number of friends (int)
//Pizza price per piece (double)
//Whether you have popcorn (boolean)
//Print a short plan for your movie night.
//Calculate and print the total pizza cost (include yourself).
//Bonus: Use an if statement to print a fun message if there’s popcorn.
        String movieName = "John Wick";
        int numberOfFroends = 5;
        double pizzaPrice = 3.50;
        boolean havePopcorn = true;


        System.out.println("we are watching " + movieName + " with " + numberOfFroends + " friends");
        System.out.println("each pizza costs $" + pizzaPrice);

        double pizzaTotal = pizzaPrice * numberOfFroends;
        System.out.println("the total for the pizza will be $" + pizzaTotal);
        if (havePopcorn) {
            System.out.println("POPCORN TIMEEE");
        }else {
            System.out.println("NO POPCORN FOR YOU");
        }


    }
}
