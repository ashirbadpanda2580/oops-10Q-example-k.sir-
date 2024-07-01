package com.jspiders.p2;

class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void vehicleDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private int numOfDoors;
    private int trunkCapacity;

    public Car(String make, String model, int year, int numOfDoors, int trunkCapacity) {
        super(make, model, year);
        this.numOfDoors = numOfDoors;
        this.trunkCapacity = trunkCapacity;
    }

    void carDetails() {
        super.vehicleDetails();
        System.out.println("Number of Doors: " + numOfDoors);
        System.out.println("Trunk Capacity: " + trunkCapacity + " liters");
    }
}

class Motorcycle extends Vehicle {
    private String handlebarType;
    private int engineCC;

    public Motorcycle(String make, String model, int year, String handlebarType, int engineCC) {
        super(make, model, year);
        this.handlebarType = handlebarType;
        this.engineCC = engineCC;
    }

    void motorcycleDetails() {
        super.vehicleDetails();
        System.out.println("Handlebar Type: " + handlebarType);
        System.out.println("Engine Capacity: " + engineCC + " cc");
    }
}

public class Hierarchy1 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2018, 4, 15);
        myCar.carDetails();

        System.out.println("=============================================");

        Motorcycle myMotorcycle = new Motorcycle("Honda", "CBR600RR", 2020, "Racing", 599);
        myMotorcycle.motorcycleDetails();
    }
}
