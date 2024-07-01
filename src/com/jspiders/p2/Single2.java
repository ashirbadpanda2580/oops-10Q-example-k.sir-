package com.jspiders.p2;

class ElectronicsItem {
	protected String name;
	protected double price;

 public ElectronicsItem(String name, double price) {
     this.name = name;
     this.price = price;
 }

 	void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Price: $" + price);
 }
}

class Smartphone extends ElectronicsItem {
 private String brand;

 public Smartphone(String name, double price, String brand) {
     super(name, price);
     this.brand = brand;
 }
 
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Brand: " + brand);
 }
}

public class Single2 {
 public static void main(String[] args) {
     Smartphone phone = new Smartphone("iPhone 12", 999.99, "Apple");
     phone.displayInfo();
 }
}
