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

    public static List<Product> getProductBooks(List<Product> products) {
        List<Product> result = products.stream()
                .filter(element -> element.getType().equals("Book")
                        && element.getPrice() > 250)
                .toList();
        return result;
    }

    public static List<Product> getProductBooksDiscount(List<Product> products) {
        List<Product> result = products.stream()
                .filter(element -> element.getType().equals("Book")
                        && element.getDiscount() == 10)
                .peek(element -> element.setDiscount(
                        interestCalculator(element.getDiscount()
                        )
                )).toList();
        return result;
    }

    public static Product getMinPriceProduct(List<Product> products) throws Exception {
        Product product;
        Optional<Product> result = products.stream()
                .min(Comparator.comparingInt(Product::getPrice));

        if (result.isPresent()) {
            product = result.get();
        } else {
            throw new Exception("Product not found");
        }

        return product;
    }

    public static List<Product> getLatestProducts(List<Product> productList) {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getDateOfManufacture).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static double calculateTotalCost(List<Product> productList) {
        double sumPrices = productList.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();

        return sumPrices;
    }

    public static Map<String, List<Product>> groupProductsByType(List<Product> productList) {
        return productList.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    private static int interestCalculator(int fullPrice) {
        return fullPrice - (fullPrice / 10);
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
