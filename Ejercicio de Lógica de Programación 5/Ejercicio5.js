function numeroSecreto() {
    let numero = Math.floor(Math.random() * 10);
    let prediccion = Number(prompt("Estoy pensando en un número del 1 al 100, cuál es?", 0));
    while (prediccion !== numero) {
        console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
        prediccion = Number(prompt("Estoy pensando en un número del 1 al 100, cuál es?", 0));
    }
    console.log("Felicidades, adivinaste el número secreto");
}

numeroSecreto();

/*if (prediccion == numero) {
        console.log("Felicidades, adivinaste el número secreto");
    } else {
        console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    }
*/