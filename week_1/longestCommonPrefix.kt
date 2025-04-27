package week_1

class Prefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val firstStr = strs[0]
        var numMatch = 100
        for (i in 0 until strs.size) {
            val strL = strs[i].length
            var num = 0
            for (j in 0 until strs[i].length) {
                if (j < firstStr.length && strs[i][j] == firstStr[j]) {
                    num++
                }
                else if (j < firstStr.length && strs[i][j] != firstStr[j]) {
                    break
                }
            }
            if(num < numMatch) {
                numMatch = num
            }
        }
        return firstStr.take(numMatch)
    }
}

fun main() {
    val str = arrayOf("foower","floor","floer")
    val result = Prefix().longestCommonPrefix(str)
    println(result)

}