package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public void dial(String number){
        System.out.println(owner + "'s phone is calling " + number);
    }

    //getters

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    //Setters

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setOwner (String owner){
        this.owner = owner;
    }
}
