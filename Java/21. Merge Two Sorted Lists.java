/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // O(l1.length + l2.length) time complexity
    // O(1) space complexity (since we are just arranging pointers, not creating new ListNodes)
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }
        if (l1 != null)
            curr.next = l1;
        if (l2 != null)
            curr.next = l2;
        return dummy.next;

    }
}