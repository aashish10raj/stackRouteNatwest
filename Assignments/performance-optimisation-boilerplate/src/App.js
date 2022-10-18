import React from 'react';
import './App.css';
import ParentComponent from './CallBack/Parent';
// import ParentComponent from './components/Parent';
// import LocalState from './LocalState/localstate';
// import ParentComponent from './Memorization/Parent';
// import { BrowserRouter as Router } from "react-router-dom"


function App() {
  return (
    <div className="App">
      {/* <ParentComponent></ParentComponent> */}
      {/* <LocalState></LocalState> */}
      {/* <ParentComponent></ParentComponent> */}
      <ParentComponent/>
    </div>
  );
}

export default App;
