import React from "react"

export default class SelectComponent extends React.Component {
    constructor(props) {
        super(props);
        this.productChanged = this.productChanged.bind(this);
        this.save = this.save.bind(this);
        this.products = [
            {id:301, name: "Cep telefonu", price : 2350.0},
            {id:302, name: "Masaüstü", price : 2350.0},
            {id:303, name: "Dizüstü", price : 2350.0},
        ]
        const currentProductId = 302;
        this.state = {
            currentProductId:currentProductId,
            currentProduct: this.products.find( p => p.id === currentProductId)

        }

    }

    productChanged(event) {
        const currentProductId = Number(event.target.value);
        if(currentProductId === 0) {
           
            this.setState({
                currentProductId:0,
            }) 
            return;
        }

        this.setState({
            currentProductId:currentProductId,
            currentProduct: this.products.find( p => p.id === currentProductId )
        })
    }
    save (event) {

        event.preventDefault();
        if(this.state.currentProductId!== 0) {
            alert(`Saklanıyor `)
        } else {
            alert(`saklanıyor boş`)

        }
    }
   
    render() {
        return (
            <>
                <h3>saökn</h3>
                Seçilen Öz : {this.state.currentProductId}
                Seçilen Nesne : {this.state.currentProduct.id}
                {this.state.currentProduct.name}
                {this.state.currentProduct.price}
            
                <form onSumbmit = {this.save}>  
                Ürün Seç:
                <select value = {this.state.currentProductId} onChange = {this.productChanged}>
                    <option key = {0} value = {0} >
                        ---seçiniz----
                     </option>
                    {this.products.map (product =>
                        <option key = {product.id} value = {product.id}  >
                            {product.name} 
                         </option>
                    )}
                </select>
                <input type = "submit" value = "Kaydet"/>
                </form>
            
            </>
            
        )
    }
}