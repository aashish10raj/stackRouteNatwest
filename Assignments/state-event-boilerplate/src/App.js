import './App.css';
import BodyComponent from './components/BodyComponent';
import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import ViewTitleComponent from './components/ViewTitleComponent';

function App() {
  return (
    <div className="App">
      <h1>learn react</h1>
     <HeaderComponent />
     <BodyComponent />
      <FooterComponent />
    </div>
  );
}

export default App;
