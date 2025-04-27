package week_1

class RomanToInt {
    fun checkNext(first:Char, second:Char):Boolean {
        when(first) {
            'I' -> when(second) {
                'V' -> return true
                'X' -> return true
            }
            'X' -> when(second) {
                'L' -> return true
                'C' -> return true
            }
            'C' -> when(second) {
                'D' -> return true
                'M' -> return true
            }
        }
        return false
    }
    fun romanNum(s: Char):Int {
        when(s) {
            'I' -> return 1
            'V' -> return 5
            'X' -> return 10
            'L' -> return 50
            'C' -> return 100
            'D' -> return 500
            'M' -> return 1000
        }
        return 0
    }
    fun romanToInt(s: String): Int {
        var number = 0
        var count = 0
        while(count < s.length) {
            if(count+1 != s.length && checkNext(s[count],s[count+1])) {
                number+= romanNum(s[count+1]) - romanNum(s[count])
                count++
            }
            else {
                number+=romanNum(s[count])
            }
            count++
        }
        return number
    }
}

fun main() {
    val roman = "MCMXCIV"
    val result = RomanToInt().romanToInt(roman)
    println(result)
}