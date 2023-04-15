import { Button } from "@mui/material";
import React from "react";

const AddToCartButton = ({ productId }) => {
  const addToCart = () => {
    fetch(`/cart/add/1/${productId}`, { method: "POST" })
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("Failed to add the product to the cart");
        }
      })
      .then((data) => {
        console.log("Product added to cart:", data);
        alert("Product added to cart successfully!"); 
      })
      .catch((error) => {
        console.error("Error adding product to cart:", error);
        alert("Failed to add the product to the cart");
      });
  };

  return <Button variant="contained" onClick={addToCart} >Add to Cart</Button>
};

export default AddToCartButton;