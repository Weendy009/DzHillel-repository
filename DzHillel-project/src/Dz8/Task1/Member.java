package Dz8.Task1;

import Dz8.Task2.Obstacle;

public abstract class Member {
    private int power;
    private final String name;

    public Member(int power, String name) {
        this.power = power;
        this.name = name;
    }

    public boolean overcome(Obstacle obstacle) {
        System.out.println("overcome.");
        return false;
    }

    public void run(int distance) {
        System.out.println("running.");
    }

    public void jump(int distance) {
        System.out.println("jumping.");
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
