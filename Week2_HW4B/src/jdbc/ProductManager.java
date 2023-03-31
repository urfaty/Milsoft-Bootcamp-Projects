package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private final Connection conn;

    public ProductManager(Connection conn) {
        this.conn = conn;
    }

    public boolean insert(Product product) {
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO products (name, price) VALUES (?, ?)");
            stmt.setString(1, product.getProductName());
            stmt.setDouble(2, product.getSalesPrice());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean update(Product product) {
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE products SET name=?, price=? WHERE productid=?");
            stmt.setString(1, product.getProductName());
            stmt.setDouble(2, product.getSalesPrice());
            stmt.setLong(3, product.getProductId());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean delete(long productId) {
        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM products WHERE productid=?");
            stmt.setLong(1, productId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Product find(long productId) {
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM products WHERE productid=?");
            stmt.setLong(1, productId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getLong("productid"));
                product.setProductName(rs.getString("name"));
                product.setSalesPrice(rs.getDouble("price"));
                return product;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Product> findAll() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM products");
            List<Product> productList = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getLong("productid"));
                product.setProductName(rs.getString("name"));
                product.setSalesPrice(rs.getDouble("price"));
                productList.add(product);
            }
            return productList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
