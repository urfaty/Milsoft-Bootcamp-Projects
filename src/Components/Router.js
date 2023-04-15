import React from 'react';
import { BrowserRouter, Route, Link, Outlet, Routes } from 'react-router-dom';
import CategoriesComponent from './CategoriesComponent';
import ProductsComponent from './ProductsComponent';
import ProductComponent from './ProductComponent';
import CartSummary from './CartSummary';
import CartDetail from './CartDetail';
import CartCheckout from './CartCheckout';
import DrawerAppBar from './DrawerAppBar';
import Shopping from './Shopping';
import Home from './Home';

const Router = () => {
  return (
    <BrowserRouter>
      <DrawerAppBar />
      <div style={{ paddingTop: 64 }}>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/inventory" element={<CategoriesComponent />} />
          <Route path="/inventory/products/:categoryId" element={<ProductsComponent />} />
          <Route path="/inventory/product/:productId" element={<ProductComponent />} />
          <Route path="/shopping" element={<Shopping />} />
          <Route path="/shopping/summary" element={<CartSummary />} />
          <Route path="/shopping/cart" element={<CartDetail />} />
          <Route path="/shopping/cart/checkout" element={<CartCheckout />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
};

export default Router;
