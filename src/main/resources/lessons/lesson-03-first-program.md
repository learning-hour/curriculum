# Lesson 3

Recall `bit`, `nibble` and `byte`, `strong typing`.

# Kotlin

Kotlin is a strongly typed language. It runs on the JVM (a concept we'll probably broach in a future session).

## Basics

In the last lesson, you saw some actual code running. Today, we'll start decomposing that.

How does _a program run?_

All programs, need to run!

- Distinction lies on the trigger/when.

Examples:

- The programs we write will run when we run a specific file.
- There is a class of programs that runs on servers, and the trigger is a request from another system. We'll cover
  this in a future session.

```kotlin
// this is a comment
// comments start with two slashes
/*
 multi line comments are enclosed with /* and */
 */
// fun is a keyword
fun main() {
    println("Hello world!")
}
```

In this example, `fun` is a `keyword` or `reserved word`. It means, it has a very precise meaning. Recall that we
translate a program from a high level language to machine language. Hence, the translation process requires rules to
be in place, so it can distinguish some key concepts.

`fun` specifically declares a `function`. A function is a piece of code, that can be called. In `kotlin`, `main` is
a special function that runs as the first function. It can orchestrate other function calls. So the declaration
really says ...

- create a function, and call it main

after `main`, we have `()` or parenthesis. It indicates, if any inputs are going to be passed, in this case, as we
have specified nothing, nothing is expected. _Think back to the concept of strong typing ... and defining as many
necessary things as possible_.

then we have `println` function call, with inputs, `Hello World!`.

### How can we invoke println when we haven't defined it?

Kotlin has a small library of readily available functions to use. We'll go over how to leverage this in the future, for
now we'll stick to the small library that is available, so we are more comfortable with basic language constructs.

### Let's try it out.

## Creating your own function

```kotlin
fun sum(a: Int, b: Int) = a + b

fun sum(a: Int, b: Int): Int {
    return a + b
}
```

### Exercise

- Create a function that does `subtraction`, `multiplication` and `division`
- what happens if we rename `main` to `something`? or `main2`?

