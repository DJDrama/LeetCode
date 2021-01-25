/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */

// O(n) time complexity
// O(n) space complexity
fun defangIPaddr(address: String): String {
    val sb = StringBuilder()
    address.forEach { c ->
        if (c.isDigit()) sb.append(c)
        else sb.append("[.]")
    }
    return sb.toString()
}

fun main() {
    val input = "255.100.50.0"
    println(defangIPaddr(input)) // Output: 255[.]100[.]50[.]0

}