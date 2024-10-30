package com.pluralsight.vehicles;


public class SemiTruck extends Vehicle {

    public SemiTruck(String make, String model, int mileage, double price) {
        super(make, model, mileage, price);
    }

    public void loadFabrics() {
        System.out.println("I'm loading fabrics onto the semi truck!!!!");
    }
}
