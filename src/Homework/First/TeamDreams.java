package Homework.First;

import java.util.Arrays;

public class TeamDreams {
    private String name ;
    private TeamMembers members[];


    public TeamDreams(String name, TeamMembers members[]) {
        this.name = name;
        this.members = members;

    }

    public String getName(){
        return "Team name: " + name;
    }

    public TeamMembers[] getTeamMembers() {
        return members;
    }

    public void showResults(){
        for(TeamMembers c: members){
            c.showResult();
        }
    }
    public void showMembersFinishedCourse(){
                for(TeamMembers c: members){
            if(c.isOnDistance())
                c.showResult();
        }
    }


}
