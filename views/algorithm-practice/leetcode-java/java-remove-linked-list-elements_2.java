/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = null;
        ListNode current = head;
        head = null;
        while (current != null) {
            if (current.val != val) {

                if (previous == null) {
                    head = current;
                }
                previous = current;
            } else {
                if (previous != null) {
                    previous.next = current.next;
                }
            }
            current = current.next;

        }
        return head;
    }
}