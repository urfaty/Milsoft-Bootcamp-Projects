import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        // 5432
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "qzmp2795";
        String driver = "org.postgresql.Driver";
        Class.forName(driver).newInstance();


        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println(connection.getMetaData().getDatabaseProductName());
        connection.close();








    }
}