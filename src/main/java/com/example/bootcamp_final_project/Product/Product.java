package com.example.bootcamp_final_project.Product;
import com.example.bootcamp_final_project.Category.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "product")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "sales_price")
    private double salesPrice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    // constructors, getters and setters

    public int getId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public Category getCategory() {
        return category;
    }


}
