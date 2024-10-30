package com.pluralsight.vehicles;

public class HoverCraft extends Vehicle {
    public HoverCraft(String make, String model, int mileage, double price) {
        super(make, model, mileage, price);
    }

    public void floatOnWater() {
        System.out.println("Floating on water with the hovercraft...");
    }
}