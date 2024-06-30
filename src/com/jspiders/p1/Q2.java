package com.jspiders.p1;
import java.util.Scanner;
class Animal{
	protected String name;
	public int age;
	
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
}

class Dog extends Animal{
	private String breed;
	
	public Dog(String name, int age, String breed) {
		super(name,age);
		this.breed = breed;
	}
	void dispDetails() {
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("breed: "+breed);
	}
	
}
public class Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter animal name: ");
		String aName = sc.next();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter breed: ");
		String breed = sc.next();
		Dog d = new Dog(aName,age,breed);
		d.dispDetails();
		sc.close();
	}
}
