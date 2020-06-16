fun main() {
    findSumSquareDifference()
}

fun findSumSquareDifference() {
    val t = readLine()!!.toInt()
    for (i in 0 until t) {
        val n = readLine()!!.toLong()
        var sumOfSquares = 0L
        var sum = 0L
        for (j in 1..n) {
            sum += j
            sumOfSquares += (j * j);
        }

        var difference = (sum * sum) - sumOfSquares
        println("$difference")
    }
}