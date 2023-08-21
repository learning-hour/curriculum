# Lesson 1
- [Lesson 1](#lesson-1)
  * [Introduction](#introduction)
  * [High-Level Languages](#high-level-languages)
  * [Compilers and Interpreters](#compilers-and-interpreters)
    + [Pros and Cons](#pros-and-cons)
    + [Examples](#examples)
    + [Why isn't every language compiled if it is faster?](#why-isn-t-every-language-compiled-if-it-is-faster-)
  * [Strongly typed vs Weakly typed aka Static vs Dynamic typing](#strongly-typed-vs-weakly-typed-aka-static-vs-dynamic-typing)
    + [Why are strongly typed languages better?](#why-are-strongly-typed-languages-better-)
      - [Pros](#pros)
      - [Cons](#cons)
  * [What is memory?](#what-is-memory-)
    + [Bits, Bytes and Nibbles](#bits--bytes-and-nibbles)
  * [What are variables?](#what-are-variables-)
  * [What are data types?](#what-are-data-types-)


## Introduction
At a fundamental level, like humans, computers operate on instructions. These instructions are written in a language that the computer can understand. The computer then executes these instructions. The instructions that a computer is, or more specifically, a CPU (Central Processing Unit), called an [Instruction set](https://en.wikipedia.org/wiki/Instruction_set_architecture). We'll go in depth on this later.

The instruction set is typically a very low-level set of instructions. Examples could include. 
* Store a value in memory
* Recall a value from memory
* Add two values in specific memory locations
* Jump to a specific memory location
* Compare two values

These instructions are typically represented in binary. For example, the instruction to add two values in memory could be represented as `00000001`. This is a basic example, but you can see how this could get very complicated quickly.

## High-Level Languages
In order to make programming easier, we use high-level languages. These languages are typically closer to human language. For example, the instruction to add two values in memory could be represented as `add`. This is much easier to read and understand.

```kotlin
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun main(args: Array<String>) {
  //Kotlin example
  val first: Int = 10
  val second = 20 //example of type inference
  val result = add(first, second)
  println("Result is $result")
}
```

It might get compiled into the following pseudocode (it is still more high-level than closer to binary level)
``` 
 ALLOCATE MEMORY LOCATION
 ASSIGN NAME TO MEMORY LOCATION first
 STORE 10 in MEMRORY LOCATION first
 ALLOCATE MEMORY LOCATION
 ASSIGN NAME TO MEMORY LOCATION second
 STORE 20 in MEMRORY LOCATION second
 ALLOCATE MEMORY LOCATION
 ASSIGN NAME TO MEMORY LOCATION result
 RECALL MEMORY location first and store in MEMORY REGISTER
 RECALL MEMORY location second and store in MEMORY REGISTER
 COMPUTE first + second AND STORE result in MEMORY LOCATION result
 DISPLAY TEXT 
```

a higher language is easier for humans to understand and organize.

## Compilers and Interpreters
In order for a computer to understand a high-level language, we need to convert it to a low-level language. This is where compilers and interpreters come in. 

A compiler is a program that converts a high-level language to a low-level language. This is typically done **before the program is run**. The compiler will convert the entire program to a low-level language. This low-level language is then run by the computer.

An interpreter is a program that converts a high-level language to a low-level language. This is typically done **as the program is run**. The interpreter will convert each line of the program to a low-level language. This low-level language is then run by the computer.

### Pros and Cons
Compilers are typically faster than interpreters. This is because the compiler only has to convert the program once.

The interpreter has to convert the program every time it is run. This makes it slower than the compiler.

### Examples
Some examples of compiled languages are C, C++, Java, Kotlin, Rust, Go. Some examples of interpreted languages are Python, Ruby, and JavaScript.

### Why isn't every language compiled if it is faster?
Depending on what is more important in a particular scenario, you may want to use an interpreter. For example, if you are writing a script that you will only run once, you may want to use an interpreter. This is because the interpreter will convert the program as it is run. This means that you can make changes to the program and run it again without having to recompile the program. This is much faster than having to recompile the program every time you make a change.

Alternatively, if the program is going to run on a server, you may want to use a compiler. This is because the compiler will convert the program once. This means that the program will run faster. This is important because the program will be run many times.

## Strongly typed vs Weakly typed aka Static vs Dynamic typing
Strongly typed languages require that the type of variable be declared. For example, in Java, you would have to declare a variable as an integer. You could not then assign a string to that variable. 

Weakly typed languages do not require that the type of variable be declared. For example, in JavaScript, you could declare a variable as an integer, but then assign a string to that variable.

``` kotlin
//Kotlin example
var age: Int = 1
var name: String = "John"
name = 1 // This would not compile
age = "John" // This would not compile
age = 1.0 // This would not compile, because Int and Double are different types

//Error from compiler
//The integer literal does not conform to the expected type String
//Type mismatch: inferred type is String but Int was expected
```
Each line is marked with an error 
![example-compile-error.png](..%2Fimages%2Fexample-compile-error.png)

``` javascript
//Javascript example
let age = 1
let name = "John"
name = 1 // This would compile but would throw an error at runtime, alternatively your name might be 1
age = "John" // This would compile but would throw an error at runtime, alternatively your age might be "John" and you would be "John" years old which doesn't make sense.
```

### Why are strongly typed languages better?
Strongly typed languages are typically better because they help prevent bugs. For example, if you have a variable that is supposed to be an integer, but you accidentally assign a string to it, the program will not compile. This will force you to fix the bug before you can run the program.

#### Pros
* Compiler can catch bugs
* For large code bases, it is really helpful if code base is strongly typed. It helps you understand what is going on.
* It also helps with refactoring. If you change the type of variable, the compiler will tell you all the places you need to change.
* It also helps with auto complete. If you are using an IDE, it can help you auto complete the variable name.
* It also helps with documentation. If you are using an IDE, it can help you auto complete the variable name.
* Compiled languages tend to be faster than interpreted languages. This is because the compiler can optimize the code before it is run.

#### Cons
* Compiled languages have longer build periods. This is because the compiler has to convert the entire program before it can be run.
* Compiled languages have longer feedback loops. This is because the compiler can only give you feedback after you have written the entire program.
* Compiled languages tend to be more verbose. This is because you have to declare the type of every variable. Kotlin is an exception to this rule, as it has type inference. Other languages with type inference include Swift and Rust.

## What is memory?
Memory is a series of available storage space. 

Imagine the following variable declaration
```kotlin
val age: Int = 10
```

![memory-variable.png](..%2Fimages%2Fmemory-variable.png)

### Bits, Bytes and Nibbles

* A single memory location is called a `bit`. It can store either `0` or `1`.
* `4` consecutive `bits` are called a `nibble`. 
* `8` consecutive `bits` are called a `byte`. 
* `1024 bytes` is `1 kilo byte`. Note this is different from the metric convention of `1000`. Why `1024`? In computers, everything is measured in binary, hence the number base is also `2` and not `10`. `2^10 = 1024`
* similarly `1 Mega byte = 2 ^ 20`

## What are variables?
A variable is a **named** block of memory. A variable has 
- a `name` (we can call it by the name)
- a `value` (what is stored in it)
- a starting `address` location
- an ending `address` location
- the difference between start and end represents the length of the variable
- In languages which allow `pointers`, you can suffer from `memory overflow` or `underflow`. A concept we'll explore in a future lesson.

## What are data types?
Every programming language has a notion of `data types` or `primitives`. These are types of data that the language comes bundled with. You can use these constructs to build more complex `data structures`. 

[Kotlin](https://kotlinlang.org/docs/basic-types.html) supports
* Numbers
  * Byte - takes 1 byte
  * Short - takes 2 bytes
  * Int - takes 4 bytes
  * Long - takes 8 bytes
* Booleans
  * it can represent `true` or `false`
* Characters
  * it stores a single character example `a` or `'`
* Strings
  * it stores a series of characters, including numbers
* Arrays
  * An array is a series of data types. It is a more advanced concept, we'll study later.

