/**
 * https://leetcode.com/problems/decode-xored-array/
 */
// O(n) time complexity
// O(n) space complexity
fun decode(encoded: IntArray, first: Int): IntArray {
    val res = IntArray(encoded.size + 1)
    res[0] = first

    for (i in 1 until res.size) {
        res[i] = res[i - 1].xor(encoded[i - 1])
    }
    return res
}

fun main() {
    val encoded = intArrayOf(1, 2, 3)
    val first = 1
    val res = decode(encoded, first)
    for (r in res) print("$r ") // Ouput: 1 0 2 1

}