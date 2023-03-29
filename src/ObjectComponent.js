import {useState} from 'react'

export default function ObjectComponent() {

    const initialProduct = {id:301, name: "Cep telefonu", price : 2350.0}
    const [product, setProduct] = useState(initialProduct);

    const nameChanged = (event) => {
        setProduct({
            id: product.id,
            name: event.target.value,
            price: product.price
        })
    }

    const priceChanged = (event) => {
        setProduct({
            ...product,
            price: event.target.value
        })
    }

    const save = (event) => {
        event.preventDefault();
        alert(`Saklanıyor ${product.id} ${product.name} ${product.price}`)


    }

    return (
        <div>
            <h1>Nesne Bileşeni</h1>
            Özdeşlik: {product.id}<br></br>
            Ad: {product.name}<br></br>
            Eder: {product.price} <br></br>
            <form onSubmit={save}>
                Özdeşlik: {product.id}<br></br>
                Ad: <input type= "text" value = {product.name} onChange = {nameChanged} /> <br></br>
                Eder: <input type= "text" value = {product.price} onChange = {priceChanged} /> <br></br>
                <input type="submit" value="Sakla" ></input>

            </form>
            

        </div>
    )
}
