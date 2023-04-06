import MapItem from "./MapItem"

export default function MapContainer() {
    const products = [
                        {id:301, name: "Cep telefonu", price : 2350.0},
                        {id:302, name: "Masaüstü", price : 2350.0},
                        {id:303, name: "Dizüstü", price : 2350.0},
                    ]



    return (
        
             <div>

                 {products.map (product =>
                    <div key = {product.id}>
                       <div>  {product.id} </div>
                       <div>  {product.name} </div>
                       <div>  {product.price} </div>
                    </div> 
                    )}



                



            </div>

        
    )

}

