
import './App.css';
import Header from './Components/Header';
import Footer from './Components/Footer';
import React from 'react';
import ContactList from './Components/ContactList';
import About from './Components/About';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import PageNotFound from './Components/PageNotFound';
import AddContact from './Components/AddContact';

function App() {
  return (
    <Router>
      <Header />
      <Routes>
      <Route exact path="/" element={<About/>} />
      <Route exact path="/contacts" element={<ContactList/>} />
      <Route exact path="/addcontact" element={<AddContact/>} />
      
      <Route exact path="*" element={<PageNotFound/>} />
      </Routes>
      <Footer />
   </Router>
  );
}

export default App;
