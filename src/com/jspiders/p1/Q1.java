package com.jspiders.p1;
import java.util.Scanner;

class Person {
    public String name;
    public String gender;
    public int age;

    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void personDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    public int roll;
    public double marks;
    public String collegeName;

    public Student(String name, String gender, int age, int roll, double marks, String collegeName) {
        super(name, gender, age);
        this.roll = roll;
        this.marks = marks;
        this.collegeName = collegeName;
    }

    void studentDetails() {
        personDetails();
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("College Name: " + collegeName);
    }
}

class Employee extends Person {
    public int empId;
    public double salary;
    public String compName;

    public Employee(String name, String gender, int age, int empId, double salary, String compName) {
        super(name, gender, age);
        this.empId = empId;
        this.salary = salary;
        this.compName = compName;
    }

    void employeeDetails() {
        personDetails();
        System.out.println("Emp ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + compName);
    }
}

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: 1 for Person, 2 for Student, 3 for Employee");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter Person name: ");
                String name = sc.next();
                System.out.println("Enter gender: ");
                String g = sc.next();
                System.out.println("Enter age: ");
                int age = sc.nextInt();
                Person p1 = new Person(name, g, age);
                p1.personDetails();
                break;
            case 2:
                System.out.println("Enter Person name: ");
                String name1 = sc.next();
                System.out.println("Enter gender: ");
                String g1 = sc.next();
                System.out.println("Enter age: ");
                int age1 = sc.nextInt();
                System.out.println("Enter Student roll: ");
                int roll = sc.nextInt();
                System.out.println("Enter marks: ");
                double marks = sc.nextDouble();
                System.out.println("Enter college name: ");
                String clgName = sc.next();

                Student s1 = new Student(name1, g1, age1, roll, marks, clgName);
                s1.studentDetails();
                break;
            case 3:
                System.out.println("Enter Person name: ");
                String name2 = sc.next();
                System.out.println("Enter gender: ");
                String g2 = sc.next();
                System.out.println("Enter age: ");
                int age2 = sc.nextInt();
                System.out.println("Enter Employee ID: ");
                int empId = sc.nextInt();
                System.out.println("Enter salary: ");
                double salary = sc.nextDouble();
                System.out.println("Enter company name: ");
                String compName = sc.next();

                Employee e1 = new Employee(name2, g2, age2, empId, salary, compName);
                e1.employeeDetails();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}

