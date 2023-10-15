fun main() {
    for (index in 1..20) {
        lesson7bGreet(index)
    }
}


fun lesson7aGreet(age: Int) {
    when {
        age < 10 -> println("secret kid greeting - Your age is $age")
        age == 10 -> println("Congratulations. You are exactly 10")
        age > 10 -> println("hello - Your age is $age")
    }
}

fun lesson7bGreet(age: Int) {
    when (age) {
        1, 2, 3, 4, 5, 6, 7, 8, 9 -> println("secret kid greeting - Your age is $age")
        10 -> println("Congratulations. You are exactly 10")
        else -> println("secret kid greeting - Your age is $age")
    }
}

//note there is no else
fun lesson07cGreet(age: Int) {
    if (age > 10) {
        println("hello - Your age is $age")
    } else {
        println("secret kid greeting - Your age is $age")
    }
}