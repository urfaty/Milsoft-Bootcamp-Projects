package com.example.bootcamp_final_project.Category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

   // @Autowired
    private CategoryRepository categoryRepository;
    //constructor
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }


}
