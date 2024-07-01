package com.jspiders.p1;
import java.util.Scanner;
class TeamMember {
    private String name;
    private int age;
    private String position;

    public TeamMember(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    void play() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}
class Coach extends TeamMember {
    private int experience;
    private String strategy;

    public Coach(String name, int age, String position, int experience, String strategy) {
        super(name, age, position);
        this.experience = experience;
        this.strategy = strategy;
    }

    void train() {
        System.out.println("Experience: " + experience + " years");
        System.out.println("Strategy: " + strategy);
    }
}
class HeadCoach extends Coach {
    private int championshipsWon;
    private String teamManagementSkills;

    public HeadCoach(String name, int age, String position, int experience, String strategy, int championshipsWon, String teamManagementSkills) {
        super(name, age, position, experience, strategy);
        this.championshipsWon = championshipsWon;
        this.teamManagementSkills = teamManagementSkills;
    }

    void manageTeam() {
        System.out.println("Championships Won: " + championshipsWon);
        System.out.println("Team Management Skills: " + teamManagementSkills);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1.for TeamMember 2.for Coach 3.for HeadCoach");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter team member name: ");
                String name = sc.next();
                System.out.println("Enter team member age: ");
                int age = sc.nextInt();
                System.out.println("Enter position: ");
                String position = sc.next();
                TeamMember member = new TeamMember(name, age, position);
                member.play();
                break;
            case 2:
                System.out.println("Enter coach name: ");
                name = sc.next();
                System.out.println("Enter coach age: ");
                age = sc.nextInt();
                System.out.println("Enter position: ");
                position = sc.next();
                System.out.println("Enter experience (in years): ");
                int experience = sc.nextInt();
                System.out.println("Enter strategy: ");
                String strategy = sc.next();
                Coach coach = new Coach(name, age, position, experience, strategy);
                coach.play();
                coach.train();
                break;
            case 3:
                System.out.println("Enter head coach name: ");
                name = sc.next();
                System.out.println("Enter head coach age: ");
                age = sc.nextInt();
                System.out.println("Enter position: ");
                position = sc.next();
                System.out.println("Enter experience (in years): ");
                experience = sc.nextInt();
                System.out.println("Enter strategy: ");
                strategy = sc.next();
                System.out.println("Enter championships won: ");
                int championshipsWon = sc.nextInt();
                System.out.println("Enter team management skills: ");
                String teamManagementSkills = sc.next();
                HeadCoach headCoach = new HeadCoach(name, age, position, experience, strategy, championshipsWon, teamManagementSkills);
                headCoach.play();
                headCoach.train();
                headCoach.manageTeam();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}

