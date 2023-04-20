package Dz8.Task2;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public void defeated() {
        System.out.println("Wall defeated.");
    }
    @Override
    public void undefeated() {
        System.out.println("Wall undefeated.");
    }
}
