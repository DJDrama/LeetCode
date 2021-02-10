/**
 * https://leetcode.com/problems/two-sum/
 */

class Solution {
    // O(n) time complexity
    // O(n) space complexity
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: HashMap<Int, Int> = HashMap()

        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) {
                return intArrayOf(map.getOrDefault(target - nums[i], 0), i)
            }
            map.put(nums[i], i)
        }

        return IntArray(2)
    }
}

fun main() {
    val s = Solution()
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val res = s.twoSum(nums, target)
    println("${res[0]} ${res[1]}") // Output: 0 1
}