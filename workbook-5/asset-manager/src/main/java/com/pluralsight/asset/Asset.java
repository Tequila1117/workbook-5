package com.pluralsight.asset;

// Class that reps assets
public class Asset {
    //Properties of the assets
    private String description;
    private String dateAcquired;
    private double originalCost;

    //Constructor
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    //Getters
    public String getDescription() {
        return description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    // Method to get the value of the asset (default to original cost)
    public double getValue() {
        return originalCost;
    }
}
