package week_1

class Solution1 {
    fun isPalindrome(x: Int): Boolean {
        val num = "$x"
        val numSize = num.length
        var num1 = 0

        while (num1 < numSize/2) {
            if (num[num1] != num[numSize-(num1+1)]) {
                return false
            }
            num1++
        }
        return true
    }
}
fun main() {
    val number = 10
    val result: Boolean = Solution1().isPalindrome(number)
    println(result)
}