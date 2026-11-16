package com.pluralsight;

public class app {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(10);
        slowRide.setFuelCapacity(2);
        slowRide.setHasBell(true);

        Car myCar = new Car();
        myCar.setColor("Blue");
        myCar.setNumberOfPassengers(5);
        myCar.setCargoCapacity(400);
        myCar.setFuelCapacity(15);
        myCar.setNumberOfDoors(4);


    }
}
