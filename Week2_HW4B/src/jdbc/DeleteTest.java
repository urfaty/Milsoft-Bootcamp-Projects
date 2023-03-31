package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteTest {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/Week2_HW4B";
        String user = "postgres";
        String password = "qzmp2795";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            ProductManager manager = new ProductManager(conn);

            long productId = 1;
            boolean deleteResult = manager.delete(productId);
            if (deleteResult) {
                System.out.println("Deleted product with ID " + productId);
            } else {
                System.out.println("Failed to delete product with ID " + productId);
            }
        }
    }
}
