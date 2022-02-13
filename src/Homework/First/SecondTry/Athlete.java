package Homework.First.SecondTry;

public class Athlete {
    private String name;
    private int maxRun;
    private int maxJump;
    boolean isOnDistance;

    public Athlete(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.isOnDistance = true;
        info();
    }

    public boolean isOnDistance() {
        return isOnDistance;
    }

    public String getName() {
        return name;
    }

    public void info () {
        System.out.println("In our team > " + name + " can jump a maximum of " + maxJump + " m. and run " + maxRun + " m.");
    }

    public void run (int distance) {
        if (distance <= maxRun) {
            System.out.println(name + " run success ");
        } else {
            System.out.println( name + " run false ");
            isOnDistance = false;
        }
    }

    public void jump (int height) {
        if (height <= maxJump) {
            System.out.println(name + " jump success ");
        } else {
            System.out.println( name + " jump false ");
            isOnDistance = false;
        }
    }
}
