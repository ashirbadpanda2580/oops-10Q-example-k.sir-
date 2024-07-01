package com.jspiders.p2;

class Academic {
    private String name;
    private int id;
    private String fieldOfStudy;

    public Academic(String name, int id, String fieldOfStudy) {
        this.name = name;
        this.id = id;
        this.fieldOfStudy = fieldOfStudy;
    }

    void academicDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Field of Study: " + fieldOfStudy);
    }
}

class Professor extends Academic {
    private String rank;
    private String coursesTaught;

    public Professor(String name, int id, String fieldOfStudy, String rank, String coursesTaught) {
        super(name, id, fieldOfStudy);
        this.rank = rank;
        this.coursesTaught = coursesTaught;
    }

    void professorDetails() {
        super.academicDetails();
        System.out.println("Rank: " + rank);
        System.out.println("Courses Taught: " + coursesTaught);
    }
}

class Researcher extends Academic {
    private String project;
    private double grant;

    public Researcher(String name, int id, String fieldOfStudy, String project, double grant) {
        super(name, id, fieldOfStudy);
        this.project = project;
        this.grant = grant;
    }
    
    void researcherDetails() {
        super.academicDetails();
        System.out.println("Project: " + project);
        System.out.println("Grant: " + grant);
    }
}

public class Hierarchy2 {
	public static void main(String[] args) {
		Academic academic = new Academic("Dr. Smith", 101, "Physics");
		academic.academicDetails();

        System.out.println("========================================================");

        Professor professor = new Professor("Dr. Johnson", 102, "Chemistry", "Associate Professor", "Organic Chemistry");
        professor.professorDetails();

        System.out.println("===========================================================");
        Researcher researcher = new Researcher("Dr. Clark", 103, "Biology", "Genetic Research", 50000.0);
        researcher.researcherDetails();

        System.out.println("============================================================");
	}
}
