import logo from './logo.svg';
import './App.css';
import Component1 from './Component1';
import Component2 from './Component2';
import UserData from './UserData';
import Component3 from './Component3';
import RegularComponent from './RegularComponent';
import MyPureComponent from './MyPureComponent';
import ParentComponent from './ParentComponent';

function App() {
  return (
    <div className='container'>
      <div className='row'>
        <ParentComponent />
          {/* <RegularComponent />
          <MyPureComponent /> */}

         {/* <Component1 />
         <Component2 />
         <Component3 />
         <UserData /> */}
      </div>
    </div>
  )
  
}

export default App;
