package Homework.First.SecondTry;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void test(Athlete team) {
        team.jump(height);
    }
}
