fun gcd(a: Long, b: Long) : Long {
    return if ((a % b) != 0L) gcd(b, a % b) else b
}

fun lcm(n: Long){
    var ans:Long = 1L
    for (i in 1 .. n){
        ans = (ans * i)/gcd(ans, i)
    }

    println("LCM = $ans")
}

fun main(){
    val t = readLine()!!.toLong()
    for( i in 1 .. t){
        val n = readLine()!!.toLong()
        lcm(n)

    }
}