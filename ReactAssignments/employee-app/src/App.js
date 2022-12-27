import logo from './logo.svg';
import './App.css';
import Product1 from './components/Product1';
import {productArr} from './service/product1Data'

function App() {
  return (   
    <div className="App">
      <Product1 data={productArr}/>
    </div>
    
  );
}





export default App;
