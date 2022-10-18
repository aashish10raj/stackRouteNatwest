import React, { Suspense } from 'react';
import {ErrorBoundary} from 'react-error-boundary'
import './App.css';
import Header from './Component/Header';
import Footer from './Component/Footer';
// import ContactList from './Component/ContactList';
// import AboutUs from './Component/AboutUs';
import ContactUs from './Component/ContactUs';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import PageNotFound from './Component/PageNotFound';
import ErrorFallback from './Component/ErrorFallback';
// import AddContact from './Component/AddContact';
const ContactList=React.lazy(()=> import('./Component/ContactList'))
const AboutUs=React.lazy(()=> import('./Component/AboutUs'))
const AddContact=React.lazy(()=> import('./Component/AddContact'));

function App() {
  return (
    <Router>
      <Header />
      <ErrorBoundary FallbackComponent={ErrorFallback} onReset={() => { }}>
      <Suspense fallback={<div>Loading...</div>}>
      <Routes>
        <Route exact path="/" element={<AddContact/>}/>
        <Route exact path="/about" element={<AboutUs/>}/>
        <Route exact path="/contact" element={<ContactList/>}/>
        <Route exact path="/contactus" element={<ContactUs/>}/>
        <Route exact path="*" element={<PageNotFound/>}/>
      </Routes>
      </Suspense>
      </ErrorBoundary>
      <Footer />
     </Router>
  )
}

export default App;
