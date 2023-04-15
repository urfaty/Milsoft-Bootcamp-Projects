import { Button } from "@mui/material";
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

const CartDetail = () => {
  const [cart, setCart] = useState(null);
  const [cartProducts, setCartProducts] = useState([]);

  useEffect(() => {
    fetch("/cart/get/1")
      .then((response) => response.json())
      .then((data) => setCart(data));

    fetch("/cart/get/1/products")
      .then((response) => response.json())
      .then((data) => setCartProducts(data));
  }, []);

  const removeFromCart = (productId) => {
    fetch(`/cart/remove/1/${productId}`, { method: "DELETE" })
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("Failed to remove product from cart");
        }
      })
      .then((data) => {
        console.log("Product removed from cart:", data);
        setCartProducts(cartProducts.filter((product) => product.product.id !== productId));
        alert("Product successfully removed from cart!");

      })
      .catch((error) => {
        console.error("Error:", error);
      });
  };
  

  return (
    <div>
      <h1>Cart Detail</h1>
      {cart && (
        <>
          <p>Cart ID: {cart.cartId}</p>
          <p>Cart Status: {cart.cartStatus}</p>
        </>
      )}
      <h2>Cart Products</h2>
      <ul style={{ listStyleType: 'none', paddingLeft: 0 }}>
        {cartProducts.map((cartProduct) => (
          <li key={cartProduct.cartProductId} style={{ display: 'flex', alignItems: 'center', marginBottom: '1rem' }}>
            <div style={{ flexGrow: 1 }}>
              {cartProduct.product.productName} - Price: {cartProduct.product.salesPrice}  - Category: {cartProduct.product.category.categoryName}
            </div>
            <Button variant="outlined" style={{ marginLeft: '20px' }} onClick={() => removeFromCart(cartProduct.product.id)}>Remove</Button>
          </li>
        ))}
      </ul>
      <Link to="/shopping/cart/checkout">Checkout</Link>
    </div>
  );
  
};

export default CartDetail;

