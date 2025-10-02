package com.pluralsight;

public class GameOn {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println("Shooting web #" + i);
        }


        GameOn spiderman = new GameOn();
        spiderman.webZip("New York");

        String villian = "\"VENOM!\"";
        System.out.println("And his name issss " + villian);
        String intro = " I am Spider-Man! ";
        System.out.println(intro.trim().toLowerCase());
        String tag = "OSCORP-213";
        int dash = tag.indexOf("-");
        String company = tag.substring(0, dash);
        System.out.println(company);
        String enemies = "Venom|Rhino|Green Goblin";
        String[] enemy = enemies.split("\\|");
        System.out.println(enemy[0]);
    }




    public void webZip(String destination) {
        System.out.println("🕸️ Web-zipping to " + destination + "!");
    }
}
