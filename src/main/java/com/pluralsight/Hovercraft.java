package com.pluralsight;

public class Hovercraft extends Vehicle {

    private double airPressure;

    public Hovercraft(String color, int numberOfPassengers,
                      int cargoCapacity, int fuelCapacity) {

        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public double getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(double airPressure) {
        this.airPressure = airPressure;
    }
}
