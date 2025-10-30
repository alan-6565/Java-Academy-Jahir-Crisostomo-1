package com.pluralsight;

import java.util.ArrayList;

public class GameOn {
    public static void main(String[] args) {
        ArrayList<Human> people = new ArrayList<Human>();
        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());
        for(int i = 0; i < 3; i ++) {
            System.out.print(people.get(i).getClass() + "--> ");
            people.get(i).eat();
        }
    }
}

