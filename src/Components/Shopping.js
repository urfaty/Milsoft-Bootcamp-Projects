import React from 'react';
import { Link } from 'react-router-dom';

const Shopping = () => {
  return (
    <div>
      <ul>
        <li>
          <Link to="/shopping/summary">Cart Summary</Link>
        </li>
        <li>
          <Link to="/shopping/cart">Cart Detail</Link>
        </li>
      </ul>
    </div>
  );
};

export default Shopping;
