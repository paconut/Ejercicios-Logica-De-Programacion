function textoInvertido() {
    let array = [];
    let frase = prompt("En qué estas pensando", "");
    for (let caracter of frase) {
        array.unshift(caracter);
    }
    console.log(array.join(""));
}

textoInvertido();