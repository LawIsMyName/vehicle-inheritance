package com.pluralsight;

public class SemiTruck extends Vehicle {

    private boolean hasTrailer;

    public SemiTruck(String color, int numberOfPassengers,
                     int cargoCapacity, int fuelCapacity) {

        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }
}
