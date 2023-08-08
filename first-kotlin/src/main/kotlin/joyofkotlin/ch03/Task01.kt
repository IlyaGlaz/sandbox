package joyofkotlin.ch03

fun main() {
    val squareToTriple = compose(::square, ::triple)
    println(squareToTriple(2))
}

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun compose(a: (Int) -> Int, b: (Int) -> Int): (Int) -> Int =
    {a(b(it))}
