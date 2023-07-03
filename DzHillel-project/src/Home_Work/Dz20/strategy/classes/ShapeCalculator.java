package Home_Work.Dz20.strategy.classes;

public class ShapeCalculator {
    private ShapeAreaStrategy areaStrategy;

    public void setAreaStrategy(ShapeAreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    public double calculateArea() {
        if (areaStrategy == null) {
            throw new IllegalStateException("Area strategy is not set.");
        }

        return areaStrategy.calculateArea();
    }
}
