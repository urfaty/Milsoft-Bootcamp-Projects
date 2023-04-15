import * as React from 'react';
import PropTypes from 'prop-types';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import CssBaseline from '@mui/material/CssBaseline';
import Divider from '@mui/material/Divider';
import Drawer from '@mui/material/Drawer';
import IconButton from '@mui/material/IconButton';
import List from '@mui/material/List';
import ListItem from '@mui/material/ListItem';
import ListItemButton from '@mui/material/ListItemButton';
import ListItemText from '@mui/material/ListItemText';
import MenuIcon from '@mui/icons-material/Menu';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import ShoppingCartIcon from '@mui/icons-material/ShoppingCart';
import Badge from '@mui/material/Badge';
import { Link } from 'react-router-dom';
import { useState, useEffect } from 'react';

const drawerWidth = 240;
const navItems = [
  { name: 'Home', path: '/' },
  { name: 'Inventory', path: '/inventory' },
  { name: 'Shopping', path: '/shopping' },
];

function DrawerAppBar(props) {
  const { window } = props;
  const [mobileOpen, setMobileOpen] = React.useState(false);
  const [cartItemCount, setCartItemCount] = useState(0);

  const handleDrawerToggle = () => {
    setMobileOpen((prevState) => !prevState);
  };

  const fetchCartItemCount = () => {
    fetch("/cart/get/1/products")
      .then((response) => response.json())
      .then((data) => setCartItemCount(data.length));
  };

  useEffect(() => {
    fetchCartItemCount();
  }, []);

  // ... (rest of the code)

  return (
    <Box sx={{ display: 'flex' }}>
      <CssBaseline />
      <AppBar component="nav">
        <Toolbar sx={{ justifyContent: 'space-between' }}>
          <Box sx={{ display: { xs: 'none', sm: 'flex' } }}>
            {navItems.map((item) => (
              <Button key={item.name} sx={{ color: '#fff' }}>
                <Link to={item.path} style={{ textDecoration: 'none', color: 'inherit' }}>
                  {item.name}
                </Link>
              </Button>
            ))}
          </Box>
          <Link to="/shopping/cart" style={{ textDecoration: 'none', color: 'inherit' }}>
            <IconButton color="inherit">
              <Badge badgeContent={cartItemCount} color="error">
                <ShoppingCartIcon />
              </Badge>
            </IconButton>
          </Link>
        </Toolbar>
      </AppBar>
      <Box component="nav">
        {/* ... */}
      </Box>
    </Box>
  );
}

DrawerAppBar.propTypes = {
  /**
   * Injected by the documentation to work in an iframe.
   * You won't need it on your project.
   */
  window: PropTypes.func,
};

export default DrawerAppBar;
