package Home_Work.Dz8.Task0;

public class Circle implements Geometry {
    private final double RADIUS;

    public Circle(double radius) {
        this.RADIUS = radius;
    }

    @Override
    public double getFigureArea() {
        return Math.PI * (RADIUS * RADIUS);
    }
}
