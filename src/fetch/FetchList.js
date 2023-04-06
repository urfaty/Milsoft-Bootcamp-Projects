import React, { useEffect } from 'react';
import { useState } from 'react';

export const FetchList = () => {

    const urlList = "/json/products.json";
    const initialProducts = [];
    const [products,setProducts] = useState(initialProducts);




    useEffect(() => {
        fetch(urlList)
          .then(response => response.json())
          .then(products => {
            setProducts(products);
          })
          .catch(error => console.error(error));
      }, [urlList]);

    return (
        <>
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

/*
const initialProducts = []; diye bir dizi olultur boş
constn [products,setProducts] = useState(initialProducts); products diye bir state tanımladık
useEffect(() => {
    fetch(urlList)
        setProducts(products)


return 
    products.map ile bas        
*/