package com.jspiders.p1;
import java.util.Scanner;
class Person4 {
    private String name;
    private int age;
    private String address;

    public Person4(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Student3 extends Person4 {
    private String studentId;
    private String gradeLevel;

    public Student3(String name, int age, String address, String studentId, String gradeLevel) {
        super(name, age, address);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
    }

    void study() {
        System.out.println("StudentId: "+studentId);
        System.out.println("grade level: "+gradeLevel);
    }
}

class GraduateStudent extends Student3 {
    private String thesisTopic;
    private String advisor;

    public GraduateStudent(String name, int age, String address, String studentId, String gradeLevel, String thesisTopic, String advisor) {
        super(name, age, address, studentId, gradeLevel);
        this.thesisTopic = thesisTopic;
        this.advisor = advisor;
    }

    void research() {
        System.out.println("Thesis topic : " + thesisTopic);
        System.out.println("Advisor: "+advisor);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of student (1 - Person, 2 - Student, 3 - Graduate Student): ");
        int choice = sc.nextInt();

        switch (choice) {
        
        	case 1:
        		System.out.println("Enter student name: ");
                String name1 = sc.next();
                System.out.println("Enter student age: ");
                int age1 = sc.nextInt();
                System.out.println("Enter student address: ");
                String address1 = sc.next();
                Person4 person = new Person4(name1, age1, address1);
                person.introduce();
        		
            case 2:
                System.out.println("Enter student name: ");
                String name = sc.next();
                System.out.println("Enter student age: ");
                int age = sc.nextInt();
                System.out.println("Enter student address: ");
                String address = sc.next();
                System.out.println("Enter student ID: ");
                String studentId = sc.next();
                System.out.println("Enter student grade level: ");
                String gradeLevel = sc.next();
                Student3 student = new Student3(name, age, address, studentId, gradeLevel);
                student.introduce();
                student.study();
                break;

            case 3:
                System.out.println("Enter graduate student name: ");
                name = sc.next();
                System.out.println("Enter graduate student age: ");
                age = sc.nextInt();
                System.out.println("Enter graduate student address: ");
                address = sc.next();
                System.out.println("Enter graduate student ID: ");
                studentId = sc.next();
                System.out.println("Enter graduate student grade level: ");
                gradeLevel = sc.next();
                System.out.println("Enter thesis topic: ");
                String thesisTopic = sc.next();
                System.out.println("Enter advisor name: ");
                String advisor = sc.next();

                GraduateStudent gradStudent = new GraduateStudent(name, age, address, studentId, gradeLevel, thesisTopic, advisor);
                gradStudent.introduce();
                gradStudent.study();
                gradStudent.research();
                break;

            default:
                System.out.println("Invalid input");
                break;
        }

        sc.close();
    }
}

