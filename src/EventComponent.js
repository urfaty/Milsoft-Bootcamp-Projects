export default function EventComponent() {
    const handle = () => {
        alert("Kotarılıyor...")
    }

    const deal = (input) => {
        alert("uğraşılıyor..." + input)
    }

    const manage = (event) => {
        alert("işletiliyor..." + event.target.id + ' ' + event.target.tagName)
    }


    return (
        <div>
            <h1> Biçim Bileşeni </h1>
            <form>
                <button onClick = { () => alert("işleniyor..")}>Çizgi içi</button>
                <button onClick = { handle }>ok</button>
                <button onClick = { () => deal("girdi") }>Değiştirgen</button>
                <button id="Manager" onClick = { (event) => manage(event) }>Olay</button>




            </form>


        </div>
    )
}
