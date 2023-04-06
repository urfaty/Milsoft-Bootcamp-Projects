import { Link, Outlet, useNavigate } from "react-router-dom";




export default function RouterOutlet () {

    let navigate = useNavigate();

    const goToThree = () => {
        navigate('/three');
    }

    return (
        <div>
            <h6>Bİleşen</h6>
            <Link to="/">Dizin</Link> {' '}
            <Link to="/two">İki</Link> {' '}
            <Link to="/three">Üç</Link> {' '}
            <Link to="/four/301">parametric</Link> {' '}
            <button onClick = {() => goToThree()}>Üçe Gezzin</button>


            <Outlet/>
        </div>
    )
}