function practicaDeComparacionDeNumeros() {
    let array = [];
    let numero1 = Number(prompt("Ingrese un número:", 0));
    let numero2 = Number(prompt("Ingrese un segundo número:", 0));
    let numero3 = Number(prompt("Ingrese un tercer número:", 0));
    array.push(numero1);
    array.push(numero2);
    array.push(numero3);
    arraySorted = array.sort();
    console.log("Los números en orden ascendente son: " + arraySorted.join(","));
    let arraySortedReverse = [];
    for (let i = 1; i <= arraySorted.length; i++) {
        arraySortedReverse.push(arraySorted[arraySorted.length - i]);
    }
    console.log("Los números en orden descendente son: " + arraySortedReverse.join(","));
    if (numero1 == numero2 && numero2 == numero3) {
        console.log("Los números son iguales.");
    }
}

practicaDeComparacionDeNumeros();