package com.example.bootcamp_final_project.Product;
import com.example.bootcamp_final_project.Category.Category;
import com.example.bootcamp_final_project.Category.CategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;
@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

   // @Autowired
    private ProductService productService;

    // constructor
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable int categoryId) {
        return productService.getProductsByCategoryId(categoryId);
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

}

