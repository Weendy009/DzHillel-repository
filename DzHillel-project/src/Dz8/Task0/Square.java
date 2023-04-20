package Dz8.Task0;

public class Square implements Geometry {
    private final double SIDE;

    public Square(double side) {
        this.SIDE = side;
    }

    @Override
    public double getFigureArea() {
        return SIDE * SIDE;
    }
}
