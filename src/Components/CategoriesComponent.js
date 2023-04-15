import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

const CategoriesComponent = () => {
  const [categories, setCategories] = useState([]);

  useEffect(() => {
    fetch("/categories")
      .then((response) => response.json())
      .then((data) => setCategories(data));
  }, []);

  return (
    <div>
      <h1>Categories</h1>
      <ul>
        {categories.map((category) => (
          <li key={category.id}>
            <Link to={`/inventory/products/${category.id}`}>
              {category.categoryName}
            </Link>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default CategoriesComponent;
