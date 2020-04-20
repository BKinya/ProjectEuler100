import kotlin.math.sqrt

fun main() {
    println("Here")
    //printPrimeFactors(1000000000)
    maxPrimeNumber()
}

//Not optimal solution
fun printPrimeFactors(n: Long) {
    var number = n
    while (number % 2L == 0L) {
        println(2)
        number /= 2
    }
    var x = 3
    while (x <= sqrt(number.toDouble())) {
        while (number % x == 0L) {
            println(x)
            number /= x
        }
        x += 2
    }

    if (number > 2) {
        println(n)
    }
}

fun maxPrimeNumber() {
    var num = readLine()!!.toLong()
    var maxPrime = -1L

    while (num % 2 == 0L) {
        maxPrime = 2
        num /= 2
    }

    var x = 3L
    while (x <= sqrt(num.toDouble())) {
        while (num % x == 0L) {
            maxPrime = x
            num /= x
        }
        x += 2
    }

    if (num > 2) maxPrime = num

    println(" $maxPrime")
}