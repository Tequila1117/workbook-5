package com.pluralsight.vehicles;


//The Moped class represents a type of vehicle that inherits from Vehicle.

public class Moped extends Vehicle {
    //Constructor to initialize a Moped object.

     //parameteres( make , model, mileage and price)

    public Moped(String make, String model, int mileage, double price) {
        super(make, model, mileage, price); // Call the parent constructor
    }


     // Simulates the action of riding the moped.
    //This method outputs a message indicating that the moped is being ridden.

    public void ride() {
        System.out.println("Riding the Moped!!!!!");
    }
}