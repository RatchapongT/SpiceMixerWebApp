/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        for (int i = 0; i < n; i++) {
            currentNode = currentNode.next;
        }
        ListNode previous = null;
        ListNode track = head;
        while (currentNode != null) {
            previous = track;
            track = track.next;
            currentNode = currentNode.next;
        }
        if (previous == null) return head.next;
        previous.next = previous.next.next;
        return head;
    }
}