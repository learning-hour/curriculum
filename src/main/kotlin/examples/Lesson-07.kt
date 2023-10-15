fun main() {
    for (index in 1..100) {
        lesson7aGreet(index)
    }
}


fun lesson7aGreet(age: Int) {
    when {
        age < 10 -> println("secret kid greeting - Your age is $age")
        age == 10 -> println("Congratulations. You are exactly a decade old")
        age > 10 -> println("hello - Your age is $age")
    }
}


//note there is no else
fun lesson07bGreet(age: Int) {
    if (age > 10) {
        println("hello - Your age is $age")
    } else {
        println("secret kid greeting - Your age is $age")
    }
}