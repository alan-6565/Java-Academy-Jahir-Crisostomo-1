package com.pluralsight;

import java.util.regex.Pattern;

public class Scores {
    public static void main(String[] args) {
        String score = "Home:Visitor|21:9";
        String[] tally = score.split(Pattern.quote("|"));
        String

        System.out.println(tally);
    }
}
