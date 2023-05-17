package Home_Work.Dz14;

import Home_Work.Dz14.coffee.order.CoffeeOrderBoard;
import Home_Work.Dz14.coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        addOrders(coffeeOrderBoard);

        coffeeOrderBoard.draw();
        System.out.println("=".repeat(15));
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();

        System.out.println("=".repeat(15));
        coffeeOrderBoard.deliver(5);
        coffeeOrderBoard.draw();

    }

    private static void addOrders(CoffeeOrderBoard coffeeOrderBoard) {
        coffeeOrderBoard.add(new Order("Latte"));
        coffeeOrderBoard.add(new Order("Espresso"));
        coffeeOrderBoard.add(new Order("Cappuccino"));
        coffeeOrderBoard.add(new Order("Mocha"));
        coffeeOrderBoard.add(new Order("Americano"));
    }

}
