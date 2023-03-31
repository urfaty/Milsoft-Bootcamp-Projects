package HW3B;

import HW3A.Product;

public class ProductFormat {
    public static void main(String[] args) {
        // Product sınıfından bir örnek oluşturun
        Product product = new Product(1, "Laptop", 2500.0);

        // printf() metodu kullanarak Product nesnesini konsola basın
        System.out.printf("Product ID: %d, Product Name: %s, Sales Price: %.2f",
                product.getProductId(), product.getProductName(), product.getSalesPrice());
    }
}
