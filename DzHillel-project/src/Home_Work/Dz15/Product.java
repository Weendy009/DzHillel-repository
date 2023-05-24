package Home_Work.Dz15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Product {
    private int id;
    private String type;
    private int price;
    private int discount;

    private LocalDateTime dateOfManufacture;

    public Product(String type, int price, int discount) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.dateOfManufacture = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", discount='" + discount + '\'' +
                '}' + "\n";
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public LocalDateTime getDateOfManufacture() {
        return dateOfManufacture;
    }

    public int getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setDateOfManufacture(LocalDateTime dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setId(int id) {
        this.id = id;
    }

}
