import { Button, TextField } from '@mui/material';
import React, { useState, useEffect } from 'react';

const CartCheckout = () => {
  const [customerName, setCustomerName] = useState('');
  const [cardNumber, setCardNumber] = useState('');
  const [cartCheckedOut, setCartCheckedOut] = useState(false);

  useEffect(() => {
    fetch('/cart/get/1')
      .then((response) => response.json())
      .then((data) => {
        if (data.cartStatus === 'COMPLETED') {
          setCartCheckedOut(true);
        }
      });
  }, []);

  const handleCheckout = () => {
    fetch(`/cart/checkout/1`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({
        customerName,
        cardNumber,
      }),
    })
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error('Failed to checkout cart');
        }
      })
      .then((data) => {
        console.log('Cart checkout:', data);
        alert('Cart successfully checked out!');
        setCustomerName('');
        setCardNumber('');
        setCartCheckedOut(true);
      })
      .catch((error) => {
        console.error('Error:', error);
      });
  };

  if (cartCheckedOut) {
    return (
      <div>
        <h1>Cart Checkout</h1>
        <p>The cart has already been checked out.</p>
      </div>
    );
  }

  return (
    <div>
      <h1>Cart Checkout</h1>
      <form
        onSubmit={(e) => {
          e.preventDefault();
          handleCheckout();
        }}
      >
        <div>
          <TextField
            id="customerName"
            label="Customer Name"
            value={customerName}
            onChange={(e) => setCustomerName(e.target.value)}
            InputLabelProps={{
              style: { color: 'white' },
            }}
            InputProps={{
              style: {
                color: "white",
                borderRadius: "4px"
              }              
            }}
          />
        </div>
        <div>
          <TextField
            id="cardNumber"
            label="Card Number"
            value={cardNumber}
            onChange={(e) => setCardNumber(e.target.value)}
            InputLabelProps={{
              style: { color: "white" }
            }}
            InputProps={{
              style: {
                color: "white",
                borderRadius: "4px"
              }
            }}
          />
        </div>
        <Button variant="contained" style={{ marginTop: '20px' }} type="submit">Checkout</Button>
      </form>
    </div>
  );
};

export default CartCheckout;
