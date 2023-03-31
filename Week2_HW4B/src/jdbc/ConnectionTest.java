package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/Week2_HW4B";
        String user = "postgres";
        String password = "qzmp2795";
        String driver = "org.postgresql.Driver";
        Class.forName(driver).newInstance();

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection.getMetaData().getDatabaseProductName());

        connection.close();
    }
}
