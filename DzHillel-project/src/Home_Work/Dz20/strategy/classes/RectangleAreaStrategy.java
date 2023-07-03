package Home_Work.Dz20.strategy.classes;

public class RectangleAreaStrategy implements ShapeAreaStrategy {
    private final double width;
    private final double height;

    public RectangleAreaStrategy(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
