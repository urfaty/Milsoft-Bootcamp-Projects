import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <div>
      <h2>Welcome to my project</h2>
      <p>To start shopping, please go to <Link to="/inventory">Inventory</Link> and add some products to your cart.</p>
    </div>
  );
};

export default Home;
