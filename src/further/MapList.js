export default function MapList() {
    const names = ['HTML','css','JSON','AJAX','JavaScript']

    return (
        <>
            <h3>
                Eşlem Dizelge
            </h3>
            <ul>
                {names.map (name =>
                    <li> {name} </li>)}
            </ul>
        </>
    )

}