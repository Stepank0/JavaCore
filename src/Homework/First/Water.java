package Homework.First;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(TeamMembers members) {
        members.swim(distance);
    }
}