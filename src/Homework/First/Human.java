package Homework.First;

public class Human implements TeamMembers {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Human(String name, int maxSwimDistance, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(name + " " + " успешно справился с кросс");
        } else {
            System.out.println(name + " " + " не смог преодолеть кросс");
            onDistance = false;
        }
    }
    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(name + " " + " успешно справился с препятствием");
        } else {
            System.out.println(name + " " + " не смог преодолеть препятствие");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (distance <=maxSwimDistance){
            System.out.println(name + " " + " успешно проплыл дистанцию");
        } else {
            System.out.println(name + " " + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }

}


