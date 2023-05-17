package Home_Work.Dz14.coffee.order;

public class Order {
    private int numberOrder;
    private final String name;

    public Order(String name) {
        this.name = name;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public String getName() {
        return name;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    @Override
    public String toString() {
        return "Order name: " + getName()
                + ", id: " + getNumberOrder() + "\n";
    }
}
