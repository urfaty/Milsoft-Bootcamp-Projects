package com.example.bootcamp_final_project.Product;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    //@Autowired
    private ProductRepository productRepository;

    //constructor
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductsByCategoryId(int categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    public Product getProductById(int id) {
//        Optional<Product> productOptional = productRepository.findById(id);
//        if (productOptional.isPresent()) {
//            System.out.println(productOptional.get());
//            return productOptional.get();
//        } else {
//            return null;
//        }
         return productRepository.findById(id).orElse(null);
    }

}
