package com.pluralsight;

public class Moped extends Vehicle{

    private boolean hasBell;

    public Moped(String color, int numberOfPassengers,
                 int cargoCapacity, int fuelCapacity) {

        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public boolean hasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasPedals) {
        this.hasBell = hasPedals;
    }
}
