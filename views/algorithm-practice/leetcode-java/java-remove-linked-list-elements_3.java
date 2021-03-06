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
        ListNode phantomHead = new ListNode(0);
        ListNode current = phantomHead;
        while (head != null) {
            if (head.val != val) {
                current.next = head;
                current = current.next;
            }
            head = head.next;
        }
        current.next = null;
        return phantomHead.next;
    }
}