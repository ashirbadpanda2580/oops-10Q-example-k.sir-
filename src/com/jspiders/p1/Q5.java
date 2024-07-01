package com.jspiders.p1;

import java.util.Scanner;

class Device {
    private String brand;
    private String model;
    private double price;

    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void deviceDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

class Computer extends Device {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String brand, String model, double price, String processor, int ram, int storage) {
        super(brand, model, price);
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    void computerDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }
}

class Laptop extends Computer {
    private double weight;
    private int batteryLife;
    private boolean isTouchscreen;

    public Laptop(String brand, String model, double price, String processor, int ram, int storage, double weight, int batteryLife, boolean isTouchscreen) {
        super(brand, model, price, processor, ram, storage);
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.isTouchscreen = isTouchscreen;
    }

    void laptopDetails() {
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Touchscreen: " + isTouchscreen);
    }
}


public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (1):for DEVICE, (2):for COMPUTER, (3):for LAPTOP");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter device brand: ");
                String brand = sc.next();
                System.out.println("Enter device model: ");
                String model = sc.next();
                System.out.println("Enter device price: ");
                double price = sc.nextDouble();
                Device device = new Device(brand, model, price);
                device.deviceDetails();
                break;
            case 2:
                System.out.println("Enter computer brand: ");
                brand = sc.next();
                System.out.println("Enter computer model: ");
                model = sc.next();
                System.out.println("Enter computer price: ");
                price = sc.nextDouble();
                System.out.println("Enter processor: ");
                String processor = sc.next();
                System.out.println("Enter RAM (in GB): ");
                int ram = sc.nextInt();
                System.out.println("Enter storage (in GB): ");
                int storage = sc.nextInt();
                Computer computer = new Computer(brand, model, price, processor, ram, storage);
                computer.deviceDetails();
                computer.computerDetails();
                break;
            case 3:
                System.out.println("Enter laptop brand: ");
                brand = sc.next();
                System.out.println("Enter laptop model: ");
                model = sc.next();
                System.out.println("Enter laptop price: ");
                price = sc.nextDouble();
                System.out.println("Enter processor: ");
                processor = sc.next();
                System.out.println("Enter RAM (in GB): ");
                ram = sc.nextInt();
                System.out.println("Enter storage (in GB): ");
                storage = sc.nextInt();
                System.out.println("Enter weight (in kg): ");
                double weight = sc.nextDouble();
                System.out.println("Enter battery life (in hours): ");
                int batteryLife = sc.nextInt();
                System.out.println("Does it have a touchscreen? (true/false): ");
                boolean hasTouchscreen = sc.nextBoolean();
                Laptop laptop = new Laptop(brand, model, price, processor, ram, storage, weight, batteryLife, hasTouchscreen);
                laptop.deviceDetails();
                laptop.computerDetails();
                laptop.laptopDetails();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}

