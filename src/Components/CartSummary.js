import React, { useEffect, useState } from "react";

const CartSummary = () => {
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

  return (
    <div>
      <h1>Cart Summary</h1>
      {cart && (
        <>
          <p>Cart ID: {cart.cartId}</p>
          <p>Cart Number: {cart.cardNumber}</p>
          <p>Cart Status: {cart.cartStatus}</p>
          <p>Customer Name: {cart.customerName}</p>
        </>
      )}
      <h2>Cart Products</h2>
      <ul>
        {cartProducts.map((cartProduct) => (
          <li key={cartProduct.cartProductId}>
            {cartProduct.product.productName} - Price: {cartProduct.product.salesPrice}  - Category: {cartProduct.product.category.categoryName}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default CartSummary;
