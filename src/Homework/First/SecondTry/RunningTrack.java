package Homework.First.SecondTry;

public class RunningTrack implements Obstacle {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void test(Athlete team) {
        team.run(distance);

    }
}
