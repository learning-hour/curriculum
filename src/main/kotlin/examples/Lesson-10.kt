package examples


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
    println(lesson10("Earth"))
    println(lesson10("earth"))
}

fun lesson10(planet: String): Planet {
    return Planet.valueOf(planet)
}