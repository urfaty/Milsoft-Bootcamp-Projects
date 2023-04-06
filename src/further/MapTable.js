export default function MapTable() {
    const products = [
                        {id:301, name: "Cep telefonu", price : 2350.0},
                        {id:302, name: "Masaüstü", price : 2350.0},
                        {id:303, name: "Dizüstü", price : 2350.0},
                    ]


    return (
        <>
            <h3>
                Eşlem Dizelge
            </h3>
            <table>
                <tbody>  
                    {products.map (product =>
                    <tr key = {product.id}>
                       <td>  {product.id} </td>
                       <td>  {product.name} </td>
                       <td>  {product.price} </td>
                    </tr> )}
                </tbody>
            </table>
        </>
    )

}

