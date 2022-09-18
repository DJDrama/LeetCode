/**
 * https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 */
class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val res = mutableListOf<Int>()
        val wordsMap = mutableMapOf<String, Int>()
        val sLen = s.length
        val wordLen = words[0].length
        if (sLen < wordLen) return res
        words.forEach {
            wordsMap[it] = wordsMap.getOrDefault(it, 0) + 1
        }

        for (i in s.indices) {
            var currentIndex = i
            val copiedMap = wordsMap.toMutableMap()
            while (currentIndex + wordLen <= s.length) {
                val subString = s.substring(currentIndex, currentIndex + wordLen)
                if (copiedMap.containsKey(subString)) {
                    copiedMap[subString] = copiedMap[subString]!!.dec()
                    if (copiedMap[subString] == 0)
                        copiedMap.remove(subString)
                    if (copiedMap.isEmpty())
                        res.add(i)

                    currentIndex += wordLen
                } else {
                    break
                }
            }
        }
        return res
    }
}

fun main() {
    val str = "barfoothefoobarman"
    val words = arrayOf("foo", "bar")
    println(Solution().findSubstring(s = str, words = words))
}