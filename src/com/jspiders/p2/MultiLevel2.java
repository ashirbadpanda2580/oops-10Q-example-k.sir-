package com.jspiders.p2;

class Sport {
    private String name;
    private int numberOfPlayers;

    public Sport(String name, int numberOfPlayers) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    void dispSport() {
        System.out.println("Name of the sport is " + name);
        System.out.println("Number of players in the sport is " + numberOfPlayers);
    }
}

class TeamSport extends Sport {
    private int teamSize;
    private String coach;

    public TeamSport(String name, int numberOfPlayers, int teamSize, String coach) {
        super(name, numberOfPlayers);
        this.teamSize = teamSize;
        this.coach = coach;
    }

    void dispTeamSport() {
        System.out.println("Team size: " + teamSize);
        System.out.println("Coach : " + coach);
    }
}

class Soccer extends TeamSport {
    private String league;
    private String fieldSize;

    public Soccer(String name, int numberOfPlayers, int teamSize, String coach, String league, String fieldSize) {
        super(name, numberOfPlayers, teamSize, coach);
        this.league = league;
        this.fieldSize = fieldSize;
    }

    void dispSoccer() {
        System.out.println("league: " + league);
        System.out.println("fieldSize: " + fieldSize);

    }
}

public class MultiLevel2 {
    public static void main(String[] args) {
        Sport sport = new Sport("General Sport", 10);
        sport.dispSport();
        System.out.println("----------------------------------------------------------------------------------");
        TeamSport teamSport = new TeamSport("Basketball", 10, 5, "Coach John");
        teamSport.dispSport();
        teamSport.dispTeamSport();
        System.out.println("-----------------------------------------------------------------------------------");
        Soccer soccer = new Soccer("Soccer", 22, 11, "Coach Alex", "Premier League", "Standard");
        soccer.dispSport();
        soccer.dispSport();
        soccer.dispSoccer();

    }
}
