import {BrowserRouter, Route, Routes} from 'react-router-dom';
import RouteOutlet from './RouteOutlet';
import ComponenIndex from '../module/ComponentIndex';
import ComponentTwo from '../module/ComponentTwo';
import ComponentThree from '../module/ComponentThree';
import ComponentParametric from '../module/ComponentParametric';



export default function RouteDefinition () {
  return ( 
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<RouteOutlet/>} >
            <Route index element={<ComponenIndex/>} />
            <Route path="two" element={<ComponentTwo/>} />
            <Route path="three" element={<ComponentThree/>} />
            <Route path="four/:id" element={<ComponentParametric/>} />


            
                

            </Route>
        </Routes>

    </BrowserRouter>

  )
}