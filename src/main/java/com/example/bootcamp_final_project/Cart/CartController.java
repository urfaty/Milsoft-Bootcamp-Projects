package com.example.bootcamp_final_project.Cart;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {

   // @Autowired
    private CartService cartService;

    // constructor
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/get/{id}")
    public Cart getCartById(@PathVariable int id) {
        return cartService.getCartById(id);
    }

    @PostMapping("/add/{cartId}/{productId}")
    public Cart addProductToCart(@PathVariable int cartId, @PathVariable int productId) {
        return cartService.addProductToCart(cartId, productId);
    }

    @DeleteMapping("/remove/{cartId}/{productId}")
    public Cart removeProductFromCart(@PathVariable int cartId, @PathVariable int productId) {
        return cartService.removeProductFromCart(cartId, productId);
    }

    @PostMapping("/checkout/{cartId}")
    public Cart checkoutCart(@PathVariable int cartId) {
        return cartService.checkoutCart(cartId);
    }

    @GetMapping("/get/{id}/products")
    public List<CartProduct> getCartProductsById(@PathVariable int id) {
        Cart cart = cartService.getCartById(id);
        return cart.getCartProducts();
    }




}



