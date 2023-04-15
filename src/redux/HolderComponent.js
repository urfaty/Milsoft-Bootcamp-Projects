import {useSelector, useDispatch} from 'react-redux' 

export function HolderComponent(){
    const quantity = useSelector(state => state.quantity)
    const dispatch = useDispatch()
    const quantityIncrement = () => dispatch({type:'quantity/increment'})

    const quantityAdd = (delta) => dispatch({type:'quantity/add', delta:delta})
    return (
        <>
            Nicelik : {quantity}
            <button onClick={() => quantityIncrement()}>Artır</button>
            <button onClick={() => quantityAdd(5)}>Ekle</button>


        </>
    )
}


