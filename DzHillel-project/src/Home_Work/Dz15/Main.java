package Home_Work.Dz15;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Product> products = new ArrayList<>();
        addProducts(products);

        System.out.println(getProductBooksDiscount(products));
        System.out.println("=".repeat(15));
        System.out.println(getMinPriceProduct(products));
        System.out.println("=".repeat(15));
        System.out.println(getProductBooks(products));
        System.out.println("=".repeat(15));
        System.out.println(getLatestProducts(products));
        System.out.println("=".repeat(15));
        System.out.println(calculateTotalCost(products));
        System.out.println("=".repeat(15));
        Map<String, List<Product>> result = groupProductsByType(products);
        System.out.println(result.get("Book"));
        System.out.println("=".repeat(15));
        System.out.println(result.get("Mango"));


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

    private static void addProducts(List<Product> products) {
        Collections.addAll(products,
                new Product("Mango", 140, 30),
                new Product("Banana", 230, 10),
                new Product("Plum", 40, 5),
                new Product("Book", 65, 35),
                new Product("Book", 34, 0),
                new Product("Book", 570, 10));
    }
}
