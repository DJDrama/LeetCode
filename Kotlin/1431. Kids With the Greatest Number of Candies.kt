/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
// O(n) time complexity
// O(1) space complexity
fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    val max = candies.max()
    val res = BooleanArray(candies.size)
    for(i in candies.indices)
        res[i] = candies[i]+extraCandies >= max!!
    return res
}

fun main() {
    val candies = intArrayOf(2, 3, 5, 1, 3)
    val extraCandies = 3
    val res = kidsWithCandies(candies, extraCandies)
    for (v in res) {
        print("$v ") // true,true,true,false,true
    }
}