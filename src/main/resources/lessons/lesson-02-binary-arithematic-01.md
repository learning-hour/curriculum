# Lesson 2

Recall `bit`, `nibble` and `byte`.

## What is binary?
In binary, there are only two states `0`, and `1`. 

Let's compare it to the `decimal` system `0 ... 9` . 

In the decimal base system, we `increment` the `base` numbers by one, until we reach then end, then we increment the 
next power. Example `1, 2, 3, 4, 5, 6 ... 9`. After `9`, we set the next power to `1` which was `0` and restart with 
the lower number in the base i.e `09` -> `10`. 

Similarly, the same principal applies to binary. The only difference is that there are only `2` numbers in the base 
hence the name `binary`. Now you can probably guess why the `decimal` system is called `decimal`. As an aside, there 
are other bases that are also used and others could hypothetically be developed. `octal` is based on `8` and `hexa 
decimal` is based on `16` numbers. We won't cover them today, though we could in a future lesson.

Monotonically increasing numbers
``` 
0   = 0
1   = 1
10  = 2
11  = 3
100 = 4
101 = 5
110 = 6
111 = 7
```

So a `byte` has `8` `bits` ... hence the maximum number would be 

``` 
11111111 = 255
```

### What if you want to store a larger number?
What if you could use `2 bytes` to store a number? How big a number can you store?

```
1111111111111111 = 65,535
```

Notice, that inorder to store larger numbers, we need to use more memory.

using `3 bytes`, we can store `unsigned` max of `16,777,215`
using `4 bytes`, we can store `unsigned` max of `4,294,967,295`

### What if you want to store negative numbers i.e signed?
This is possible ... we will do a deeper dive in a future lesson.

## Why binary?
We've learned what is binary ... now the question is why binary?

Why is it so hard for computers to understand base 10?

At its heart, a computer relies on electrical signals. The simplest way to determine a number is if signal is 
`above` or `below` a certain threshold, hence `1` or `0`. 

If signal is `above` a threshold it is `1`. If it is `below`, it is `0`. 

## Addition
`1 + 1 = 10`



## Subtraction

## Overflow

## Underflow