package entity;

public class Product {
    private long productId;
    private String productName;
    private double salesPrice;

    public Product() {

    }
    public Product(long productId, String productName, double salesPrice) {
        this.productId = productId;
        this.productName = productName;
        this.salesPrice = salesPrice;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesPrice() {
        return salesPrice;
    }
}
