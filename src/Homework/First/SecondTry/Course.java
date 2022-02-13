package Homework.First.SecondTry;

import org.jetbrains.annotations.NotNull;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt (@NotNull Team team) {

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
