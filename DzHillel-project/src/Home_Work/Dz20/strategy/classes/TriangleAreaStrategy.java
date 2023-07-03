package Home_Work.Dz20.strategy.classes;

public class TriangleAreaStrategy implements ShapeAreaStrategy {
    private final double base;
    private final double height;

    public TriangleAreaStrategy(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
