package com.jspiders.p1;

class Engineer {
    private String name;
    private int age;
    private String specialization;

    public Engineer(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    void detailEngineer() {
    	System.out.println("Name: "+name);
    	System.out.println("Age: "+age);
    	System.out.println("Specialization: "+specialization);
    }
}

class AerospaceEngineer extends Engineer {
    private String aircraftDesign;
    private String propulsionSystems;

    public AerospaceEngineer(String name, int age, String specialization, String aircraftDesign, String propulsionSystems) {
        super(name, age, specialization);
        this.aircraftDesign = aircraftDesign;
        this.propulsionSystems = propulsionSystems;
    }

    void detailsAerospaceEngineer() {
    	detailEngineer();
    	System.out.println("AircraftDesign: "+aircraftDesign);
    	System.out.println("PropulsionSystems: "+propulsionSystems);
    }
}

public class Q10 {
	public static void main(String[] args) {
//		Engineer genericEngineer = new Engineer("John Doe", 30, "Mechanical");
//        genericEngineer.detailEngineer();
        
        AerospaceEngineer aerospaceEngineer = new AerospaceEngineer("Jane Smith", 35, "Aerospace", "Advanced Fighter Jet", "Turbofan Engines");
        aerospaceEngineer.detailsAerospaceEngineer();
	}
}
