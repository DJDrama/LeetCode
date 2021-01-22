/**
 * https://leetcode.com/problems/remove-vowels-from-a-string/
 */

// O(n) time complexity (n=s.length)
// O(n) space complexity (n=s.length)
fun reverseVowels(s: String): String {
    var l = 0
    var r = s.length - 1
    val arr = s.toCharArray()
    while (l < r) {
        if (isVowel(arr[l]) && isVowel(arr[r])) {
            val temp = arr[l]
            arr[l] = arr[r]
            arr[r] = temp
            l++
            r--
        } else if (isVowel(arr[l])) {
            r--
        } else if (isVowel(arr[r])) {
            l++
        } else {
            l++
            r--
        }
    }
    return String(arr)
}

fun isVowel(input: Char): Boolean {
    return input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'
            || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U'
}

fun main() {
    val input = "leetcode"
    println(reverseVowels(input)) // output: leotcede
}