package Home_Work.Dz11.Task2.fruit;

public class Fruit {
    private final String name;
    private final double weight;

    public Fruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}' + "\n";
    }

    public double getWeight() {
        return weight;
    }
}
