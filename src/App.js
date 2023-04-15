import logo from './logo.svg';
import './App.css';
import CategoriesComponent from './Components/CategoriesComponent';
import ProductComponent from './Components/ProductComponent';
import ProductsComponent from './Components/ProductsComponent';
import { Switch, Route, Routes } from 'react-router-dom';
import AddToCartButton from './Components/AddToCartButton';
import CartCheckout from './Components/CartCheckout';
import CartDetail from './Components/CartDetail';
import CartSummary from './Components/CartSummary';
import Router from './Components/Router';
import DrawerAppBar from './Components/DrawerAppBar';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Router>
        </Router>
      </header>
    </div>

  );
}

export default App;


