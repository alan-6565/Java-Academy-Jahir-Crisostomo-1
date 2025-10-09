package com.pluralsight;
import java.io.*;
public class GameOn {
    public static void main(String[] args)  {
        try {

            FileReader fr = new FileReader("/Users/alansito/Pluralsight/Java-Academy-Jahir-Crisostomo-1/DEMOS/VideoGame-Demo/src/main/java/com/pluralsight/spidey_logs.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            System.out.println("Mission logs complete");
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found! Maybe it got wiped by Electro ⚡");
        }catch (IOException e) {
            System.out.println("Something went wrong while reading the file.");
        }
    }
}

