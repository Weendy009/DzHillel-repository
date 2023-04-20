package Dz8.Task2;

public class RunningTrack implements Obstacle {
    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void defeated() {
        System.out.println("Running track defeated.");
    }

    @Override
    public void undefeated() {
        System.out.println("Running track undefeated.");
    }
}
