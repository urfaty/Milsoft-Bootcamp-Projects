import {useState} from 'react'

export default function StateComponent() {
   const [quantity, setquantity] = useState(10);

   const changeQuantity = () => {
        setquantity(7)
     }

    return (
        <div>
            <h1>Durum Bileşeni</h1>
            Nicelik : {quantity}<br/>
            <button onClick = { changeQuantity }>tak</button>



        </div>


    
    )
}
