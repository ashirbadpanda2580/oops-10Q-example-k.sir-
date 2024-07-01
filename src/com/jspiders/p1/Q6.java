package com.jspiders.p1;

import java.util.Scanner;

class Art {
    private String title;
    private String artist;
    private int yearCreated;

    public Art(String title, String artist, int yearCreated) {
        this.title = title;
        this.artist = artist;
        this.yearCreated = yearCreated;
    }

    void artDetails() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Year Created: " + yearCreated);
    }
}

class Painting extends Art {
    private String medium;
    private String dimensions;
    private String style;

    public Painting(String title, String artist, int yearCreated, String medium, String dimensions, String style) {
        super(title, artist, yearCreated);
        this.medium = medium;
        this.dimensions = dimensions;
        this.style = style;
    }

    void paintingDetails() {
        System.out.println("Medium: " + medium);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Style: " + style);
    }
}

class Portrait extends Painting {
    private String subjectName;
    private String pose;
    private String backgroundDetails;

    public Portrait(String title, String artist, int yearCreated, String medium, String dimensions, String style, String subjectName, String pose, String backgroundDetails) {
        super(title, artist, yearCreated, medium, dimensions, style);
        this.subjectName = subjectName;
        this.pose = pose;
        this.backgroundDetails = backgroundDetails;
    }

    void portraitDetails() {
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Pose: " + pose);
        System.out.println("Background Details: " + backgroundDetails);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Option 1.for Art 2.for Painting 3.for Portrait");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter art title: ");
                String title = sc.next();
                System.out.println("Enter artist: ");
                String artist = sc.next();
                System.out.println("Enter year created: ");
                int yearCreated = sc.nextInt();
                Art a1 = new Art(title, artist, yearCreated);
                a1.artDetails();
                break;
            case 2:
                System.out.println("Enter painting title: ");
                title = sc.next();
                System.out.println("Enter artist: ");
                artist = sc.next();
                System.out.println("Enter year created: ");
                yearCreated = sc.nextInt();
                System.out.println("Enter medium: ");
                String medium = sc.next();
                System.out.println("Enter dimensions: ");
                String dimensions = sc.next();
                System.out.println("Enter style: ");
                String style = sc.next();
                Painting pa1 = new Painting(title, artist, yearCreated, medium, dimensions, style);
                pa1.artDetails();
                pa1.paintingDetails();
                break;
            case 3:
                System.out.println("Enter portrait title: ");
                title = sc.next();
                System.out.println("Enter artist: ");
                artist = sc.next();
                System.out.println("Enter year created: ");
                yearCreated = sc.nextInt();
                System.out.println("Enter medium: ");
                medium = sc.next();
                System.out.println("Enter dimensions: ");
                dimensions = sc.next();
                System.out.println("Enter style: ");
                style = sc.next();
                System.out.println("Enter subject name: ");
                String subjectName = sc.next();
                System.out.println("Enter pose: ");
                String pose = sc.next();
                System.out.println("Enter background details: ");
                String backgroundDetails = sc.next();
                Portrait p1 = new Portrait(title, artist, yearCreated, medium, dimensions, style, subjectName, pose, backgroundDetails);
                p1.artDetails();
                p1.paintingDetails();
                p1.portraitDetails();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}
