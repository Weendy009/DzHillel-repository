package Home_Work.Dz11.Task2;

import Home_Work.Dz11.Task2.fruit.Apple;

public class Main {
    public static void main(String[] args) {
        Box<Apple> boxAppleOne = new Box<>();
        boxAppleOne.add(new Apple("doktor apple"));
        boxAppleOne.addAll(new Apple("tayler apple"),
                new Apple("anton apple"));

        Box<Apple> boxAppleTwo = new Box<>();
        boxAppleTwo.add(new Apple("donald apple"));

        boxAppleOne.merge(boxAppleTwo);

        System.out.println(boxAppleOne.compare(boxAppleTwo));
        System.out.println(boxAppleOne);
    }
}
