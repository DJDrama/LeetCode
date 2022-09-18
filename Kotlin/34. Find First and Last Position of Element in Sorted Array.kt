/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        return intArrayOf(search(nums, target, 0), search(nums, target, 1))
    }

    private fun search(nums: IntArray, target: Int, type: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                if (type == 0) {
                    if (mid == 0 || nums[mid - 1] != nums[mid]) return mid
                    else right = mid - 1
                } else {
                    if (mid == nums.size - 1 || nums[mid] != nums[mid + 1]) return mid
                    else left = mid + 1
                }
            } else if (nums[mid] < target) left = mid + 1
            else right = mid - 1
        }
        return -1
    }
}

fun main() {
    val input = intArrayOf(5, 7, 7, 8, 8, 10)
    val target = 8
    println(message = Solution().searchRange(nums = input, target = target))
}