package Home_Work.Dz11.Task2;

import Home_Work.Dz11.Task2.fruit.Apple;
import Home_Work.Dz11.Task2.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Box<Apple> boxAppleOne = new Box<>();
        boxAppleOne.add(new Apple("doktor apple"));
        boxAppleOne.addAll(new Apple("tayler apple"),
                new Apple("anton apple"));

//        Box<Apple> boxAppleTwo = new Box<>();
//        boxAppleTwo.add(new Apple("donald apple"));

        Box<Orange> boxOrange = new Box<>();
        boxOrange.add(new Orange("donald orange"));

        boxAppleOne.merge(boxOrange);

        System.out.println(boxAppleOne.compare(boxOrange));
        System.out.println(boxAppleOne);
    }
}
