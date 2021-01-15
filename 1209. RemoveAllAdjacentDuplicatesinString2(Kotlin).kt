/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
 **/

// O(n) time complexity
// O(n) space complexity
fun removeDuplicates(s: String, k: Int): String {
    val sb = StringBuilder(s)
    val count = IntArray(sb.length)
    var i = 0
    while (i < sb.length) {
        if (i == 0 || sb[i] != sb[i - 1]) {
            count[i] = 1
        } else {
            count[i] = count[i - 1] + 1
            if (count[i] == k) {
                sb.delete(i - k + 1, i + 1)
                i -= k
            }
        }
        i++
    }
    return sb.toString()
}

fun main() {
    val s = "deeedbbcccbdaa"
    val k = 3
    println(removeDuplicates(s, k)) // Output: "aa"
}