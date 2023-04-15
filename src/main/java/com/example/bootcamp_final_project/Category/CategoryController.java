package com.example.bootcamp_final_project.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {

   // @Autowired
    private CategoryService categoryService;

    //constructor
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/categories/add")
    public String addCategory() {
        Category category = new Category(0, "Beyaz Eşya");
        categoryService.addCategory(category);

        return "Kategori Özdeşliği: " + category.getId() + " Kategori Adı: " + category.getCategoryName();
    }
}

