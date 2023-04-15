package com.example.bootcamp_final_project.Cart;

import com.example.bootcamp_final_project.Product.Product;
import com.example.bootcamp_final_project.Product.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

   // @Autowired
    private CartRepository cartRepository;

   // @Autowired
    private ProductRepository productRepository;

    private CartProductRepository cartProductRepository;

    //constructor

    public CartService(CartRepository cartRepository, ProductRepository productRepository, CartProductRepository cartProductRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
        this.cartProductRepository = cartProductRepository;
    }
    public Cart getCartById(int id) {
        Cart cart = cartRepository.findById(id).orElse(null);
        if (cart == null) {
            cart = new Cart();
            cart.setCartId(id);
            cart.setCartStatus(CartStatus.NEW);
            cart.setCardNumber("1234567890123456");
            cart.setCustomerName("John Doe");
            cartRepository.save(cart);
        }
        return cart;
    }

    public Cart addProductToCart(int cartId, int productId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        Product product = productRepository.findById(productId).orElse(null);

        if (cart == null || product == null) {
            return null;
        }

        CartProduct cartProduct = new CartProduct();
        cartProduct.setCart(cart);
        cartProduct.setProduct(product);
        cartProduct.setSalesQuantity(1);

        cart.getCartProducts().add(cartProduct);
        cart = cartRepository.save(cart);

        return cart;
    }

    public Cart removeProductFromCart(int cartId, int productId) {

        Optional<Cart> cartOptional = cartRepository.findById(cartId);
        Optional<Product> productOptional = productRepository.findById(productId);

        if (cartOptional.isPresent() && productOptional.isPresent()) {
            Cart cart = cartOptional.get();
            Product product = productOptional.get();

            CartProduct cartProductToRemove = null;
            for (CartProduct cartProduct : cart.getCartProducts()) {
                if (cartProduct.getProduct().getId() == productId) {
                    cartProductToRemove = cartProduct;
                    break;
                }
            }

            if (cartProductToRemove != null) {
                cart.getCartProducts().remove(cartProductToRemove);
                cartProductRepository.delete(cartProductToRemove);
                cartRepository.save(cart);
            }
        }

        return cartOptional.orElse(null);

    }

    public Cart checkoutCart(int cartId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart.getCartStatus() == CartStatus.COMPLETED) {
            return null;
        }

        cart.setCartStatus(CartStatus.COMPLETED);
        cart = cartRepository.save(cart);

        return cart;
    }




}
