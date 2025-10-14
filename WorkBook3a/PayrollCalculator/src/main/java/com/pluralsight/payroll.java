package com.pluralsight;
import java.io.*;
import java.io.FileReader;

public class payroll {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/alansito/Pluralsight/Java-Academy-Jahir-Crisostomo-1/WorkBook3a/PayrollCalculator/employees.csv"))){
            String line = br.readLine();
            while ((line = br.readLine()) != null){
              String[] parts = line.split("\\|");
              int employeeId = Integer.parseInt(parts[0]);
              String name = parts[1];
              double hoursWorked = Double.parseDouble(parts[2]);
              double payRate = Double.parseDouble(parts[3]);
              Employee em = new Employee(employeeId, name, hoursWorked, payRate);
                System.out.printf("%d %-20s %.2f\n", em.getEmployeeId(), em.getName(), em.getGrossPay());
            }
        } catch (FileNotFoundException e){
            System.out.println("ds");
        } catch (IOException e) {
            System.out.println("sum wen wring");
        }

    }
}
