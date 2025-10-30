package com.pluralsight;

import java.time.LocalDate;

class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dataAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dataAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue(){
        double value = getOriginalCost();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;

        // Depreciation based on age
        if (age <= 3) {
            value -= (value * 0.03 * age);
        } else if (age <= 6) {
            value -= (value * 0.06 * age);
        } else if (age <= 10) {
            value -= (value * 0.08 * age);
        } else {
            value = 1000.0; // over 10 years old
        }

        // Mileage adjustment (if over 100,000 miles)
        boolean isHondaOrToyota = makeModel.toLowerCase().contains("honda") ||
                makeModel.toLowerCase().contains("toyota");

        if (odometer > 100000 && !isHondaOrToyota) {
            value *= 0.75; // reduce by 25%
        }

        // Ensure it doesn’t drop below 0
        if (value < 0) {
            value = 0;
        }

        return value;

    }
}
