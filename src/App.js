import logo from './logo.svg';
import './App.css';
import FunctionComponent from './FunctionComponent';
import ParentComponent from './ParentComponent';
import ChildComponent from './ChildComponent';
import FormComponent from './FormComponent';
import EventComponent from './EventComponent';
import StateComponent from './StateComponent';
import ObjectComponent from './ObjectComponent';
import Condition from './further/Condition';
import ConditionTernary from './further/ConditionTernary';
import ConditionAnd from './further/ConditionAnd';
import MapList from './further/MapList';
import MapTable from './further/MapTable';
import MapContainer from './further/MapContainer';
import SelectComponent from './further/SelectComponent';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        merhabalar efendim
        nasılsınız bugun <br/>

        {/* <FunctionComponent/> */}
        {/* <ParentComponent /> */}
        {/* <ChildComponent left = "3" right = "4"/> */}
        {/* <FormComponent/> */}
        {/* <EventComponent/> */}
        {/* <StateComponent/> */}
        {/* <ObjectComponent/> */}
        {/* <Condition/> */}
        {/* <ConditionTernary/> */}
        {/* <ConditionAnd/> */}
        {/* <MapList/> */}
        {/* <MapTable/> */}
        <SelectComponent/>


      </header>
    </div>
  );
}

export default App;
