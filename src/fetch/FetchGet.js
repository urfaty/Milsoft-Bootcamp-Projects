import React, { useEffect } from 'react';
import { useState } from 'react';

export const FetchGet = () => {

    const productId = 302;
    const initialProduct = {id:0, name: "", price : 0.0};
    const urlList = "/json/product" + productId + ".json";
    const [product,setProducts] = useState(initialProduct);


    useEffect(() => {
        fetch(urlList)
          .then(response => response.json())
          .then(product => {
            console.log(product);
            setProducts(product);

        })
          .catch(error => console.error(error));
      }, [urlList]);

    // make post request
    // fetch(urlList, {
    //     method: 'POST',
    //     headers: {
    //       'Content-Type': 'application/json',
    //     },
    //     body: JSON.stringify({title: 'React POST Request Example'}),
    //   })
    //     .then(response => response.json())
    //     .then(data => {
    //       console.log('Success:', data);
    //     })
    //     .catch((error) => {
    //       console.error('Error:', error);
    //     });


    const options = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(product)
        };
    fetch(urlList, options
        .then(data => (data.json())
        .then(result => {
            console.log(result);
        })
    ), [urlList]);




    return (
        <>
            <table>
                <tbody>  
                    <tr>
                       <td>  {product.id} </td>
                       <td>  {product.name} </td>
                       <td>  {product.price} </td>
                    </tr> 
                </tbody>
            </table>
        </>
    )
}

/*
const initialProducts = []; diye bir dizi olultur boş
constn [products,setProducts] = useState(initialProducts); products diye bir state tanımladık
useEffect(() => {
    fetch(urlList)
        setProducts(products)


return 
    products.map ile bas        
*/