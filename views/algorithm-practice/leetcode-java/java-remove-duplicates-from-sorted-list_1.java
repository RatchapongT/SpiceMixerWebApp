/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            if (prev == null) {
                prev = current;
            } else {
                if (current.val != prev.val) {
                    prev.next = current;
                    prev = current;
                }
            }
            current = current.next;
        }
        prev.next = null;
        return head;
    }
}