/**
 * https://leetcode.com/problems/merge-two-sorted-lists/submissions/
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
    // O(l1.length + l2.length) time complexity
    // O(1) space complexity
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        var curr = dummy
        var l1Node = l1
        var l2Node = l2
        while (l1Node != null && l2Node != null) {
            if (l1Node.`val` > l2Node.`val`) {
                curr.next = l2Node
                l2Node = l2Node.next
            } else {
                curr.next = l1Node
                l1Node = l1Node.next
            }
            curr = curr.next
        }
        if (l1Node != null)
            curr.next = l1Node
        if (l2Node != null)
            curr.next = l2Node
        return dummy.next
    }
}