package com.pluralsight;
import java.util.Scanner;
public class mainApp {
    public static void main(String[] args) {
        CellPhone cellPhone1, cellPhone2;


        cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(123456);
        cellPhone1.setModel("xr");
        cellPhone1.setCarrier("verizon");
        cellPhone1.setPhoneNumber("510-234-2345");
        cellPhone1.setOwner("alan");


        cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(654321);
        cellPhone2.setModel("xe");
        cellPhone2.setCarrier("verizon");
        cellPhone2.setPhoneNumber("510-523-8765");
        cellPhone2.setOwner("bruh");

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
    }
    public static void display(CellPhone phone) {
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
    }
}
