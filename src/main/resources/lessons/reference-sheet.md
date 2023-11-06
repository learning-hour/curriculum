# Reference Sheet

[Kotlin Language reference docs](https://kotlinlang.org/docs/home.html)

## Program Entry point

An entry point of a Kotlin application is the main function.

`fun` is a keyword indication it is a function
`main` is a keyword for a special function. 
`()` indicates preceding name belongs to a function. There can be arguments to the function as well.
`{` and `}` open/close the definition
`println` is a library function that prints given text to the standard output.

```kotlin
fun main() {
    println("Hello world!")
}
```

## Function definition
A function has a `name`, possibly `input` parameters, and possibly it can return an `output`.

In the following definition we see `fun` keyword start the definition of the function `sum`. We can call our functions anything we want. `(` opens definition of input parameters `)`.

`a` is the first parameter and it is of `type` `Int`. We declare a variable by defining the name first, followed by its type.
`a:Int` or `b:Int`

Since there are 2 parameters, they are separated by a comma. If there was only one, we'd only have `a:Int`

```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}
```

## For loops
### Index based loops that increase or count in ascending sequence

```kotlin
for (index in 1..3){
    println("Index is $index")
}
```

### Index based loops that decrease or count in descending sequence
You can specify a step. A step of 2, would execute the following 5 times only.
A step of 3 would execute this 4 times (10, 7, 4, 1). 
```kotlin
for (index in 10 downTo 1 step 1){
    println("Countdown with a step 1")
}
```


