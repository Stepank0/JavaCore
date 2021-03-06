package Homework.First;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(TeamMembers members) {
        members.jump(height);
    }
}