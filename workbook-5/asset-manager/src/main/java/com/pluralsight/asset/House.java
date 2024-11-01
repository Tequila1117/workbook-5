package com.pluralsight.asset;

//Class that rep a House (asset type)
public class House extends Asset {

    private String address;
    private int condition; // 1 - excellent, 2 - good, 3 - fair, 4 - poor
    private int squareFootage;
    private int lotSize;

    //Constructor
    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFootage, int lotSize) {
        super(description, dateAcquired, originalCost);

        this.address = address;
        this.condition = condition;
        this.squareFootage = squareFootage;
        this.lotSize = lotSize;
}

    //Getters
    public String getAddress() {
        return address;
    }


    public int getCondition() {
        return condition;
    }


    public int getSquareFootage() {
        return squareFootage;
    }


    public int getLotSize() {
        return lotSize;
    }


    //Override getValue method to calculate the value of the house
    @Override
    public double getValue() {
        double valuePerSquareFoot;
        // The value per square foot based on condition
        switch (condition) {
            case 1: // excellent
                valuePerSquareFoot = 180.00;
                break;
            case 2: // good
                valuePerSquareFoot = 130.00;
                break;
            case 3: // fair
                valuePerSquareFoot = 90.00;
                break;
            case 4: // poor
                valuePerSquareFoot = 80.00;
                break;
            default:
                valuePerSquareFoot = 0.00;
        }

        // Calculate the total value
        return (valuePerSquareFoot * squareFootage) + (0.25 * lotSize);
    }
}

