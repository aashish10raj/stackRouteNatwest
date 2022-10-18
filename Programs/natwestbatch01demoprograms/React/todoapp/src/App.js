import React from "react"; 
import TodoList from "./components/TodoList";


function App() {
  return (
   <div>
       <div className="container">
        <div className="row">
          <div className="col-md-4"></div>
            <div className="col-md-4">
             <TodoList />
            </div>
              <div className="col-md-4"></div>
          </div>
        </div>
       </div>
  );
}

export default App;
