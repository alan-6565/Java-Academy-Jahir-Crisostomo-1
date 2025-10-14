package com.pluralsight;

public class Player {
    private String name;
    private int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void takeDamage(int dmg) {
        hp -= dmg;
        System.out.println(name + " took " + dmg + " damage! HP now: " + hp);
    }
}
