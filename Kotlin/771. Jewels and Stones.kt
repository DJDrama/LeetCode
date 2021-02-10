/**
 * https://leetcode.com/problems/jewels-and-stones/
 */

class Solution {
    // O(jewels.length + stones.length) time complexity
    // O(58) space complexity
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val arr = IntArray(58)
        jewels.forEach { arr[it - 'A']++ }
        var res = 0
        stones.forEach { res += arr[it - 'A'] }
        return res
    }
}

fun main() {
    val s = Solution()
    val jewels = "aA"
    val stones = "aAAbbbb"
    println(s.numJewelsInStones(jewels, stones)) // Output: 3
}