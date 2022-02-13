package Homework.First.SecondTry;

import java.awt.event.WindowFocusListener;

public class Main {

    public static void main(String[] args) {

        Athlete[] team1 = {new Athlete("Alex", 100, 20), new Athlete("Helen", 200, 40)};
        Obstacle[] obstacles = {new Wall(21), new RunningTrack(100)};

        Team teamFirst = new Team("as", team1);

        System.out.println(team1);

        Course course = new Course(obstacles);

        course.doIt(teamFirst);






    }
}
