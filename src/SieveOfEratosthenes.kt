
fun findPrimeNumbers(n: Int)  {
    val isPrime = mutableListOf<Boolean>()
    for (i in 0 .. n){
        isPrime.add(true)
    }

    for (p in 2 .. n){
        if (isPrime[p]){
            for (i in p*p ..n step p){
               isPrime[i] = false
            }
        }
    }

    for(j in 2 until isPrime.size){
        if (isPrime[j])
            print(j)
    }
}

fun main(){
    findPrimeNumbers(50)
    println()
    findPrimeNumbers1(50)
}

fun findPrimeNumbers1(n: Int){
    val numList = (2..n).toMutableList()
    val toRemove = mutableSetOf<Int>()

    for(item in numList) {
        for(j in numList.indices){
            if ((numList[j] % item == 0) && (numList[j] >= item * item) ){
                toRemove.add(numList[j])
            }
        }
    }
    numList.removeAll(toRemove)
    print("my cleaner list $numList")

}