package com.jspiders.p1;
import java.util.Scanner;
class Vehicle {
    protected String brand;
    protected int year;
    protected String color;
    protected double price;
    protected boolean isElectric;
    
    public Vehicle(String brand, int year, String color, double price, boolean isElectric) {
    	this.brand = brand;
    	this.year = year;
    	this.color = color;
    	this.price = price;
    	this.isElectric = isElectric;
    }
}

class Maruti extends Vehicle {
	private String model;
    private int seatingCapacity;
    
    public Maruti(String brand,int year,String color,double price,boolean isElectric,String model,int seatingCapacity) {
    	super(brand,year,color,price,isElectric);
    	this.model = model;
    	this.seatingCapacity = seatingCapacity;
    }
    
    void dispMarutiDetails() {
    	System.out.println("Brand: "+brand);
    	System.out.println("Year: "+year);
    	System.out.println("color: "+color);
    	System.out.println("price: "+price);
    	System.out.println("isElectric: "+isElectric);
    	System.out.println("model: "+model);
    	System.out.println("seating Capacity: "+seatingCapacity);
    }
}

class Thar extends Vehicle{
	private boolean isOffroad;
	private String terrianType;
	
	public Thar(String brand,int year,String color,double price,boolean isElectric,boolean isOffroad,String terrianType) {
		super(brand, year, color, price, isElectric);
		this.isOffroad = isOffroad;
		this.terrianType = terrianType;
	}
	
	void tharDetails() {
		System.out.println("Brand: "+brand);
    	System.out.println("Year: "+year);
    	System.out.println("color: "+color);
    	System.out.println("price: "+price);
    	System.out.println("isElectric: "+isElectric);
    	System.out.println("isOffroad: "+isOffroad);
    	System.out.println("terrianType: "+terrianType);
	}
}
public class Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter (1): Maruti brand...   (2):Thar brand:...");
		int tik = sc.nextInt();
		switch (tik) {
			case 1:
			System.out.println("Enter brand: ");
			String brand1 = sc.next();
			System.out.println("Enter year: ");
			int year1 = sc.nextInt();
			System.out.println("Enter color: ");
			String color1 = sc.next();
			System.out.println("Enter price: ");
			double price1 = sc.nextDouble();
			System.out.println("Enter isElectric: ");
			boolean isElectric1 = sc.nextBoolean();
			System.out.println("Enter Model: ");
			String model = sc.next();
			System.out.println("Enter seatingCapacity: ");
			int secp = sc.nextInt();
			Maruti m = new Maruti(brand1,year1,color1,price1,isElectric1,model,secp);
			m.dispMarutiDetails();
			break;

			case 2:
			System.out.println("Enter brand: ");
			String brand = sc.next();
			System.out.println("Enter year: ");
			int year = sc.nextInt();
			System.out.println("Enter color: ");
			String color = sc.next();
			System.out.println("Enter price: ");
			double price = sc.nextDouble();
			System.out.println("Enter isElectric: ");
			boolean isElectric = sc.nextBoolean();
			System.out.println("Enter isOffroad: ");
			boolean isOffroad = sc.nextBoolean();
			System.out.println("Enter terrianType: ");
			String terrian = sc.next();
			Thar t = new Thar(brand,year,color,price,isElectric,isOffroad,terrian);
			t.tharDetails();
			break;

			default:
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}
