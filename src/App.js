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
import { FetchList } from './fetch/FetchList';
import { FetchGet } from './fetch/FetchGet';
import RouteDefinition from './router/app/RouteDefinition';
import OutlinedCard from './mui/card';
import { HolderComponent } from './redux/HolderComponent';
import { Provider } from 'react-redux';
import store from './redux/coreStore';



function App() {
  return (
    <Provider store={store}> 
    <div className="App">
      <header className="App-header">
        merhabalar  <br/>

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
        {/* <SelectComponent/> */}
        {/* <FetchList/> */}
        {/* <FetchGet/> */}
        {/* <RouteDefinition/> */}
        {/* <OutlinedCard/> */}
        <HolderComponent/>

      </header>
    </div>
    </Provider>
  );
}

export default App;