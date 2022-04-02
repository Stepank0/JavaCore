package Homework.First.SecondTry;


public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt (Team team) {

        Athlete[] athletes = team.getTeam();
        for ( Athlete human: team.getTeam() ) {
            for (Obstacle obstacle: obstacles) {
                obstacle.test(human);
                if (!human.isOnDistance())
                    break;
            }


        }

    }
}
