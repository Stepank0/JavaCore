package Homework.First.SecondTry;

public class Team {
    String name;
    Athlete[] team;

    public Team(String name, Athlete[] team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public Athlete[] getTeam() {
        return team;
    }
}
