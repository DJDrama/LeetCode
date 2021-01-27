/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */

// O(n^2) time complexity
// O(1) space complexity
fun maximumWealth(accounts: Array<IntArray>): Int {
    var res = 0
    accounts.forEach { account ->
        var sum = 0
        account.forEach {
            sum += it
        }
        res = Math.max(sum, res)
    }
    return res
}

fun main() {
    val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))
    println(maximumWealth(input)) // Output: 6

}