function minutosRestantes() {
    let dia = prompt("Día de la semana:", "");
    let hora = prompt("Hora del día:", "");
    let minuto = prompt("Minuto del día:", "");
    let diaNumero = 0;
    let minutosTotales = 0;
    switch (dia) {
        case "lunes":
            diaNumero = 1;
            break;
        case "martes":
            diaNumero = 2;
            break;
        case "miércoles":
            diaNumero = 3;
            break;
        case "jueves":
            diaNumero = 4;
            break;
        case "viernes":
            diaNumero = 5;
            break;
    }
    minutosTotales += ((5 - diaNumero) * 24 * 60);
    minutosTotales += ((15 - hora) * 60);
    minutosTotales += (60 - minuto);
    console.log(minutosTotales);
}

minutosRestantes();