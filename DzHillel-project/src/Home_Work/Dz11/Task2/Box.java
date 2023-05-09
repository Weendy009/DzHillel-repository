package Home_Work.Dz11.Task2;

import Home_Work.Dz11.Task2.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> fruits;
    private Class<?> fruitType;
    private double weight = 0;

    public void add(T fruit) {
        if (fruits == null) {
            fruits = new ArrayList<>();
            fruitType = fruit.getClass();
        } else if (!fruit.getClass().equals(fruitType)) {
            throw new IllegalArgumentException("Cannot add fruit of different type to the box");
        }
        weight += ((Fruit) fruit).getWeight();
        fruits.add(fruit);
    }

    @SafeVarargs
    public final void addAll(T... elements) {
        for (T element : elements) {
            this.add(element);
        }
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
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

    public Class<?> getFruitType() {
        return fruitType;
    }

}
