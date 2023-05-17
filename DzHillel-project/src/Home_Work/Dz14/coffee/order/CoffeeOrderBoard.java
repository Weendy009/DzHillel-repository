package Home_Work.Dz14.coffee.order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private int counter;

    private Comparator<Order> idComparator =
            Comparator.comparingInt(Order::getNumberOrder);

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
    }

    public void add(Order order) {
        counter = orders.size() + 1;
        order.setNumberOrder(counter);
        orders.add(order);
    }

    public void deliver() {
        Order smallestOrder = orders.get(0);

        for (int i = 1; i < orders.size(); i++) {
            Order currentOrder = orders.get(i);

            if (currentOrder.getNumberOrder() < smallestOrder.getNumberOrder()) {
                smallestOrder = currentOrder;
            }
        }

        orders.remove(smallestOrder);
    }

    public void deliver(int numberOrder) {
        orders.removeIf(
                order -> order.getNumberOrder() == numberOrder
        );
    }

    public void draw() {
        orders.sort(idComparator);
        for (Order order : orders) {
            System.out.println(order.getNumberOrder() + " | " + order.getName());
        }
    }

    @Override
    public String toString() {
        return "CoffeeOrderBoard{" +
                "orders=" + orders +
                '}' + "\n";
    }
}
