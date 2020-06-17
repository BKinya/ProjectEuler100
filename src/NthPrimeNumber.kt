fun main() {
    findNthPrimeNumber1(150000)
}

fun checkIsPrimeNumber(num: Int): Boolean {
    var isPrime = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}

//Failing the last two tests
fun findNthPrimeNumber() {
    val t = readLine()!!.toInt()
    for (i in 0 until t) {
        val n = readLine()!!.toInt()
        var position = 1
        var nthPrimeNumber = 2
        var currentNumber = 2
        while (position < n) {
            currentNumber++
            if (checkIsPrimeNumber(currentNumber)) {
                nthPrimeNumber = currentNumber
                position++
            }
        }
        println("$nthPrimeNumber")
    }

}

//passing all tests
fun findNthPrimeNumber1(num: Long) {
    val isPrime = mutableListOf<Boolean>()
    val primeNumbers = mutableListOf<Int>()

    val n = readLine()!!.toInt()

    for (i in 0L..num) {
        isPrime.add(true)
    }

    for (p in 2..num) {
        if (isPrime[p.toInt()]) {
            for (i in p * p..num step p) {
                isPrime[i.toInt()] = false
            }
        }
    }
    for (j in 2 until isPrime.size) {
        if (isPrime[j]) {
            //print("$j ")
            primeNumbers.add(j)
        }
    }
    print("size = ${primeNumbers.size}")
    print("10th prime number => ${primeNumbers[n-1]}")
}
