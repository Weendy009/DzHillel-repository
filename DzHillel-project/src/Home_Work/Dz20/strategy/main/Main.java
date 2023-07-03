package Home_Work.Dz20.strategy.main;

import Home_Work.Dz20.strategy.classes.RectangleAreaStrategy;
import Home_Work.Dz20.strategy.classes.ShapeAreaStrategy;
import Home_Work.Dz20.strategy.classes.ShapeCalculator;
import Home_Work.Dz20.strategy.classes.TriangleAreaStrategy;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        ShapeAreaStrategy rectangleStrategy = new RectangleAreaStrategy(5.0, 10.0);
        calculator.setAreaStrategy(rectangleStrategy);
        double rectangleArea = calculator.calculateArea();
        System.out.println("Площадь прямоугольника: " + rectangleArea);

        ShapeAreaStrategy triangleStrategy = new TriangleAreaStrategy(4.0, 6.0);
        calculator.setAreaStrategy(triangleStrategy);
        double triangleArea = calculator.calculateArea();
        System.out.println("Площадь треугольника: " + triangleArea);
    }
}
