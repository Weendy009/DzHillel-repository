package Home_Work.Dz11.Task2;

import Home_Work.Dz11.Task2.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> fruits;
    private double weight = 0;

    public Boolean add(T fruit) {
        if (fruits == null) {
            fruits = new ArrayList<>();
        }
        weight += ((Fruit) fruit).getWeight();
        fruits.add(fruit);
        return null;
    }

    @SafeVarargs
    public final void addAll(T... elements) {
        for (T element : elements) {
            this.add(element);
        }
    }

    public boolean compare(Box<T> otherBox) {
        return getWeight() == otherBox.getWeight();
    }

    public void merge(Box<? extends Fruit> anotherBox) {
        for (Fruit fruit : anotherBox.fruits) {
            this.add((T) fruit);
        }
    }


    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}' + "\n";
    }

    public double getWeight() {
        return weight;
    }

}
