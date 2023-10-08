fun main() {
    greetWithElse(40)
    greetWithElse(20)
    greetWithElse(14)
    greetWithElse(13)
    greetWithElse(12)
    greetWithElse(10)
}


fun greetWithElse(age: Int) {
    if (age > 13) {
        println("secret kid greeting")
    } else {
        println("hello")
    }
}