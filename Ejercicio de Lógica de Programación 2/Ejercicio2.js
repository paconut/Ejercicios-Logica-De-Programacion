function conversionDeTemperaturas() {
    let celsius = Number(prompt("Ingrese la temperatura en Celsius:", 0));
    let fahrenheit = (celsius * 9 / 5) + 32;
    let kelvin = celsius + 273.15;
    console.log("Los grados fahrenheit son:" + fahrenheit);
    console.log("Los grados kelvin son:" + kelvin);
    return fahrenheit, kelvin;
}

conversionDeTemperaturas();