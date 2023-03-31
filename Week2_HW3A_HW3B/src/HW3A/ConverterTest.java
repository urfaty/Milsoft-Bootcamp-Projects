package HW3A;

public class ConverterTest {
    public static void main(String[] args) {
        // Bir Product nesnesi oluşturun
        Product product = new Product(1, "Laptop", 2500.0);

        // ProductConverter sınıfını kullanarak Product nesnesini string'e dönüştürün
        ProductConverter converter = new ProductConverter();
        String productString = converter.format(product);
        System.out.println("Product String: " + productString);

        // ProductConverter sınıfını kullanarak string'i Product nesnesine dönüştürün
        Product parsedProduct = converter.parse(productString);
        System.out.println("Parsed Product: " + parsedProduct.getProductId() + ", " + parsedProduct.getProductName() + ", " + parsedProduct.getSalesPrice());
    }
}
