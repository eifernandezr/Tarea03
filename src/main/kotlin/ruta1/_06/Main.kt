package org.eifr.dsm.ruta1._06

fun main() {
    primeraParte()
    println("-".repeat(33))
    segundaParte()
    println("-".repeat(33))
    terceraParte()
}


//region Tercera parte
fun terceraParte() {
    val inicialCelsius = 27.0
    val inicialKelvin = 350.0
    val inicialFahrenheit = 10.0

    printFinalTemperature(
        inicialCelsius,
        "Celsius",
        "Fahrenheit",
        { celsius -> (celsius * 9 / 5) + 32 }
    )
    printFinalTemperature(inicialKelvin,
        "Kelvin", "Celsius",
        { it - 273.15 }
    )
    printFinalTemperature(
        inicialFahrenheit,
        "Fahrenheit", "Kelvin",) {
        (it - 32) * 5 / 9 + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit")
}
//endregion


//region Segunda Parte
fun segundaParte() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("The movie ticket price for a person aged $child is ${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is ${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is ${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1 // error?
    }
}
//endregion


//region Primera Parte
fun primeraParte() {
    val morningNotification = 51;
    val eveningNotification = 135;

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    val upperLimit = 99;
    if (numberOfMessages > upperLimit) {
        println("Your phone is blowing up! " +
                "You have $upperLimit+ notifications.")
    } else {
        println("You have $numberOfMessages notifications.")
    }
}
//endregion