package com.pluralsight.vehicles;

public class Vehicle {


    String make;
    String model;
    int mileage;
    double price;


    public Vehicle(String make, String model, int mileage, double price) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
}


    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: $" + price);


    }
}
