package com.jspiders.p2;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    void displayStudentDetails() {
        super.display();
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}


public class Single1 {
	public static void main(String[] args) {
        Student student = new Student("Alice", 20, "S12345", "Computer Science");
        student.displayStudentDetails();
	}
}


