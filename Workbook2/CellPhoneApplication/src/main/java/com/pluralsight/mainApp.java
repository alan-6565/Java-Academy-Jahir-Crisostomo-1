package com.pluralsight;
import java.util.Scanner;
public class mainApp {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the serial number?");
        int serial = sc.nextInt();
        String eat = sc.nextLine();
        System.out.println("What model is the phone?");
        String model = sc.nextLine();
        System.out.println("who is the carrier?");
        String carrier = sc.nextLine();
        System.out.println("What is your phone number");
        String number = sc.nextLine();
        System.out.println("Who is the owner of the phone");
        String owns = sc.nextLine();


        cellPhone1.setSerialNumber(serial);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(number);
        cellPhone1.setOwner(owns);

        System.out.println(cellPhone1.getSerialNumber());
        System.out.println(cellPhone1.getModel());
        System.out.println(cellPhone1.getCarrier());
        System.out.println(cellPhone1.getPhoneNumber());
        System.out.println(cellPhone1.getOwner());



    }
}
