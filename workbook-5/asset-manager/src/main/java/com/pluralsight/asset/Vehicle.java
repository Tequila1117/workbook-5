package com.pluralsight.asset;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;


    // Constructor
    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }


    // Getters
    public String getMakeModel() {
        return makeModel;
    }


    public int getYear() {
        return year;
    }


    public int getOdometer() {
        return odometer;
    }


    // Override getValue method to calculate the value of vehicle

    @Override
    public double getValue() {
        double value = getOriginalCost();
        int age = 2024 - year; // current year to year


        // Change value based on age of
        if (age <= 3) {
            value *= (1 - 0.03 * age); // 3% reduction per year
        } else if (age <= 6) {
            value *= (1 - 0.06 * (age - 3)); // 6% reduction per year
        } else if (age <= 10) {
            value *= (1 - 0.08 * (age - 6)); // 8% reduction per year
        } else {
            value = 1000.00; // Value for vehicles older than 10 years
        }


        // Lower value if odometer is over 100,000 miles, unless it’s a Honda or Toyota
        if (odometer > 100000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota")) {
            value *= 0.75; // Reduce by 25%
        }

        return value;
    }
}