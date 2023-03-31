package HW3B;

import HW3A.Product;

import java.util.Scanner;

public class ProductScan {
    public static void main(String[] args) {
        // Product sınıfından bir örnek oluşturun
        Product product = new Product(1, "Laptop", 2500.0);

        // Scanner sınıfı ile konsoldan okuma yapın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product ID: ");
        long productId = scanner.nextLong();
        System.out.println("Enter Product Name: ");
        String productName = scanner.next();
        System.out.println("Enter Sales Price: ");
        double salesPrice = scanner.nextDouble();

        // Okunan verilerle yeni bir Product nesnesi oluşturun
        Product scannedProduct = new Product(productId, productName, salesPrice);
        System.out.println("Scanned Product: " + scannedProduct.toString());
    }
}
