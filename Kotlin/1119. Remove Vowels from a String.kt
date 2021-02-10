/**
 * https://leetcode.com/problems/remove-vowels-from-a-string/
 */

// O(n) time complexity (n=s.length)
// O(n) space complexity (n=s.length)
fun removeVowels(s: String): String {
    val sb = StringBuilder()
    s.forEach { c ->
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            sb.append(c)
        }
    }
    return sb.toString()
}

fun main() {
    var input = "aeiou"
    println(removeVowels(input)) // output:

    input = "leetcodeisacommunityforcoders"
    println(removeVowels(input)) // output: ltcdscmmntyfrcdrs
}