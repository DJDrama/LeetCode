/**
 * https://leetcode.com/problems/add-two-numbers/
 */

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    // O(max(l1, l2)) time complexity
    // O(max(l1, l2)+1) time complexity (carry 1 could be added at the end)
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var a: ListNode? = l1
        var b: ListNode? = l2
        var carry = 0
        val dummy = ListNode(0)
        var curr = dummy
        while (a != null || b != null) {
            var x = 0
            var y = 0
            a?.let {
                x = it.`val`
                a = it.next
            }
            b?.let {
                y = it.`val`
                b = it.next
            }

            val sum = x + y + carry
            carry = sum / 10
            curr.next = ListNode(sum % 10)
            curr = curr.next!!
        }
        if (carry > 0)
            curr.next = ListNode(carry)
        return dummy.next
    }
}