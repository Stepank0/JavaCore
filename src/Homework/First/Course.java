package Homework.First;

public class Course {

    Obstacle[] obstacle;

    public Course (Obstacle[] obstacle){
        this.obstacle = obstacle;

    }

    public void doIt (TeamDreams teamDreams) {
        TeamMembers[] members = teamDreams.getTeamMembers();
        if (members.length > 0) {
            for (TeamMembers c: members) {
                for (Obstacle o: obstacle){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;

                }
            }
        }else {
            System.out.println("There are no members in the team!");
        }
    }
}
