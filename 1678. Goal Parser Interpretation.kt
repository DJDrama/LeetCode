/**
 * https://leetcode.com/problems/goal-parser-interpretation/
 */

// O(n) time complexity
// O(n) space complexity
fun interpret(command: String): String {
    return command.replace("()", "o").replace("(al)", "al")
}

fun main() {
    val command = "G()()()()(al)"
    println(interpret(command))
}