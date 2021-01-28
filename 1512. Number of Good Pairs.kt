/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */

// O(n) time complexity
// O(101) space complexity
fun numIdenticalPairs(nums: IntArray): Int {
    val arr = IntArray(101)
    nums.forEach {
        arr[it]++
    }
    var res = 0
    arr.forEach {
        res += if (it > 1) it * (it - 1) / 2 else 0
    }
    return res
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 1, 1, 3)
    println(numIdenticalPairs(nums)) // Output: 4

}