import { Provider } from "react-redux";
import AddItem from "./Components/AddItem";
import Header from "./Components/Header";
import TodoList from "./Components/TodoList";
import store from "./Redux/store";

function App() {
  return (
    <div>
    <Header />
     <div className="container">
      <Provider store={store}>
       <AddItem />
       <TodoList />
       </Provider>
     </div>
     </div>
  
  );
}

export default App;
