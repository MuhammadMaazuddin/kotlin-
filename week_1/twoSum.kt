package week_1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if ((nums[i] + nums[j]) == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf() // If no solution is found
    }
}

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 5)
    val target = 6
    val result = Solution().twoSum(values, target)

    println(result.joinToString()) // To print the indices nicely
}
