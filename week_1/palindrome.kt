package week_1

class Solution1 {
    fun isPalindrome(x: Int): Boolean {
        var num: String = "$x";
        var numSize = num.length;
        var num1:Int = 0;

        while (num1 < numSize/2) {
            if (num[num1] != num[numSize-(num1+1)]) {
                return false;
            }
            num1++;
        }
        return true;
    }
}
fun main() {
    var number:Int = 10;
    var result: Boolean = Solution1().isPalindrome(number);
    println(result)
}