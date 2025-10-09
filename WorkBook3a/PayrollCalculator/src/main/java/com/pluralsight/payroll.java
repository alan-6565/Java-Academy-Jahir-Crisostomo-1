package com.pluralsight;
import java.io.*;
import java.io.FileReader;

public class payroll {
    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader("/Users/alansito/Pluralsight/Java-Academy-Jahir-Crisostomo-1/WorkBook3a/PayrollCalculator/src/Employee.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\|")
            }
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found! Maybe Electro wiped it ");
        } catch (IOException e) {
            System.out.println("Something went wrong while reading the file.");
        }

    }
}
