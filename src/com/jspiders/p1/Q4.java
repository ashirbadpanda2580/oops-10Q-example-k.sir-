package com.jspiders.p1;

import java.util.Scanner;

class Employee1 {
    private String name;
    private int id;
    private String department;
    private double salary;

    public Employee1(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    void empdetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee1 {
    private int teamSize;
    private double budget;
    private String project;

    public Manager(String name, int id, String department, double salary, int teamSize, double budget, String project) {
        super(name, id, department, salary);
        this.teamSize = teamSize;
        this.budget = budget;
        this.project = project;
    }

    void managerDetails() {
        System.out.println("Team Size: " + teamSize);
        System.out.println("Budget: " + budget);
        System.out.println("Project: " + project);
    }
}

class Director extends Manager {
    private String region;
    private int numOfManagers;
    private double companyShares;

    public Director(String name, int id, String department, double salary, int teamSize, double budget, String project, String region, int numOfManagers, double companyShares) {
        super(name, id, department, salary, teamSize, budget, project);
        this.region = region;
        this.numOfManagers = numOfManagers;
        this.companyShares = companyShares;
    }

    void directorDetails() {
        System.out.println("Region: " + region);
        System.out.println("Num of Managers: " + numOfManagers);
        System.out.println("Company Shares: " + companyShares);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        switch (mark) {
            case 1:
                System.out.println("Enter employee name: ");
                String name = sc.next();
                System.out.println("Enter employee id: ");
                int id = sc.nextInt();
                System.out.println("Enter employee department: ");
                String department = sc.next();
                System.out.println("Enter employee salary: ");
                double salary = sc.nextDouble();
                Employee1 ee = new Employee1(name, id, department, salary);
                ee.empdetails();
                break;
            case 2:
                System.out.println("Enter manager name: ");
                name = sc.next();
                System.out.println("Enter manager id: ");
                id = sc.nextInt();
                System.out.println("Enter manager department: ");
                department = sc.next();
                System.out.println("Enter manager salary: ");
                salary = sc.nextDouble();
                System.out.println("Enter team size: ");
                int teamSize = sc.nextInt();
                System.out.println("Enter budget: ");
                double budget = sc.nextDouble();
                System.out.println("Enter project: ");
                String project = sc.next();
                Manager manager = new Manager(name, id, department, salary, teamSize, budget, project);
                manager.empdetails();
                manager.managerDetails();
                break;
            case 3:
                System.out.println("Enter director name: ");
                name = sc.next();
                System.out.println("Enter director id: ");
                id = sc.nextInt();
                System.out.println("Enter director department: ");
                department = sc.next();
                System.out.println("Enter director salary: ");
                salary = sc.nextDouble();
                System.out.println("Enter team size: ");
                teamSize = sc.nextInt();
                System.out.println("Enter budget: ");
                budget = sc.nextDouble();
                System.out.println("Enter project: ");
                project = sc.next();
                System.out.println("Enter region: ");
                String region = sc.next();
                System.out.println("Enter number of managers: ");
                int numOfManagers = sc.nextInt();
                System.out.println("Enter company shares: ");
                double companyShares = sc.nextDouble();
                Director director = new Director(name, id, department, salary, teamSize, budget, project, region, numOfManagers, companyShares);
                director.empdetails();
                director.managerDetails();
                director.directorDetails();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}
