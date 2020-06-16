fun main(){

    findSumSquareDifference()
}

fun findSumSquareDifference(){
    val n = readLine()!!.toLong()
    var sumOfSquares = 0L
    var sum = 0L
    for(i in 1 .. n){
        sum += i
        sumOfSquares += (i*i);
    }
    println("sum => $sum")
    println("sum of Suares => $sumOfSquares")

    var difference = (sum * sum) - sumOfSquares
    println("diff => $difference")

}