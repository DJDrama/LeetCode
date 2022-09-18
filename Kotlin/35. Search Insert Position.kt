/**
 * https://leetcode.com/problems/search-insert-position/
 */
class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] < target) {
                left = mid + 1
            } else if (nums[mid] > target) {
                right = mid - 1
            } else {
                return mid
            }
        }
        return left
    }
}

fun main() {
    val input = intArrayOf(1, 3, 5, 6)
    val target = 5
    println(message = Solution().searchInsert(nums = input, target = target))
}