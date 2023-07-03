package Home_Work.Dz20.builder.main;

import Home_Work.Dz20.builder.classes.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder("Honda", "Civic")
                .setYear(2022)
                .setColor("Red")
                .build();

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
    }
}
