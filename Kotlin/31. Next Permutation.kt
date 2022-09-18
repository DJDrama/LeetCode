/**
 * https://leetcode.com/problems/next-permutation/
 */
class Solution {
    fun nextPermutation(nums: IntArray): Unit {
        var i = nums.size - 2
        while (i >= 0 && nums[i] >= nums[i + 1]) i--
        if (i >= 0) {
            var j = nums.size - 1
            while (nums[i] >= nums[j]) j--
            swap(nums, i, j)
        }
        reverse(nums, i + 1)
    }

    private fun swap(nums: IntArray, a: Int, b: Int) {
        val temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp
    }

    private fun reverse(nums: IntArray, startIndex: Int) {
        var left = startIndex
        var right = nums.size - 1
        while (left < right) {
            swap(nums, left++, right--)
        }
    }
}

fun main() {
    val input = intArrayOf(1, 2, 3)
    println(Solution().nextPermutation(nums = input))
}