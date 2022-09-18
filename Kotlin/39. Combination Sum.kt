/**
 * https://leetcode.com/problems/combination-sum
 */

class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        backTrack(
            candidates = candidates,
            result = res,
            index = 0,
            target = target,
            currentSum = 0,
            answerList = mutableListOf()
        )
        return res
    }

    private fun backTrack(
        candidates: IntArray,
        result: MutableList<List<Int>>,
        target: Int,
        index: Int,
        currentSum: Int,
        answerList: MutableList<Int>
    ) {
        if (currentSum == target) {
            result.add(answerList.toList())
        } else if (currentSum > target) return

        for (i in index until candidates.size) {
            val tempSum = currentSum + candidates[i]
            answerList.add(candidates[i])
            backTrack(candidates, result, target, i, tempSum, answerList)
            answerList.removeAt(answerList.size - 1)
        }
    }
}

fun main() {
    println(
        message = Solution().combinationSum(
            candidates = intArrayOf(2, 3, 6, 7),
            target = 7
        )
    )
}