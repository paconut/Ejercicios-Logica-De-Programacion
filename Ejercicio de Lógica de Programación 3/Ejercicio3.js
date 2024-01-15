function factorial() {
    let numero = Number(prompt("Ingrese el número del que quiere el factorial:", 0));
    for (let i = numero - 1; i >= 1; i--) {
        numero *= i;
    }
    console.log(numero);
    return numero;
}

factorial();