package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadTest {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "qzmp2795";
        String driver = "org.postgresql.Driver";
        Class.forName(driver).newInstance();

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from \"Product\"";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()) {
            long productId = resultSet.getLong("productId");
            String productName = resultSet.getString("productName");
            double salesPrice = resultSet.getDouble("salesPrice");
            System.out.println(productId + " " + productName + " " + salesPrice);
        }

        connection.close();
    }
}
