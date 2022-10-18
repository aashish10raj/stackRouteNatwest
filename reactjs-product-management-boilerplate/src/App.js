import './App.css';
import axios from 'axios';
import AddProduct from './Components/AddProduct';
import { useState, useEffect } from "react";
import ProductsData from './Components/ProductsData';
function App() {
  let url = 'http://localhost:3001/products';
  // Write Your Code Here

  
  return (
    <div className="App">
      {/* Write Your Code Here */}    
      <AddProduct/>  
      <ProductsData/>
    </div>
  );
}

export default App;
