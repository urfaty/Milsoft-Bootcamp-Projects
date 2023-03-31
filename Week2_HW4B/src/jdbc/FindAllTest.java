package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class FindAllTest {
    public static void main(String[] args) {
        // JDBC driver and database URL
        String JDBC_DRIVER = "org.postgresql.Driver";
        String DB_URL = "jdbc:postgresql://localhost:5432/Week2_HW4B";

        // Database credentials
        String USER = "postgres";
        String PASS = "qzmp2795";

        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            // Create a ProductManager object
            ProductManager productManager = new ProductManager(conn);

            // Call the findAll() method to retrieve all products from the database
            List<Product> productList = productManager.findAll();

            // Print out the retrieved products
            for (Product product : productList) {
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Product name: " + product.getProductName());
                System.out.println("Product price: " + product.getSalesPrice());
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

