package com.pluralsight.vehicles;

public class Car extends Vehicle {
    public Car(String make, String model, int mileage, double price) {
        super(make, model, mileage, price);
    }

    public void beepHorn() {
        System.out.println("Beeping the car's horn: Honk! Honk!");
    }
}