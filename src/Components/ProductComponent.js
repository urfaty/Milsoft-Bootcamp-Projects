import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import AddToCartButton from './AddToCartButton';

const ProductComponent = () => {
  const [product, setProduct] = useState(null);
  const { productId } = useParams();

  useEffect(() => {
    fetch(`/product/${productId}`)
      .then((response) => response.json())
      .then((data) => setProduct(data));
  }, [productId]);

  return (
    <div>
      {product && (
        <>
          <h1>{product.productName}</h1>
          <p>Price: {product.salesPrice}</p>
          <p>Category: {product.category.categoryName}</p>
          <AddToCartButton productId={product.id} />
        </>
      )}
    </div>
  );
};

export default ProductComponent;
