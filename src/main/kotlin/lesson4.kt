import kotlin.math.pow

fun main(){

    var a = 10
    val b = 3

    println ("a+b = ${a+b}")
    println ("a-b = ${a-b}")
    println ("a*b = ${a*b}")
    println ("a/b = ${a/b}")
    println ("a%b = ${a%b}")

    println("2+2*5 = ${(2+2)*5}")

    println("a-- : ${a--}")
    println("--a : ${--a}")

    println("a++ : ${a++}")
    println("++a : ${++a}")



    a += 2
    println("a += 2: $a")
    a -= 2
    println("a -= 2: $a")
    a *= 2
    println("a *= 2: $a")
    a /= 2
    println("a /= 2: $a")
    a %= 2
    println("a %= 2: $a")

}