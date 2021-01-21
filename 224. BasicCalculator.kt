import java.util.*
import kotlin.math.min

/**
 * https://leetcode.com/problems/basic-calculator/
 **/

// O(n) time complexity
// O(n) space complexity
fun calculate(s: String): Int {
    val stack: Stack<Int> = Stack<Int>()
    var res = 0
    var op = 0
    var sign = 1
    s.forEach {
        when {
            Character.isDigit(it) -> {
                op = 10 * op + (it - '0')
            }
            it == '+' -> {
                res += op * sign
                op = 0
                sign = 1
            }
            it == '-' -> {
                res += op * sign
                op = 0
                sign = -1
            }
            it == '(' -> {
                stack.push(res)
                stack.push(sign)
                res = 0
                sign = 1
            }
            it == ')' -> {
                res += op * sign
                res *= stack.pop()
                res += stack.pop()
                op = 0
            }
        }
    }

    return res + op * sign
}

fun main() {
    val input = "(1+(4+5+2)-3)+(6+8)"
    println(calculate(input)) // output: 23
}