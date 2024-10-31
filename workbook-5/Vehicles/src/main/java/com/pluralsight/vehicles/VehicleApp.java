package com.pluralsight.vehicles;


 //The VehicleApp class serves as the main application to demonstrate vehicle functionality.

public class VehicleApp {
    public static void main(String[] args) {
        // Creating instances of different vehicle types with details
        Moped myMoped1 = new Moped("Yamaha", "NMAX", 500, 3000.00);
        Moped myMoped2 = new Moped("Honda", "PCX", 400, 2800.00);

        Car myCar1 = new Car("Mercedes-Benz", "C-Class", 15000, 40000.00);
        Car myCar2 = new Car("Audi", "A4", 12000, 38000.00);

        SemiTruck myTruck1 = new SemiTruck("Freightliner", "Cascadia", 80000, 100000.00);
        SemiTruck myTruck2 = new SemiTruck("Kenworth", "T680", 70000, 95000.00);

        HoverCraft myHoverCraft1 = new HoverCraft("AirFish", "500", 100, 150000.00);
        HoverCraft myHoverCraft2 = new HoverCraft("Gibbs", "Quadski", 50, 70000.00);

        // Displaying vehicle information and performing different actions based on vehicle
        System.out.println("Moped 1 Info:");
        myMoped1.displayInfo();
        myMoped1.ride();

        System.out.println("\nMoped 2 Info:");
        myMoped2.displayInfo();
        myMoped2.ride();

        System.out.println("\nCar 1 Info:");
        myCar1.displayInfo();
        myCar1.beepHorn();

        System.out.println("\nCar 2 Info:");
        myCar2.displayInfo();
        myCar2.beepHorn();

        System.out.println("\nSemi Truck 1 Info:");
        myTruck1.displayInfo();
        myTruck1.loadFabrics();

        System.out.println("\nSemi Truck 2 Info:");
        myTruck2.displayInfo();
        myTruck2.loadFabrics();

        System.out.println("\nHovercraft 1 Info:");
        myHoverCraft1.displayInfo();
        myHoverCraft1.floatOnWater();

        System.out.println("\nHovercraft 2 Info:");
        myHoverCraft2.displayInfo();
        myHoverCraft2.floatOnWater();
    }
}