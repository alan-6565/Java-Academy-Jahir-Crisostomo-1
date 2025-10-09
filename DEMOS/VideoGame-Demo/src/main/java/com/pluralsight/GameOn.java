package com.pluralsight;
import java.io.*;
public class GameOn {
    public static void main(String[] args) {
       try{
           FileReader fr = new FileReader("/Users/alansito/Pluralsight/Java-Academy-Jahir-Crisostomo-1/DEMOS/VideoGame-Demo/src/spidey_logs.txt");
           BufferedReader br = new BufferedReader(fr);

           String line;
           while ((line = br.readLine()) != null) {
               if (line.contains("Patrolled")){
                   System.out.println(line);
               }

               if (line.contains("Battled")){
                   System.out.println(line);
               }
           }
       } catch (FileNotFoundException e) {
           System.out.println("Log file not found! Maybe Electro wiped it ");
       } catch (IOException e) {
           System.out.println("Something went wrong while reading the file.");
       }
    }

}

