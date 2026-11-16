package com.pluralsight;

public class app {
    public static void main(String[] args) {

        Moped slowRide = new Moped("Red", 1, 0, 5);
        slowRide.setHasBell(true);

        Car myCar = new Car("Blue", 5, 400, 15);
        myCar.setNumberOfDoors(4);

        SemiTruck bigTruck = new SemiTruck("Black", 2, 20000, 300);
        bigTruck.setHasTrailer(true);

        Hovercraft hover = new Hovercraft("White", 6, 500, 50);
        hover.setAirPressure(25.5);


        System.out.println("---- MOPED ----");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Passengers: " + slowRide.getNumberOfPassengers());
        System.out.printf("Has a bell: %s%n", slowRide.hasBell());

        System.out.println("\n---- CAR ----");
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Passengers: " + myCar.getNumberOfPassengers());
        System.out.println("Doors: " + myCar.getNumberOfDoors());

        System.out.println("\n---- SEMI TRUCK ----");
        System.out.println("Color: " + bigTruck.getColor());
        System.out.println("Passengers: " + bigTruck.getNumberOfPassengers());
        System.out.printf("Has Trailer: %s%n", bigTruck.hasTrailer());

        System.out.println("\n---- HOVERCRAFT ----");
        System.out.println("Color: " + hover.getColor());
        System.out.println("Passengers: " + hover.getNumberOfPassengers());
        System.out.println("Air Pressure: " + hover.getAirPressure());

        // A Moped can call setColor() because it extends Vehicle.
        // Moped inherits the public methods from Vehicle,
        // so we do not need to create a separate Vehicle object.
    }
}
