import { useReducer, useState } from "react";
import AppContext  from "./AppContext";
import Comp1 from "./Comp1";
import Comp2 from "./Comp2";
import Component1 from "./Component1";
import reducer, { initialState } from "./Reducer";


function App() {
  const [person, setPerson]=useState({
    name: 'John',
    age: 25
  });

const[state, dispatch]=useReducer(reducer, initialState);
  return (
    <div>
      <AppContext.Provider value={person}>
      <Component1 />
      </AppContext.Provider>
     
      <AppContext.Provider value={{state,dispatch}}>
      <Comp1 />
      <Comp2 />
      </AppContext.Provider>
     
    </div>
  )
   
}

export default App;
