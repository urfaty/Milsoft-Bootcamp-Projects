package entity;

public class ProductTest1 {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductId(301);
        product.setProductName("Cep Telefonu");
        product.setSalesPrice(3450.0);

        System.out.println(product.getProductId() + " "
        + product.getProductName() + " "
        + product.getSalesPrice());

    }
}
