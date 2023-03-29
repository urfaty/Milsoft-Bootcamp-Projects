package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriterTest {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "qzmp2795";
        String driver = "org.postgresql.Driver";
        Class.forName(driver).newInstance();

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "insert into \"Product\" (\"productName\", \"salesPrice\") values (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "Cep Telefonu");
        statement.setDouble(2, 1560);
        int affected = statement.executeUpdate();

        connection.close();



    }
}
