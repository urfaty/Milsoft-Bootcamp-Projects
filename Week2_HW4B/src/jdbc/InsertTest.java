package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/Week2_HW4B";
        String username = "postgres";
        String password = "qzmp2795";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            ProductManager productManager = new ProductManager(conn);

            // create a new product
            Product product = new Product();
            product.setProductName("Bilgisayar");
            product.setSalesPrice(19.99);

            // insert the product into the database
            boolean success = productManager.insert(product);

            if (success) {
                System.out.println("Product inserted successfully!");
            } else {
                System.out.println("Failed to insert product.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

