package Homework.First;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(TeamMembers members) {
        members.run(distance);
    }
}