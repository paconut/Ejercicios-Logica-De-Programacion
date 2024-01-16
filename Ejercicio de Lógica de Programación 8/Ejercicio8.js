function esPrimo(numero) {
    if (numero <= 1) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i === 0) {
            return false;
        }
    }

    return true;
}

function arrays() {
    let array = [];
    let arrayArreglado = [];
    let numero1 = Number(prompt("Dame el primer numero", 0));
    array.push(numero1);
    let numero2 = Number(prompt("Dame el segundo numero", 0));
    array.push(numero2);
    let numero3 = Number(prompt("Dame el tercer numero", 0));
    array.push(numero3);
    let numero4 = Number(prompt("Dame el cuarto numero", 0));
    array.push(numero4);
    let numero5 = Number(prompt("Dame el quinto numero", 0));
    array.push(numero5);
    let numero6 = Number(prompt("Dame el sexto numero", 0));
    array.push(numero6);
    let numero7 = Number(prompt("Dame el septimo numero", 0));
    array.push(numero7);
    let numero8 = Number(prompt("Dame el octavo numero", 0));
    array.push(numero8);
    let numero9 = Number(prompt("Dame el noveno numero", 0));
    array.push(numero9);
    let numero10 = Number(prompt("Dame el decimo numero", 0));
    array.push(numero10);
    for (let i of array) {
        if (esPrimo(i) == true) {
            arrayArreglado.unshift(i);
        } else {
            arrayArreglado.push(i);
        }
    }
    console.log(array);
    console.log(arrayArreglado);
    for (let i = 0; i < array.length; i++) {
        console.log(i, array[i]);
    }
    for (let i = 0; i < arrayArreglado.length; i++) {
        console.log(i, arrayArreglado[i]);
    }
}



arrays();