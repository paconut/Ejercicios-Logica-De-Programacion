function fibonacci() {
    let array = [];
    let i = 0;
    let maximo = Number(prompt("Cuantos numeros quiere de la serie de fibonacci", 0));
    while (i <= maximo) {
        if (i >= 2) {
            let numero = array[i - 1] + array[i - 2];
            array.push(numero);
        } else if (i == 1) {
            array.push(1);
        } else {
            array.push(0);
        }
        i++;
    }
    console.log(array.join(","));
}

fibonacci();