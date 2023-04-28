package Home_Work.Dz8.Task0;

public class Main {
    public static void main(String[] args) {
        Geometry[] arr = {
                new Circle(15),
                new Square(25),
                new Triangle(15,20,25)
        };
        System.out.println(getSumArea(arr));
    }

    public static int getSumArea(Geometry[] array) {
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            result += array[i].getFigureArea();
        }
        return result;
    }
}
