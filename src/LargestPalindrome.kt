fun getLargestPalindrome() {
    var largestPalindrome = 0L
    for (i in 100 until 1000) {
        for (j in i until 1000) {
            val product = i * j
            if (product.toString().isPalindrome()) {
                if (product > largestPalindrome) {
                    largestPalindrome = product.toLong()
                }
            }
        }
    }
    print("Largest palindrome $largestPalindrome")
}

fun String.isPalindrome() = this == this.reversed()
fun main() {
    getLargestPalindrome()
    greatestPalindrome2()
}

fun greatestPalindrome2() {
    var largestPalindrome = 0L
    val n = readLine()!!.toLong()
    for (i in 100 until  1000) {
        var j = 100000 / i + 1
        while (j < 1000){
            val product = i * j
            if (product.toString().isPalindrome()) {
                if (product < n) {
                    if (product > largestPalindrome) {
                        largestPalindrome = product.toLong()
                    }
                }
            }
            ++j
        }
    }
    print("$largestPalindrome")
}

