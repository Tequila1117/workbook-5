package com.pluralsight.asset;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {

        // Create an ArrayList to hold Asset objects
        ArrayList<Asset> assets = new ArrayList<>();

        // Add House assets
        assets.add(new House("My seasonal home", "2022-06-15", 300000,
                "175 Heart Rd", 1, 1500, 5000));
        assets.add(new House("Kela's house", "2021-08-20", 250000,
                "456 Maple Ave", 2, 2000, 6000));

        // Vehicle assets
        assets.add(new Vehicle("My car", "2020-03-10", 20000,
                "Honda Civic", 2019, 25000));
        assets.add(new Vehicle("Kela's  truck", "2018-02-29", 30000,
                "Ford F-150", 2017, 80000));

        // Loop through the assets and display their details
        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            // Check asset type and display additional details
            if (asset instanceof House) {
                House house = (House) asset; // Downcast to House
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset; // Downcast to Vehicle
                System.out.println("Make/Model: " + vehicle.getMakeModel() + ", Year: " + vehicle.getYear());
            }

            // Print for separation
            System.out.println("-----------------------------------");
        }
    }
}