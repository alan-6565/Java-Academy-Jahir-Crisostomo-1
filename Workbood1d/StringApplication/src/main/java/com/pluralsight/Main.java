package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void aging(int age){
        age += age;
        System.out.println(age);
    }
    public static void main(String[] args) {

        aging(10);
    }
}