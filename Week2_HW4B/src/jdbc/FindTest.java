package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class FindTest {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/Week2_HW4B";
        String user = "postgres";
        String password = "qzmp2795";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            ProductManager manager = new ProductManager(conn);

            // Find a product by ID
            long productId = 1;
            Product product = manager.find(productId);
            if (product != null) {
                System.out.println("Found product with ID " + productId + ": " + product.getProductName() + " ($" + product.getSalesPrice() + ")");
            } else {
                System.out.println("Product with ID " + productId + " not found.");
            }

            // Find all products
            List<Product> products = manager.findAll();
            System.out.println("All products:");
            for (Product p : products) {
                System.out.println(p.getProductId() + "\t" + p.getProductName() + "\t$" + p.getSalesPrice());
            }
        }
    }
}
