package Home_Work.Dz15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Product> products = new ArrayList<>();
        addProducts(products);

        System.out.println(Product.getProductBooksDiscount(products));
        System.out.println("=".repeat(15));
        System.out.println(Product.getMinPriceProduct(products));
        System.out.println("=".repeat(15));
        System.out.println(Product.getProductBooks(products));
        System.out.println("=".repeat(15));
        System.out.println(Product.getLatestProducts(products));
        System.out.println("=".repeat(15));
        System.out.println(Product.calculateTotalCost(products));
        System.out.println("=".repeat(15));
        Map<String, List<Product>> result = Product.groupProductsByType(products);
        System.out.println(result.get("Book"));
        System.out.println("=".repeat(15));
        System.out.println(result.get("Mango"));
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
