package examples

import examples.Planet.Earth


enum class Planet {
    Mercury,
    Venus,
    Earth,
    Mars,
    Jupiter,
    Saturn,
    Uranus,
    Neptune
}

fun main() {
    Planet.values().forEach {
        planet(it)
    }
}

fun planet(name: Planet){
    when (name){
        Planet.Earth -> println("I live here - Planet is $name")
        else -> println("I don't live here: Planet is $name")
    }
}

fun lesson10(planet: String): Planet {
    return Planet.valueOf(planet)
}