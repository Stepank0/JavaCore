package Homework.First;

public class MainClass {

    public static void main(String[] args) {

        TeamMembers[] members = { new Human("Вася", 10,400,12),
                new Human("Паша", 100, 500, 10),
                new Human("Оля", 200, 100, 6),
                new Human("Олег", 9, 900,400)};
        Obstacle[] obstacles = {new Cross(400), new Wall(5), new Water(10)};
        TeamDreams teamDreams = new TeamDreams("winners", members);
        System.out.println("-------created new team--------");
        System.out.println(teamDreams.getName());
        System.out.println("-------greeting team members--------");
        teamDreams.showResults();

        Course course = new Course(obstacles);
        System.out.println("============team goes to course============");
        course.doIt(teamDreams);

        System.out.println("============show team Results============");
        teamDreams.showResults();

        System.out.println("============team members finished course============");
        teamDreams.showMembersFinishedCourse();


    }
}
