fun main(){
    greet(40)
    greet(20)
    greet(14)
    greet(13)
    greet(12)
    greet(10)
}

//note there is no else
fun greet(age: Int){
    if (age > 13 ){
        println("secret kid greeting")
    }
    println("hello")
}