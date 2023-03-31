package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateTest {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/Week2_HW4B";
        String username = "postgres";
        String password = "qzmp2795";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Create a ProductManager instance
            ProductManager productManager = new ProductManager(conn);

            // Create a new Product object with the updated data
            Product product = new Product();
            product.setProductId(1);
            product.setProductName("New Product Name");
            product.setSalesPrice(10.99);

            // Update the product in the database
            boolean success = productManager.update(product);

            // Check if the update was successful
            if (success) {
                System.out.println("Product updated successfully.");
            } else {
                System.out.println("Product update failed.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
