package com.jspiders.p1;

import java.util.Scanner;

class pson {
    private String name;
    private int age;
    private String address;

    public pson(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void personDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Teacher extends pson {
    private String subject;
    private int yearsOfExperience;
    private double salary;

    public Teacher(String name, int age, String address, String subject, int yearsOfExperience, double salary) {
        super(name, age, address);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    void teacherDetails() {
        System.out.println("Subject: " + subject);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Salary: " + salary);
    }
}

class MathTeacher extends Teacher {
    private String mathSpecialty;
    private boolean mathClubAdvisor;
    private int tutoringHours;

    public MathTeacher(String name, int age, String address, String subject, int yearsOfExperience, double salary, String mathSpecialty, boolean mathClubAdvisor, int tutoringHours) {
        super(name, age, address, subject, yearsOfExperience, salary);
        this.mathSpecialty = mathSpecialty;
        this.mathClubAdvisor = mathClubAdvisor;
        this.tutoringHours = tutoringHours;
    }

    void mathTeacherDetails() {
        System.out.println("Math Specialty: " + mathSpecialty);
        System.out.println("Math Club Advisor: " + (mathClubAdvisor ? "Yes" : "No"));
        System.out.println("Tutoring Hours: " + tutoringHours);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter person name: ");
                String name = sc.next();
                System.out.println("Enter person age: ");
                int age = sc.nextInt();
                System.out.println("Enter person address: ");
                String address = sc.next();
                pson p = new pson(name, age, address);
                p.personDetails();
                break;
            case 2:
                System.out.println("Enter teacher name: ");
                name = sc.next();
                System.out.println("Enter teacher age: ");
                age = sc.nextInt();
                System.out.println("Enter teacher address: ");
                address = sc.next();
                System.out.println("Enter subject: ");
                String subject = sc.next();
                System.out.println("Enter years of experience: ");
                int yearsOfExperience = sc.nextInt();
                System.out.println("Enter salary: ");
                double salary = sc.nextDouble();
                Teacher t1 = new Teacher(name, age, address, subject, yearsOfExperience, salary);
                t1.personDetails();
                t1.teacherDetails();
                break;
            case 3:
                System.out.println("Enter math teacher name: ");
                name = sc.next();
                System.out.println("Enter math teacher age: ");
                age = sc.nextInt();
                System.out.println("Enter math teacher address: ");
                address = sc.next();
                System.out.println("Enter subject: ");
                subject = sc.next();
                System.out.println("Enter years of experience: ");
                yearsOfExperience = sc.nextInt();
                System.out.println("Enter salary: ");
                salary = sc.nextDouble();
                System.out.println("Enter math specialty: ");
                String mathSpecialty = sc.next();
                System.out.println("Is math club advisor? (true/false): ");
                boolean mathClubAdvisor = sc.nextBoolean();
                System.out.println("Enter tutoring hours: ");
                int tutoringHours = sc.nextInt();
                MathTeacher mt = new MathTeacher(name, age, address, subject, yearsOfExperience, salary, mathSpecialty, mathClubAdvisor, tutoringHours);
                mt.personDetails();
                mt.teacherDetails();
                mt.mathTeacherDetails();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}
