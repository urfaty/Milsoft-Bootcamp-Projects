// ProductsComponent.js
import React, { useEffect, useState } from 'react';
import { useParams, Link } from 'react-router-dom';

const ProductsComponent = () => {
  const [products, setProducts] = useState([]);
  const { categoryId } = useParams();

  useEffect(() => {
    fetch(`/products/${categoryId}`)
      .then((response) => response.json())
      .then((data) => setProducts(data));
  }, [categoryId]);

  return (
    <div>
      <h1>Products</h1>
      <ul>
        {products.map((product) => (
          <li key={product.id}>
            <Link to={`/inventory/product/${product.id}`}>
              {product.productName}
            </Link>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ProductsComponent;
